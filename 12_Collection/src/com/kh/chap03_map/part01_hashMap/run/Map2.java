package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Map2 {

	public static void main(String[] args) {
		
		// 학급 반장(해쉬맵)
		// 어려움
		
		// 반장을 뽑는데 기호 A B C D E 후보등록!
		// 투표 용지에는 H반 학생들이 자기가 선택한 후보의 기호(알파벳) 써있음
		// 입력
		// 투표참여인원수 : 15
		// 서기가 적은 결과 : ABABD ... (15개 단어 한줄로 입력)
		
		// 결과
		// 축하합니다 A가 당선되었습니다.
		
		// 조건 : HashMap을 이용해서! (keySet)
		
		Scanner sc = new Scanner(System.in);
		HashMap<Character, Integer> map = new HashMap<Character, Integer>(); // K(후보자) - V(득표수)
		char leader = ' ';
		
		System.out.print("투표참여 인원수 : ");
		int people = sc.nextInt();
		sc.nextLine();
		
		System.out.print("서기 결과 : ");
		String write = sc.nextLine();
		
		for(int i=0; i<people; i++) {
		
			char candidate = write.charAt(i);
			
			if(map.get(candidate) == null) { // 처음 표 받을때
				map.put(candidate, 1);
			}else { // 한 표라도 받을때 
				 map.replace(candidate, map.get(candidate)+1);
			}
			
			
		}
		int max = 0;
		for(char key : map.keySet()) {
			int votes = map.get(key); // 득표수 조회
			if(votes > max) {
				max= votes;
				leader = key;
			}
		}
			
		System.out.println("축하합니다 . " + leader + "가 당선되었습니다.");
		}
		
		
		
		
		
		
		
		
		
		
	}


