package in.mindcraft.EmpDemo;

import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
		e1.setId(1010);
		e1.setName("Palak");
		
		Employee e2 = new Employee();
		e2.setId(4050);
		e2.setName("Rohit");
		
		Address a1 = new Address();
		a1.setCity("Mumbai");
		a1.setPinCode(401602);
		
		e1.getList().add(a1);

		Configuration con=new Configuration().configure();
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf=con.buildSessionFactory(reg);
		Session s=sf.openSession();
		
		Transaction tx=s.beginTransaction();
		s.save(e1);
		s.save(a1);
		tx.commit();
	}

}
