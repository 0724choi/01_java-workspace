package com.kh.variable;

public class C_Printf {
	
	public void printfTest() {
		
		// System.out.print("출력하고 싶은 값"); // 출력만 해줌 (줄바꿈 x)
		// System.out.println("출력하고 싶은 값"); // 출력 후 줄바꿈 발생
		
		
		// System.out.printf("출력하고자 하는 형식(포맷)", 출력하고자 하는 값);
		// 출력하고자 하는 값들이 제시한 형식에 맞춰서 출력만 진행 (한 줄 띄어쓰기 안됨)
		
		
		/*
		 * 포맷 안에서 쓰일 수 있는 키워드
		 * %d : 정수
		 * %c : 문자 (한글자만 가능)
		 * %s : 문자열 (문자도 포함)
		 * &f : 실수
		 */
		
		
		int iNum1 = 10;
		int iNum2 = 20;
		
		// "10 20"
		
		System.out.println(iNum1 + " " + iNum2);
		System.out.printf("%d %d", iNum1, iNum2);
		System.out.println();
		System.out.printf("%d %d%%" , iNum1, iNum2);
		
		// printf는 줄바꿈 x 
		System.out.println();
		// System.out.printf("%d %d", iNum1); // 오류 개수맞추기!
		// System.out.printf("%d %d",iNum1,iNum2,iNum2,30); 오류는 아니나 이후값 무시
		
		System.out.printf("%5d\n" , iNum1); // 양수 5만큼 오른쪽 비트 이동
		System.out.printf("%-5d %d\n" , iNum2,iNum2); // 음수 5만큼왼쪽 비트 이동
		
		
		System.out.printf("%5d\n",250);
		System.out.printf("%5d\n",3000);
		System.out.printf("%5d\n",16);
		
		double dNum1 = 1.23456789;
		double dNum2 = 4.53;
		
		System.out.printf("%f\t%f\n",dNum1, dNum2); // 무조건 소수점 아래 6번째 짜리까지 보여줌
		System.out.printf("%.2f %.1f\n", dNum1,dNum2); // .n(숫자)넣을시 그 자리수로 짤라짐
	
		
		char ch = 'a';
		String str = "hello";
		
		
		System.out.printf("%c %s %s\n",ch,str,ch );
		System.out.printf("%C %S %S\n",ch,str,ch ); //대문자 포맷 변경시 대문자 출력가능
		
		
		
		
		
	}

}
