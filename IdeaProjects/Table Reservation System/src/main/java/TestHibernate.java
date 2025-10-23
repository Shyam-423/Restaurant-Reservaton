import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestHibernate {
    public static void main(String[] args) {
        try {
            // Load Hibernate configuration file (hibernate.cfg.xml)
            Configuration cfg = new Configuration().configure("hibernate.cfg.xml");

            // Build the SessionFactory and open a session
            SessionFactory sessionFactory = cfg.buildSessionFactory();
            Session session = sessionFactory.openSession();

            System.out.println("✅ Hibernate connected successfully to the database!");

            session.close();
            sessionFactory.close();
        } catch (Exception e) {
            System.out.println("❌ Hibernate connection failed!");
            e.printStackTrace();
        }
    }
}
