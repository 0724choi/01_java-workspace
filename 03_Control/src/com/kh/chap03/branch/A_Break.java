package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	/*
	 * break;		: 반복문안에서 사용되는 분기문
	 * 				  break;가 실행되는 순간 현재 속해있는 반복문을 강제로 빠져나감
	 * 
	 * 
	 * 유의사항 : switch문 안에 break;는 단순히 switch문만을 빠져나가는 구문
	 */

	public void method1() {
		// 랜덤값( 1 ~ 100) 발생시키고 그 랜덤값 출력 ( 이 과정 매번 반복) => 무한반복
		// 단, 발생된 랜덤값이 3의 배수가 되면 break;
		
		while(true) { // 무한반복
			int random = (int)(Math.random()*100+1);
			System.out.println("랜덤 값 : " + random);
			
			if(random % 3 == 0) { // 3의배수
				break; // 반복문을 강제로 빠져나오게 하는 구문 
			}
		}
	System.out.println("탈출");
	}
	
	 public void method2() {
		 // 사용자에게 문자열을 입력받아 해당 그 문자열의 길이 출력(무한반복)
		 // 단, 사용자가 입력한 문자열을 "exit" 입력시는 반복문을 빠져나감
		 Scanner sc = new Scanner(System.in);
		 
		 while(true) { // 여기부터 반복
		 System.out.print("문자열을 입력하세요 : ");
		 String str = sc.nextLine();
		 
		 if(str.equals("exit")) { // 조건 입력시 탈출
			 break;
		 }else {
			 System.out.println("문자열의 길이는 : " + str.length());
		 }
	 }
		System.out.println("탈출"); 
		 
	}
	 
	 public void method3() {
		 //사용자에게 2~9단을 입력받아 해당 단을 출력하고 프로그램 종료
		 //그 외에 숫자를 입력한 경우 다시 단을 입력받고록 유도

		 	Scanner sc = new Scanner(System.in);
		 	while(true) {
		 		System.out.print("단을 입력하세요.");
		 		int dan = sc.nextInt();
		 		
		 		if(dan >=2 &&  dan <= 9 ) {
		 			
		 			for(int i=1; i<10; i++) {
		 				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
		 			}
		 			break;		
		 		}else {
		 			System.out.println("잘못입력했습니다, 다시 입력하세요.");
		 		}
		 	}

	 
	 
	 }
}