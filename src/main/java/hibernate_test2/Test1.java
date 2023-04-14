package hibernate_test2;


import hibernate_test2.entity.Detail;
import hibernate_test2.entity.Employee;
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
                addAnnotatedClass(Employee.class).addAnnotatedClass(Detail.class).buildSessionFactory();
// FIXME Важно, что необходимо в фабрику добавить все классу которые связаны с entity,
//  здесь мы добавили addAnnotatedClass(Detail.class).

        try {
            Session session = factory.getCurrentSession();

            Employee employee = new Employee("Alex", "Klimenko", "IT", 500);
            Detail detail = new Detail("St.Petersburg", "555-55-55", "alex@gmail.com");
// FIXME Создали объекты работника и его детали
            employee.setEmpDetail(detail);

            session.beginTransaction();

            session.save(employee);

            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {
            factory.close();
//        закрытие сесии

        }
    }


}
