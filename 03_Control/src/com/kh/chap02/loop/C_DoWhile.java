package com.kh.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	
	/* do-while문
	 * 
	 * do  {
	 * 		반복적으로 실행할 코드(무조건 한번은 실행!!)
	 * }while(조건식);
	 * 
	 * 첨에 무조건 실행코드 실행 ******* !!
	 * --> 조건식 검사 --> true일 경우 실행코드 실행 
	 * --> 조건식 검사 --> true일 경우 실행코드 실행 
	 * 
	 * ...
	 * 
	 * --> 조건식 검사 --> false일 경우 실행코드 실행x => 반복문 빠져나감
	 * 
	 * * 기존의 for/while문과의 차이점
	 * 	for / while문 같은 경우에는 조건 검사 후에 true일때만 수행
	 * 	do-while문은 조건검사 없이 무조건 한 번은 수행한다
	 */

	public void method1() {
		int num = 1;
		
		do {
			System.out.println(num);
			
		}while(false); // false 대입
		// 조건이 애초에 맞지 않아도 무조건 한 번 실행하는 특징!!!!
	}
	
	
	public void method2() {
		// 1 2 3 4 5
		
		int i =1;
		
		do { // 첫번째 값은 조건이 아닌 최초의 값
			System.out.print(i + " ");
			i++;
		}while(i<6);
	}
	
	public void method3() {
		// 1부터 사용자가 입력한 숫자의 총 합계
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		
		do {
			sum += i;
			i++;	
	}while(i<=num);
		
		
System.out.println("1부터 " + num + "까지의 합계 : " + sum);
	}
	
	

}
	
	

