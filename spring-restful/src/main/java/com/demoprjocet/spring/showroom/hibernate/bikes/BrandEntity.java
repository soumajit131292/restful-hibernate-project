package com.demoprjocet.spring.showroom.hibernate.bikes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;

@Getter
@Entity(name = "brands")
@Table(name = "brands")
public class BrandEntity {

	public BrandEntity() {
	}

	public BrandEntity(int brandId, String brandName) {
		this.brandId = brandId;
		this.brandName = brandName;
	}

	@Id
	@Column(name = "brandId")
	private int brandId;
	@Column(name = "brandName")
	private String brandName;

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

}
