package com.kh.chap01_beforeVSafter.before.model.vo;

public class Desktop {
	// 필드부
	private String brand;
	private String pCode;
	private String productName;
	private int price;
	private boolean allInOne;
	
	
	// 생성자부
	public Desktop() {}
	public Desktop(String brand, String pCode,String productName, int price, boolean allInOne) {
		this.brand = brand;
		this.pCode = pCode;
		this.productName=productName;
		this.price=price;
		this.allInOne=allInOne;
	}
	
	// 메소드부
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
	
	public boolean isAllInOne() { // boolean자료형의 경우 get --> is 로 쓰기!!!!
		return allInOne;
	}
	
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	public String information() {
		return "브랜드 : " + brand + " 상품코드 : " + pCode + " 상품명 : " + productName + " 상품가격 : " + price + " 일체 여부 : " + allInOne;
		
	}
	
}




	