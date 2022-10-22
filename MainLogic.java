package com.ex;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class MainLogic {

	public static void main(String[] args) {
	Configuration cf = new Configuration();
//	cf.configure("EmployeeCofig.xml");
	   SessionFactory sf=Hibernate.getSessionFactory();
		Session se = sf.openSession();
		Transaction tx=se.beginTransaction();
		//load
//		Employee ee = se.load(Employee.class,new Integer(1023));
//		System.out.println("Employee Id = "+ee.getId());
//		System.out.println("Employee Name = "+ee.getName());
//		tx.commit();
		
		//get
		Employee ee = se.get(Employee.class,new Integer(1023));
		System.out.println("Employee Id = "+ee.getId());
		System.out.println("Employee Name = "+ee.getName());
		System.out.println("Employee Salary = "+ee.getSalary());
		tx.commit();
	}
	}	
	
//		Query qr=se.createQuery("select ee.id,ee.name,ee.salary from Employee ee where ee.id in(:input,:value)");
//		qr.setParameter("input",1023);
//		qr.setParameter("value",1024);
//		List i =qr.list();
//
//		Iterator li = i.iterator();
//		while(li.hasNext()) {
//			Object[] o=(Object[])li.next();
//			System.out.println(o[0]+"   "+o[1]+"   "+o[2]);
		


	
		//update
//		Employee ee = new Employee();		
//		ee.setId(1028);
//		ee.setName("Rasheed");
//		ee.setSalary(70000);
//		ee.setBranch("Hyderabad");
//		ee.setProhibition("accepted");
//		se.update(ee);
//		tx.commit();
//		

// 			save
		
//		Employee ee = new Employee();		
//		ee.setId(1024);
//		ee.setName("Harsha");
//		ee.setSalary(60000);
//		ee.setBranch("Pune");
//		ee.setProhibition("accepted");
//		se.save(ee);
//		tx.commit();
		
		
//		       delete
		
	
//		Employee ee=se.load(Employee.class,1028);
//		System.out.println(ee.getId()+"   "+ee.getName()+"    "+ee.getSalary()+"   "+ee.getBranch()+"   "+ee.getProhibition());
//		se.delete(ee);
//		tx.commit();
		
//				 persist
		
//		Employee ee=se.load(Employee.class,1023);
//		System.out.println(ee.getId()+"   "+ee.getName()+"    "+ee.getSalary()+"   "+ee.getBranch()+"   "+ee.getProhibition());
//		se.persist(ee);
//		tx.commit();
		
		
// 			      merge
//		Employee ee = new Employee();		
//	ee.setId(1028);
//	ee.setName("Havinash");
//	ee.setSalary(70000);
//		ee.setBranch("Mumbai");
//		ee.setProhibition("accepted");
//		se.merge(ee);
//		tx.commit();
	
		
//		Employee ee=se.load(Employee.class,1023);
//		System.out.println(ee.getId()+"   "+ee.getName()+"    "+ee.getSalary()+"   "+ee.getBranch()+"   "+ee.getProhibition()); 
	
		
//		Retrieving one particular value
		//	Employee ee=(Employee)li.next();
//	
//
//	System.out.println(ee.getId()+"   "+ee.getName()+"   "+ee.getSalary()+"   "+ee.getBranch()+"   "+ee.getProhibition());
//}
