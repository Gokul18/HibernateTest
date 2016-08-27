package in.co.sunrays.service;

import java.util.Iterator;
import java.util.List;

import in.co.sunrays.dto.CompanyDTO;
import in.co.sunrays.dto.CompanyDTO;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CompanyService {
	public void add(CompanyDTO dto) {
		SessionFactory factory = new Configuration().configure()
				.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(dto);
		transaction.commit();
		session.close();
		System.out.println("Data Successfully Added");
	}

	public void update(CompanyDTO dto) {
		SessionFactory factory = new Configuration().configure()
				.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(dto);
		transaction.commit();
		session.close();
		System.out.println("updated");
	}

	/*public void Get(CompanyDTO dto) {
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from CompanyDTO");
		List list = query.list();
		Iterator it = list.iterator();
		while (it.hasNext()) {
			dto = (CompanyDTO) it.next();
		}
	}*/
	public CompanyDTO get(long pk){
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		CompanyDTO dto=null;
		dto=(CompanyDTO) session.get(CompanyDTO.class,pk);
		session.close();
		return dto;
	}
}
