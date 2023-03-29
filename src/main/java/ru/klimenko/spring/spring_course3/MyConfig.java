package ru.klimenko.spring.spring_course3;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:application.properties")
// 137 - прописываем аннотацию PropertySource над классом в аргумент проперти файл. Запускаем -> test6
// @ComponentScan("ru.klimenko.spring.spring_course3")
// 126 - создали класс, поставили две аннотации @Configuration, @ComponentScan("ru.klimenko.spring.spring_course3") -> Cat

public class MyConfig {
    @Bean
    @Scope("singleton")
    public Pet catBean(){
        // System.out.println("!!!");
        return new Cat();
    }
    // 132 - при @Scope("singleton"), даже если мы пропишем в test6 создание двух бинов -> test6
    @Bean
public  Person personBean(){
        return  new Person(catBean());
}
// 134 - а если прописать еще сощдание  бина Person и ему передать DI ..son(catBean());-> test6

}
