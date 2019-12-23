package com.xiaodao.core.word;

import com.xiaodao.core.json.JSONObject;
import com.xiaodao.core.utils.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.util.CollectionUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

/**
 * @Author gaolei
 * @Date 2019/11/21 15:49
 * @Version 1.0
 */
public class EXcelUtil {
    public static void main(String[] args) throws IOException {
        String filePath1 = "C:\\Users\\86187\\Desktop\\水文地质.xls";
        FileInputStream in1 = new FileInputStream(filePath1); // 载入文档
        HSSFWorkbook wb = new HSSFWorkbook(in1);
        // //Workbook wb = new XSSFWorkbook(in1);

        //    XSSFWorkbook xsf = new XSSFWorkbook(in1);

        System.out.println(JSONObject.valueAsStr(getValue(wb)));


    }

    /**
     * 此方法兼容xls和xlsx
     * xls 请传  HSSFWorkbook wb = new HSSFWorkbook( new FileInputStream());
     * xlsx 请传  XSSFWorkbook xsf = new XSSFWorkbook(new FileInputStream());
     *
     * @param xsf
     * @return
     */

    public static List<List<Map<String, Object>>> getValue(Workbook xsf) {
        List<List<Map<String, Object>>> result = new ArrayList<>();
        if (xsf == null) {
            return result;
        }
        for (int i = 0; i < xsf.getNumberOfSheets(); i++) {
            List<Map<String, Object>> mapList = new ArrayList<>();
            Sheet sheet = xsf.getSheetAt(i);
            if (sheet == null) {
                continue;
            }

            Iterator<Row> rowIterator = sheet.iterator();
            Row header = rowIterator.next();
            List<String> headerList = convvertRowValueToList(header);
            if (headerList != null) {
                rowIterator.forEachRemaining((row) -> {
                    mapList.add(convvertRowValueToMap(row, headerList));
                });
            }
            result.add(mapList);
        }
        return result;
    }

    /**
     * 将行数据转换为Map
     *
     * @param row  行数据
     * @param keys mapkey值
     * @return
     */
    private static Map<String, Object> convvertRowValueToMap(Row row, List<String> keys) {
        Map<String, Object> resultMap = new HashMap();
        if (row != null && !CollectionUtils.isEmpty(keys)) {
            for (int i = 0; i < keys.size(); ++i) {
                if (row.getCell(i) == null) {
                    resultMap.put(keys.get(i), new String());
                } else {
                    resultMap.put(keys.get(i), row.getCell(i).toString());
                }
            }

        }
        return resultMap;

    }


    /**
     * 将单行数据转换为List
     *
     * @param row 行数据
     * @return
     */
    private static List<String> convvertRowValueToList(Row row) {
        List<String> list = new ArrayList();
        if (row != null) {
            int max = row.getLastCellNum();
            for (int i = 0; i < max; i++) {
                Cell cell = row.getCell(i);
                if (cell == null) {
                    list.add("未命名字段" + i);
                } else {
                    if (!StringUtils.isEmpty(cell.getStringCellValue())) {
                        list.add(cell.toString());
                    } else {
                        list.add("未命名字段" + i);
                    }
                }
            }
        }
        return list;
    }


}
