package com.kh.chap02_encapsuliation.model.vo; // vo : value object

public class Student {
	// 필드부 구성
	// 접근제한자 자료형 변수명
	private String name;
	private int age;
	private double height;
	private int korScore;
	private int mathScore;
	
	/*
	 * 메소드부
	 * [표현법]
	 * 접근제한자 [예약어] 반환형 메소드명([매개변수]){ // public [static] void(접근할게없다) method
	 * 	.. 실행할 코드
	 * 
	 * }
	 */
	
	
	/*
	public void method1(int a) { // int a = 매개변수 : 전달되는 변수 
		int b = 10; // 일반변수
		System.out.println("a + b : "+ (a+b));*/
		
	// -- setter 메소드
	// 해당 필드에 대입시키고자 하는 값 전달 받아 해당 필드에 대입시켜주는 기능의 메소드
	
	
	/*
	public void setName(String name) {
		// System.out.println(newName);
		// 매개변수 : 해당 메소드를 호출시 전달값을 받아주기 위한 변수 선언문(이 메소드 내에서만 사용 가능)
		name =newName;
	}
	*/
	
	public void setName(String name) { // 관례적표현
		// name = name; // 매개변수 name = 매개변수 name; 형식
					// 필드명과 매개변수명이 동일한 시점에서는 해당 메소드 영역에서 만들어진 변수가 우선권을 지닌다.
		// 필드 name = 매개변수 name
		this.name = name; // 색차이 : this에는 해당 객체의 주소값이 담겨있다.
		
		
	}
	
	public void setAge(int age) {
		this.age = age;	
	}
	
	public void setHeight(double height) {
		this.height = height;
	
	}
	
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	// - getter 메소드
	// 해당 필드에 담긴 값을 반환해주는 역할을 수행
	
	public String getName() {
		return name;
		
	}
	
	public int getAge() {
		return age;
	}
	
	public double getHeight() {
		return height;
	}
	public int getKorScore() {
		return korScore;
	}	
	
	public int getMathScore() {
		return mathScore;
	}
	
		
		
}

