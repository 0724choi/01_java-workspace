package com.kh.chap02_string.controller;

public class B_StringMethodTest {
	
	public void method() {
		String str1 = "Hello World";
		
		// 메소드명(매개변수) : 반환형 
		
		// 1. 문자열.charAt(int index) : char
		// 	  문자열에서 전달받은 index 위치의 문자만을 추출해서 리턴
		char ch = str1.charAt(3);
		System.out.println("ch : " + ch);
		
		// 2. 문자열.concat(String str) : String
		String str2 = str1.concat("!!!");
		System.out.println("str 2 : " + str2);
		
		String str3 = str1 + "!!!";
		System.out.println("str 3 : "+ str3);
		
		System.out.println("str2와 str3가 일치하는가? : " + (str2==str3)); // false
		// 근데 아까전에 StringPool에서 같은글자면 같은주소 아닌가요? 
		// concat을 열어보면 new가 있음 => 새로운 주소값 heap
		// str3만 수영장에 있음...
		
		
		// 3. 문자열.equals(Object obj) : boolean // 부모타입으로는 자식 전부 다 받을 수 있다(다형성)
		//	  문자열과 전달된 또 다른 문자열 가지고 주소값 비교가 아니고 실제 문자열값 가지고 동등비교 한다
		System.out.println("str2와 str3가 일치합니까?(equals) : " + str2.equals(str3));
		
		// 4. 문자열.contains(CharSequence s) : boolean // String의 부모 : CharSequence
		System.out.println("str1 Hello 문자열이 포함되어 있습니까 : " + str1.contains("Hello"));
		System.out.println("str1에 bye 문자열이 포함되어 있습니가 : "+ str1.contains("bye"));
		
		// 5. 문자열.length() : int
		System.out.println("str1의 길이 : " + str1.length());
		
		// 6. 문자열.substring(int beginIndex) : String => 문자열의 beginIndex위치부터 끝까지 문자열을 추출해서 리턴
		//	  문자열.substring(int beginIndex, int ednIndex) : String
		//						=> 문자열의 beginIndex 위치부터 endIndex-1 위치까지의 문자열을 추출해서 리턴
		
		// Hello World
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(3, 7));
		
		// Hello만 추출해보기
		System.out.println(str1.substring(0,5)); // 문자열시작부터 끝위치의-1 까지...
		
		// ** Quiz
		// 1. Worl 만 추출 + concat 함수로 ! 엮어서 str0만들기 => Worl!
		// 2. contains 함수 이용해서 !가 포함되어있는지 여부 추출 => str0에 ! 가 포함되어있습니까? : true
		
		String str0 = str1.substring(6,10);
		System.out.println(str0);
		str0 = str0.concat("!");
		System.out.println(str0);
		System.out.println(str0.contains("!"));
		
		
		System.out.println(str1.substring(6, 10).concat("!").contains("!")); // 메소드 체이닝
		
		
		// 7. 문자열.replace(char oldCahr, char newChar) : String
		//	  문자열에서 oldChar 문자들을 newChar로 변환한 새 문자열 리턴
		
		
		String str4 = str1.replace('l', 'c');
		System.out.println(str4);
		System.out.println("str1이 바꼈을까? : " + str1);
		
		// 8. 문자열.toUpperCase() : String 		=> 문자열을 다 대문자로 변경한 새 문자열 리턴
		//	  문자열.toLowerCase() : String 		=> 문자열을 다 소문자로 변경한 새 문자열 리턴
		
		
		String str5 = str1.toUpperCase();
		System.out.println(str5);
		System.out.println("Loew : " + str5.toLowerCase());
		
		/*
		System.out.println("계속 하시겠습니까 ? : (y/n) : ");
		char ch = sc.nestLine().toUpperCase().charAt(0); // 메소드 연이어서 호출 -> 메소드 체이닝
		char ch = sc.nestLine().charAt(0).toUpperCase(); 
		-> charAt쓰는순간 char형이되기 때문에 불가능 
		
		if(ch=='N') {
			// 프로그램 종료
		}
		*/
		
		
		// 9. 문자열.trim() : String
		//	  문자열의 앞 뒤 공백을 제거시킨 새 문자열 리턴
		
		String str6 = "		JA  	VA			";
		System.out.println(str6.trim());
		
		
		
		// 10. 문자열.toCharArray() : char[]
		char[] arr = str1.toCharArray();
		System.out.println(arr[4]);
		
		
		// 11. String.valueOf(char[] data) : String
		System.out.println(String.valueOf(arr));
		
		
		
		
	}
	

}
