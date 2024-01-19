package com.hotel.HotelManagementSystem;

 

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                    .configure("hibernate.cfg.xml")
                    .build();

            Metadata metadata = new MetadataSources(standardRegistry)
                    .getMetadataBuilder()
                    .build();

            return metadata.getSessionFactoryBuilder().build();
        } catch (Exception e) {
            // Handle exception, log it, etc.
            e.printStackTrace();
            throw new RuntimeException("Error building Hibernate SessionFactory: " + e.getMessage(), e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
