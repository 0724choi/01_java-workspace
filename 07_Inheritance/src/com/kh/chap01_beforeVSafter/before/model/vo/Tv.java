package com.kh.chap01_beforeVSafter.before.model.vo;

public class Tv {
	
	private String brand;
	private String pCode;
	private String productName;
	private int price;
	private int inch;
	
	
	public Tv() {}
	
	public Tv(String brand, String pCode,String productName, int price, int inch) {
		this.brand = brand;
		this.pCode = pCode;
		this.productName=productName;
		this.price=price;
		this.inch= inch;
		
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getpCode() {
		return pCode;
	}
	
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPirce(int price) {
		this.price = price;
	}
	
	public int getInch() {
		return inch;
	}
	
	public void setInch(int inch) {
		this.inch = inch;
	}
	
	public String information() {
		return "브랜드 : " + brand + " 상품코드 : " + pCode + " 상품명 : " + productName + " 상품가격 : " + price + " 인치 : " + inch;
		
	}

}
