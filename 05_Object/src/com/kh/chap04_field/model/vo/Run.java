package com.kh.chap04_field.model.vo;

public class Run {
	
public static void main(String[] args) {
		
		//-------------- FiledTest1--------------------
		FieldTest1 f1 = new FieldTest1();
		//f1.test(7);
		
		//-------------- FiledTest2--------------------
		FieldTest2 f2 = new FieldTest2();
		System.out.println(f2.pub);
		
		// protected : 같은 패키지내에서는 접근 가능, 다른 패지키라면
		// 상속구조에서만 접근 가능
		 System.out.println(f2.pro);
		
		
		
		// default : 오직 같은 패지키에서만 접근 가능!
		 System.out.println(f2.def);
		
		
		// private : 오직 같은 클래스에서만 접근 가능!
		// System.out.println(f2.pri);
		
		

}
}