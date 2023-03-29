package aop;

import java.util.ArrayList;
import java.util.List;

public class University {

    private List<Student> students = new ArrayList<>();

    public void  addStudents(){
        Student st1 = new Student("Anton Klimenko", 4, 7.5);
        Student st2 = new Student("Denis Titov", 2, 8.5);
        Student st3 = new Student("Anna Makarova", 3, 9.5);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents(){
        System.out.println("Начало работы метода getStudents()" );
        // System.out.println(students.get(3));
        // FIXME Cтудент с индексом 3 будет выбрасывть исключение,
        //  т.к мы в List<Student> внесли тотько инд 0,1 и 2.
        System.out.println("Information from method getStudents(): ");
        System.out.println(students);
        return students;
    }

}
