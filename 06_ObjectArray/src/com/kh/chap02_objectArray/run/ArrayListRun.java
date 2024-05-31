package com.kh.chap02_objectArray.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ArrayListRun {

	
	public static void main(String[] args) {
		ArrayList<Phone> list = new ArrayList<Phone>();
		
		list.add(new Phone());
		list.add(new Phone("아이폰","애플",150000,"15pro"));
		list.add(new Phone("갤럭시","삼성",120000,"24Ultra"));
		
		list.get(0).setName("벨벳폰");
		list.get(0).setBrand("엘지");
		list.get(0).setPrice(10000000);
		list.get(0).setSeries("1");
		/*
		int total = 0;
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			total += list.get(i).getPrice(); // list.get(i) = Phone 이므로 . getPrice한다!
		}
		*/
		
		int total = 0;
		for(Phone p : list) { // p = list.get(0);
			System.out.println(p);
			total += p.getPrice();
		}

		System.out.println("총 가격 : " + total);
		System.out.println("평균가 : " + total/list.size());
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구매하고자 하는 휴대폰 입력 : ");
		String buy = sc.nextLine();
		
		
		for(Phone p: list) {
			if(p.getName().equals(buy)) {
				System.out.println("당신이 구매하고자 하는 휴대폰의 가격은 " + p.getPrice() + "원 입니다");
			}
			
			
		}
		
	}
	
		

}
