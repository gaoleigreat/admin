package com.xiaodao.generate;

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

        //设置数据并执行
        Map map = new HashMap();


        exam.forEach(e -> {
            if (e.getTableName().equals("data_file")) {


                try {
                    map.put("gentable", e);
                    Writer writer1 = new OutputStreamWriter(new FileOutputStream("E:/" + e.getPackageName().replace('.', '/') + "/mapper/" + e.getClassName() + "Mapper.java"));
                    Writer writer2 = new OutputStreamWriter(new FileOutputStream("E:/" + e.getPackageName().replace('.', '/') + "/mapper/xml/" + e.getClassName() + "Mapper.xml"));
                    Writer writer3 = new OutputStreamWriter(new FileOutputStream("E:/" + e.getPackageName().replace('.', '/') + "/service/I" + e.getClassName() + "Service.java"));
                    Writer writer4 = new OutputStreamWriter(new FileOutputStream("E:/" + e.getPackageName().replace('.', '/') + "/service/impl/" + e.getClassName() + "ServiceImpl.java"));
                    Writer writer5 = new OutputStreamWriter(new FileOutputStream("E:/" + e.getPackageName().replace('.', '/') + "/entity/" + e.getClassName() + ".java"));
                    Writer writer6 = new OutputStreamWriter(new FileOutputStream("E:/" + e.getPackageName().replace('.', '/') + "/controller/" + e.getClassName() + "Controller.java"));

                    template1.process(map, writer1);
                    template2.process(map, writer2);
                    template3.process(map, writer3);
                    template4.process(map, writer4);
                    template5.process(map, writer5);
                    template6.process(map, writer6);
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                } catch (TemplateException ex) {
                    ex.printStackTrace();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });


    }
}
 