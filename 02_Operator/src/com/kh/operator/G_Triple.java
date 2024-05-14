package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	
	/*
	 *	삼항연산자(세개의 항목을 가지고 연산하는 연산자)
	 *	
	 *	[표현식]
	 *	조건식 ? 조건식이 참일 경우 반환할 값 : 조건식이 거짓일 경우 반환할 값;
	 *
	 * 	이때, 조건식은 반드시  true or false가 나오도록 설정!
	 * 	주로 비교, 논리 연산자를 통해 작성!
	 * 
	 */

	
	
	public void method1() {
		// 입력받은 정수의 값이 양수인지 아닌지 판별 후 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 :");
		
		int num = sc.nextInt();
		
		// String result = (num > 0) ? "양수입니다." : "양수가 아닙니다.";
		
		// System.out.println(num + " 은(는) " + result);
		
		System.out.println(num + " 은(는) " + ((num > 0) ? "양수입니다." : "양수가 아닙니다."));
		// 코드 줄이는 방법 result를 만들지 않아도 되는 경우에 사용!
		
		sc.close();
		
	}
	
	
	public void method2() {
		// 입력받은 정수값이 짝수인지 홀수인지 판별 후 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "짝수입니다." : "홀수입니다.";
		String result2 = (num % 2 == 1) ? "홀수입니다." : "짝수입니다.";
		
		System.out.println(num + " 은(는) "+ result2);

	
	}
	
	
	public void method3() {
		// 사용자한테 종료여부를 입력받고 판별하여 출력하는 프로그램
		// "종료하려면 Y를 입력해주세요 : " 
		// y,Y 누르면 프로그램이 종료합니다 문구 이외에것 누르면 계속진행
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("시스템을 종료하려면 (Y / y)를 눌러주세요 : ");
		
		char ch = sc.nextLine().charAt(0);
		
		String result = (ch == 'y' || ch =='Y') ? "프로그램을 종료합니다." : "프로그램을 진행합니다.";
		
		System.out.println(result);
		
		sc.close();
		
		
	}
	
	public void method4() {
		//입력받은 문자값이 영어 소문자인지 아닌지 판별 후 출력
		// 영문 한글자 입력 : 
		// 소문자입니다 or 소문자아닙니다
		// 출력결과 예시 : 입력한 문자 x는 ~ 입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("영문자 한글자 입력해 주세요 : ");
		
		char ch = sc.nextLine().charAt(0);
		System.out.println("입력한 문자 " + ch + "은(는) "+ ((ch >= 'a' && ch <= 'z') ?"소문자 입니다" : "소문자가 아닙니다"));
		// 자동형변환 이용하기!
		sc.close();
		
	}
	
	
	public void nethod4_1() {
		// 0보다 큰지 작은지 판별하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요 : ");
		
		int num = sc.nextInt();
		
		System.out.println("입력하신 숫자 "+ num + "은/는 " + ((num > 0) ? "0보다 큽니다": "0보다 작습니다"));
		
		
	}
	
	public void method5() {
		// 사용자가 입력한 정수값이 양수인지 음수인지 0인지 판별한 다음 출력
		// 삼항연산자 중첩 예제
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해 주세요 : ");
		
		int num = sc.nextInt();
		String result = ((num > 0) ? "양수입니다." : (num == 0) ? "0입니다." : "음수입니다");
		
		
		System.out.println(num + " 은/는 " + result); 
		
	
	
	}
	
	public void method6() {
		// 사용자에게 두개의 정수를 입력 받고 +또는 -를 입력 받아 
		// 그에 맞는 연산결과를 출력
		// 단, + 또는 - 외의 다른문자 입력시 잘못입력했습니다 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해 주세요 : ");
		int num1  = sc.nextInt();
		
		System.out.print("정수를 하나 더 입력해 주세요 : ");
		int num2 = sc.nextInt();
		
		System.out.print("+ / - 를 입력해 주세요 : ");
		sc.nextLine(); // !! 버퍼엔터 제거
		char op = sc.nextLine().charAt(0);
		
		String result = (op == '+') ? (num1 + num2 + "") : (op == '-') ? (num1 - num2 + "") : ("잘못 입력했습니다.");
		//                             -> !! 문자열을 추가하면 문자열이 된다
		
		System.out.println("결과 :  "+ result);
		
		
		
		
		
		
	
		
		
		
		
	}
}
