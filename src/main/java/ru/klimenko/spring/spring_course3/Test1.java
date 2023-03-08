package ru.klimenko.spring.spring_course3;

public class Test1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.say();
// 3. Создаем объек dog и запускаем метод -> Pet

        Pet pet = new Cat();
// 10. Заменили Dog на Cat -> конспект
        pet.say();
// 7. Создаем объек и меняем ТД и имя на Pet -> создаем Cat

    }
}

