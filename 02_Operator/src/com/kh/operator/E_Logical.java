package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	
	/*
	 * 논리연산자 (이항연산자)
	 * 두 개의 논리값을 연산해주는 연산자
	 * 논리연산한 결과 마저도 논리값임!!
	 * 
	 * 논리값 && 논리값 : 왼쪽과 오른쪽 둘다 ture일 경우  ture 반환 (AND)
	 * 논리값 || 논리값 : 왼쪽과 오른쪽중 하나라도 ture일 경우 ture 반환 (OR) 
	 */

	public void method1() {
		// 사용자가 입력한 정수값이 1부터 100사이의 값인지 확인하는 작업
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 한개 입력하시오 : ");
		int num = sc.nextInt();
		
		// boolean result = (1 <= num <= 100); 자바에서 이런 표현 불가능
		
		boolean result = (num >= 1) && (num <= 100); // num값이 1이상이고 100이하인 경우
		System.out.println("입력한 값이 1이상 100이하 인가요? "+ result);
		sc.close();
		
	}
	
	public void method2() {
		// 사용자가 입력한 문자값(영문자 한글자)이 영어 대문자인지 확인
		Scanner sc = new Scanner(System.in);
		System.out.print("영문자를 한글자만 입력하시오 : " );
		char input = sc.nextLine().charAt(0);

		boolean result = (input >= 65) && (input <= 90);
		// 대소비교가 되는 이유? => int와 char가 형변환이 자동으로 되기 때문이다
		System.out.println("사용자가 입력한 값이 대문자 입니까? : " + result);
		
		
		
		// 두 번째 형변환 방법
		// boolean result = (input >= 'A') && (input <='Z');
		 sc.close();
		
	}
}
