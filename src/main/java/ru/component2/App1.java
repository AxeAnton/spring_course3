package ru.component2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App1 {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("ru.component2");
Mouse mouse = applicationContext.getBean("mouseBean", Mouse.class);
mouse.say();



    }
}
