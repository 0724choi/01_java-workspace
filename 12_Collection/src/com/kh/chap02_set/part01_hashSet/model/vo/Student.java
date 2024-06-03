package com.kh.chap02_set.part01_hashSet.model.vo;

import java.util.Objects;

public class Student {
	
	private String name;
	private int age;
	private int score;
	
	public Student() {}

	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;	
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name, score);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(name, other.name) && score == other.score;
	}
	
	
	
	
	
	/*
	@Override
	public int hashCode() { // 모든필드에 담긴 값이 일치하면 동일한 hashCode반환 하도록!
		String str = name + age + score; // 하나의 문자열 "공유43100","차은우2685","주지훈2420","공유43100"
		return str.hashCode();
		
	}
	
	public boolean equals(Object obj) { // 현재객체와 전달받은 객체의 각 필드값이 모두 일치하면 true, 하나라도 일치하지 않으면 false
		
		System.out.println();
		
		//		this(현객체)				vs				obj(전달받은객체)
		//		Student 타입								Object타입
		
		
		// Student other =(Student)obj; // 비교하기위해 Student로 타입 맞춰주자
		
		//		this(현객체)				vs				other(전달받은객체)
		//		this.name				vs				other.name 일치하는지
		//		this.age				vs				other.age 일치하는지
		//		this.score				vs				other.score 일치하는지	
		
		
		Student other = (Student)obj;
		if(name.equals(other.name)&& age==other.age && score==other.score) {
			return true;	
		}else {
			return false;
		}
		
	}
*/
	
	

}
