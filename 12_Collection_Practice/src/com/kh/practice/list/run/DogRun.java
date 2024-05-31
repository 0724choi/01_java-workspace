package com.kh.practice.list.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.model.vo.Dog;

public class DogRun {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Dog> list = new ArrayList<Dog>();
	
		
		int count = 0;
		/*String name = null;
		int age = 0;
		String kind = null;*/
		
		while(count < 5) {
			System.out.print(count+1 + "번째 강쥐 이름 입력 : ");
			String name = sc.nextLine();
			
			System.out.print("강쥐 나이 입력 : ");
			int age = sc.nextInt();
			sc.nextLine();
			
			System.out.print("강쥐 종 입력(ex. 말티즈) : ");
			String kind = sc.nextLine();
			
			count ++;
			
				list.add(new Dog(name, age, kind));
			if(count == 5) {
				list.add(2,new Dog(name, age, kind));
			}
		
		}
		
			System.out.println("====================================");
			System.out.println("전체 깡쥐 출력");
			System.out.println("====================================");
			
			
		for(int i=0; i<list.size()-1; i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("====================================");
		System.out.println("이름에 '구'가 들어간 강쥐 정보 출력");
		System.out.println("====================================");

		int total = 0;
		for(int i=0; i<list.size()-1; i++) {
			if(list.get(i).getName().contains("구")) {
				System.out.println(list.get(i));
				total ++;
			}
		}
		
		System.out.println("이름에 '구'가 들어간 강쥐는 총 " + total + "마리 입니다.");
		System.out.println("최승균");
		
		}
		
		
		
	}

	

	

