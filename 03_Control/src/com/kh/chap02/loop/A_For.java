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
			
			while(true) {
				System.out.print("1이상의 정수 : ");
			int num = sc.nextInt();
			
			if(num>=1) { // 잘 입력했을경우 => 1에서부터 num까지의 수의 합계 출력
				int sum = 0;
				for(int i = 1; i <= num; i++) {
					sum += i;
				}
				System.out.println("1부터 "+ num + "까지의 합계는 : " + sum + "입니다.");
				return; // break; 사용시 반복문 빠져나와 다음코드 진행 
						// return;시 코드반환하면서 코드 종료
				
			}else { // 잘못 입력한 경우 => 오류 구문 출력
				System.out.println("잘못된 숫자입니다. 다시 입력해주세요");
			}
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
		
		public void method9() {
			String str = "Hello";
			
			// 각 인덱스별 문자를 뽑아서 출력
			/*
			 * H   		=> str.charAt(0); 출력
			 * e   		=> str.charAt(1); 출력
			 * l   		=> str.charAt(2); 출력
			 * l   		=> str.charAt(3); 출력
			 * o   		=> str.charAt(4); 출력
			 * 
			 * 
			 * 0번 인덱스부터 4번 인덱스(마지막)까지 매번 1씩 증가하면서 반복 수행
			 */
			for(int i=0;i<5;i++) {
				System.out.println(str.charAt(i));
			}
			
			
		}
		
		public void method10() {
			// 사용자에게 문자열 입력 받아서 (str 변수에 대입)
			Scanner sc = new Scanner(System.in);
			
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();
			
			// 각 인덱스별 문자를 뽑아서 출력
			
			// apple 의 길이 => 5글자
			// 01234
			
			// strawberry => 10글자
			// 0123456879
		
			// kiwi
			// 0123
			
			// 마지막 인덱스는 항상 문자열의 길이 -1 이다!
			// 추출하고자 하느 인덱스값이 (문자열의 길이 -1)까지 매번 1씩 증가
			
			System.out.println("문자열의 길이 : " + str.length());
			
			for(int i=0; i<str.length(); i++) {
				System.out.println(str.charAt(i));
				
			}
			
		
		}
		
		public void method11() {
			//구구단 출력하기 2단
			
			/*
			 * 2 x 1 = 2
			 * 2 x 2 = 4
			 * 
			 * ...
			 * 
			 * 2 x 9 = 18
 			 */
			
			for(int i=1; i<10; i++) {
				// System.out.println(" 2 x " + i + " = " + 2*i);
				System.out.printf("2 x %d = %d\n",i,2*i);
				
			}
			
			
		
		}
		public void method12() {
			// 사용자에게 단을 받아 구구단 출력
			// int dan;
			// 2~9사이의 정수를 입력 => 가이드 문구
			// 다른 숫자를 입력한 경우 => 2~9사이의 숫자를입력해야합니다
			
			Scanner sc = new Scanner(System.in);
			System.out.print("2~9사이의 정수를 입력해 주세요 :");
			int dan = sc.nextInt();
			
			if(dan>=2 && dan<=9) {
				for(int i=1; i<10; i++) {
					System.out.printf("%d x %d = %d\n" ,dan,i,dan*i);			
				}
			}else{
				System.out.println("2~9사이의 숫자를 입력해야합니다.");
			}
				
			
		}
		public void method13() {
			// 랜덤한 단을 출력 (2부터 9사이의)
			
			int dan = (int)(Math.random()*8)+2; //  + 2(시작수),  * 개수(2,3,4,5,6,7,8,9 =>)8
			//		  0.0 <= random	<1.0
			//		  0.0 <=8random <8.0
			//		  2.0 <=8random+2 <10.0 
			//	  	  2<=(int)8random+2 <10  => 2~9
			
			System.out.println("=== " + dan + "단 ===");
			
			for(int i=1; i<10; i++) {
				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
			}
			
		}
		
		// 중첩 for문
		public void method14() {
			// 1 2 3 4 5
			// 1 2 3 4 5
			// 1 2 3 4 5
			
			for(int i =0; i<4; i++) {
				
				for(int j = 1; j<=5; j++) {
					System.out.print(j + " ");
				}
				System.out.println(); // 개행 코드
			}
			
		}
		public void method15() {
			// ****
			// ****
			// ****
			// ****
			for(int i =0; i<4; i++) {
				for(int j =0; j<4; j++) {
					System.out.print("*");		
			}
				System.out.println();
		}
	}
		public void method16() {
			// 1*** => 1행1열일때 숫자1
			// *2** => 2행2열일때 숫자2
			// **3* => 3행3열일때 숫자3
			// ***4 => 4행4열일때 숫자4
			
			for(int i=0; i<4; i++) { // 행 담당
				for(int j=0; j<4; j++) { // 열 담당
					
					if(i==j) {
						System.out.print(i+1);
					}else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}
		
		
		public void method17() {
			// 2단부터 9단까지 출력
			
			for(int i= 2; i<10; i++) {
				System.out.printf("\n=== %d단 ===\n",i);
				for(int j=1; j<10; j++) {
					System.out.printf("%d x %d = %d\n",i,j,i*j);	
				}
			}
			
		}
		
		
		public void method18() {
			for(; ;) { // 조건식에 자리가 생략된 경우 기본으로 true로 인식되어 무한 반복문이 된다
				System.out.println("안녕");
				
			}
		}

}


