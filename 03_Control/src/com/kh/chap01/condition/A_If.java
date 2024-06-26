package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	/*
	 * 기본적으로 프로그램 진행은 순차적으로 진행
	 * 단, 이 순차적 흐름을 바꾸려고 한다면 제어문을 이용하여 직접 제어 가능
	 * 
	 * 선택적으로 실행시키고자 할 때 => 조건문
	 * 반복적으로 실행시키고자 할 때 => 반복문
	 * 그 외의 흐름 제어시 => 분기문
	 * 
	 * 
	 * 조건문
	 * "조건식"을 통해 참이냐 거짓이냐를 판단해서 참일 경우 그에 해당하는 코드 실행
	 * 
	 * 조건식의 결과는 true / false 이어야 한다!
	 * 보통 조건식에서는 비교연산자 (대소,동등) , 논리연산자(&&,||)를 주로 사용
	 * 
	 * 조건문은 크게 if문 switch문으로 나뉜다.
	 * 
	 */

	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 한개 입력 : ");
		int num = sc.nextInt();
		
		
		
		/*
		 * 단독 if문
		 * 
		 * [표현식]
		 * if(조건식){
		 * 		.. 실행시키고자 하는 코드 ..
		 * }
		 * 
		 * 조건식은 if와 친하다!
		 * 
		 * => 조건식 참(true)일 경우 => 중괄호 블럭 안의 코드 실행
		 * => 조건식 거짓(false)일 경우 => 중괄호 블럭 안의 코드 무시하고 통과
		 * 
		 */
		
		
		if(num > 0) {
			System.out.println("양수다");
		}
		
		if(num < 0) {
			System.out.println("음수다");
		}
		sc.close();
		
	}
	
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		
		
		
		/*
		 * if - else문
		 * 
		 * [표현식]
		 * if(조건식){
		 * 		.. 실행코드 1 ..
		 * }else{
		 * 		.. 실행코드 2 ..
		 * 
		 * }
		 * 
		 * 조건식의 결과가 참(true)일 경우 실행코드 1 수행 후 if-else문 통과
		 * 단, 조건식의 결과가 거짓(false)일 경우 무조건 실행코드 2 수행!
		 */
		
		if(num > 0) {
			System.out.println("양수다");
		}else {
			System.out.println("양수가 아니다.");
			
			sc.close();
		}
		
	}
		public void method3() {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		
		
		
		
		/*
		 * if -else if - else문
		 * 같은 비교대상으로 여러개의 조건을 제시해야 될 경우
		 * 
		 * [표현식]
		 * if(조건식1){
		 * 
		 * 		.. 실행코드1 .. 
		 * 
		 * }else if(조건식2){
		 * 
		 *		.. 실행코드2 ..
		 *
		 *}else if(조건식n){
		 *		.. 실행코드n .. 
		 *
		 *}else{
		 *		.. 위의 조건들이 다 false일 경우 실행할 코드
		 *
		 *} // else문은 생략 가능 ! 
		 *
		 */
		
		if(num > 0) {
			System.out.println("양수다");
		}else if(num == 0) {
			System.out.println("0이다");
		}else {
			System.out.println("음수다");
		}
		
		
		
	}
	
	public void method4() {
		// 사용자에게 나이를 입력 받아서 어린이 청소년 성인
		// 어린이(13세이하)
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		
		/*
		if(age <= 13) {
			System.out.println("어린이");
		} else if(age >= 19) { // 항상 변수 = 숫자; 로 표현 할 것
			System.out.println("성인");
		} else {
			System.out.println("청소년");
		}
		*/
		
		
		// 코드를 조금 더 간결하게 만드는 방법
		String result = ""; 
		if(age <= 13) {
			result = "어린이";
		} else if(age < 20) {
			result = "청소년";	
		} else {
			result = "성인";
		}
		
		System.out.println(result);
	}
	
	public void method5() {
		// 사용자에게 이름,성별(M/F) 입력 받아서 
		// xxx님은 x학생 입니다.
		// 잘못입력한 경우 => "성별을 잘못 입력하셨습니다." 출력
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해 주세요 : ");
		String name = sc.nextLine();
		
		System.out.print("성별을 입력해주세요 (M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		String result = ""; // 변수를 미리 세팅해줄때 반드시 초기화 할 것.
		
		if(gender == 'M' || gender == 'm') {
			result = "남학생";
		}else if(gender == 'F' || gender == 'f'){
			result = "여학생";	
		}else {
			System.out.println("잘못입력하셨습니다");
			return; // 코드종료. 실행코드로 돌아감 (Run파일로) 
					// 해당 메소드 자체를 빠져나가는 구문
		}

		System.out.println(name + "님은 " + result + "입니다");
		
	}
	// 특이케이스
	public void method6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		/*
		if(name == "차은우") {
			System.out.println("차은우님 반갑습니다.");
		}else {
			System.out.println("차은우님이 아닙니다.");
		}
		*/
		
		/*
		 * 
		 * 기본 자료형 (소문자로 이루어짐) 
		 * boolean(1), byte(1), short(2), int(4), long(8) -정수
		 * float(4), double(8) -실수
		 * char(2) -문자 
		 * 
		 * 참조 자료형 (대문자로 시작함)
		 * String
		 * 
		 * 기본자료형들 끼리 동등 비교시에는 ==,!= 사용가능 (정상적으로 비교된다)
		 * 단, 참조자료형은 동등 비교시에는 ==, != 사용시 정상적으로 비교가 안됨.
		 * 				=> equals() 메소드를 이용해서 비교해야함!
		 * 				=> 문자열.equals(비교할문자열); 
		 */
		
		if(name.equals("차은우")) {
			System.out.println("차은우님 반갑습니다.");
		}else {
			System.out.println("차은우님이 아닙니다.");
		}
	}
	
	// 조건문 중첩 사용
	public void method7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력(양수만) : ");
		int num = sc.nextInt();
		
		if(num > 0) { // 양수일 경우
			
			if(num % 2 == 0) { // (양수이고) 짝수일 경우
				System.out.println("짝수입니다.");
			}else {
				System.out.println("홀수입니다.");
			}
			
		}else { // 양수가 아닐 경우 (0 or 음수)
			System.out.println("양수가 아닙니다, 다시 입력하세요.");	
		}
	}
}
