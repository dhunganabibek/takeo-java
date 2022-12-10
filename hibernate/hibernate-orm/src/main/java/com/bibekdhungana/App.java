package com.bibekdhungana;

import com.bibekdhungana.entities.Vehicle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Vehicle v1 = new Vehicle();
        v1.setVid(1);
        v1.setColor("blue");
        v1.setBrand("Honda");

        Vehicle v2 = new Vehicle();
        v2.setVid(2);
        v2.setColor("brown");
        v2.setBrand("Toyota");

        Vehicle v3 = new Vehicle();
        v3.setVid(3);
        v3.setColor("Green");
        v3.setBrand("Tata");

        session.persist(v1);
        session.persist(v2);
        session.persist(v3);
        transaction.commit();
        System.out.println("operation sucessful");


    }
}
