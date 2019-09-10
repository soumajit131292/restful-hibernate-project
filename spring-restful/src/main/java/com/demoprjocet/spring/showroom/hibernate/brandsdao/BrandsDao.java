package com.demoprjocet.spring.showroom.hibernate.brandsdao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demoprjocet.spring.showroom.hibernate.bikes.BrandEntity;

public class BrandsDao {

	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(BrandEntity.class)
			.buildSessionFactory();

	public List<BrandEntity> getDataDtabase() {

		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<BrandEntity> list = session.createQuery("from brands").getResultList();

		return list;
	}

	public void setDatabase(BrandEntity brand) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(brand);
		session.getTransaction().commit();

	}

	public void putDatabase(BrandEntity updatebrand) {

		Session session = factory.getCurrentSession();
		session.beginTransaction();
		int id = updatebrand.getBrandId();
		BrandEntity brand = session.get(BrandEntity.class, id);
		// brand=updatebrand;
		brand.setBrandName(updatebrand.getBrandName());
		session.getTransaction().commit();

	}

	public void deleteDatabase(int brandId) {

		Session session = factory.getCurrentSession();
		session.beginTransaction();
		// int id=updatebrand.getBrandId();
		BrandEntity brand = session.get(BrandEntity.class, brandId);
		session.delete(brand);
		session.getTransaction().commit();

	}

}
