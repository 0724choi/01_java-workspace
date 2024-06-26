package com.hw1.model.vo;

public class Product {
	
	private String productId; 	// 상품아이디 
	private String productName; // 상품명
	private String productArea; // 생산지
	private int price; 			//가격
	private double tax;			//부가세비율
	
	public Product() {} // 기본 생성자
	
	
	// 매개변수 생성자
	public Product(String productId, String productName, String productArea, int price, double tax) {
		this.productId = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
		
		
}	
	public String info() {
		return productId+ " " + productName +" "+ productArea +" "+ price +" " + tax;
	}
	
	public String info2() {
		return ("부가세 포함 가격 : "+(int)(price+(price*tax)));
	}
	
	
	// setter 
	
	public void setProductId(String productId) {
		this.productId = productId;

	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	
	// getter 
	
	public String getProductId() {
		return productId;
	}
	public String getproductName() {
		return productName;
	}
	public String getProductArea() {
		return productArea;
	}
	public int getPrice() {
		return price;
	}
	public double getTax() {
		return tax;
	}
	
	


}
