package com.kh.chap02_set.part01_hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

public class SetRun {

	public static void main(String[] args) {
		
		
		// Object equals() => 두 객체의 "주소값"을 비교해서 일치하면 true / 일치하지 않으면 false
		// Object hashCode() = > 해당 객체의 "주소값"을 가지고 10진수 형태로 만들어서 반환
		
		// String equals() => "실제 담긴 문자열"을 가지고 비교해서 일치하면 true / 일치하지 않으면 false => A_StringPoolTest
		// String hashCode() => "실제 담긴 문자열"을 가지고 10진수 형태로 만들어서 반환 => A_StringPoolTest
		
		
		
		
		HashSet<String> hs1 = new HashSet();
		
		// set 순서유지가 안됨, 중복값 불가능
		
		hs1.add("반갑습니다");
		hs1.add(new String("반갑습니다"));
		hs1.add("여러분");
		hs1.add("안녕하세요");


		System.out.println(hs1); // 저장 순서 유지 안됨!!(인덱스 개념 없음!) , 중복된 데이터(동일객체) 보관 불가능
		
		HashSet<Student> hs2 = new HashSet<>();
		
		// 존잘월드에 3명이 살고 있음
		
		hs2.add(new Student("공유", 43, 100));
		hs2.add(new Student("은우", 26, 85));
		hs2.add(new Student("주지훈", 24, 20));
		hs2.add(new Student("공유", 43, 100));
		
		
		System.out.println(hs2); // 저장 순서 유지 안됨! (인덱스 개념 없음) / 중복 제거 안됨 => 왜? 동일 객체로 판단되지 않음...
		
		// HashSet 이라는 공간에 객체가 추가가 될 때마다 동일객체인지 비교!
		// 동일객체 : 각 객체 마다 hashCode() 호출 결과 일치하고, equals() 비교시 true일 경우
		
		// Student에 equals() 오버라이딩 => "실제 각 필드에 담긴 데이터" 들이 다 일치하면 true / 아니면 false
		// Student에 hashCode() 오버라이딩 =>  "실제 각 필드에 담긴 데이터"들이 일치하면 동일한 10진수 반환
		
		
		/*
		System.out.println(new Student("공유",43,100).hashCode()); // new 사용했기때문에 당연히 주소값이 다르게 나옴!
		System.out.println(new Student("공유",43,100).hashCode());
		
		System.out.println(new Student("공유",43,100).equals(new Student("공유",43,100)));
		*/
		
		
		// hs2.get(1);  => 인덱스의 개념이 없고 get메소드 자체가 정의되어있지않음 (한 객체만 뽑아올 수 없음!)
		
		// HashSet에 담긴 모든 객체들에 순차적으로 접근
		
		// 1. for문 사용가능 (for each문만 사용가능 인덱스가 없기 때문에)
		for(Student s : hs2) {
			System.out.println(s);
		}
		
		
		// 2. ArrayList에 담아준 다음에 ArrayList를 반복문 돌려서 접근
		// ArrayList에 담는 첫번째 방법 : ArrayList 생성 후 addAll 메소드를 통해 통째로 추가하기 
		ArrayList<Student> list = new ArrayList<Student>();
		list.addAll(hs2);
		
		
		// ArrayList에 담는 두번째 장법 : ArrayList 생성과 동시에 통째로 추가하기
		ArrayList<Student>list2 = new ArrayList<Student>();
		for(int i=0; i<list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		// set 왜 사용하나요?
		// 중복된 데이터 들어오면 절대 안되는 경우! => 거의 안쓰임
		
		System.out.println("====================================");
		// 3. Iterator (반복자)를 이용해서 순차적으로 접근
		Iterator<Student> it = hs2.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}
		
		// it.next(); NoSuchElementException : 더 이상 뽑을 요소 없음
	}

}
