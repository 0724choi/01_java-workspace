package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Switch {
	
	/*
	 * switch문도 if문과 동일하게 조건문임!!
	 * 
	 * 다만, if문과의 차이점은?
	 * -> if문은 조건식을 자유롭게 기술 가능!
	 * -> switch문은 동등비교로 밖에 수행되지 않음!(~랑 ~랑 같다 형식)
	 * 
	 * -> 실행할 구문만 실행하고 자동으로 빠져나오지 못함! (직접 break;문 작성)
	 * 
	 * [표현법]
	 * switch(이제부터 동등비교할 대상){
	 * case 값1 : 실행코드1;
	 * case 값2 : 실행코드2;
	 * ...
	 * [default : 위의 값들과 모두 일치하지 않을 경우 실행할 코드;] // 생략가능
	 * }
	 * 
	 */
	
	public void method1() {
		/*
		 * 정수를 입력 받아
		 * 1일 경우 "빨간색 입니다" => case 1 : 빨간색입니다;
		 * 2일 경우 "파란색 입니다" => case 2 : 파란색입니다;
		 * 3일 경우 "초록색 입니다" =? case 3 : 초록색입니다;
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력(1~3) : ");
		int num = sc.nextInt();
		
		/*
		if(num ==1) {
			System.out.println("빨간색 입니다");
		}else if(num ==2) {
			System.out.println("파란색 입니다");
		}else if(num ==3) {
			System.out.println("초록색 입니다");
		}else {
			System.out.println("잘못입력 하셨습니다.");
		}
		*/
		
		// switch 문으로 바꿔보기!
		switch(num) {
		case 1 : 
			System.out.println("빨간색 입니다.");
			break;
		case 2 : 
			System.out.println("파란색 입니다.");
			break;
		case 3 : 
			System.out.println("초록색 입니다.");
			break;
		default : 
			System.out.println("잘못입력하셨습니다.");
			break; // 보통 default가 맨밑에 적히기 때문에 생략가능
		}

		
	}
	
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매하고자 하는 과일(사과, 바나나, 복숭아) 입력 : ");
		String fruit = sc.nextLine();
		
		int price = 0;
		
		switch(fruit) {
		case "사과" : 
			price = 1000;
			break;
		case "바나나" : 
			price = 2000;
			break;
		case "복숭아" :
			price = 3000;
			break;
		default :
			System.out.println("해당과일은 품절입니다.");
			return;
		}
		
		System.out.println(fruit + "의 가격은 "+ price + "원 입니다.");
	}
	
	public void method3() {
		// 등급별 권한
		// 1. 읽기+쓰기+관리
		// 2. 읽기+쓰기
		// 3. 읽기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등급(정수) : ");
		int level = sc.nextInt();
		
		switch(level) { // break;를 제외해서 조금 더 간결한 코드 활용
		case 1 : 
			System.out.println("관리권한");
		case 2 : 
			System.out.println("글쓰기권한");
		case 3 : 
			System.out.println("읽기권한");
		}
	}
	
	public void method4() {
		// 월을 입력 받아 해당 월의 마지막 날짜 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("1월 ~ 12월까지 중 하나를 입력(정수로)");
		int month = sc.nextInt();
		
		// 1, 3, 5, 7, 8, 10, 12  => 31일까지
		// 4, 6, 9, 11			  => 30일
		// 2					  => 28일 또는 29일
		
		switch(month) {
		case 1 :
		case 3 :
		case 5 : // ex) 5월입력시 쭉 타고 내려가서 break에 걸림
		case 7 :
		case 8 :
		case 10 :
		case 12 : 
			System.out.println("입력하신 달은 31일까지 입니다. "); 
			break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			System.out.println("입력하신 달은 30일까지 입니다. ");
			break;
		case 2 : 
			System.out.println("입력하신 달은 28일 또는 29일까지 입니다. ");
			break;
		default : 
			System.out.println("반드시 1~12월 까지를 입력해야 합니다.");
			break;
			
		}
	}

}
