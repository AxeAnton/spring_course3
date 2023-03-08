package ru.klimenko.spring.spring_course3;

import org.springframework.context.support.ClassPathXmlApplicationContext;
// тест
public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.say();
/*
        Dog bean is created
        Class Dog: init method
        Bow-Bow
        Class Dog: destroy method
*/
        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.say();
        context.close();
/*
        Dog bean is created
        Class Dog: init method
        Bow-Bow
        Bow-Bow
        Class Dog: destroy method
        context.close();
 */
/*
        Dog bean is created
        Class Dog: init method
        Bow-Bow
        Dog bean is created
        Class Dog: init method
        Bow-Bow
*/
// тест
    }
}
