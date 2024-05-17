package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {
	public void p1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
	if(num>0) {
		for(int i = 1; i<=num; i++) {
			if(i%2==0) {
				System.out.print("수");
			}else {
				System.out.print("박");
			}
		}

}else {
	System.out.println("양수가 아닙니다.");
}
}
	public void p2() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
		if(num>0) {
			for(int i = 1; i<=num; i++) {
				if(i%2==0) {
					System.out.print("수");
				}else {
					System.out.print("박");
				}
			}break;

	}else {
		System.out.println("양수가 아닙니다.");
			
		}
	}
}
	
	public void p3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		int strLength = str.length();
		
		for(int i=0;i<=strLength;i++) {
			char strChar = str.charAt(i);
			System.out.println(strChar);
		}

		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		
		
	
		
		
		
		
	
		
	}
}