package com.kh.operator;

public class C_Arithmetic {
	
	/*
	 * 산술 연산자 (이항연산자 == 두 개의 값을 가지고 연산)
	 * + - * / %
	 * 
	 * 
	 */
	public void method1() {
		int num1 = 10;
		int num2 = 3;
		
		// System.out.println("num1 + num2 = " + num1 + num2); -> 103이 나옴 (우선순위)
		System.out.println("num1 + num2 = " + (num1 + num2)); // 13
		// System.out.println("num1 - num2 = "+ num1 - num2);
		// => 에러발생 우선순위 때문에 문자열 - 숫자 꼴이 된다
		System.out.println("num1 - num2 = "+ (num1 - num2)); // 7
		System.out.println("num1 * num2 = "+ (num1 * num2)); // 30 => 곱셈연산 우선순위 먼저
		System.out.println("num1 / num2 = "+ (num1 / num2)); // 3 => 나누기했을때 몫
		System.out.println("num1 / num2 = "+ (num1 % num2)); // 1 => 나누기했을때 나머지
		
		// 값 % 2 == 0 -> 짝수 
		// 값 % 2 == 1 -> 홀수
		// 값 % n == 0 -> n의 배수라는 뜻
		
		
		
		
		
	}

	
	
}
