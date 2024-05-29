package com.kh.chap03_wrapper.run;

public class WrapperRun {

	public static void main(String[] args) {
		
		/*
		 * * Wrapper 클래스
		 * 	=> 기본자료형을 객체로 포장해줄 수 있는 클래스
		 * 
		 * 	기본자료형 <----------> wrapper 클래스
		 * 	boolean				 Boolean
		 * 	char				 Character	**
		 * 	byte				 Byte
		 * 	short				 Short
		 * 	int					 Integer	**
		 * 	long				 Long
		 *  float				 Float
		 *  double				 Double
		 *  
		 *  
		 *  => 왜 기본자료형을 객체로 취급해야할까?
		 *  	- 메소드 호출해야 될 때
		 *  	- 메소드의 매개변수로 기본자료형이 아닌 객체 타입만이 요구될 때
		 *  	- 다형성을 적용시키고 싶을 때
		 */
		
		// Boxing : 기본자료형 => Wrapper 클래스 자료형
		int num1 = 10;
		int num2 = 15;
		
		// System.out.println(num1.equals(num2));
		
		// 1. 객체 생성 구문을 통한 방법
		Integer i1 = new Integer(num1);
		Integer i2 = new Integer(num2);
		
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.println(i1 == i2);
		
		// 객체화 시키면 메소드 호출 가능
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2)); // 두 값을 비교해서 앞이크면 1, 뒤가크면 -1, 같으면 0반
		

		// 2.객체생성 하지않고 바로 대입하는방법 (autoBoxing)
		Integer i3 = num1;
		System.out.println(i3);
		
		// Integer i4 = "213";
		Integer i4 = new Integer("123"); // 숫자만 줘야한다!
		System.out.println(i4); // 숫자 123 출력
		
		
		//UnBoxing : Wrapper 클래스 자료형 => 기본 자료형
		
		
		// 1. 해당 그 Wrapper 클래스에서 제공하는 xxxValue() 메소드를 통해 
		int num3 = i1.intValue(); // i3 => num3 
		int num4 = i4.intValue(); // i4 => num4
		
		
		// 2. 메소드 사용하지 않고 바로 대입하는 방법 (AutoUnBoxing)
		int num5 = i1;
		
		
		// 이거 왜 하는걸까? 
		// 웹개발 할 때 값 입력하면 무조건 문자로 날아옴 
		
		System.out.println("=================================");
		
		String str1 = "10";
		String str2 = "15.3";
		
		
		System.out.println(str1 + str2);
		
		// String --> 기본자료형
		// "10" -> 10
		// "15.3" -> 15.3
		// 해당 Wrapper 클래시에 있는 method 활용!
		// Wrapper.parseXXX();
		int i = Integer.parseInt(str1);
		double d = Double.parseDouble(str2);
		
		System.out.println(i+d);
		
		
		// 2.기본자료형 --> String
		// 10 		  --> "10"
		// 15.3 	 --> "15.3"
		
		String strI = i + ""; // "10"
		String strD = d + ""; // "15.3"
		
		String strI2 = String.valueOf(i); // "10"
		String strD2 = String.valueOf(d); // "15.3"
		
	
	}

}
