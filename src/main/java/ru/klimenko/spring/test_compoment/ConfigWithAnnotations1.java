package ru.klimenko.spring.test_compoment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.klimenko.spring.spring_course3.Cat;
import ru.klimenko.spring.spring_course3.Person;
import ru.klimenko.spring.spring_course3.Pet;

import java.sql.SQLOutput;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
/*
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("ru.klimenko.spring.spring_course3");
        Cat mayCat = applicationContext.getBean("catBean", Cat.class);
        mayCat.say();
*/

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        // 83 -создаем класс context и в аргумент имя конфиг файла - applicationContext3.xml.

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        //92 -  Что происходит applicationContext3.xml сканирует пакет spring_course3, наход аннотации @ComponentCat и т.к scope дефолтный то создает бины, затем смотрит конструктора и если в аргументе конструктора есть класс, то устанавливает с ним зависимость и мы получим  bean is created / Person bean is created / Class Person: Set Pet/ Heel, my lovely Pet!/ Mau-Mau, но у меня это не работает ХЗ почему -> Конспект
        // 97 - получаем то же самое, что и в 92. Следующий урок 16. Аннотация @Autowired для ПОЛЯ -> Person .
        // 99 - получаем то же самое, что и в 92. Следующий урок 17.  -> Конспект.
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

/*
        Cat mayCat = context.getBean("catBean", Cat.class);
        mayCat.say();
        // 84 - создаем бин - context.getBean и аргументе указываем ID - catBean которое будет привсоено бину + указываем класс и вызываем метод.
*/
/*
        Cat mayCat = context.getBean("cat", Cat.class);
        mayCat.say();
        // 88 - дефолтный у класса Cat будет вот такой ID - cat, запускаем и получаем то же что и в 85 -> далее конспект урок 14.
*/
        context.close();
// 85 - не забываем закрывать контекст, вызываем метод и получаем: Cat bean is created и Mau-Mau -> конспект

// 110 - запустили и получили в консоль имя и возраст, но у меня не работает -> конспект
    }
}
