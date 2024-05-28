package com.kh.chap03_abstractAndinterface.part01_easy.model.vo;

public class BasketBall extends Sports{
	
	// 자식클래스에 강제성을 부여하기 위함
	// BasketBall, footVall이든 무조건 rule이있으니 rule을 구현했으면 해서
	
	// 추상메소드가 존재하는 추상클래스를 상속받는 순간
	// 부모클래스에 있는 추상메소드를 강제로 오버라이딩 해야함
	

	@Override
	public void rule() {
		System.out.println("공을 항상 손으로만 다뤄야한다.");
		
	}

}
