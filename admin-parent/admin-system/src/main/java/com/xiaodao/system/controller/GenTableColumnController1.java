package com.xiaodao.system.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import io.micrometer.core.instrument.util.StringUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


/**
 * GenTableColumn
 *
 * @author xiaodao
 * @email 513684652@qq.com
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/genTableColumn")
@Api(value = "GenTableColumn管理", tags = "GenTableColumn管理")
@Validated
@Slf4j
public class GenTableColumnController1 {



    @ApiOperation(value = "download", notes = "download")
    @ApiImplicitParams({
    })
    @GetMapping("/download")
    public void download(HttpServletResponse response) {
        Map<String,byte[]> map = new HashMap<>();
        map.put("1",getFileByte("http://114.115.233.31/group1/M00/00/00/wKgAX12_96GAEhVDABn2Pw1Po6069.docx"));

        downloadBatchByFile(response,map,"test");
    }
    public void downloadBatchByFile(HttpServletResponse response, Map<String, byte[]> files, String zipName) {

        try {

            response.reset();

            zipName = java.net.URLEncoder.encode(zipName, "UTF-8");

            response.setContentType("application/vnd.ms-excel;charset=UTF-8");

            response.setHeader("Content-Disposition", "attachment;filename=" + zipName + ".zip");


            ZipOutputStream zos = new ZipOutputStream(response.getOutputStream());

            BufferedOutputStream bos = new BufferedOutputStream(zos);


            for (Map.Entry<String, byte[]> entry : files.entrySet()) {

                String fileName = entry.getKey();            //每个zip文件名

                byte[] file = entry.getValue();            //这个zip文件的字节


                BufferedInputStream bis = new BufferedInputStream(new ByteArrayInputStream(file));

                zos.putNextEntry(new ZipEntry(fileName));

                int len = 0;

                byte[] buf = new byte[10 * 1024];

                while ((len = bis.read(buf, 0, buf.length)) != -1) {

                    bos.write(buf, 0, len);

                }

                bis.close();

                bos.flush();

            }

            bos.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }
    public static InputStream getFileStream(String filePath) throws Exception {
        if (StringUtils.isNotBlank(filePath) && filePath.startsWith("http")) {
            URL url = new URL(filePath);
            //打开链接
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            //设置请求方式为"GET"
            conn.setRequestMethod("GET");
            //超时响应时间为5秒
            conn.setConnectTimeout(5 * 1000);
            //通过输入流获取图片数据
            InputStream is = conn.getInputStream();
            return is;
        } else if (StringUtils.isNotBlank(filePath)) {
            InputStream is = new FileInputStream(filePath);
            return is;
        } else {
            return null;
        }
    }


    /**
     * 得到文件流
     * @param url
     * @return
     */
    public  byte[] getFileByte(String url){
        try {
            URL httpUrl = new URL(url);
            HttpURLConnection conn = (HttpURLConnection)httpUrl.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5 * 1000);
            InputStream inStream = conn.getInputStream();//通过输入流获取图片数据
            byte[] btImg = readInputStream(inStream);//得到图片的二进制数据
            return btImg;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 从输入流中获取数据
     * @param inStream 输入流
     * @return
     * @throws Exception
     */
    public static byte[] readInputStream(InputStream inStream) throws Exception{
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
        while( (len=inStream.read(buffer)) != -1 ){
            outStream.write(buffer, 0, len);
        }
        inStream.close();
        return outStream.toByteArray();
    }
}
