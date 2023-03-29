package ru.klimenko.spring.spring_course3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml"/*, "applicationContext2.xml"*/);
        // 57 - Создаем класс main и сонтекст (бин) со сылкой на конфиг файл (причем файлов может быть несколько) -> создаем applicationContex2
        // 59 - запускаем тест и получаем бин собаки - Dog bean is created - означает, что бин создается даже если мы его не запрашиваем, мы негде не писали context.getBean("myPet", Dog.class); -> конспект

        Dog mayDog = context.getBean("myPet", Dog.class);
        Dog yourDog = context.getBean("myPet", Dog.class);

/*
        Dog mayDog = context.getBean("myPet", Dog.class);
        mayDog.setName("Belka");
        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.setName("Strelka");
        System.out.println(mayDog.getName);
        System.out.println(yourDog.getName);
        // 69 - а при данном скопе - Prototype, помимо двух бинов и имена будут разные, то есть это бины statfull которые хранят какую либо информацию, имена например -> конспект
        Dog bean is created
        Dog bean is created
        Belka
        Strelka
*/
/*      Dog mayDog = context.getBean("myPet", Dog.class);
        Dog yourDog = context.getBean("myPet", Dog.class);
        System.out.println("Переменные ссылаются на один и тот же объект? " + (mayDog == yourDog));
        Dog bean is created
        Dog bean is created
        Переменные ссылаются на один и тот же объект? false
        ru.klimenko.spring.spring_course3.xxx
        ru.klimenko.spring.spring_course3.Dog@5ffead27
        67 - тогда при создании бинов, создадутся два разных бина и ссылки на облость памяти будут разными -> конспект
 */
/*
        Dog mayDog = context.getBean("myPet", Dog.class);
        mayDog.setName("Belka");
        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.setName("Strelka");
        System.out.println(mayDog.getName);
        System.out.println(yourDog.getName);
        // 64 - тогда к бинам mayDog и yourDog устанавливаем имена Belka и Strelka, но т.к скоп singletone то мы получим два раза Strelka, это и есть stetless объекты (бины), объектов которые не хранят информацию (имена например) -> конспект.
        Dog bean is created
        Strelka
        Strelka
*/
/*
        Dog mayDog = context.getBean("myPet", Dog.class);
        Dog yourDog = context.getBean("myPet", Dog.class);
        System.out.println("Переменные ссылаются на один и тот же объект? " + (mayDog == yourDog));
        System.out.println(mayDog);
        System.out.println(mayDog);
        context.close();
        // 61 - создадим бины mayDog и yourDog и сравниваем адреса в памяти Результат:
        Dog bean is created
        Dog bean is created
        Переменные ссылаются на один и тот же объект? true
        ru.klimenko.spring.spring_course3.Dog@5ffead27
        ru.klimenko.spring.spring_course3.Dog@5ffead27
        Получаются они общие для обоих бинов -> конспект 62
*/
    }
}
