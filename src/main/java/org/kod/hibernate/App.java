package org.kod.hibernate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println("project started");
        
        
        //creating student
        Student s = new Student();
        s.setsId(101);
        s.setName("ganesh");
        s.setCity("Hyderabad");
        System.out.println(s);
        
        //creating object of address class
        Address address = new Address();
        address.setStreet("street_1");
        address.setCity("Hyderabad");
        address.setOpen(true);
        address.setAddedDate(new Date());
        address.setX(1234.1234);
        
        //for reading the image
        FileInputStream fis = new FileInputStream("src/main/java/linked in dp.JPG");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        address.setImage(data);
        
        
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        
        //for creating the student entity
        entityTransaction.begin();
        entityManager.persist(s);
        entityManager.persist(address);
        entityTransaction.commit();
        entityManagerFactory.close();
        System.out.println("Done...");
    }
}
