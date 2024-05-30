package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UncheckedException {
	
	/*
	 * * RuntimeException
	 * - 프로그램 실행시 발생되는 예외들
	 * 
	 * * RuntimeException의 후손들
	 * - IndexOutOfBoundsException : 부적절한 인덱스를 가지고 접근시 발생되는 예외
	 * - NullPointerException : 참조변수가 null로 초기화된 상황에서 null에 접근 했을 때 발생되는 예외
	 * - ArithmeticException : 나누기 연산시 0으로 나누려 할 때 발생되는 예외
	 * - ClassCastException : 허용할 수 없는 형변환이 진행될 때 발생되는 예외
	 * - NegativeArraySizeException : 배열 할당 과정에서 배열의 크기를 음수로 지정하는 경우 발생되는 예외
	 * 
	 * 
	 *	 RuntimeException 관련된 예외는 충분히 예측가능한 상황이 있음
	 *	 애초에 예외발생이 안되게끔 if문 조건 처리 가능!!
	 *
	 */
	private Scanner sc = new Scanner(System.in); // 전역변수로 스캐너생성 (캡슐화에 따라 private 사용)
	
	public void method1() {
		// ArithmeticException : 나누기 연산시 0으로 나누려고 할 때 발생되는 예외
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		// int result = num1/num2;   사용자가 num2에 0을 입력하는 순간 예외발생 => 비정상적 프로그램 종료발생!!
		
		/* 애초에 예외 자체가 발생이 안되게끔 if문으로 조건 검사 => 예외 처리 x 
		 *  int result = 0;
		if(num2 !=0) {
		 result = num1 / num2;
		System.out.println("결과 : " + result);
		} */ 
		
		// 예외처리 : 예외가 "발생했을때" 실행할 내용을 미리 작성해놓는 방법
		
		/*
		 * * try catch 방법
		 * try{
		 * 		예외가 발생할 수 있는 구문
		 * }catch(발생될예외클래스 매개변수){
		 * 		해당 예외가 발생했을 경우 실행할 구문;
		 * }
		 */
		
		try {
			int result = num1 / num2;
			System.out.println("결과 : " + result);
		}catch(ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다.");
			
		}
		
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	public void method2() {
		// NegativeArraySizeException : 배열을 할당하는 과정에서 배열의 크기를 음수로 지정하는 경우 발생
		// ArrayIndexOutOfBoundsException : 배열의 부적절한 인덱스를 가지고 접근시 발생되는 예외
		
		System.out.print("배열의 크기 : ");
		int size = sc.nextInt();
		
		// int[] arr = new int[size];
		
		//System.out.println("100번 인덱스의 값 : " + arr[100]);
		
		/* if문으로 예외자체를 발생이 안되도록 막는방법
		if(size>=101) {
			int[] arr = new int[size];
			System.out.println("100번 인덱스의 값 : " + arr[100]);
		}
		*/
		
		try{
			int[] arr = new int[size];
			System.out.println("100번째 인덱스의 값 : " + arr[100]);
		}catch(NegativeArraySizeException e ) {
			System.out.println("배열의 크기로 음수를 제시할 수 없습니다.");
			
		}catch(ArrayIndexOutOfBoundsException e) { // 부모 확인해보면 RunTimeException 임!!
			System.out.println("부적절한 인덱스로 접근했습니다.");
		}
		
		// 다중 catch블럭 작성 가능
		
		System.out.println("프로그램을 종료합니다.");
		
		
	}
	
	public void method3() {
		
		System.out.print("배열의 크기 입력 : ");
		/*
		try{
			int size = sc.nextInt(); // 문제가 되는 구문!
			int[] arr = new int[size];
			System.out.println("100번째 인덱스의 값 : " + arr[100]);
		}catch(NegativeArraySizeException e ) {
			System.out.println("배열의 크기로 음수를 제시할 수 없습니다.");
			
		}catch(ArrayIndexOutOfBoundsException e) { // 부모 확인해보면 RunTimeException 임!!
			System.out.println("부적절한 인덱스로 접근했습니다.");
		
		}catch(InputMismatchException e ) { // import필요 : java.util임
			System.out.println("정수로만 입력하세요.");
		}
		*/
		// 다중 catch블럭 작성 가능
		// 각각의 예외 발생시 실행할 내용이 별개일 경우 세분화 해서 다중 catch블럭으로 기술하는게 적절함!
		
		
		try{
			int size = sc.nextInt(); // 문제가 되는 구문!
			int[] arr = new int[size];
			System.out.println("100번째 인덱스의 값 : " + arr[100]);
		}catch(InputMismatchException e) {
			System.out.println("정수가 아닌 값을 입력하셨습니다.");
			e.printStackTrace(); 		//예외를 상세하게 보여주는 구문!
		}catch (RuntimeException e){ 	// 다형성 적용해서 부모타입 예외클래스 작성 가능
										// 모든 자식 예외 발생시 다 받아서 처리할 수 있음
			System.out.println("예외가 발생하긴 했음 .. 배열의크기, 부적절한 인덱스 등등...");
		}/*catch(NegativeArraySizeException e) {
				// 이 코드가 실행되고 싶으면 부모코드보단 위로 올라가야함!	
		}*/
		
		
		// 부모예외클래스와 자식예외클래스를 가지고 catch 블럭을 기술하고자 할 때는
		// 자식예외클래스 catch 블럭이 위에 있어야함!! (아니면 unreachable catch block 오류)
		System.out.println("프로그램을 종료합니다.");
		
		/*
		 * RuntimeException 관련 애들은 UnCheckedException (예외처리 구문이 필수는 아님)
		 * if문: 예외자체가 발생하기 전에 소스코드로 핸들링 한 것 (예외처리 구문 아님)
		 * try ~ catch문 : 예외가 "발생했을경우" 처리해주는 구문을 작성해두는 것 (예외처리 구문)
		 * 
		 * 예측 가능한 상황은 if문으로 조건 검사로 해결하는게 권장사항!
		 * 부득이하게 조건문으로 핸들링이 안되는 구문은 예외처리 구문으로 작성해둘 것!
		 * 
		 * e.printStackTrace(); //  예외를 상세하게 보여주는 구문!
		 *  */
		
		
	}
	
}
