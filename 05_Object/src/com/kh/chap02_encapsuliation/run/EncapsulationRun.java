package com.kh.chap02_encapsuliation.run;

import com.kh.chap02_encapsuliation.model.vo.Student;

public class EncapsulationRun {
	
	/*
	 * 7. 캡슐화 과정까지 적용해서 완벽한 클래스의 형태를 갖추게끔!
	 * 
	 *  * 캡슐화 : 추상화를 통해 정의된 속성들과 기능들을 하나로 묶어 관리하는 기법중 하나로
	 *  		  클래스에서 가장 중요한 목적인 "데이터의 접근 제한"을 원칙적으로
	 * 			  외부로부터 "데이터의 직접 접근을 막고" 
	 * 			  대신 "데이터를 간접적으로나마 처리(값을 대입, 값을 돌려줌)" 할 
	 *            메소드를 클래스 내부에 작성해서 관리
	 * 
	 * 
	 * 	1) 정보 은닉 : private
	 * 		직접 접근을 막기위해 private라는 접근제한자 사용!
	 * 
	 *  2) setter / getter 메소드 만듦
	 *  	private 하는 순간 필드에 직접 접근 불가능 해지기 때문에!
	 *  	setter 메소드 : 해당 필드에 대입시키고자 하는 값 전달 받아 해당 필드에 대입시켜주는 메소드
	 *  	getter 메소드 : 해당 필드에 담긴값을 반환해주는 메소드
	 */

	public static void main(String[] args) {
		
		Student cha = new Student();
		
		/*
		cha.name ="차은우";
		cha.age = 20;
		cha.heigth = 188.8;
		cha.korScore = 100;
		cha.mathScore = 80;
		*/ 
		
		// cha.method1(7); // private로 바꾸면 접근 불가능
		
		cha.setName("차은우");
		cha.setAge(20);
		cha.setHeight(188.8);
		cha.setKorScore(100);
		cha.setMathScore(80);
		
		cha.setAge(21);
		
		System.out.println(cha.getName());
		System.out.println(cha.getAge());
	}

}
