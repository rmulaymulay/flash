package com.rahul.hibernatetutorial;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.transform.ResultTransformer;

import com.rahul.hibernatetutorial.entities.Alien;
import com.rahul.hibernatetutorial.entities.Laptop;
import com.rahul.hibernatetutorial.entities.Name;
import com.rahul.hibernatetutorial.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       /*Alien telusko = new Alien();
       Name name = new Name();
       name.setFname("Rahul");
       name.setLname("Mulay");
       name.setMname("Vinod");
       telusko.setAid(101);
       telusko.setAname(name);
       telusko.setColor("pista");
       
       Configuration cfg = new Configuration().configure().addAnnotatedClass(Alien.class);
       
       ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
       SessionFactory sf = cfg.buildSessionFactory(reg);
       Session session = sf.openSession();
       session.beginTransaction();
       session.save(telusko);
       session.getTransaction().commit();
       Alien telusko1 = (Alien) session.get(Alien.class, 105);
       System.out.println(telusko1);*/
    	
//    	/*Laptop lap = new Laptop();
//    	lap.setLid(1);
//    	lap.setLname("Dell");
//    	
//    	Student stud = new Student();
//    	stud.setMarks(30);
//    	stud.setName("Navin");
//    	stud.setRollno(10);
//    	stud.getLaptop().add(lap);
//    	lap.setStudent(stud);*/
//    	
//    	Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
//    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
//    	SessionFactory sf = cfg.buildSessionFactory(reg);
//    	Session session = sf.openSession();
//    	/*session.beginTransaction();
//    	session.save(stud);
//    	session.save(lap);
//    	session.getTransaction().commit();*/
//    	
//    	Student student = (Student) session.get(Student.class, 10);
//    	//System.out.println(student);
//    	List<Laptop> laptops = student.getLaptops();
//    	for (Laptop lp : laptops) {
//    		System.out.println(lp.getLname());
//    	}
    	
    	int id = 102;
    	
    	Configuration cfg = new Configuration().configure().addAnnotatedClass(Alien.class);
    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
    	SessionFactory sf = cfg.buildSessionFactory(reg);
    	Session session1 = sf.openSession();
    	session1.beginTransaction();
    	
    	Query q = session1.createQuery("from Alien where aid=102");
    	Alien a = (Alien) q.uniqueResult();
    	System.out.println(a);
    	
    	a.setColor("maroon");

    	session1.evict(a);
    	a.setColor("orange");
    	session1.saveOrUpdate(a);
    
    	session1.getTransaction().commit();
    	session1.close();
    	
    	

    	
    
    }
}
