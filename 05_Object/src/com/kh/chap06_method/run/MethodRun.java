package com.kh.chap06_method.run;

import java.util.Scanner;

import com.kh.chap06_method.controller.NonStaticMethod;
import com.kh.chap06_method.controller.OverloadingTest;

public class MethodRun {

	public static void main(String[] args) {
		NonStaticMethod n = new NonStaticMethod();
		
		
		// 1. 매개변수 반환값 둘다 없는 메소드
		// n.method1();
		
		
		// 2. 매개변수는 없고 반환값은 있는 메소드
		// n.method2(); // 리턴값은 출력되지 않음
		// System.out.println(n.method2());
		
		// 3. 매개변수는 있고 반환값은 없는 메소드
		// n.method3()); --> 매개변수 없으면 오류남!
		//				 --> 매개변수 개수가 맞지 않아도 오류남!
		// int a = n.method3(10,20); 반환값이 없어서 오류남!
			// n.method3(10, 0); // 값을 담고 싶으면 반환값 만들기!
			
			
		 //4. 매개변수도 있고 반환값도 있는 메소드	
			//char ch = n.method4("apple", 2);
			//System.out.println(ch);
		
		
		//사용자에게 매개변수를 입력 받아서 해당 메소드 호출
		/*Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		System.out.print("인덱스 하나 입력 : ");
		int index = sc.nextInt();
		
		// 여기서 유효성 검사해보자
		// index가 0이상이고, 문자열의 길이보다 작을때만 메소드4를 실행
		
		if(index>=0 && index <=str.length()) {
			System.out.println(n.method4(str, index));
		}else {
			System.out.println("다시 입력해주세요.");
		}
		
		
		System.out.println(n.method4(str, index));
		 */
	
		OverloadingTest ot = new OverloadingTest();
		ot.test();
		ot.test(10);
		ot.test(10, "ㅎㅇ");
		ot.test("ㅋㅋ",20);
		ot.test(10, 10);
		ot.test("gd");
		
		// 오버로딩의 대표적인 예 => print()문
		System.out.print(10);
		System.out.print("하이");
		System.out.print(0.0);
		
		
		
	}
		
		
}
