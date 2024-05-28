package com.kh.chap03_abstractAndinterface.part01_easy.model.vo;

public abstract class Sports {
	
	private int people;
	
	public Sports() {}
	public Sports(int people) {
		this.people=people;
	}
	
	public int getPeople() {
		return people;
	}
	
	public void setPeople(int people) {
		this.people = people;
		
	}

	
	@Override
	public String toString() {
		return "people : " + people;
	}
	
	// 추상메소드(미완성된 메소드)
	public abstract void rule();  // 머리부만 있고 몸통부가 없다는 에러가 남
	// 미완성된 메소드가 있다는 것은 이 클래스도 아직 미완성이라는 이야기
	// 그럼 언제 만드나요..? => 해당 추상 클래스를 상속 받는 자식에서 !!
	
	
	
}
