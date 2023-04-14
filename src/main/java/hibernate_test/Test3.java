package hibernate_test;

import hibernate_test.Test1;
import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.net.URISyntaxException;
import java.util.List;

public class Test3 {
    public static void main(String[] args) throws URISyntaxException {
        SessionFactory factory = new Configuration().
                configure(new File(Test1.class.getClassLoader().
                        getResource("hibernate.cfg.xml").toURI())).
                addAnnotatedClass(Employee.class).buildSessionFactory();


        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            List<Employee> emps = session.createQuery("from Employee" + " where name = 'Alex' AND salary > 700").getResultList();
            // TODO Если нам необходимо получать инфо из БД по имени (например Alex), то запрос будет выглядеть так,
            //  но важный момент, что название name, это не название столбца, а названия свойства в классе Emploee.
            for (Employee e:emps) {
                System.out.println(e);
            }
            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {
            factory.close();


        }
    }
}
