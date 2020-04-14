package com.cg.springjpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ProductData")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pk_seq")
	@SequenceGenerator(sequenceName = "pk_seq", allocationSize = 1, name = "pk_seq")
	private int productid;
	private String productName;
	
	private String productDescription;
	private Double productcost;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public Double getProductcost() {
		return productcost;
	}
	public void setProductcost(Double productcost) {
		this.productcost = productcost;
	}
}
