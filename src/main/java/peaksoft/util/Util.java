package peaksoft.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import peaksoft.entity.*;


import java.util.Properties;

public class Util {

    private static final SessionFactory sessionFactory = createSessionFactory();

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

    public static SessionFactory createSessionFactory() {
        Properties properties = new Properties();
        properties.put(Environment.DRIVER, "org.postgresql.Driver");
        properties.put(Environment.URL, "jdbc:postgresql://localhost:5432/postgres");
        properties.put(Environment.USER, "postgres");
        properties.put(Environment.PASS, "1234");


        properties.put(Environment.HBM2DDL_AUTO, "update");
        properties.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
        properties.put(Environment.SHOW_SQL, "true");


        org.hibernate.cfg.Configuration configuration = new Configuration();
        configuration.addProperties(properties);
        configuration.addAnnotatedClass(Car.class);
        configuration.addAnnotatedClass(Garage.class);
        configuration.addAnnotatedClass(Person.class);
        configuration.addAnnotatedClass(Company.class);
        configuration.addAnnotatedClass(SocialMedia.class);

        return configuration.buildSessionFactory();

    }
}
