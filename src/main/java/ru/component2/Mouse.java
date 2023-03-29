package ru.component2;

import org.springframework.stereotype.Component;
import ru.klimenko.spring.spring_course3.Pet;
@Component("mouseBean")
public class Mouse implements Pet {

    public Mouse() {
        System.out.println("Mouse bean is created");
    }

    @Override
    public void say() {
        System.out.println("Mi mi");
    }


}
