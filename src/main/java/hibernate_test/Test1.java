package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.net.URISyntaxException;

public class Test1 {
    public static void main(String[] args) throws URISyntaxException {
        SessionFactory factory = new Configuration().
                configure(new File(Test1.class.getClassLoader().
                        getResource("hibernate.cfg.xml").toURI())).
                addAnnotatedClass(Employee.class).buildSessionFactory();
//        ДЛЯ ВНЕСЕНИЯ НОВОЙ СТРОКИ В ТАБЛИЦУ бд, необходимо создание сесии, а перед ней и фабрики сесий.
        Session session = factory.getCurrentSession();
        try {
            Employee emp = new Employee("Alex", "Ivanov", "IT", 600);
            session.beginTransaction();

//        открытие сесии
            session.save(emp);
//        сохрание
            session.getTransaction().commit();
//        потверждение
            System.out.println("Done!");
            System.out.println(emp);

        } finally {
            factory.close();
//        закрытие сесии

        }
    }


}
