package org.example;

import org.example.Service.ReportService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
//        AbstractApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig1.class);
        ReportService service =context.getBean(ReportService.class);
        service.generateReport();
    }
}