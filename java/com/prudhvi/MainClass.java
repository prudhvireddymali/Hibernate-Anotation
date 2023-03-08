package com.prudhvi;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class MainClass {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		 cfg.configure("hibernate.cfg.xml");
		 SessionFactory factory = cfg.buildSessionFactory();
		 Session session = factory.openSession();
		 Transaction tn = session.beginTransaction();
		 
		/* Employee emp = new Employee();
		 emp.setEid(306);
		 emp.setEname("Amer");
	     emp.setEsalary(9000);
	     
	    // session.save(emp); //Insert
	     session.save(emp); //Insert
	     Employee empid =  session.get(Employee.class, 309);
	     System.out.println("Employee id is " + empid.getEid());
	     System.out.println("Employee id is " + empid.getEname());
	     System.out.println("Employee id is " + empid.getEsalary());*/
		 
		 //HQL= hibernate Query Lang
		 //Query query=session.createQuery("from Employee where esalary>3000");
		 
		 //display the table records
		 /*Query query=session.createQuery("from Employee where eid=:id");
         Scanner sc=new Scanner(System.in);
		 int id=sc.nextInt();
		 query.setParameter("id",id);
		 
		 List list=query.list();
		 Iterator it=list.iterator();
		 while(it.hasNext()){
		 Employee obj=(Employee)it.next();
		 System.out.println(obj.getEid()+" "+obj.getEname()+" "+obj.getEsalary());
		 }
	     
	     tn.commit();*/
		 
	     // delete the row
	    /* Query query=session.createQuery("delete from Employee where eid =:id");
	     Scanner sc = new Scanner(System.in);
	     int id = sc.nextInt();
	     query.setParameter("id", id);
	     query.executeUpdate();
	     
	       tn.commit();*/
		 
		 //update the salary
		 Query query=session.createQuery("update Employee set esalary=:esalary where eid =:id");
		   Scanner sc = new Scanner(System.in);
		   int id = sc.nextInt();
		   int esalary = sc.nextInt();
		   query.setParameter("id", id);
		   query.setParameter("esalary", esalary);
		   query.executeUpdate();
		   
		     tn.commit();
	     
	     session.close();
	     System.out.println("Object Saved");

	}

}
