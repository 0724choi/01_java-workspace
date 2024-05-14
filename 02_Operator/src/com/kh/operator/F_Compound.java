package com.kh.operator;

public class F_Compound {
	
	/*
	 * 	복합 대입 연산자
	 * 	산술연산자과 대입연산자가 결합되어 있는 형태 (산술연산 먼저 쓰고 대입연산 나중)
	 *  -> 연산처리 속도가 빨라지므로 사용하는 것을 권장
	 *  
	 *  += -= *= /= %=
	 *  
	 *  a = a + 3;  	=> 	a += 3; 
	 *  a = a - 3; 		=> 	a -= 3;
	 *  a = a * 3; 		=>	a *= 3;
	 *  a = a / 3; 		=> 	a /= 3;
	 *  a = a % 3;		=> 	a %= 3;
	 */

	
	public void method1() {
		int num = 12;
		
		System.out.println("최초 num : " + num ); // 12
		
		// num = num;  no effect => 효과없는 코드
		
		num += 3;
		System.out.println("덧셈 후 num : " + num); // 15
		
		num -= 5;
		System.out.println("뺄셈 대입 후 num : " + num);
		
		num *= 6;
		System.out.println("곱셈 후 num : " + num);
		
		num /= 2;
		System.out.println("나눗셈 후 num : " + num);
		
		num %= 4;
		System.out.println("최종 num : " + num);
		
		String str = "Hello";
		// str = str + "World"; String은 산술연산중 더하기만 가능하다!
		str += " World";
		
		System.out.println(str);
		
	}
}
