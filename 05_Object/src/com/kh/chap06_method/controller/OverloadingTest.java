package com.kh.chap06_method.controller;

public class OverloadingTest {
	
	// 오버로딩 : 한클래스 내에 같은 메소드명으로 정의할 수 있는 것
	
	public void test() {
		// 차은우 출력 코드 작성~~
	}

	/*
	public void test() {
		// 카리나 출력 코드 작성~~
	}
	*/
	
	public void test(int a ) {
		
	}
	
	public void test(int a, String s) {
		
	}
	
	public void test(String s, int a ) {
		
	}
	
	public void test(int a, int b) {
		
	}
	
	/*
	public void test(int c, int d ) {
		
	}
	오버로딩이 가능하려면 매개변수명이 아니라
	매개변수의 개수와 순서가 다르게 작성되어야한다.
	
	*/
	
	public void test(String s ) {
		
	}
	
	/*
	public void test(String s ) {
		return "gd";
	}
	반환해도 소용없고 매개변수를 봐야함!
	접근제한자도 소용없고 매개변수가 달라야한다!
	*/
	
	
	/*
	 *   결론
	 *   오버로딩 : 한 클래스내에 동일한 이름의 메소드들
	 *   		단, 매개변수명, 접근제한자, 반환형을 떠나서 매개변수의 자료형,개수,순서가 다르게 작성되어야 함!
	 *   
	 *   		
	 */
	
	
	
}




