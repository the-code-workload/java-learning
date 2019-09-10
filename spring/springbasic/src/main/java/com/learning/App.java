package com.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext
                ("spring-beans.xml");
        Animal animal = (Animal) context.getBean("animal");
        animal.makeSound();
        System.out.println("debug");
    }
}
