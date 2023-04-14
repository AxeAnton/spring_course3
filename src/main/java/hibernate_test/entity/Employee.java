package hibernate_test.entity;

import javax.persistence.*;

// импорт обязательно из javax..., там есть и другой варик.
@Entity
@Table(name = "employees")
// таблица в MySQL с которой связан класс

public class Employee {
    @Id
// аннотация означает, что это Primary Key
    @GeneratedValue (strategy = GenerationType.IDENTITY)
//    Это стратегия по которой будет генерироваться Primary Key
    @Column(name = "id")
// указываем с каким столбцом связано свойство
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "department")
    private String department;
    @Column(name = "salary")
    private int salary;

    public Employee() {
    }
//    ОБЯЗАТЕЛЬНО конструктор без аргументов.

    public Employee(String name, String surname, String department, int salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

//    конструктор с арг. не обязательный но для нас удобный.


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
