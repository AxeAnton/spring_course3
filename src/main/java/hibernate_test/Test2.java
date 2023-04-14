package hibernate_test;

import hibernate_test.Test1;
import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.net.URISyntaxException;

public class Test2 {
    public static void main(String[] args) throws URISyntaxException {
        SessionFactory factory = new Configuration().
                configure(new File(Test1.class.getClassLoader().
                        getResource("hibernate.cfg.xml").toURI())).
                addAnnotatedClass(Employee.class).buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {
            Employee emp = new Employee("Oleg", "Sidorov", "HR", 550);
            session.beginTransaction();
            session.save(emp);
//            session.getTransaction().commit();

            int myId = emp.getId();
//            session = factory.getCurrentSession();
//            session.beginTransaction();
            Employee employee = session.get(Employee.class, myId);
            // TODO здесь можно вссместо myId записать - поставить номер
            session.getTransaction().commit();
            System.out.println(employee);

            System.out.println("Done!");

        } finally {
            factory.close();


        }
    }
}
