package com.ex;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class mainlogic {
	public static void main(String[] args) {
		Configuration cf = new Configuration();
	cf.configure("Hibernate.xml");
		   SessionFactory sf=cf.buildSessionFactory();
			Session se = sf.openSession();
	Transaction tx=se.beginTransaction();
	
	
	ChequeType c = new ChequeType();
	c.setPid(102);
	c.setAmount(50000);
	c.setCqType("ICICI");  
	
	CreditCard C = new CreditCard();
	C.setPid(103);
	C.setAmount(60000);	
	C.setCcType("VISA");
	
	se.save(c);
	tx.commit();
	
	
//		CreditCard c = new CreditCard();
//	  	c.setPid(101);
//		c.setAmount(54000);
//		c.setCcType("VISA");
//		
//	se.save(c);
//	tx.commit();
	
	}
	
}
