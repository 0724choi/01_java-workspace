package com.kh.chap01_beforeVSafter.after.model.vo;


// 			  자식 ------------> 부모
//			  후보 ------------> 조상
//			  하위 ------------> 상위
//			  this				super // 주소값을 얘기 외우기!
public class Desktop extends Product { 
	
	private boolean allInOne;
	
	public Desktop() {}
	
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		
		// brand ~ price 네 개의 값들은 부모클래스(Product)의 필드에 대입
		// super. 으로 부모에 접근가능
		
		
		// 해결방법 1. 부모클래스에 있는 필드를 protected 접근 제한자로 수정
		/*super.brand = brand;
		super.pCode = pCode;
		super.pName=pName;
		super.price=price;
		*/
		
		
		
		//해결방법2. 부모클래스에 있는 setter 메소드 활용하기(public이기 떄문에 접근 가능)
		/*
		super.setBrand(brand);
		super.setpCode(pCode);
		super.setpName(pName);
		super.setPrice(price);
		*/
		
		//해결방법3. 부모생성자 호출하기 => 주로 사용
		// this생성자, super생성자 위치가 항상 위에 배치되어야한다!!!!
		super(brand,pCode,pName,price); 
		this.allInOne = allInOne;
	}
		
		
		public boolean isAllInOne() {
			return allInOne;
		}
		
		public void setAllInOne(boolean allInOne) {
			this.allInOne = allInOne;
		
		}
		// 오버로딩 : 메소드 이름이 똑같지만 매개변수가 다를때 
		// 오버라이딩 : 부모클래스에 있는 메소드를 자식 클래스에서 재정의 하는 것 (상속의 개념)
		public String information() {
			return super.information() + ", allInOne : " + allInOne; 
		}
	
}
