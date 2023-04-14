package hibernate_test;

import hibernate_test.Test1;
import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.net.URISyntaxException;

public class Test5 {
    public static void main(String[] args) throws URISyntaxException {
        SessionFactory factory = new Configuration().
                configure(new File(Test1.class.getClassLoader().
                        getResource("hibernate.cfg.xml").toURI())).
                addAnnotatedClass(Employee.class).buildSessionFactory();


        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            Employee emp = session.get(Employee.class, 9);
//            session.delete(emp);
//            TODO Удаление объекта по id

            session.createQuery("delete Employee where name = 'Alex'").executeUpdate();
//            TODO Удаление объекта по имени

            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {
            factory.close();

        }
    }
}
