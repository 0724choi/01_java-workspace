package com.kh.chap02.loop;
import java.util.Scanner;

public class LoopPractice {
	
	public void p1() {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num>=1) {
			for(int i=1;i<=num;i++) {
				System.out.print(i+ " ");
			}
		}else {
			System.out.println("1 이상의 숫자를 입력하세요.");
		}
		
	}
	
	public void p2() {
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num>=1) {
				for(int i=1;i<=num;i++) {
					System.out.print(i+ " ");
				} return;
			}else {
				System.out.println("1 이상의 숫자를 입력하세요.");
			}
			
		}
	}
	
	public void p3() {
		Scanner sc= new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num>=1) {
			for(int i=num;i>0; i--) { // 변수확인 잘하기
				System.out.print(i+ " ");
			}
		}else {
			System.out.println("1 이상의 숫자를 입력하세요.");
		}
		
	}
	public void p4() {
		Scanner sc= new Scanner(System.in);
		while(true) {System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num>=1) {
			for(int i=num;i>0; i--) { // 변수확인 잘하기
				System.out.print(i+ " ");
			}return;
		}else {
			System.out.println("1 이상의 숫자를 입력하세요.");
		}
			
		}
	}
	
	public void p5() { // 야매로품..
		
		Scanner sc= new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요. : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<num; i++) {	
			sum += i;
			System.out.print(i + " + ");
		}
		System.out.print(num + " = " +  (num+sum));
	}
	
	public void p6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1>1 && num2>1) {
			if(num1>num2) {for(int i = num2; i<=num1; i++) {
				System.out.print(i + " ");
				}
			}else {for(int i = num1; i<=num2; i++) {
				System.out.print(i + " ");	
			}
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	public void p7() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();
			if(num1>1 && num2>1) {
				if(num1>num2) {for(int i = num2; i<=num1; i++) {
					System.out.print(i + " ");
					}break;
				}else {for(int i = num1; i<=num2; i++) {
					System.out.print(i + " ");	
				}break;
				}
			}else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
			
		}
		
	}
	
	public void p8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		System.out.printf("==== %d단 ====\n",dan);
		
		for(int i =1; i<10; i++) {
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
			
		}
		
	}
	
	public void p9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		if(dan<=9) {
		for(int i =dan; i<10; i++) {
			System.out.println("====" + i + "단" + "====");
			for(int j= 1; j<10; j++) {
				System.out.printf(" %d x %d = %d\n",i,j,i*j);
			}

			System.out.println();
		}
		
	}else {
		System.out.println("9 이하의 숫자만 입력해주세요.");
	}
		
		
}
	public void p10() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 : ");
			int dan = sc.nextInt();
			
			if(dan<=9) {
			for(int i =dan; i<10; i++) {
				System.out.println("====" + i + "단" + "====");
				for(int j= 1; j<10; j++) {
					System.out.printf(" %d x %d = %d\n",i,j,i*j);
				}
				System.out.println();
			}
			break;
			
		}else {
			System.out.println("9 이하의 숫자만 입력해주세요.");
	 }	
	}	
}

	
	
	public void p11() { // 다 풀고 다시풀기
						// 회수를 제어해야하는문제 -> count break; 활용해보기
		/*
		 * 4 => firstNum
		 * 3 => comNum
		 * 4 7 10 13 16 19 22 25 28 31
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int firstNum = sc.nextInt();
		
		System.out.print("공차 : ");
		int comNum = sc.nextInt();
		
		int count = 0;
		while(true) {
			
			if(count == 10) {
				break;
			}
			System.out.print(firstNum + " ");
			firstNum = firstNum + comNum;
			count++;
		}		
	}
	
	
	public void p12() {

		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.print("연산자 (+,-,*,/,%) : ");
			String op = sc.nextLine();
			
			if (op.equals("exit")) {
				System.out.println("프로그램을 종료합니다");
				break;
			} 
			

			System.out.print("정수1 : ");
			int num1 = sc.nextInt();

			System.out.print("정수2 : ");
			int num2 = sc.nextInt();

			sc.nextLine();

			System.out.println("op : " + op);

			if (op.equals("/") && num2 == 0) {
				System.out.println("0으로 나눌수 없습니다. 다시 입력해주세요.");

			} else if (op.equals("+")) {
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

			} else if (op.equals("-")) {
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

			} else if (op.equals("*")) {
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

			} else if (op.equals("/")) {
				System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));

			} else if (op.equals("%")) {
				System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));

			} else {
				System.out.println("없는 연산자입니다. 다시 입력해주세요");
			}

		}
	}

	public void p13() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		
		for(int i=0; i<4; i++) { // 행 담당
			for(int j=0; j<4; j++) { // 열 담당
				
				if(i+1>j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		
	
		}
	}
	
	public void p14() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for(int i=4; i>0; i--) { // 행 담당
			for(int j=0; j<4; j++) { // 열 담당
				
				if(i>j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		
		
		}
	}
	
}
