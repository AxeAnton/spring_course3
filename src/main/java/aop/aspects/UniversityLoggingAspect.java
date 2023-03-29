package aop.aspects;

import org.aspectj.lang.annotation.*;

public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка " +
//                "студентов перед методом getStudents");
//    }

//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
//        // FIXME значение параметра returning, должно совпадать с параметром ....ingAdvice
//        Student firstStudent = students.get(0);
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr " + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//        double avgGrade = firstStudent.getAverGrade();
//        avgGrade =  avgGrade + 0.5;
//        firstStudent.setAverGrade(avgGrade);
//
//        System.out.println("afterReturningGetStudentsLoggingAdvice: логируем получение списка " +
//                "студентов перед методом getStudents");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())",
//            throwing = "exception")
//    public  void afterThrowingGetStudentsLoggingAdvice (Throwable exception ){
//        System.out.println("" +
//                "afterThrowingGetStudentsLoggingAdvice: " +
//                "Логируем выброс исключения" + exception);
//    }
    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice (){
        System.out.println("afterGetStudentsLoggingAdvice: логируем " +
                "нармальное оканчание работы метода или исключение");
    }
}
