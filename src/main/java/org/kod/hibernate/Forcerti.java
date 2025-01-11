package org.kod.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Forcerti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for has a relationship
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
        
        //student1 details
        Mvm_students std = new Mvm_students();
        std.setSname("ganesh");
        
        Certificate certificate = new Certificate();
        certificate.setCourse("java");
        certificate.setDuration(45);
        
        std.setCertificate(certificate);
        
        //student2 details
        Mvm_students std2 = new Mvm_students();
        std2.setSname("mukesh");
        
        Certificate certificate2 = new Certificate();
        certificate2.setCourse("python");
        certificate2.setDuration(95);
        
        std2.setCertificate(certificate2 );
        
        transaction.begin();
        manager.persist(std);
        manager.persist(std2);
        transaction.commit();
        manager.close();

	}

}
