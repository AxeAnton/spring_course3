package ru.klimenko.spring.test_compoment;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.klimenko.spring.spring_course3.Dog;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        // 116 - создаем объект (вроде контейнера спринг)
        Dog myDog = context.getBean("dog", Dog.class);
        // 117 - создаем первую сабаку
        myDog.say();
/*
        Dog yourDog = context.getBean("dog", Dog.class);
// 118 - создаем вторую сабаку
        System.out.println("Переменные ссылаются на один и тот же объект? " + (myDog == yourDog));
        System.out.println(myDog);
        System.out.println(yourDog);
// 119 - проверяем на один ли объект т.к Singalton ссылаются ссылки, видим что да. Меняем в Dog аннотацию на prototype и получаем фолс, т.к, ссылки будут на разные объекты, что говорит о том, что создалась два объекта -> конспект
*/

        context.close();
    }
}
