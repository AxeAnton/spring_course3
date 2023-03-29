package ru.klimenko.spring.spring_course3;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// @Component
// @Scope("prototype")
// 115 - устанавливаем singleton -> идем в созданный ScopeTest
public class Dog implements Pet {
    // 1. Создаем класс dog
    // 5. имплементим Pet
/*   private String name;

         public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        63 - давайте добавим поле name и его гетторы и сетторы - test4
        71 - комментируем все про имя
*/
    public Dog() {
        System.out.println("Dog bean is created");
    }
    // 35 - это сообщение для диагностики-> test3

/*
   public void init() {
        System.out.println("Class Dog: init method");
    }
    public void destroy() {

        System.out.println("Class Dog: destroy method");
    }
    72 - создаем два метода, но в них может быть все что угодно, причем они могут иметь ТД любой, например protected + так же данные методы могут, что то возвращать, но это не где не используется поэтому они всегда void + данные методы должны быть без аргументов ->applicationContext2
*/
/*
    @PostConstruct
    // 123 - вот таким образом указываем аннотацию @PostConstruct, что переводится, как после создания бина
    public void init() {
        System.out.println("Class Dog: init method");
    }

    @PreDestroy
    // 124 - и аннотацию @PreDestroy, что переводится как разрушение после (имеется ввиду закрытия бина)-> новый урок 20 конспект.
    public void destroy() {
        System.out.println("Class Dog: destroy method");
    }
*/

    @Override
    // 6. добавляем аннотацию -> test1
    public void say() {
        System.out.println("Bow-Bow");
    }
}
// 2. И метод say -> test1