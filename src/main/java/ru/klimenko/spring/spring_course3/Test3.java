package ru.klimenko.spring.spring_course3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
/*
Pet pet = new Cat();
Person person = new Person(pet);
person.callYourPet();
     */
// 22 - создали сначало обычный вариант объекта и вызова метода

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
//        Pet pet = context.getBean("myPet", Pet.class);
//        Person person = new Person(pet);
//        24 - вот такое написание кода Person(pet) говорит о жестком коде или жесткой зависимости, что бы ослабить зависимость и сделать ее более гибкой используют DI -> конспект
//        person.callYourPet();
//        23 - второй вариант, когда бин (животного) создается контейнерм и методом context
//        29 - теперь получается, что нам не надо создавать бин pet и объект person и добавлять в него pet, мы просто
        Person person = context.getBean("myPerson", Person.class);
//        30 - создаем бин person, а все остальное будит за кулисами создано.
        person.callYourPet();
//      31 - далее понятно, вызываем метод и получаем результат.-> конспект

        // 36 - теперь запускаем run и видим, отрабатывает все по порядку -
        // 31.1 - создался бин кат - Cat bean is created,Class Person: Set Pet
        // 31.2 - создался бин первсон - Person bean is created
        // 31.3 - дальше понятно - Heel, my lovely Pet!
        // 31.4 - Mau-Mau

        System.out.println(person.getSurname());
        System.out.println(person.getAge());
// 46 - теперь выводим в консоль через гетторы, но перед запуском пропишем диагностические сообщения - Person.
// 49 - теперь запускаем и получаем последовательность выполнения команд:
// 49.1 - создался бин кат - Cat bean is created,Class Person: Set Pet
// 49.2 - создался бин первсон - Person bean is created
// 49.3 - установили Person животного: Class Person: Set Pet
// 49.4 - фамилию: Class Person: set surname
// 49.5 - возраст: Class Person: set age
// 49.6 - дальше, запустили метод - Heel, my lovely Pet!
// 49.7 - ответ - Mau-Mau
// 49.8 - Вывели в консоль - Titov
// 49.9 - Вывели в консоль - 88 -> конспект
        context.close();
        // 37 - закрыть контекст. Далее будем внедрять зависимость с помощью сеттроров -> Person.
        // 54 - Здесь ни чего не меяем и просто запускаем, все работает аналогично 49.1-49.9 -> конспект.
    }
}
