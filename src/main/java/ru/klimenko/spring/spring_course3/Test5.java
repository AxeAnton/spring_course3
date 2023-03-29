package ru.klimenko.spring.spring_course3;

import org.springframework.context.support.ClassPathXmlApplicationContext;
// тест
public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

/*      Dog myDog = context.getBean("myPet", Dog.class);
        myDog.say();
        context.close();
// 74 - создали класс, создали context, бин myDog ивызвали метод say, получили:
        Dog bean is created
        Class Dog: init method
        Bow-Bow
        Class Dog: destroy method
        То есть создался бин, выполнился init, отработал метод say, закрылся метод destroy. а потом выполнелся методcontext.close(); -> конспект
*/

        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.say();
        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.say();
        context.close();
// 76 - если создать бин двух собак myDog и yourDog с то получим:
/*      Dog bean is created
        Class Dog: init method
        Bow-Bow
        Bow-Bow
        Class Dog: destroy method
        context.close();
 */
// 77 - а, если в конфиг2 файле добавить scope="prototype", то получим:
/*
        Dog bean is created
        Class Dog: init method
        Bow-Bow
        Dog bean is created
        Class Dog: init method
        Bow-Bow
        НО ЕСТЬ НУАНС - prototype НЕ закорывает метод!!! Class Dog: destroy method. Надо закрывать вручную прописывать. -> конспект
*/
// тест
    }
}
