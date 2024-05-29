package com.kh.chap02_string.controller;

public class A_StringPoolTest {
	
	public void method1() {
		
		/*
		 * 
		 * String Pool 이야기
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
		
		
		
		// 동등비교
		System.out.println(str1 == str2); // 주소값비교 => false
		System.out.println(str1.equals(str2)); // 무조건 equals로 비교 해야한다
		// String 클래스의 equals 메소드 이미 오버라이딩 되어있다
		// Object 클래스 확인해보면 원래는 주소값을 동등 비교하는 메소드
		
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// String 클래스에 있는 hashCode 메소드 이미 오버라이딩 되어있음
		// 주소값이 아닌 실제 담겨있는 문자열(hello)을 가지고 해쉬코드를 만듦
		
		// 근데 나는 주소값을 꼭 알고싶다.
		// System.identityHashCode(레퍼런스);
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
	}
	
	public void method2() {
		// String 생성시
		// 1. 매개변수 생성자로 만들기
		String str = new String("hello");
		
		// 2. 문자열을 리터럴값으로 생성
		// heap 영역에 String Pool에 "hello"가 생기는데 중복이 불가능함
		// 따라서 먼저 생긴 "hello"를 str2가 같은 주소값을 보는 형태가 된다.
		String str1 = "hello";
		String str2 = "hello";
		
		System.out.println(str1); // 주소값이 담겨 있지만 toString()에 의해서 값이 나옴
		System.out.println(str2);
		
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(str1 == str2); // true가 나옴..? (주소값 일치)
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		String str3 = "hi"; // 다른글자는 위의 경우가 안됨
		System.out.println(str1==str3);
		System.out.println(System.identityHashCode(str3));
		
		// String클래스 == 불변 클래스 (변하지 않는 클래스)
		// 값을 못바꾸는건 아니지만 변경이 가능하나 그 자리에서 바로 수정되는 개념이 아니다!
		// 값을 바꾸는 개념이 아니고 참조를 변경하는 개념
		
		str3 = "bye";
		System.out.println(System.identityHashCode(str3));
		// 변경하는 순간 기존의 문자열 자리에서 변경되는게 아닌
		// 새로운 곳을 참조하도록 됨 (새로운 주소값 부여받음 == 주소값 변경)
		
		
		str3 = "hello";
		System.out.println(System.identityHashCode(str3));
		
		
	}

}
