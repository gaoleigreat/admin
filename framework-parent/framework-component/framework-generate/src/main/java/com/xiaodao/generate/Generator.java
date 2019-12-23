package com.xiaodao.generate;

import com.xiaodao.generate.config.GenConfig;
import com.xiaodao.generate.domain.GenTable;
import com.xiaodao.generate.service.DataServiceImpl;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Generator {

    public static void main(String[] args) throws Exception {
        DataServiceImpl dataService = new DataServiceImpl();
        List<GenTable> exam = dataService.getGenTable("exam");

        //创建Configuration对象
        Configuration configuration = new Configuration();
        //设置模板所在目录
        String path = Generator.class.getClassLoader().getResource("java").getPath();
        configuration.setDirectoryForTemplateLoading(new File(path));
        //获取模板
        Template template1 = configuration.getTemplate("mapper.java.vm");
        Template template2 = configuration.getTemplate("mapper.vm");
        Template template3 = configuration.getTemplate("service.java.vm");
        Template template4 = configuration.getTemplate("serviceimpl.java.vm");
        Template template5 = configuration.getTemplate("class.vm");
        Template template6 = configuration.getTemplate("controller.java.vm");
        Template template7 = configuration.getTemplate("FeignClient.java.vm");

        //设置数据并执行
        Map map = new HashMap();


        exam.forEach(e -> {


            try {
                GenConfig genConfig = new GenConfig();
                map.put("gentable", e);
                map.put("genconfig", genConfig);

                String mapperDir = "E:\\" + genConfig.getDaoPackageName().replace(".", "/") + "/";
                String entityDir = "E:\\" + genConfig.getEntityPackageName().replace(".", "/") + "/";
                String serviceDir = "E:\\" + genConfig.getServicePackageName().replace(".", "/") + "/";
                String serviceImplDir = "E:\\" + genConfig.getServiceImplPackageName().replace(".", "/") + "/";
                String controllerDir = "E:\\" + genConfig.getControllerPackageName().replace(".", "/") + "/";
                String feignClient = "E:\\" + genConfig.getFeignClientPackageName().replace(".", "/") + "/";
                String mapperXmlDir = "E:\\" + genConfig.getMapperPackageName().replace(".", "/") + "/";
                mkdirs(mapperDir);
                mkdirs(entityDir);
                mkdirs(serviceDir);
                mkdirs(serviceImplDir);
                mkdirs(controllerDir);
                mkdirs(feignClient);
                mkdirs(mapperXmlDir);
                Writer writer1 = new OutputStreamWriter(new FileOutputStream(mapperDir + e.getClassName() + "Mapper.java"));
                Writer writer2 = new OutputStreamWriter(new FileOutputStream(mapperXmlDir + e.getClassName() + "Mapper.xml"));
                Writer writer3 = new OutputStreamWriter(new FileOutputStream(serviceDir + "I" + e.getClassName() + "Service.java"));
                Writer writer4 = new OutputStreamWriter(new FileOutputStream(serviceImplDir + e.getClassName() + "ServiceImpl.java"));
                Writer writer5 = new OutputStreamWriter(new FileOutputStream(entityDir + e.getClassName() + ".java"));
                Writer writer6 = new OutputStreamWriter(new FileOutputStream(controllerDir + e.getClassName() + "Controller.java"));
                Writer writer7 = new OutputStreamWriter(new FileOutputStream(feignClient + e.getClassName() + "Client.java"));

                template1.process(map, writer1);
                template2.process(map, writer2);
                template3.process(map, writer3);
                template4.process(map, writer4);
                template5.process(map, writer5);
                template6.process(map, writer6);
                template7.process(map, writer7);
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (TemplateException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        });


    }


    public static void mkdirs(String dir) {
        File file = new File(dir);
        if (file.exists()) {
            file.delete();
        }
        file.mkdirs();
    }
}
 