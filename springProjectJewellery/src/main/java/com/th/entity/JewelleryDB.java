package com.th.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class JewelleryDB {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer jewelId;
	private String jewelType;
	private String metal;
	private float weight;
	private float price;
	
	public Integer getJewelId() {
		return jewelId;
	}
	public void setJewelId(Integer jewelId) {
		this.jewelId = jewelId;
	}
	public String getJewelType() {
		return jewelType;
	}
	public void setJewelType(String jewelType) {
		this.jewelType = jewelType;
	}
	public String getMetal() {
		return metal;
	}
	public void setMetal(String metal) {
		this.metal = metal;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
