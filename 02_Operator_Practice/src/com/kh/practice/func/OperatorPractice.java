package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void p1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num1 = sc.nextInt();
		System.out.println((num1 > 0) ? "양수다." : "양수가 아니다.");
		sc.close();
		
		
	}
	
	public void p2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		System.out.println((num > 0) ? "양수다." : (num == 0) ? "0 이다.": "0이 아니다." );
		sc.close();
	}
	
	public void p3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		System.out.println((num % 2 ==0) ? "짝수다" : " 홀수다");
		sc.close();
	}
	
	public void p4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 :");
		int num1 = sc.nextInt();
		
		System.out.print("사탕 개수 :");
		int num2 = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + (num2 / num1));
		System.out.println("남는 사탕 개수 : " + (num2  % num1));
		sc.close();
		
	}
	
	
	public void p5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String studentName = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int studentAge = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int studentClass = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("번호(숫자만) : ");
		int studentNumber = sc.nextInt();
		
		sc.nextLine();
	
		System.out.print("성별(M/F) : ");
		char studentGender = sc.nextLine().charAt(0);
		String result = (studentGender == 'M')? "남학생":"여학생";
		
		System.out.print("성적(소수점 둘째 자리까지) : ");
		float studentGrade = sc.nextFloat();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다. ",studentAge,studentClass,studentNumber,studentName,result,studentGrade);
		
		
		sc.close();
		
		
	}
	
	public void p6() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 :");
		int age = sc.nextInt();
		sc.close();
		
		System.out.println((age > 19) ? "성인" : (age <=13) ? "어린이" : "청소년");
		
	}
	
	public void p7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 :");
		int korGrade = sc.nextInt();
		
		System.out.print("영어 :");
		int engGrade = sc.nextInt();
		
		System.out.print("수학 :");
		int mathGrade = sc.nextInt();
		
		int sum = korGrade + engGrade + mathGrade;
		double avg = (sum / 3.0);
		String str = (avg < 60)? "불합격":(korGrade>=40 && engGrade>=40 && mathGrade >=40)? "합격" : " 불합격";
		
		System.out.printf("합계 : %d\n평균 : %.1f\n %s", sum, avg, str);

		
	}
	
	public void p8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		String num = sc.nextLine();
		char ch = num.charAt(7);
		sc.close();
		
		System.out.println(ch);
		System.out.println((ch == '1' || ch == '3') ? "남자": "여자");
		// char = 문자형이므로 ''처리 해줘야 결과가 나옴!
	}
	
	
	public void p9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1번 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("2번 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.print("비교할 정수 : ");
		int num3 = sc.nextInt();
		
		System.out.println((num3 > num2)? "true" :(num3 <= num1)? "ture" : "false");
		
		sc.close();
		
		
	}
	
	public void p10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력3 : ");
		int num3 =sc.nextInt();
		
		System.out.println((num1!=num2)?"false":(num2!=num3)?"false":"ture" );
		sc.close();
		
		
	}
	public void p11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("A사원의 연봉 : ");
		int payA = sc.nextInt();
		
		System.out.print("B사원의 연봉 : ");
		int payB = sc.nextInt();
		
		System.out.print("C사원의 연봉 : ");
		int payC = sc.nextInt();
		
		
		double payPlusA= (payA * 1.4);
		double payPlusB= payB;
		double payPlusC= (payC * 1.15);
		
		String strA = (payPlusA >= 3000) ? "3000 이상" : "3000 미만";
		String strB = (payPlusB >= 3000) ? "3000 이상" : "3000 미만";
		String strC = (payPlusC >= 3000) ? "3000 이상" : "3000 미만";
		 
		
		sc.close();
		
		//System.out.printf("A사원의 연봉/연봉+a : %d/%f\n%s\n",payA,payPlusA,strA);
		//System.out.printf("B사원의 연봉/연봉+a : %d/%f\n%s\n",payB,payPlusB,strB);
		//System.out.printf("C사원의 연봉/연봉+a : %d/%f\n%s\n",payC,payPlusC,strC);
		
		
		System.out.println("A사원 연봉/연봉+a : " + payA + "/" + payPlusA);
		System.out.println(strA);
		System.out.println("B사원 연봉/연봉+a : " + payB + "/" + payPlusB);
		System.out.println(strB);
		System.out.println("C사원 연봉/연봉+a : " + payC + "/" + payPlusC);
		System.out.println(strC);
		
	}
}