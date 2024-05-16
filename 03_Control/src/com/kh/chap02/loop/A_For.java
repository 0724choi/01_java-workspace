package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	
	/*
	 *	반복문
	 *	프로그램 흐름을 제어하는 제어문 중 하나
	 *	어떤 실행코드를 반복적으로 수행 시켜줌
	 *	
	 *	크게 두 종류로 나뉨(for문 / while문(do-while문))
	 *	
	 * 	
	 * 	for문
	 * 	[표현법]
	 * 	for(초기식; 조건식; 증감식){ // 반복 횟수를 지정하기 위해 제시하는 것들
	 * 			반복적으로 실행시키고자 하는 구문 
	 * }
	 * 	초기식 : 반복문이 수행될 때 "처음에 단 한번만 실행되는 구문"
	 * 	(보통 반복문 안에서 사용될 변수를 선언 및 초기화하는 구문)
	 * 
	 * 	조건식 : "반복문이 수행될 조건"을 작성하는 구문
	 * 			조건식이 true일 경우에는 해당 구문을 반복
	 * 			조건식이 false가 되는 순간 반복을 멈추고 구문을 빠져나옴
	 * 	
	 * 	증감식 : 반복문을 제어하는 변수값을 증감 시키는 구문
	 * 			(보통 초기식에 제시된 변수를 가지고 증감연산자(++, --)를 사용함
	 * 
	 * 	for문을 만나는 순간
	 * 	초기식(최초 한번만) --> 조건식 검사 --> true일 경우 실행구문 실행 --> 증감식
	 * 	조건에 맞음		--> 조건식 검사 --> true일 경우 실행구문 실행 --> 증감식
	 * ------------------------계 속 반 복--------------------------------
	 * 	조건에 안맞아짐 	--> 조건식 검사 --> false일 경우 실행구문 실행하지 않음 --> 반복문 빠져나옴
	 * 
	 * 
	 * 
	 * 	알아둘 것
	 * 	for문안에 초기식, 조건식, 증감식 각각 생략가능하긴 함 (단 ; ; 은 반드시 작성)
	 * 	안에 아무런 내용 없을시 ;;만 있으면 무한 반복하는 코드
	 * 
	 */

	
	
	public void method() { // i값이 1에서부터 5까지 매번 1씩 증가하는 동안 반복 수행
		// "안녕하세요" 를 5번 반복해서 출력하기
		
		for(int i=1; i<=5; i++) {
			System.out.println("안녕하세요");
		}
		for(int i=0; i<5; i++) { // i값이 0에서부터 4까지 매번 1씩 증가하는 동안 반복 수행
			System.out.println("반갑습니다");
		}
		for(int i=11; i<=15; i++) { // i값이 11에서부터 15까지 매번 1씩 증가하는 동안 반복 수행
			System.out.println("저리가세요");
		}
		for(int i=1; i<=9;i+=2) { //i값이 1에서부터 9까지 매번 i+2씩 증가하는 동안 반복 수행
			System.out.println("hello");
			System.out.println(i);
		}
			// System.out.println(i); 같은 블럭내에서만 변수 사용 가능!
	}
	
	
	public void method2() {
		// 1부터 5까지 출력
		/*System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		*/
		
		/*for(int i=1; i<=5; i++) {
			System.out.println(i);	
		}
		*/
		
		// 1 2 3 4 5 (사이 공백 포함)
		for(int i=1; i<=5; i++) {
			System.out.print(i + " ");
		}
		
	}
		public void method3() {
			// 5 4 3 2 1
			for(int i=5; i>=1; i--) {
				System.out.print(i + " ");
			}
		}
		
		public void method4() {
			// 1부터 10까지 출력(홀수만)
			/*for(int i=1; i<=9; i+=2) {
				System.out.print(i + " ");
				}*/
			
			for(int i=0; i<10; i++) { // i값이 1에서부터 9까지 매번 1씩 증가되는 동안 반복 수행 (총 9회 실행)
				
				if( i % 2 == 1) {
					System.out.print(i+ " ");
				}
			}
		}
		public void method5() {
			// 1 2 3 4 .. 10 for문 고정
			for(int i= 0; i<=9; i++ ) {
				System.out.print((i+1) + " ");
			}
		}
	
		public void method6() {
			// 1에서 부터 10까지의 총 합계
			/*
			 * int sum = 0
			 * sum += 1; => sum = sum + 1; 0 + 1
			 * sum += 2; => sum = sum + 2; 0 + 1 + 2
			 * sum += 3; => sum = sum + 3; 0 + 1 + 2 + 3
			 * ...
			 * sum += 9;
			 * sum += 10; => 0 + 1 + 2 ... + 10 = 55;
			 * 
			 * 규칙을 찾자!
			 * sum 변수에 누적해서 합산하는것을 반복진행!
			 * 단, 누적해서 더하고자 하는 값이 1에서 부터 10까지 1씩 증가!
			 * 
			 * 
			 * 
			 */
			
			int sum = 0;
			for(int i=1; i<=10; i++) {
				sum += i; // 누적합 공식
			}
			System.out.println("1부터 10까지의 합 : " + sum);
			 {
				
			}
		}
		
		public void method7() {
			//사용자에게 값을 입력 받아서 1부터 입력받은 수 까지의 합계 출력
			Scanner sc = new Scanner(System.in);
			System.out.print("1이상의 정수 : ");
			int num = sc.nextInt();
			
			if(num>=1) { // 잘 입력했을경우 => 1에서부터 num까지의 수의 합계 출력
				int sum = 0;
				for(int i = 1; i <= num; i++) {
					sum += i;
				}
				System.out.println("1부터 "+ num + "까지의 합계는 : " + sum + "입니다.");
			
			}else { // 잘못 입력한 경우 => 오류 구문 출력
				System.out.println("잘못된 숫자입니다.");
			}
		}
		
		public void method8() {
			// 1에서부터 어떤 랜덤값(1~10)까지의 총 합계 => 누적합 sum+=i
			// 자바에서 제공하는 클래스 (Math)
			
			/*
			 * java.lang.math 클래스에서 제공하는 random() 메소드를 호출해서
			 * 매번 다른 랜덤값을 얻어낼 수 있다
			 *  Math.random(); // 호출방법 => 0.0 ~ 0.999999 사이의 랜덤값 발생
			 *  							(0.0 <= 		1.0)
			 *  int random = Math.random(); // double형이라서 안됨
			 *  int random = Math.random() * 10; // 0.0~ 9.99999
			 *  int random = Math.random() * 10 + 1; // 1.0~ 10.99999
			 *  
			 *  
			 */
			
			int random = (int)(Math.random() * 10 + 1);
			// random()만들기 = (형변환)Math.random() * 끝수 + 시작수;
		
			System.out.println("1~10사이의 랜덤 값 : " + random);
			int sum = 0;
			for(int i=1; i<=random; i++) {
				sum += i;
			}
			System.out.println("1부터 "+ random + "까지의 합계 : " + sum);
			
		}
		
}


