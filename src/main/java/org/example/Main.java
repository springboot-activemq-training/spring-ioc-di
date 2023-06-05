package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        Computer computer = context.getBean(Computer.class);
//        computer.powerOn();
//        computer.setBrand("HP");
//        System.out.println("Computer brand: " + computer.getBrand());
//        System.out.println("<=======================================>");
//        Computer computer2 = context.getBean(Computer.class);
//        System.out.println("Computer brand: " + computer.getBrand());
//        computer2.setBrand("APPLE");
//        System.out.println("Computer brand: " + computer2.getBrand());

       Engineer engineer = context.getBean( Engineer.class);
        engineer.designAlgorith();
        engineer.developAlgorithm();
    }
}