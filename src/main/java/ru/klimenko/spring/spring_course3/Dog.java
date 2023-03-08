package ru.klimenko.spring.spring_course3;

public class Dog implements Pet {
    // 1. Создаем класс dog
    // 5. имплементим Pet
    //  private String name;
    public Dog() {
        System.out.println("Dog bean is created");
    }
     // 35 - это сообщение для диагностики-> test3

    /*    public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    */
    public /*protected*/ void init() {
        System.out.println("Class Dog: init method");
    }

    public /* private*/ void destroy() {

        System.out.println("Class Dog: destroy method");
    }

    @Override
    // 6. добавляем аннотацию -> test1
    public void say() {
        System.out.println("Bow-Bow");
    }
}
// 2. И метод say -> test1