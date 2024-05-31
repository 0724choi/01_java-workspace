package com.kh.chap02_objectArray.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {
		
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		// for loop문 => 단순 for문
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		Phone[] phones = new Phone[3];
		// phones[0].setName("아이폰"); // -> null.setName이 되기 때문에 null이 된다 (아직 생성이 안됨)
		
		phones[0] = new Phone();
		phones[1] = new Phone("아이폰","애플",1300000,"15PRO");
		phones[2] = new Phone("갤럭시","삼성",1200000,"24ultra");
		
		// 기본생성자로 생성한 phone[0] 배열을 수정하고 싶다면? 
		phones[0].setName("벨벳폰");
		phones[0].setBrand("LG");
		phones[0].setPrice(1000000);
		phones[0].setSeries("1");
		
		
		// 각 핸드폰의 가격을 전부 더해서 구하고 싶다면?
		int total = 0;
		for(int i=0; i<phones.length; i++) {
			System.out.println(phones[i]);
			total += phones[i].getPrice();
		}
		
		System.out.println("총 가격 : " + total);
		System.out.println("평균 가격 : " + total/phones.length);
		
		
		// 사용자에게 구매하고자 하는 핸드폰이름을 입력받아
		// 핸드폰을 찾은 다음 그 가격을 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매하고자 하는 제품 입력: ");
		String str = sc.nextLine();
		for(int i=0; i<phones.length; i++) {
			if(phones[i].getName().equals(str)) {
				System.out.print("당신이 구매하고자 하는 제품의 가격은 : "+phones[i].getPrice()+"원 입니다.");
				
			}else {
				System.out.println("해당 제품은 없습니다.");
				break;
			}

		}
		
		
	}

}
