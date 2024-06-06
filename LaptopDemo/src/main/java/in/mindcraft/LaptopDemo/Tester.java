package in.mindcraft.LaptopDemo;

import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ManyToOne;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Laptop l1 = new Laptop();
		//l1.setId(101);
		l1.setName("ASUS");
		l1.setCost(45000);
		
		Laptop l2 = new Laptop();
		//l2.setId(105);
		l2.setName("DELL");
		l2.setCost(50000);
		
		Laptop l3 = new Laptop();
		//l3.setId(109);
		l3.setName("HP");
		l3.setCost(30000);
		
		Student s1 = new Student();
		s1.setName("Rohit");
		s1.setRoll_no(45);
		
		Student s2 = new Student();
		s2.setName("Sahil");
		s2.setRoll_no(23);
		
		Student s3 = new Student();
		s3.setName("Kashyap");
		s3.setRoll_no(22);
		
		//one student many laptops
		s1.getList1().add(l1);
		s1.getList1().add(l2);
		
		//many laptops one student
		//l1.get
//		
//		//many laptops many students
//		s1.getList1().add(l1);
//		s1.getList1().add(l2);
//		s1.getList1().add(l3);
//		
//		l1.getList3().add(s1);
//		l2.getList3().add(s2);
//		l3.getList3().add(s3);
//		
//		s2.getList1().add(l1);
//		s2.getList1().add(l2);
//		s2.getList1().add(l3);
		
		
		Configuration con = new Configuration().configure();
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session s = sf.openSession();
		
		Transaction tx=s.beginTransaction();
		s.save(l1);
		s.save(l2);
		s.save(l3);
		s.save(s1);
		s.save(s2);
		s.save(s3);
		
		tx.commit();
	}

}

