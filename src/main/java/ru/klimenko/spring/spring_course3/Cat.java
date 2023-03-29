package ru.klimenko.spring.spring_course3;

import org.springframework.stereotype.Component;

// @Component ("catBean")
// 82 - прописываем аннотацию и придумываем ее ID например catBean, создаем класс main -> ConfigWithAnnotations1
// @Component
//127 - обратили внимание что есть аанотация @Component, говорит о том что когда MyConfig будет сканить пакет с классами он увидит аанатацию и создаст бин и зависимость которая указаны в конструкторе класса (ну или другим способом, см. лекции как с помощью аннотации создать DI)-> Test6
// 88 - вот так без id -> ConfigWithAnnotations1
public class Cat implements Pet {
    // 8. Создали Cat, имплементируется Pet

    public Cat() {
        System.out.println("Cat bean is created");
    }
     // 34 - это сообщение для диагностики-> dog

    @Override
    // 80 - Самая распространенная аннотация @Override -> applicationConfig3
    public void say() {
        System.out.println("Mau-Mau");
    }

    // 9. Написали метод -> test1
}
