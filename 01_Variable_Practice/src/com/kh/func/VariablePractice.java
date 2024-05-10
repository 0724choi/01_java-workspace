package com.kh.func;

import java.util.Scanner;

public class VariablePractice {
	public void variablePractice1() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 : " );
		String name = sc.nextLine();
		System.out.println("성별을 입력하세요(남/여) : " );
		char gender = sc.nextLine().charAt(0);
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.println("키를 입력하세요(소숫점 1자리까지) : " );
		float height = sc.nextFloat();
		
		sc.close();
		
		System.out.println("이름을 입력하세요 : " + name);
		
		
		
		
		
		
		
		
		
		
	}
	
}
	
