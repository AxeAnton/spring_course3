package ru.klimenko.spring.spring_course3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//128 - Создали класс и указали, что context, теперь работает через новый класс конфиг ...xt(MyConfig.class);

//         Person person = context.getBean("personBean", Person.class);
//         person.callYourPet();
//129 - Запустили пару строк, видим, что все работает, создается бин Cat bean is created / Person bean is created / Heel, my lovely Pet! / Mau-Mau -> следующий урок конспект

//         Pet cat1 = context.getBean("catBean", Pet.class);
//         Pet cat2 = context.getBean("catBean", Pet.class);
//         cat1.say();
// 133 - то создастся все равно один: Cat bean is created / Mau-Mau, т.к singleton. -> MyConfig

//        Person person = context.getBean("personBean", Person.class);
//        person.callYourPet();
// 135 - то с видим, что за кулисами создались оба бина кат и персон и кат поместили в персон и сработал метод callYourPet в консоли получим:  Cat bean is created  / Person bean is created / Heel, my lovely Pet! / Mau-Mau - Person

        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getAge());
        System.out.println(person.getSurname());

// 138 - результат: Cat bean is created / Person bean is created / 44 / Anton -> Конспект
        context.close();
    }
}
