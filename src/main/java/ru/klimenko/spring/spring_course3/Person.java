package ru.klimenko.spring.spring_course3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// FIXME @Component("personBean")
// 90 - и так что бы установить зависимость нам надо два бина, в Cat аннотация @Component("catBean есть") уже есть прописываем и в данный класс @Component("personBean")
public class Person {
// FIXME @Autowired
// 97 - ставим данную аннатацию над поле и все -> ConfigWithAnnotations1
// FIXME @Qualifier("catBean")
// 103 - Т.к, класс Pet наследуем несколькими классами и мы их пометили @Component, а в Persone установили @Autowired над свойством Pet, которое не указывает на контретное животное/клас, то необходимо использовать аннотацию  @Qualifier("catBean") с ID(catBean или дефолтный) того класса который нужен, это пример с полем.
    private Pet pet;
// 20 - создали класс + поле pet

@Value("Anton")
// 136 - Это уже 21 урок, и рассмотрим как добавить данные из проперти файла. Сначала возвращаем аннотации Value здесь и возрасту ниже -> MyConfig
// 105 - 18 урок про аннотацию  @Value, ее можно испльзовать вместо settor и установить имя и возраст прямо в ней.
// FIXME @Value("${person.surname}")
// 113 - комментируем
// 108 - теперь в аргументе аннотации пишим вот так
    private String surname;

@Value("44")
// 106 - это пример с утановкой возраста он добавляется в кавычках, но это ХАРД код, что бы его сделать гибким идем в -> applicationContext3.
// FIXME @Value("${person.age}")
// 114 - комментируем -> Dog
// 109 - аналогично - ConfigWithAnnotations1
    private int age;
// 44 - Далее рассмотрим как внедрить строки и другие значения с помощью config файла, сначало создаем еще два поля фамилия и возраст, добавляем гетторы и сетторы -> applicationContext

// FIXME @Autowired
// public Person(@Qualifier("catBean") Pet pet) {
// 104 - это пример с конструктором, не много синтексис другой.-> далее 18 урок еще не писал.
//  System.out.println("Person bean is created");
//  this.pet = pet;
//    }

    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

// FIXME @Autowired
// public Person(Pet pet) {
// System.out.println("Person bean is created");
// this.pet = pet;
//    }
// 91 - и так ставим аннотацию @Autowired и ВСЕ, причем если конструктор ОДИН, то даже @Autowired, писать не обязательно, но лучше написать -> ConfigWithAnnotations1!
// 94 - закомментируем данный конструктор

//    public Person(@Qualifier("catBean") Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }
// 26 - Теперь рассмотрим внедрение DI с помощью конструктора. Так у Person, была добавлена зависимость - Pet -  private Pet pet;, и ее передали в конструктор. -> applicationContext


// public Person() {
// System.out.println("Person bean is created");
//        }
// 95 - разккоментируем данный конструктор
// 39 - комментируем верхний конструктор и делаем новый без аргумента, т.к вот эта строчка <constructor-arg ref="myPet"/> (установка зависимости через конструктор), использоваться не будет в классе applicationContext ->applicationContext

//  конвертация pet -> setPet
// FIXME @Autowired
// 96 - ставим данную аннотацию над сеттором (вообще можно и над ЛЮБЫМ методом) и все -> ConfigWithAnnotations1
// FIXME @Qualifier("dog")
// 104 - это пример с сеттром,
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
