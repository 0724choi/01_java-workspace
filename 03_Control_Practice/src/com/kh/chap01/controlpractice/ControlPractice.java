package com.kh.chap01.controlpractice;

import java.util.Scanner;

public class ControlPractice {
	public static void p1() {
		System.out.printf("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n7. 종료\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		String result = "";
		
		/*if(num == 1) {
			System.out.println("입력 메뉴 입니다.");
		}else if(num ==2) {
			System.out.println("수정 메뉴 입니다.");
		}else if(num ==3) {
			System.out.println("조회 메뉴 입니다.");
		}else if(num ==4) {
			System.out.println("삭제 메뉴 입니다.");}
		else if(num ==7) {
				System.out.println("프로그램이 종료됩니다");
*/
		// return을 사용한 간결한 코드 작성해보기
		if(num == 1) {
			result = "입력";
		}else if(num ==2) {
			result = " 수정";
		}else if(num ==3) {
			result = " 조회";
		}else if(num ==4) {
			result = " 삭제";
		}else {
			System.out.println("프로그램이 종료됩니다.");
			return;
			
		}
		System.out.println(result + "메뉴입니다");
	}
	public static void p2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요(정수만) : ");
		int num = sc.nextInt();
		
		if(num > 0 ) {
			if(num % 2 == 0) {
				System.out.println("짝수다");
			}else {
				System.out.println("홀수다");
			}
		}else {
			System.out.println("양수만 입력해주세요");
		}
	}
	
	public static void p3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = (kor + math + eng);
		double avg = sum / 3;
		
		if(kor>=40 && eng >=40 && math >=40) {
			if(avg >=60) {
				System.out.printf(" 국어 : %d\n 수학 : %d\n 영어 : %d\n 합계 %d\n 평균 %.1f\n 축하합니다,합격입니다!",kor,math,eng,sum,avg);
			}else {
				System.out.println("불합격입니다");
			}
		}else{
			System.out.println("불합격입니다.");
		}
				
		
	}
	public static void p4() {
		Scanner sc =new Scanner(System.in);
		System.out.print("1 ~ 12사이의 정수 입력 : ");
		int month = sc.nextInt();
		switch(month) {
		case 3 :
		case 4 :
		case 5 : 
			System.out.println(month + "월은 봄 입니다.");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println(month +"월은 여름 입니다.");
			break;
		case 9 :
		case 10 :
		case 11 :
			System.out.println(month +"월은 가을 입니다.");
			break;
		case 12 :
		case 1 :
		case 2 :
			System.out.println("월은 겨울 입니다.");
			break;
		default : 
			System.out.println( month +"월은 잘못 입력된 달입니다.");
		}
		
	}
	
	 public static void p5() {
		 
		 String id = "myId";
		 String passwd = "maPassword12";
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("아이디 : ");
		 String userId = sc.nextLine();
		 System.out.print("비밀번호 : ");
		 String userPasswd = sc.nextLine();
		 
		if(id.equals(userId)) {
			if(passwd.equals(userPasswd)) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else {
			System.out.println("아이디가 틀렸습니다.");
		}

	 }
	 public static void p6() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		 String grade = sc.nextLine();
		 
		 switch(grade) {
		 case "관리자" :
			 System.out.print("회원관리, ");
		 case "회원" :
			 System.out.print("게시글 관리 게시글 작성, 댓글작성, ");
		 case "비회원" :
			 System.out.println("게시글 조회");
			 break;
		 }
		 
			 
		 }
	 public static void p7(){
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("키(m)를 입력해주세요 : ");
		 double height = sc.nextDouble();
		 System.out.print("몸무게(kg)를 입력해주세요 : ");
		 double weight = sc.nextDouble();
		 
		 double bmi = weight / (height*height);
		 System.out.println("BMI 지수" + bmi);
		 
		 if(bmi <= 18.5) {
			 System.out.println("저체중");
		 }else if(bmi < 23) {
			 System.out.println("정상 체중");
		 }else if(bmi < 25) {
			 System.out.println("과체중");
		 }else if(bmi < 30) {
			 System.out.println("비만");
		 }else {
			 System.out.println("고도 비만");
		 }
		
		 
		 
	 }
	 public static void p8() { // 코드 너무 별로임
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("피연산자 1 : ");
		 int num1 = sc.nextInt();
		 
		 System.out.print("피연산자 2 : ");
		 int num2 = sc.nextInt();
		 
		 System.out.print("연산자를 입력(+,-,*,/,%) : ");
		 sc.nextLine(); // 버퍼 지워주기 
		 char op = sc.nextLine().charAt(0);
		 
		 if(num1 >= 0 && num2 >=0) {
			 if(op == '+') {
				 System.out.println(num1 + " + " + num2 + " = " + (num1 + num2) );

			 }else if( op == '-') {
				 System.out.println(num1 + " - " + num2 + " = " + (num1 - num2) );
				 
			 }else if( op == '*') {
				 System.out.println(num1 + " * " + num2 + " = " + (num1 * num2) );
				 
			 }else if( op == '/') {
				 System.out.println(num1 + " / " + num2 + " = " + (num1 / num2) );
				 
			 }else if( op == '%') {
				 System.out.println(num1 + " % " + num2 + " = " + (num1 % num2) );
				 
			 }else {
				 System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			 }
			 

	 }
		 else {
			 System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		 }

	 }
	 public static void p9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int midScore = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		int finalScore = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int examScore = sc.nextInt();
		
		System.out.print("출석 회수 : ");
		int atdScore = sc.nextInt();
		
		double midScore2 = (midScore*0.2);
		double finalScore2 = (finalScore*0.3);
		double examScore2 = (examScore*0.3);
		double atdScore2 = (atdScore*1.0);
		double sum = midScore2+finalScore2+examScore2+atdScore2;
		
		System.out.println("================= 결과 =================");
		
		if(atdScore >=14) {
			if(sum >= 70) {
				
				System.out.println("중간 고사 점수(20) : " + midScore2);
				System.out.println("기말 고사 점수(30 ): " + finalScore2);
				System.out.println("과제 점수 	(30) : " + examScore2);
				System.out.println("출석 회수 	(20) : " + atdScore2);
				System.out.println("총점 : " + sum);
				System.out.println("Pass");
			}else {
			
				System.out.println("중간 고사 점수(20) : " + midScore2);
				System.out.println("기말 고사 점수(30 ): " + finalScore2);
				System.out.println("과제 점수 	(30) : " + examScore2);
				System.out.println("출석 회수 	(20) : " + atdScore2);
				System.out.println("총점 : " + sum);
				System.out.println(" Fail [점수 미달]");
			}
			
		}else {
			
				System.out.printf("Fail [출석 회수 부족 (%d/20)]",atdScore);
			
		}
		
	 }
	 public void p10() {
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.println("실행할 기능의 번호를 입력하세요.");
		 System.out.println("1. 메뉴 출력");
		 System.out.println("2. 짝수/홀수");
		 System.out.println("3. 합격/불합격");
		 System.out.println("4. 계절");
		 System.out.println("5. 로그인");
		 System.out.println("6. 권한 확인");
		 System.out.println("7. BMI");
		 System.out.println("8. 계산기");
		 System.out.println("9. P/F");
		 
		 int num = sc.nextInt();
		 System.out.println("선택 : " + num);
		 if(num == 1) {
			 ControlPractice.p1();
		 }else if(num ==2) {
			 ControlPractice.p2();
		 }else if(num ==3) {
			 ControlPractice.p3();
		}else if(num ==4) {
			 ControlPractice.p4();
		}else if(num ==5) {
			 ControlPractice.p5();
		}else if(num ==6) {
			 ControlPractice.p6();
		}else if(num ==7) {
			 ControlPractice.p7();
		}else if(num ==8) {
			 ControlPractice.p8();
		}else if(num ==9) {
			 ControlPractice.p9();
		}else {
			System.out.println("번호를 다시 입력해 주세요.");
			
		}
}
}