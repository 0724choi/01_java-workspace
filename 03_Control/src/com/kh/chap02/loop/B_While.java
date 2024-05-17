package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {
	
	
	/*
	 * while문
	 * 
	 * [표현법]
	 * 
	 * 초기식; // 생략가능 
	 * while(조건식){
	 * 		반복적으로 실행할 코드;
	 * 		증감식; // 생략가능
	 * 
	 * }
	 * 
	 * 조건식 true일 경우 해당 코드 실행
	 * 
	 * 조건식 검사 -> true일 경우 실행코드 실행
	 * 조건식 검사 -> true일 경우 실행코드 실행
	 * 
	 * ...
	 * 
	 * 조건식 검사 -> false일 경우 실행x -> 반복문 빠져 나감
	 * 
	 */
	public void method1() {
		// 안녕하세요 5번 출력
		int i = 1;
		
		while(i<=5) {
			System.out.println("안녕하세요");
			i++;
		}
		
		System.out.println(i); // for문과 다른점! i값을 출력 가능하다
		
	}
	
	public void method2() {
		// 1 2 3 4 5
		int i = 1;
		while(i<6) {
			// System.out.print(i+ " ");
			// i++;
			
			// 후위연산자 표현
			
			System.out.print(i++ + " "); // 위 코드 2줄을 1줄로 줄이는방법
		}
		
		
	}
	
	public void method3() {
		// 1에서부터 10까지 홀수만 출력
		
		int i = 1;
		/*
		while(i<10) {
			System.out.print(i + " ");
			i+=2;
			}*/
			
		
		while(i<10) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
			i++; // 증감식을 while문에다가 쓰기!
		} 
	}
	
	
	public void method4() {
		// 1부터 랜덤값(1~100)까지 합계
		// while문 사용
		
		int random = (int)((Math.random()*100)+1);
		int sum = 0;
		int i = 1;
		
		while(i<=random) {
			
			 sum += i; // 누적합 공식
			 i++; // 조건

		}
		System.out.println("랜덤값은 ? : " + random);
		System.out.println("1부터 "+ random + "까지의 합계는 ? : " + sum);
		
	}
	
	
	public void method5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		System.out.println("문자열의 길이 : "+ str.length());
		
		int i = 0;
		while(i < str.length()) { // i의 범위 잘 생각해서 계산하기
			System.out.println(str.charAt(i));
			i++;
		}
		
		
		
	}
}

