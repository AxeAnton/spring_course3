package hibernate_test;

import hibernate_test.Test1;
import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.net.URISyntaxException;

public class Test4 {
    public static void main(String[] args) throws URISyntaxException {
        SessionFactory factory = new Configuration().
                configure(new File(Test1.class.getClassLoader().
                        getResource("hibernate.cfg.xml").toURI())).
                addAnnotatedClass(Employee.class).buildSessionFactory();


        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            Employee emp = session.get(Employee.class, 3);
//            TODO Изменение свойства объекта в БД, например зарплаты по id = 3.
//            emp.setSalary(1400);

            session.createQuery("update Employee set salary=475 where name = 'Anton'").executeUpdate();

            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {
            factory.close();


        }
    }
}
