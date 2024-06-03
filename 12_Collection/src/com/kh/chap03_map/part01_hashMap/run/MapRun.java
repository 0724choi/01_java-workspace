package com.kh.chap03_map.part01_hashMap.run;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class MapRun {

	public static void main(String[] args) {
		
		
		HashMap <String,Snack>hm = new HashMap<>();
		
		// 계층구조
		// List , Set 계열 클래스들은 Collection을 구현한 클래스
		// => 객체를 추가하고자 한다면 공통적으로 add 메소드 이용!
		
		// Map계열은 Collection을 구현할 클래스가 아님!
		// => 추가하고자 한다면 put 메소드 이용! (키 + 벨류 세트로 담아야한다)
		
		// 1. put(K key , V value) : 컬렉션에 키 벨류 세트로 추가시켜주는 메소드
		hm.put("다이제", new Snack("초코맛", 1500));
		hm.put("칸쵸", new Snack("단맛",600));
		hm.put("새우깡", new Snack("짠맛", 500));
		hm.put("새우깡", new Snack("더짠맛", 2500));
		// 동일 키값으로 다시 추가하는 경우 해당 value값이 덮어 씌워짐!! (중복된 키값 공존할 수 없음!)
		
		
		
		hm.put("포테이토칩", new Snack("짠맛", 500));
		
		System.out.println(hm); // {키 = 벨류, 키 = 벨류, 키 = 벨류 ...}
		// 저장순서 유지 안됨!!   "키" 중복값 불가능!! value는 중복되도 상관없음
		
		
		// 2. get(Object key) : V => 컬렉션에서 해당 키값을 가지는 value값을 반환해주는 메소드
		Snack s = (Snack)hm.get("다이제");
		System.out.println(s);
		
		// 3. size() : 컬렉션에 담겨있는 객체들의 개수 반환
		System.out.println("몇 개 있을까? : " + hm.size() + "개 있음");
		
		// 4. replace(K key, V value) => 컬렉션에서 해당 키값 찾아서 다시 전달한 value 값으로 수정시켜주는 메소드
		hm.replace("포테이토칩", new Snack("겁나짠맛",1000));
		System.out.println(hm);
		
		// 5. remove(Object key) => 컬렉션에서 해당 키값을 찾아서 키-벨류 세트를 삭제
		hm.remove("포테이토칩");
		System.out.println(hm);
		
		
		System.out.println("==========================");
		
		// map 공간에 담긴 모든 키값과 벨류값 전부 출력
		// for each문 안됨
		
		// ArrayList도 안됨!!
		// ArrayList list = new ArrayList(hm);
		
		// Iterator 반복자를 이용
		// Iterator it = hm.iterator();  Iterator() 호출불가능!! List계열이나 Set계열에서만 사용가능
		
		
		// Map 계열에서 메소드 제공함! => Map을 Set으로 바꿔주는 메소드 제공 (2개나)
		// Map계열 => Set 계열
		
		
		// 1. keyset() 이용하는 방법
		
		// 1) hm에 있는 키들만 Set에 담기(키들의 집합형태)
		Set keySet = hm.keySet();
		
		
		// 2) 1번 과정에서 작업된 keySet을 Iterator에 담기
		// 	  keySet.iterator() : iterator
		Iterator itKey = keySet.iterator();
		
		
		// 3) 반복문을 통해서 뽑기
		while(itKey.hasNext()) {
			String key = (String)itKey.next();
			Snack value = (Snack)hm.get(key);
			System.out.println(key + "=" + value);
		}
		
		
		// 2. entrySet() 이용하는 방법
		
		// 1. hm.entrySet() : set
		Set entrySet = hm.entrySet();
		
		// 2. entrySet.iterator() : Iterator
		Iterator itEntry = entrySet.iterator();	
		
		// 3. 반복문
		Entry <String,Snack>entry = (Entry)itEntry.next(); // 이 안에 key, value 다 담겨있음!
		
		String key = /*(String)*/entry.getKey();
		Snack value = /*(Snack)*/entry.getValue();
		
		System.out.println(key + "=" + value);
		
		
		
		
	}

}
