package com.th.dto;


public class Jewellery {
	
	private int jewelId;
	private String jewelType;
	private String metal;
	private float weight;
	private float price;
	public int getJewelId() {
		return jewelId;
	}
	public void setJewelId(int jewelId) {
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
	@Override
	public String toString() {
		return "Jewellery [jewelId=" + jewelId + ", jewelType=" + jewelType + ", metal=" + metal + ", weight=" + weight
				+ ", price=" + price + "]";
	}
	
	

}
