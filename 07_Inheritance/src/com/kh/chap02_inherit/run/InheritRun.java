package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;
import com.kh.chap02_inherit.model.vo.Vehicle;

public class InheritRun /*extends Object*/  {

	public static void main(String[] args) {
		
		
		Car c = new Car("벤틀리",12.5,"세단",4);
		
		Ship s = new Ship("낚시배",3,"어선",1);
		
		Airplane a = new Airplane("종이비행기",0.01,"제트기",10,4);
		
		System.out.println(c.info());
		System.out.println(s.info());
		System.out.println(a.info());
		
		c.howToMove();
		s.howToMove();
		a.howToMove();
		
		
		
		/*
		 * 상속의 장점
		 * 보다 적은량의 코드로 새로운 클래스 작성가능
		 * 코드를 공통적으로 관리하기 때문에 추가나 변경에 용이하다(유지보수 생산성)
		 * 
		 * 상속의 특징
		 * 클래스간의 상속에 있어서 다중 상속이 안된다 (단일상속만 가능 즉, 부모는 하나다)
		 * 부모클래스에 정의되어있는 protected 필드는 자식 클래스에서 직접 접근 가능
		 * 자식객체는 부모클래스에 있는 메소드를마치 내것처럼 호출 가능
		 * 	+ 부모클래스에 있는 메소드가 마음에 안들면 자식 클래스에서 오버라이딩 가능(재정의)
		 * 명시되어 있지는 않지만 모든 클래스(제공하는 클래스, 직접 만드는 클래스 전부포함) Object클래스의 후손이다.
		 * => 즉, Object 클래스에 있는 모든 메소드를 마음대로 호출 가능!
		 * => 뿐만 아니라 오버라이딩을 통해서도 재정의 가능 (Object도)
		 */
		
		System.out.println(c.hashCode());
		System.out.println(c.equals(s));
		
		String str1 = "hi";
		String str2 = "hi";
		
		System.out.println(str1.equals(str2));
		// String이 Object를 오버라이딩해서 만든 .equals
		
		
		System.out.println(c);
		System.out.println(c/*.toString()*/);
	}

}
