package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	public void p1() {
		int[] arr = new int[10];
		
		for(int i=0; i<10; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	public void p2() {
		int[] arr = new int[10];
		
		for(int i=0; i<10; i++) {
			arr[i] = i+1;
			
		}
		for(int i=9; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
		
	}

	public void p3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		
		for(int i =0; i<num; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
			
		}
		
	}
	public void p4() {
		String arr[] = {"사과","귤","포도","복숭아","참외"};
		System.out.println(arr[1]);
		
	}
	
	public void p5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
	
		int count = 0;
		System.out.print(str + " 에 " + ch +"가 존재하는 위치(인덱스) : " );
		
		char arr[] = new char[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i);
			if(ch==str.charAt(i)) {
				System.out.print(i + " ");
				count++;
				
			}
		}
		
		System.out.printf("\n%s 개수 : %d",ch,count);
		
		
	}

		public void p6() {
			
		Scanner sc = new Scanner(System.in);
		
		String sArr[] = {"월요일", "화요일", "수요일" ,"목요일" ,"금요일" , "토요일", "일요일"};
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		if(num>6 || num<0) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			System.out.println(sArr[num]);
		}
		
	}
		
		public void p7() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 : ");
			int num = sc.nextInt();
		
			int arr[] = new int[num];

			int sum = 0;
			
			for(int i=0; i<arr.length; i++) {
				
			System.out.printf("배열 %d번째 인덱스에 넣을 값 :",i);
			 arr[i] = sc.nextInt();
			 sum += arr[i];
			}
			for(int i =0; i<arr.length; i++) {
				System.out.print(arr[i]+ " ");
			}
			System.out.printf("\n총 합 : %d",sum);
		}
		
		public void p8() {
			
			Scanner sc = new Scanner(System.in);
			
			while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if(num>2 && num%2 ==1) {
				int nArr[] = new int[num];
				
				for(int i=1; i<=nArr.length; i++) {
					
					if(i<(nArr.length/2)) {
						System.out.print(i + " ");
					}else {
						System.out.print(i + " ");
					}
				}
				System.out.println();
			}else {
				System.out.println("다시 입력하세요.");
			}
			}
		}
		public void p9() {
			Scanner sc = new Scanner(System.in);
			
			String sArr[] = {"후라이드", "양념" , "반반", "간장", "파닭"}; // 5짜리 배열
			System.out.print("치킨 이름을 입력하세요 : ");
			String str = sc.nextLine();
			
			if(sArr.equals(str)) {
				System.out.println("굿");
			}else {
				System.out.println(sArr);
			}
			
				
			}
			
		
}

