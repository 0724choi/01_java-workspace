package com.kh.func;

import java.util.Scanner;

public class VariablePractice {
	//이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.
	public void practice1() {
	      Scanner sc= new Scanner(System.in);
	      
	      System.out.print("이름을 입력하세요 : " );
	      String name = sc.nextLine();
	      System.out.print("성별을 입력하세요(남/여)) : " );
	      char gender = sc.nextLine().charAt(0);
	      System.out.print("나이를 입력하세요 : ");
	      int age = sc.nextInt();
	      System.out.print("키를 입력하세요(소숫점 1자리까지)) : " );
	      float height = sc.nextFloat();
	      
	      sc.close();
	      
	      System.out.print("키 "+ height +"cm인 " + age + "살" + gender +"자 "+ name + "님 반갑습니다^^");
	   }
	   
	//키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
	   public void practice2() {
	      Scanner sc= new Scanner(System.in);
	      System.out.print("첫 번째 정수 : ");
	      int first = sc.nextInt();
	      System.out.print("두 번째 정수 : ");
	      int second = sc.nextInt();
	      
	      System.out.println("더하기 결과 : " + (first + second));
	      System.out.println("빼기 결과 : " + (first - -second));
	      System.out.println("곱하기 결과 : " + (first * second));
	      System.out.println("나누기 결과 : " + (first / second));
	      
	      sc.close();
	      
	      
	      
	   }
	   //키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
	   public void practice3() {
		   
	      Scanner sc= new Scanner(System.in);
	      System.out.print("가로 : ");
	      double width = sc.nextDouble();
	      System.out.print("세로 : ");
	      double length = sc.nextDouble();
	      
	      System.out.println("면적 : " + (width * length));
	      System.out.println("둘레 : " + ((width + length)*2));
	      
	      sc.close();
	   }
	   
	   // 영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요.
	   public void practice4() {
	      Scanner sc= new Scanner(System.in); // Scanner 생성
	      
	      System.out.print("영어 문자열을 입력하세요 : "); // 가이드 문구 생성
	      
	      
	      String input = sc.nextLine(); // 문자열 nextLine()을 받을 담는 input 생성
	      
	      
	      char eng1 = input.charAt(0); // eng1는 input의 0번째 인덱스 출력
	      System.out.println("첫 번째 문자 : " + eng1);
	   
	      
	      System.out.println("두 번째 문자 : " + input.charAt(1));
	      // 바로찍는 이유 -> 이후 eng함수를 사용할일이 없기 때문에 
	      
	      
	      System.out.println("세 번째 문자 : " + input.charAt(2));
	      
	      sc.close(); // Scanner 반납 (메모리 낭비 방지)
	      
	      

	      
	   }
		
		
	}
	

	
