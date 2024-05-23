package com.kh.chap06_method.controller;

public class NonStaticMethod {
	/*
	 * 메소드 
	 * 한 기능을 처리하기 위한 용도
	 * 
	 * 패키지명 : 소문자로 시작
	 * 클래스명 : 대문자로 시작
	 * 변수명 : 소문자로 시작
	 * 메소드명 : 소문자로 시작
	 * 
	 * 공통 : 낙타표기법사용! (camleCase)
	 * 
	 * [표현법]
	 * 접근제한자 [예약어] 반환형(반환할 값의 자료형) 메소드명([매개변수1,매개변수2, ... ]){
	 * 		수행내용;
	 * 		[return 결과값;]
	 *
	 * }
	 * 
	 */

	
	// 1. 매개변수 없고 반환값도 없는 메소드
	public void method1() {
		// return 0; => 반환값이 없어야 한다 (void 썼기 때문에)
		System.out.println("매개변수와 반환값이 둘 다 없는 메소드 입니다.");
	}
	
	// 2. 매개변수 없고 반환값은 있는 메소드
	public String method2() {
		System.out.println("매개변수는 없고 반환값은 있는 메소드입니다.");
		return " 집가고 싶다 " ;
		
	}
	
	// 3. 매개변수는 있고 반환값은 없는 메소드
	public void method3(int num1,int num2) {
		System.out.println("매개변수는 있고 반환값은 없는 메소드");
		
		if(num2 != 0) {

			System.out.println("num / num2 : " + (num1 / num2));
		}else {
			System.out.println("0으로 나눌수 없습니다!");
		}
		
	}
	
	//4. 매개변수도 있고 반환값도 있는 메소드
	// 문자열과 정수값을 전달 받아서 해당 문자열의 정수 인덱스에 있는
	//문자값을 뽑아서 반환해주기 
	
	public char method4(String str, int index) {
		System.out.println("매개변수도 있고 반환값도 있는 메소드");
		
		if(index>=0 && index <=str.length()) {
			return str.charAt(index);
			
		}else {
			System.out.println("다시 입력해주세요.");
			return ' '; // else일떄는 캐릭터형이 없기때문에 리턴값 만들어줘야한다
			
		}
		
		
		// return str.charAt(i);
		
	}
	
}
