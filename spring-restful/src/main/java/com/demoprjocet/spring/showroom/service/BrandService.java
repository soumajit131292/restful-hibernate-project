package com.demoprjocet.spring.showroom.service;

import java.util.List;

import com.demoprjocet.spring.showroom.hibernate.bikes.BrandEntity;
import com.demoprjocet.spring.showroom.hibernate.brandsdao.BrandsDao;

public class BrandService {

	BrandsDao Dao=new BrandsDao();
	public void setToDatabase(BrandEntity brand) {
		Dao.setDatabase(brand);

	}

	public void putDatavase(BrandEntity updatebrand) {
		Dao.putDatabase(updatebrand);
		
	}

	public List<BrandEntity> retriveFromDatabase() {
		List<BrandEntity> list=Dao.getDataDtabase();
		return list;
	}

	public void deleteDatavase(int brandId) {
		Dao.deleteDatabase(brandId);
		
	}

}
