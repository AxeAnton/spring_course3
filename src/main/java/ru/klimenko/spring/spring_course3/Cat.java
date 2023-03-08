package ru.klimenko.spring.spring_course3;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet {
    // 8. Создали Cat, имплементируется Pet
    public Cat() {
        System.out.println("Cat bean is created");
    }
    // 34 - это сообщение для диагностики-> dog

    @Override
    public void say() {
        System.out.println("Mau-Mau");
    }

    // 9. Написали метод -> test1
}
