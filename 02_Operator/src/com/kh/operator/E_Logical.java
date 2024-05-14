package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	
	/*
	 * 논리연산자 (이항연산자)
	 * 두 개의 논리값을 연산해주는 연산자
	 * 논리연산한 결과 마저도 논리값임!!
	 * 
	 * 논리값 && 논리값 : 왼쪽과 오른쪽 둘다 true일 경우  true 반환 (AND)
	 * 논리값 || 논리값 : 왼쪽과 오른쪽중 하나라도 true일 경우 true 반환 (OR) 
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
	
	
	public void method3() {
		// 사용자에게 성별을 입력 받은 후 여자인지 확인
		Scanner sc = new Scanner(System.in);
		System.out.print("성별을 입력해주세요 (M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		boolean result = (gender == 'f') || (gender == 'F'); // || : ~이거나 또는
		System.out.println("사용자가 여성입니까? : " + result);
		
		// || : 두개의 조건 중 하나라도 true가 있다면 || 연산의 결과값이 true
		//		두개의 조건 중 모두 false일 경우 || 연산의 결과값이 false
		
		
	}
	
	
	public void method4() {
		// 사용자에게 입력을 받아 게임을 종료하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		System.out.print("게임을 종료하시려면 y를 입력해주세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		
		boolean result = (ch == 'y')||( ch == 'Y');
		System.out.println("사용자가 입력한 값이 y또는 Y입니까? :" + result);
	}
	
	/*
	 *  %% : 두 개의 조건이 모두 true여야 결과값이 true임 (AND)
	 *
	 * ** &&연산자를 기준으로 앞의 결과가 false일 경우 뒤의 조건은 굳이 실행하지 않음
	 * 
	 * 	|| : 두 개의 조건 중에 하나라도 true이면 결과값이 true임 (OR)
	 * 
	 *   || 연산자 기준으로 앞의 결과가 true일 경우 뒤의 조건은 굳이 실행하지 않음
	 *   
	 */ 
	
	
	
	public void method5() {
		int num = 10;
		boolean result1 = (num < 5) && (++num > 0);
		//  앞에서 False가 나오면 뒤의 문장은 아예 실행되지 않음
		
		System.out.println("result : "+ result1);
		System.out.println(" && 연산 후의 num값 : " + num);
		
		int num2 = 10;
		// boolean result2 = (num2 < 20) || (++num2 > 0);
		boolean result2 = true || (++num2 > 0); // Dead code : 실행될수없는 코드
		
		System.out.println("resylt2 : " + result2);
		System.out.println(" || 연산후의 num2의 값 : "+ num2);
	}
}
