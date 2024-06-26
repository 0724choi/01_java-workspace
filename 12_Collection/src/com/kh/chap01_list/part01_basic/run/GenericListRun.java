package com.kh.chap01_list.part01_basic.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_basic.model.vo.Music;

public class GenericListRun {

	public static void main(String[] args) {
		
		// <Music> 로 제네릭 설정함
		ArrayList<Music> list = new ArrayList<Music>();
		
		list.add(new Music("Attenction","뉴진스"));
		list.add(new Music("새삥","지코"));
		// list.add("ㅇ");  다른 타입 담기 불가!
		
		System.out.println(list);
		
		list.add(1, new Music("진심이담긴노래","케이시"));
		System.out.println(list);
		
		List<Music>sub  =list.subList(0, 2);
		
		list.addAll(sub);
		System.out.println(list);
		
		Music m = list.get(0);
		System.out.println(m);
		
		System.out.println(list.get(0).getTitle());
		
		for(Music m1: list) { // m=list.get(0) => m=list.get(1)	
			System.out.println(m1);
		}
		
		/*
		 * 제네릭<>을 사용하는 이유
		 * 1. 명시된 타입의 객쳄나 저장하도록 제한을 둘 수 있음
		 * 2. 컬렉션에 저장된 객체를 꺼내서 사용할 때 매번 형변환 하는 절차를 없애기 위해서
		 */
		
	}

}
