package ru.klimenko.spring.spring_course3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml"/*, "applicationContext2.xml"*/);
        Dog mayDog = context.getBean("myPet", Dog.class);
//       mayDog.setName("Belka");
        Dog yourDog = context.getBean("myPet", Dog.class);
//        yourDog.setName("Strelka");
//        Dog bean is created
//        Strelka
//        Strelka


//        System.out.println(mayDog.getName());
//        System.out.println(yourDog.getName());
 /*     Dog bean is created
        Dog bean is created
        Belka
        Strelka
*/

/*      System.out.println("Переменные ссылаются на один и тот же объект? " + (mayDog == yourDog));
        System.out.println(mayDog);
        System.out.println(mayDog);
        context.close();
*/

/*        Dog bean is created
        Dog bean is created
        Переменные ссылаются на один и тот же объект? false
        ru.klimenko.spring.spring_course3.Dog@5ffead27
        ru.klimenko.spring.spring_course3.Dog@5ffead27
*/
    }
}
