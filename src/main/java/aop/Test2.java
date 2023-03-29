package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        University university = context.getBean("university", University.class);
        university.addStudents();
       try {
            List<Student> students = university.getStudents();
        // FIXME здесь важный нюанс, метод работает с бизнес логикой (getStudents), завершает работу НО НЕ присваевает students финальное значение!!!, потом включается  @AfterReturning он изменяет значения и только потом идет назначение students!!!
        System.out.println(students);
       }
        catch (Exception e) {
            System.out.println("Было поймано исключение " + e );
        }
        context.close();
    }
}
