 package com.kh.chap03_class.model.vo;

public class Product {
	
	/*
	 * 필드(field)
	 * 
	 * 필드 == 멤버변수 == 인스턴스변수
	 * 
	 * [표현법]
	 * 접
	 * 근제한자 [예약어] 자료형 변수명
	 */
	private String pName;
	private int price;
	private String brand;
	
	/*
	 * 생성자
	 * - 객체를 생성하기 위한 일종의 메소드
	 * 
	 * [표현법]
	 * 접근제한자 클래스명([매개변수,매개변수, ...]){
	 * 
	 * }
	 * 
	 */
	
	// 기본생성자 (안만들면 자동으로 JVM이 만들어줌 => 그래도 만들자)
	 public Product() {} // 주의) 매개변수 생성자 만들시 기본생성자도 만들어야 함 !!
	
	 
	// 매개변수 생성자
	public Product(String pName,int price,String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}
	
	/*
	 * 메소드
	 * -기능을 처리하는 부분
	 * 
	 * [표현법]
	 * 접근제한자 [예약어] 반환형 메소드명([매개변수]){
	 * 		// 기능구현
	 * 
	 * 
	 * }
	 */
	
	// setter
	public void setpName(String pName) {
		this.pName = pName;
		
	}
	
	public void setPrice(int price) {
		this.price = price;
		
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	// getter
	public String getpName() {
		return pName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getBrand() {
		return brand;
	}
		
	
	// 내가 생각할때 유용할 것 같은 메소드도 생성 가능
	// 모든 필드값을 다 합친 하나의 문자열을 반환해주는 메소드
	
	
	public String info() {
		// return pName, price, brand; // return은 하나만 됨. 그리고 반환형을 결정할 수 없다.
		return "pName : " + pName + ", price : " + price + ", brand : "+ brand;
		
		
	}
}


