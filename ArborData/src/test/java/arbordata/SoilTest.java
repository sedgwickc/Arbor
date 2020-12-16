package arbordata;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import arbordata.Soil;
import junit.framework.TestCase;

public class SoilTest extends TestCase{
	
	
	private SessionFactory sessionFactory;
	List<Soil> testEntries;
	

	@Override
	public void setUp() throws Exception {
		testEntries = new ArrayList<Soil>();
		testEntries.add(new Soil("potting", "used for potted plants", "MEDIUM"));
		testEntries.add(new Soil("moss", "used for orchids", "HIGH"));
		final StandardServiceRegistry reg = new StandardServiceRegistryBuilder()
				.configure()
				.build();
		sessionFactory = new MetadataSources(reg).buildMetadata().buildSessionFactory();
		
		
	}

	@Override
	public void tearDown() throws Exception {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		for(Soil s : testEntries) {
			session.delete(s);
		}
		session.getTransaction().commit();
		session.close();
		
		if (sessionFactory != null)
			sessionFactory.close();
	}

	@Test
	public void testBasicUsage() {
		
		/* create some soil records */
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(new Soil("potting", "used for potted plants", "MEDIUM"));
		session.save(new Soil("moss", "used for orchids", "HIGH"));
		session.getTransaction().commit();
		session.close();
		
		/* retrieve soil records */
		session = sessionFactory.openSession();
		session.beginTransaction();
		List result = session.createQuery("from Soil").list();
		for ( Soil soil : (List<Soil>) result) {
			System.out.println("Soil ("+ soil.getName()+"):"+soil.getDescription()+", "+soil.getDrainage());
		}
		session.getTransaction().commit();
		session.close();
		
	}
	
	@Test
	public void testSomeMethod() {
		Soil curr = new Soil();
		assertTrue(curr.someMethod());
	}

}
