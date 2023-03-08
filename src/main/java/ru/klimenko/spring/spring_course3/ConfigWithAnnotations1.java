package ru.klimenko.spring.spring_course3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {

ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("applicationContext3.xml");
Cat mayCat = context.getBean("catBean", Cat.class);
        mayCat.say();
        context.close();

    }
}
