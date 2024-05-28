package com.kh.chap02_string.controller;

public class A_StringPoolTest {
	
	public void method1() {
		
		/*
		String s = "안녕"; // 참조자료형
		int a = 10; // 기본자료형
		*/
		
		// 1. 생성자를 통한 문자열 생성
		String str1 = new String("hello"); // 매개변수 생성자
		String str2 = new String("hello"); // 매개변수 생성자
		
		// 주소값이 나오지 않을까?
		System.out.println(str1.toString());
		System.out.println(str2);
		// String 클래스에 toString() 메소드가 이미 오버라이딩 돼있음! (실제 담긴 문자열 반환하도록)
		
		
	}

}
