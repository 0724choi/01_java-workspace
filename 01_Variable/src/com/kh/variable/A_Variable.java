package com.kh.variable;

public class A_Variable { 
	
	// 시급과 근무시간과 근무일수를 곱해서 월급을 계산해서 출력하는 메소드
	// public void 메소드명(){} - 메소드 기본 형태
	public void printVariable() {
		System.out.println("====== 변수 사용 전 ======");
		
		System.out.println(" 시급 : 9450원 ");
		System.out.println(" 근무시간 : 6시간 ");
		System.out.println(" 근무일수 : 8일 ");
		
		// 월급 = 시급 * 근무시간 * 근무일수
		// 차은우 : 0000원 이라는 형식으로 출력하고 싶음
		
		System.out.println(" 차은우 : " + (9450 * 6 * 8) + "원");
		System.out.println("신유 : " + (9450 * 6 * 8 ) + "원");
		System.out.println("장원영 : " + (9450 * 6 * 8 ) + "원");
		System.out.println("카리나 : " + (9450 * 6 * 8 ) + "원");
		System.out.println("뉴진스 : " + (9450 * 6 * 8 ) + "원");
		
		
		// 변수 사용 후
		System.out.println("====== 변수 사용 후 ======");
		
		// 자료형 변수명 = 값; 
		int pay = 10000;
		int time = 6;
		int day = 8;
		
		System.out.println("차은우 : " + (pay * time * day) + "원");
		System.out.println("신유 : " + (pay * time * day ) + "원");
		System.out.println("장원영 : " + (pay * time * day ) + "원");
		System.out.println("카리나 : " + (pay * time * day ) + "원");
		System.out.println("뉴진스 : " + (pay * time * day ) + "원");
		
		/*
		 * 변수를 사용하는 이유
		 * 1. 변수는 우선적으로 값에 의미를 부여할 목적으로 사용.(가독성이 높아진다)
		 * 2. 단 한번만 값을 기록하고 필요할 때마다 가져가 쓰는 목적으로 사용.(재사용성이 높아진다)
		 * 3. 유지보수를 보다 쉽게 할 수 있다.
		 */
		
		System.out.println(" 시급 : " + pay + " 원 ");
		
		
	}
	
	public void decleareVariable() {
		/*
		 * 변수의 선언
		 * 값을 기록하기 위한 변수를 메모리 공간에 확보, 할당 
		 * [표현법] 자료형 변수이름;
		 * 
		 * 자료형 : 변수의 크기 및 모양을 지정해주는 부분
		 * 변수이름 : 변수의 이름을 붙여주는 부분 (의미부여!)
		 * 
		 * 변수 선언시 주의사항
		 * 1. 변수 선언시 소문자로 시작 / 단, 낙타봉 표기법을 지킬 것! 예약어는 불가!
		 * 2. 같은 영역 안 ({}) 에서는 동일한 변수명 선언 불가 => 즉 중복 불가!
		 * 3. 해당 영역 안에서 선언한 변수는 그 영역에서만 사용 가능
		 * => 다른 메소드에서는 사용 불가!
		 */
		
		
		// ------------- 자료형에 대한 개념 ----------------
		// 1. 논리형 (논리값 = true /false)
		boolean isTrue;
		boolean isFalse = false;
		System.out.println("is false의 값 : " + isFalse);
		
		isTrue = 1 + 3 > 1;
		System.out.println(isTrue);
		
		// 2. 숫자형 
		// 2_1 정수형(소숫점x) -> 4개
		byte bNum; // 1byte(-128~127)
		short sNum = 1000; // 2byte
		int iNum = 10000; // 4byte 정수형 기본/대표 자료형
		long lNum = 10000000; // 8byte 매우 큰 숫자 넣을 수 있다
		
		// 2_2 실수형(소숫점o) - > 2개
		float fNum = 0.0f; // 4byte => 소숫점 7자리 까지 표현 가능
					  // float의 경우 double과 값을 구분하기 위해 f를 붙임
		
		double dNum = 0.0; // 8byte => 소숫점 15자리 까지 표현 가능 실수형 기본형
		
		// 3. 문자형
		// 3_1 문자
		char ch = 'a'; // 2byte 홑따옴표 사용
		char kim;
		kim = '김';
		
		// 3_2 문자열
		String str; // 참조형
		str = "abc";
		
		//값이 잘 담겼는지 확인해보자

		System.out.println("sNum : " + sNum);
		System.out.println("iNum : " + iNum);
		System.out.println("lNum : " + lNum);
		System.out.println("fNum : " + fNum);
		System.out.println("dNum : " + dNum);
		System.out.println("ch : " + ch);
		System.out.println("kim : " + kim);
		System.out.println("str : " + str);
		
		
		// 상수의 선언
		// [표현법] final(키워드) 자료형 상수이름(대문자)
		final int AGE;
		AGE = 10;
		
		System.out.println("AGE : " + AGE);
		
		// AGE = 20; -> 상수는 값의 변경이 불가능하다
		// 대표적 예시 : 3.141592... (파이,원주율)
		
		System.out.println("파이 = "+ Math.PI);
		
		// 가독성을 위해서 _ 사용 할 수 있음
		int etc = 999_999_999;
		
		System.out.println(etc);
		
		
		// * 변수 명명 규칙
		// int number;
		// 1. 같은 영역내에 중복된 이름 안됨!!
		// 대소문자 구분
		int numBer; // 이런건 가능
		
		// 2. 예약어 (자바에서 사용되는 키워트) 안된다.
		// int true;
		// int abstract;
		// int class;
		
		
		// 3. 숫자가 사용가능하나 (단, 숫자로 시작하는것은 불가능)
		int number1;
		int num1ber;
		// int 1number
		
		// 4. 특수문자 사용가능하나 (단, _와 $ 이외에는 불가능)
		int number_1;
		int _number;
		int num$ber;
		
		// 권장사항!! (오류는 안나나 지켜줬으면 하는것들 / 개발자들간의 매너)
		// 1. 낙타표기법 (두 번째 단어부터 첫 글자를 대문자로 작성)
		String username; // 관례상 사용 x
		String userName;
		
		// 2. 한글 사용 가능하나 무조건 영문자로 작성하자 / 한글 오류 발생 가능성
		String 이름;
		int 나이;
		
		/*
		 * 정리
		 * - 값(리터럴) : 프로그램상에 필요한 명시적인 값 
		 * 				또는 사용자가 마우스 또는 키보드로 입력한 값 
		 * 변수 : 값을 저장하기 위한 공간 (메모리에 값을 기록하기 위한 공간)
		 */
		
		
		
		
		
	}
	
}
