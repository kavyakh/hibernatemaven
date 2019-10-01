package com.zensar.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.hibernate.entities.Product;

/**
 * @author Kavya KH
 * @Creation_date 1-oct-2019 10:13AM
 * @Modification_date 1-oct-2019 10:13AM
 * @version 
 * Copyright  ZenSar Technologies,All right reserved.
 *
 */
public class HibernateMain 
{
    public static void main( String[] args )
    {
        Configuration c= new Configuration().configure();
        SessionFactory f= c.buildSessionFactory();
        Session s = f.openSession();
        Transaction t = s.beginTransaction();
        
        Product p = new Product();
        p.setProductId(1003);
        p.setName("Fridge");
        p.setBrand("LG");
        p.setPrice(30000);
        s.save(p);
        t.commit();
        s.close();
        System.exit(0);
    }
}
