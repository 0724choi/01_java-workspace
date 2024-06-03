package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;

import java.util.Scanner;



public class Map {
	
	
	public static void main(String[] args) {
		
		// 사전을 Map으로 만들기 (데이터4개정도 추가해서) => dic
		HashMap<String,String>dic = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		
		// 키(baby) - 벨류(아가)
		dic.put("baby", "아가");
		dic.put("coffee", "커피");
		dic.put("phone", "핸드폰");
		dic.put("mouse", "마우스");
		
		
		// 무한반복문 찾고 싶은 단어는?
		// baby
		// 아가
		while(true) {
			System.out.print("찾고 싶은 단어는? : ");
			String eng = sc.nextLine();
			if(eng.equals("exit")){
				System.out.println("종료합니다");
				break;
			}
			// 영문명(키)을 통해 조회해 맞는것이 있으면 한글(값)로 출력
			// eng값을 가져왔는데 dic 데이터 없으면 null값
			
			String kr = dic.get(eng);
			
			if(kr== null) {
				System.out.println(eng + "는 없는 단어입니다.");
			}else {
				System.out.println(kr);
				
			}
		}
		
		//tomato (사전에 없는 단어 입력)
		// tomato 는 없는 단어 입니다.
		
		//exit
		// 종료합니다 출력 후 종료
		

		
		
	}

}
