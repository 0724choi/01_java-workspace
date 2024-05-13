package com.kh.variable;

import java.util.Scanner;

// 사용자가 키보드로 입력한 값을 받아들이는 Scanner 실습

public class B_KeyboardInput {
	
	public void inputTest1() { // 메소드 = 기능
		
		/*
		 * 키보드로 값을 입력하는 방법
		 * Scanner를 사용한다!
		 * java.util.Scanner 클래스를 이용하는 것이다!
		 * Scanner 클래스 내부의 메소드를 호출하여 입력 받는 것.
		 * 
		 */
		
		// 스캐너 클래스를 생성
		// 클래스명 별칭 = new 클래스명();
		Scanner sc = new Scanner(System.in);
		// System.in 은 입력받은 값을 바이트 단위로 읽어드리겠다는 뜻
		// 출력시에는 System.out 이라는 구문 사용!
		
		
		System.out.print(" 아무거나 입력해 보세요 : ");
		String message = sc.nextLine();
		
		System.out.println(" 입력받을 내용 : " + message );
		
		sc.close(); // 메모리 낭비 방지
	}
	
	public void inputTest2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름은 ? : ");
		
		// 사용자가 입력한 값을 문자열로 받아오는 메소드(nextLine(), next())
		// 	  1		3 	 2
		//String name = sc.next();
		// next() : 사용자가 입력한 값 중에 공백이 있으면 공백 이전까지의 값만 읽음
		// 			따라서 거주지같이 공백이 있는 데이터는 값을 제대로 못가져옴
		
		String name = sc.nextLine(); // nextLine 사용시 공백 포함
		// nextLine() : 사용자가 입력한 값을 모두 다 읽어옴 (enter 전까지의 모든 값)
		
		
		// System.out.println("이름 : " + name);
		
		System.out.print("당신의 나이는 몇살입니까? : ");
		int age = sc.nextInt(); // 사용자가 입력한 값을 정수로 읽어드리는 메소드
		
		System.out.print("당신의 키는 몇 입니까? (소수점 첫째짜리까지 입력) : ");
		double height = sc.nextDouble(); // 사용자가 입력한 값을 실수로 읽어드리는 메소드
		
		// xxx님은 xx살이며, 키는 xxx.xcm 입니다.
		
		sc.close();
		System.out.println(name + "님은 " + age + "살이며, 키는 " + height + "cm 입니다." );
		
		
	}
	
	// 키보드로 값을 입력 받을 때 종종 발생하는 문제
	public void inputTest3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		sc.nextLine(); // nextLine이 버퍼에 남아있는
		               //\n(엔터)키를 지워주기때문에 넣어야함
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		sc.close();
		
	// ~님은 ~살이며, 사는곳은 ~이고 키는 ~.~입니다.
	// sysout + ctrl + space => System.out.println();
	// System.out.println(name + "님은 "+ age + "살이며, 사는곳은 " + address + " 이고, 키는 " + height + "cm 입니다 ");
		
		
	 System.out.printf("%s님은 %d살이며, 사는곳은 %s 이고, 키는 %.1fcm 입니다." , name, age, address, height);
		
		
		
	}
	
	
	
	public void inputTest4() {
		Scanner sc = new Scanner(System.in);
		
		// 문자열을 입력 받을 때(String) sc.nextLine(); or sc.next();
		// 정수값을 입력 받을 때(int) sc.nextInt();
		// 실수값을 입력 받을 때(double) sc.nextDouble();
		
		
	System.out.print("이름 : ");
	String name = sc.nextLine();
	
	System.out.println("성별(M/F) : ");
	// sc.nextChar()는 없음	
	char gender = sc.nextLine().charAt(0);
	//charAt(인덱스) : 해당 문자열로부터 해당 인덱스의 문자를 추출해주는 메소드
	
	System.out.print("나이 : ");
	int age = sc.nextInt();
	
	System.out.print("키 : ");
	float height = sc.nextFloat();
	
	sc.close();
	
	/*
	 * xxx님의 개인정보
	 * 성별 : 
	 * 나이 :
	 * 키 :
	 */
	
	System.out.println(name +"님의 개인정보\s 성별 :\s" + gender);

	}
	
	
	public void charAtTest() {
		String str = "hello";
		
		// 변수에 기록하여 출력하는 방식
		char ch = str.charAt(0);
		// System.out.println(ch);
		
		
		// 바로 출력하고 싶다 
		System.out.println(str.charAt(2));
		
		// 존재하지않는 인덱스 = 오류!
		System.out.println(str.charAt(12)); // java.lang.StringIndexOutOfBoundsException
	}
	
	
	/*
	 * 5/10 정리
	 * 1. 콘솔창(모니터)에 출력하기 위해 : System.out.print[ln]();
	 * 2. 콘솔창(키보드)에 입력받기 위해 : Scanner 클래스를 사용
	 * 
	 * 주의사항
	 * 1) sc.next~()메소드 뒤에 sc.nextLine()메소드가 와야할 경우 \n 제거 필요
	 * -> sc.nextLine() 메소드 한번 더 사용해줘야 함
	 * 
	 * 2) '문자' 값을 입력 받아야 할 경우
	 * sc.nextLine() 메소드를 통해 우선 문자열로 입력 받고 
	 * 그 뒤에 .charAt(인덱스값) 메소드를 통해서 문자 하나를 추출
	 * 
	 * 
	 */

}
