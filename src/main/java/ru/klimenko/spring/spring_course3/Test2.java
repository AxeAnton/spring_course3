package ru.klimenko.spring.spring_course3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
// 15. Создаем класс, и прописываем в него вот такую хень ClassPathXmlApplicationContext и помещаем в него ссылку на конфиг файл.
        Pet pet = context.getBean("myPet", Pet.class);
// 16. Создаем объек вот таким образом, первый аргумент, id класса, а вторым аргументом указываем Pet.class., а не дог или кет, это необходимо, что бы при необходимости создать объект другого класса не менять код. Т,к все классы наследуют интерфейс Pet.
        pet.say();
// 17. вызываем метод say
        context.close();
// 18. ОБЯЗАТЕЛЬНО закрываем context!!! -> конспект
    }
}
