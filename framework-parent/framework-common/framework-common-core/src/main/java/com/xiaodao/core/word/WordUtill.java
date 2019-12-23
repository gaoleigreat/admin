package com.xiaodao.core.word;

/**
 * @Author gaolei
 * @Date 2019/11/21 12:47
 * @Version 1.0
 */


import com.xiaodao.core.json.JSONObject;
import com.xiaodao.core.utils.StringUtils;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.*;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 */

public class WordUtill {
    public static void main(String[] args) throws Exception {
        //doc文档路径
        String filePath = "C:\\Users\\86187\\Desktop\\test01 - 副本.doc";
        FileInputStream in = new FileInputStream(filePath); // 载入文档
        POIFSFileSystem pfs = new POIFSFileSystem(in);
        HWPFDocument hwpf = new HWPFDocument(pfs);
        System.out.println(JSONObject.valueAsStr(readDOC(hwpf)));

        String filePath1 = "C:\\Users\\86187\\Desktop\\1.docx";
        FileInputStream in1 = new FileInputStream(filePath1); // 载入文档
        XWPFDocument xsf = new XWPFDocument(in1);
        System.out.println(JSONObject.valueAsStr(readDOCX(xsf)));

    }

    /**
     * 读取文档中表格
     */
    public static List<List<Map<String, Object>>> readDOC(HWPFDocument hwpf) {

        Range range = hwpf.getRange();// 得到文档的读取范围
        TableIterator it = new TableIterator(range);
        // 迭代文档中的表格
        List<List<Map<String, Object>>> resultList = new ArrayList<>();
        while (it.hasNext()) {
            List<String> headList = new ArrayList<>();
            Table tb = it.next();
            TableRow row0 = tb.getRow(0);
            if (row0 == null) {
                continue;
            }
            for (int i = 0; i < row0.numCells(); i++) {
                TableCell cell = row0.getCell(i);
                StringBuffer sbf = new StringBuffer();
                for (int k = 0; k < cell.numParagraphs(); k++) {
                    Paragraph para = cell.getParagraph(k);
                    String s = para.text();
                    // 去除后面的特殊符号
                    if (null != s && !"".equals(s)) {
                        s = s.substring(0, s.length() - 1);
                    }
                    s = s.trim();
                    sbf.append(s);
                }
                if (StringUtils.isEmpty(new String(sbf))) {
                    headList.add("未命名字段" + i);
                } else {
                    headList.add(new String(sbf));
                }
            }

            List<Map<String, Object>> mapList = new ArrayList<>();
            if (tb.numRows() == 1) {
                Map<String, Object> valueMap = new HashMap<>();
                for (int j = 0; j < headList.size(); j++) {

                    valueMap.put(headList.get(j), "");
                }
                mapList.add(valueMap);
            }

            for (int i = 1; i < tb.numRows(); i++) {
                TableRow tr = tb.getRow(i);
                Map<String, Object> valueMap = new HashMap<>();
                // 迭代列，默认从0开始
                for (int j = 0; j < headList.size(); j++) {

                    // 取得单元格
                    TableCell td = tr.getCell(j);
                    // 取得单元格的内容
                    StringBuilder stringBuilder = new StringBuilder();

                    for (int k = 0; k < td.numParagraphs(); k++) {
                        Paragraph para = td.getParagraph(k);
                        String s = para.text();
                        // 去除后面的特殊符号
                        if (null != s && !"".equals(s)) {
                            s = s.substring(0, s.length() - 1);
                        }
                        s = s.trim();
                        stringBuilder.append(s);
                    }
                    valueMap.put(headList.get(j), stringBuilder);

                }
                mapList.add(valueMap);
            }
            resultList.add(mapList);
        }
        return resultList;
    }


    public static List<List<Map<String, Object>>> readDOCX(XWPFDocument doc) throws Exception {
        List<XWPFTable> tableList = doc.getTables();
        List<List<Map<String, Object>>> resultList = new ArrayList<>();

        tableList.stream().forEach(t -> {
            XWPFTable table = t;
            List<XWPFTableRow> rows;
            List<XWPFTableCell> cells;
            rows = table.getRows();

            List<XWPFTableCell> tableCells = rows.get(0).getTableCells();
            List<String> headers = new ArrayList<>();

            for (int i = 0; i < tableCells.size(); i++) {
                if (StringUtils.isEmpty(tableCells.get(i).getText())) {
                    headers.add("未命名字段" + i);
                } else {
                    headers.add(tableCells.get(i).getText());
                }
            }

            List<Map<String, Object>> mapList = new ArrayList<>();
            if (rows.size() == 1) {
                Map<String, Object> valueMap = new HashMap<>();
                for (int j = 0; j < headers.size(); j++) {

                    valueMap.put(headers.get(j), "");
                }
                mapList.add(valueMap);
            }
            for (int j = 1; j < rows.size(); j++) {
                Map<String, Object> map = new HashMap<>();
                cells = rows.get(j).getTableCells();
                for (int i = 0; i < cells.size(); i++) {
                    if (i == headers.size()) {
                        break;
                    }
                    map.put(headers.get(i), cells.get(i).getText());
                }
                mapList.add(map);
            }
            resultList.add(mapList);

        });
        return resultList;

    }


}


