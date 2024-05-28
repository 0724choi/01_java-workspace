package com.kh.chap03_abstractAndinterface.part02_basic.model.vo;

public interface Basic {
	
	// 추상클래스(abstract class)		 : 일반 필드 + 일반 메소드 [+ 추상 메소드]
	// 인터페이스(interface) 	    	 : only 상수필드 + 추상메소드	
	
	// 인터페이스에서의 필드는 무조건 상수필드!
	/*public static final*/ int num = 10;
	
	
	// 인터페이스에서의 메소드는 무조건 추상메소드!
	/*public abstract*/ void eat();
	/*public abstract*/ void sleep();
	
	
}
