package com.kh.variable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class D_Cast {
	
	/*
	 * 형변환 : 값의 자료형을 바꾸는 것.
	 * 
	 * 컴퓨터에서의 값 처리 규칙 (즉, 형변환이 필요한 상황)
	 * 1. 대입 연산자를 기준으로 왼쪽과 오른쪽이 같은 자료형이여야 한다!!
	 *  => 즉, 같은 자료형에 해당하는 값만 대입 가능!
	 *  => 즉, 다른 자료형의 값을 대입하고자 한다면 형변환이 필수이다!
	 * 
	 * 자료형 변수명 = (자료형)값;
	 * 
	 * 
	 * 2. 같은 자료형끼리만 연산이 가능하다.
	 * 	값 + 값 = 계산 결과 마저도 같은 자료형으로 나옴!
	 * 
	 *	*형변환 종류
	 *	1. 자동 형변환 => 자동으로 형변환이 이뤄져서 굳이 형변환할 필요x
	 *	2. 강제(명시적) 형변환 => 자동형변환이 안돼서 우리가 직접 형변환 해줘야 함.
	 *
	 *	[표현법] (바꿀 자료형)값
	 *
	 *	*주의사항
	 * 	boolean은 형변환 불가
	 * 
	 */

	
	
	
	public void autoCasting() {
		/*
		 * 자동형변환
		 * 값의 범위가 작은 자료형과 큰 자료형간의 연산시
		 * 자동으로 범위가 작은 자료형을 큰 자료형으로 변환 후 처리해줌
		 * 	 */
		
		
		
		//	1. int(4byte) => double(8byte)
		int i1 = 12;
		double d1 = /*(double)*/ i1;
		
		System.out.println(d1);
		
		
		
		int i2 = 12;
		double d2 = 3.3;
		
		
		double result = (double)i2 + d2; // 12.0 + 3.3 = 15.3
		
		System.out.println(result);
		
		
		// 2.int(4byte) => long(8byte)
		int i3 = 1000;
		long l3 = i3;
		
		
		// 3. float(4byte) => double(8byte)
		float f4 = 1.0f;
		double d4 = f4;
		
		
		//========== 특이 케이스 ===========
		// 4. long(8byte) => float(4byte) 
		//	  float이 실수형이기 때문에 long보다 표현 가능한 수의 범위가 더 커서 자동형변환 됌!
		long l5= 1000000000L;
		float f5 = l5;
		
		
		// 5. char(2byte) <=> int(4byte)
		// 아스키 코드값 A = 65 , a = 97
		int num = 'B'; 
		System.out.println(num);
		
		
		char ch = 91;
		System.out.println(ch);
		
		
		// 각 문자들마다 고유한 숫자가 지정되어 있기 때문에 쌍방향으로 형변환 가능!
		// char 음수값 지정 불가 => 값의 범위가 0~65535
		
		
		// 6. byte(-128~127) 또는 short 간의 연산
		byte b1 = 1;
		byte b2 = 10;
		// byte b3 = b1 + b2; //byte와 short의 경우 연산시 무조건 int형으로 처리
							  //연산결과가 범위가 더 큰 int형임 => byte형에 대입 불가능
		
		byte b3 = (byte)(b1 + b2); // 강제형변환
		
		
		
		System.out.println(b3);
		
		
	}
	
	
	public void forceCasting() {
		// 강제형변환 : 큰 범위의 자료형을 작은 범위의 자료형으로 바꾸는 것
		
		// double(8byte) => float(4byte)
		double d1 = 4.0;
		float f1 = (float)d1;
		// 강제형변환 안하면 오류 발생. 명시적 형변환 필수
		
		
		// double(8byte) => int(4byte)
		int iNum = 10;
		double dNum = 5.89;
		
		// int iSum = iNum + dNum; 
		// 더하는것은 가능 그러나 담는곳이 int이기 때문에 오류
		
		
		// 오류 해결 방법
		// 방법1. 연산결과를 int형으로 강제형변환
		int iSum = (int)(iNum + dNum);
		System.out.println("iSum : " + iSum); 
		// 형변환을 통해 출력이되지만 정수만 나옴. 데이터 손실 발생
		
		// 방법2. double형 값 만을 int형으로 강제 형변환
		int iSum2 = iNum + (int)dNum; // 10 + 5 
		System.out.println("iSum2 : " + iSum2); 
		// 실수 값을 정수형으로 강제형변환을 할 경우 소수점 아래가 버려짐. 데이터 손실 발생
		
		
		// 방법3. 연산결과를 double 변수에 대입
		double iSum3 = iNum + dNum; 
		System.out.println("iSum3 : " + iSum3); 
		
		// ** 데이터 손실 테스트 **
		int iNum2 = 290;
		byte bNum2 = (byte)iNum2;
		// -128~127
		System.out.println("bNum2 : " + bNum2);
		
		
		
		
	}
	
	public void fs() {
		
		FileOutputStream fout = null;
		
		try {
			fout = new FileOutputStream("a.txt",true);
			
			fout.write('b');
			fout.write(123);
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
}
