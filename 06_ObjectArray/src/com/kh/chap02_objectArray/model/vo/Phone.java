package com.kh.chap02_objectArray.model.vo;

public class Phone {
	
	// 이름, 브랜드명, 가격, 시리즈
	// 필드부
	private String name;
	private String brand;
	private int price;
	private String series;
	

	
	
	
	// 생성자부
	public Phone() {};
	
	public Phone(String name, String brand, int price, String series) {
		this.name =name;
		this.brand = brand;
		this.price = price;
		this.series = series;
	}
	
	
	
	// 메소드부
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBrand() {
		return name;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	
	@Override
	public String toString() {
		return "Phone [name=" + name + ", brand=" + brand + ", price=" + price + ", series=" + series + "]";
	}
	
	
}





