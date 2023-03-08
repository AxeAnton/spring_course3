package ru.klimenko.spring.spring_course3;

public class Person {
    private Pet pet;
    // 20 - создали класс + поле pet
    private  String surname;
    private  int age;
    // 44 - Далее рассмотрим как внедрить строки и другие значения с помощью config файла, сначало создаем еще два поля фамилия и возраст, добавляем гетторы и сетторы -> applicationContext

/*    public Person(Pet pet) {
        System.out.println("Person bean is created");
        // 33 - это сообщение для диагностики-> Cat
        this.pet = pet;
    }
    // 26 - Теперь рассмотрим внедрение DI с помощью конструктора. Так у Person, была добавлена зависимость - Pet -  private Pet pet;, и ее передали в конструктор. -> applicationContext
*/

    public Person() {
        System.out.println("Person bean is created");
    }
    // 39 - комментируем верхний конструктор и делаем новый без аргумента, т.к вот эта строчка <constructor-arg ref="myPet"/> (установка зависимости через конструктор), использоваться не будет в классе applicationContext ->applicationContext

//  конвертация pet -> setPet
    public void setPet(Pet pet) {
        System.out.println("Class Person: Set Pet");
        this.pet = pet;
    }
// 38 - добавляем сеттор, устанавливает животное персону с помощью сетторов + диагностическое сообщение.

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        // 47 - диагностическое сообщение
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        // 48 - диагностическое сообщение -> test3
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Heel, my lovely Pet!");
        pet.say();
    }
// 21 - написали метод позвать животное -> test3


}
