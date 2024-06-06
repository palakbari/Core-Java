package in.mindcraft.MenuDriven;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MobilePhone mp1 = new MobilePhone();
		mp1.setId(405);
		mp1.setName("Sumsung");
		mp1.setPrice(35000);
		
		MobilePhone mp2 = new MobilePhone();
		mp2.setId(108);
		mp2.setName("1Plus");
		mp2.setPrice(45000);
		
		MobilePhone mp3 = new MobilePhone();
		mp3.setId(300);
		mp3.setName("iPhone");
		mp3.setPrice(80000);
		
		Configuration con=new Configuration().configure();
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf=con.buildSessionFactory(reg);
		Session s=sf.openSession();
		
		Transaction tx=s.beginTransaction();
		s.save(mp1);
		s.save(mp2);
		s.save(mp3);
		
		Query q = s.createQuery("from MobilePhone where price>=40000");
		List <MobilePhone> mlist = q.list();
		for(MobilePhone m:mlist)
			System.out.println(m);
		
		tx.commit();
				
		Scanner sc = new Scanner(System.in);
		int choice;
		int id = 0;
		String mname;
		double price = 0;
		
		while(true)
		{
			System.out.println("Enter your choice:");
			System.out.println("1. Insert Mobile Details");
			System.out.println("2. Update Mobile Details");
			System.out.println("3. Delete Mobile Details");
			System.out.println();
			
			choice= sc.nextInt();
			switch(choice)
			{
				case 1:
				    System.out.println("Enter Mobile Details to be Inserted");
				    System.out.println("Enter Mobile ID:");
				    int i = sc.nextInt(); 
				    System.out.println("Enter Mobile Name:");
				    String name = sc.next(); 
				    System.out.println("Enter Mobile Price:");
				    double p = sc.nextDouble();
	
//				    MobilePhone newMobile = new MobilePhone();
//				    newMobile.setId(id);
//				    newMobile.setName(name);
//				    newMobile.setPrice(price);
				    
				    Transaction insertTx = s.beginTransaction();
				    Query insertQuery =  s.createQuery("INSERT INTO MobilePhone (id, name, price) VALUES (:id, :name, :price)");
				    insertQuery.setParameter("id", i);
				    insertQuery.setParameter("name", name);
				    insertQuery.setParameter("price", price);
	
				    int rowsAffected = insertQuery.executeUpdate();
				    insertTx.commit();
				    System.out.println(rowsAffected + " row(s) inserted.");
				    break;

				case 2:
					System.out.println("Enter Mobile Details to be Updated");
					System.out.println("Enter Mobile ID:");
					int updateId = sc.nextInt();
					System.out.println("Enter New Mobile Name:");
					String newName = sc.next(); 
					System.out.println("Enter New Mobile Price:");
					double newPrice = sc.nextDouble(); 

					Transaction updateTx = s.beginTransaction();
					Query updateQuery = s.createQuery("Update MobilePhone set name = :newName, price = :newPrice where id = :id");
					updateQuery.setParameter("id", updateId);
					updateQuery.setParameter("newName", newName);
					updateQuery.setParameter("newPrice", newPrice);
					

					int rowsAffecte = updateQuery.executeUpdate();
					updateTx.commit();
					System.out.println(rowsAffecte + " row(s) updated.");
					break;
					
				case 3:
					System.out.println("Enter ID to be deleted");
					System.out.println("Enter Mobile ID:");
					choice=sc.nextInt();
				
					Transaction deleteTx = s.beginTransaction();
					Query deleteQuery = s.createQuery("Delete from Mobile Phone where mid="+choice);
					deleteQuery.setParameter("id",choice);
					
					int rowsAffect = deleteQuery.executeUpdate();
					deleteTx.commit();
					System.out.println(rowsAffect + " row(s) deleted.");
					break;
			}
		}
	}
}
