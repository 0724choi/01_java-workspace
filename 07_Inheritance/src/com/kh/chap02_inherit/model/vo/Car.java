package com.kh.chap02_inherit.model.vo;

public class Car extends Vehicle{
	
	private int tire;
	
	public Car() {}
	public Car(String name, double mileage, String kind, int tire) {
		super(name,mileage,kind);
		this.tire=tire;
	}

	public int getTire() {
		return tire;
	}
	
	public void setTire(int tire) {
		this.tire = tire;
	}
	
	public String info() {
		return super.info() + ", tire : "+ tire;
	}
	
	@Override // 어노테이션(생략가능)
	public void howToMove() { // 이름 이상하게 하면 오류난다!
		System.out.println("바퀴를 굴려 움직인다.");
	}
}
