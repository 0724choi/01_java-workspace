package com.kh.chap03_abstractAndinterface.part01_easy.run;

import com.kh.chap03_abstractAndinterface.part01_easy.model.vo.BasketBall;
import com.kh.chap03_abstractAndinterface.part01_easy.model.vo.FootBall;
import com.kh.chap03_abstractAndinterface.part01_easy.model.vo.Sports;

public class EasyRun {

	public static void main(String[] args) {
		
		// 추상클래스로 객체 생성이 불가능하다 (왜? 미완성 클래스로 판단하기 때문에)
		// Sports s = new Sports();
		// Sports s; 객체 생성이 불가능할뿐 레퍼런스로는 사용 가능하다.
		
		Sports s = new BasketBall(); // 다형성 적용 시켜서 부모타입으로 자식객체를 받아주는 형태는 가능하다
		
		Sports[] arr = new Sports[2];
		
	  //부모      자식
		arr[0] = new BasketBall();
		arr[1] = new FootBall();
		
		
		//단순 for문
		for(int i=0; i<arr.length; i++) {
			arr[i].rule();
		}
		
		//향상된 for문
		for(Sports a : arr) { // a=arr[0] => a=arr[1] 
			a.rule();
		}
		
		/*
		 * 동적바인딩 : 컴파일시점에서는 정적바인딩으로 현재 레퍼런스의 자료형의 클래스에 있는 메소드를 가리키지만
		 * 			 런타임시점(실행시점)에서는 동적바인딩으로 각각의 자식 클래스에 오버라이딩 된 메소드가 있을 경우 그게 먼저 실행됨
		 */
		
		/*
		 * 추상메소드
		 * 미완성된 메소드로 몸통부{()}가 구현되어 있지 않은 메소드
		 * 
		 * 추상클래스
		 * 미완성된 클래스
		 * 일반필드 + 일반메소드 + 추상메소드 
		 * => 추상메소드를 가진 클래스는 반드시 추상클래스로 명시해야함
		 * 
		 * 추상메소드가 굳이 없어도 추상클래스로 만드는 이유는? 언제 사용되는가?
		 * 
		 * 개념적관점 : 단지 이 클래스가 아직 미완성상태인 클래스다 라는것을 표현할 때 -> 미완성일때
		 * 프로그래밍적관점 : 객체 생성이 불가하게끔 하고자 할 때 (어떠한 이유에서 -> 모름)
		 * 
		 * 추상메소드가 존재하는 추상클래스를 쓰는 이유
		 * - 부모클래스 추상메소드가 존재할 경우
		 * 	 자식클래스에서는 강제로 오버라이딩을 해서 동일한 패턴의 메소드를 가지게 됨!!
		 * 
		 * => 각 자식 클래스마다 실행시킬 내용은 다르지만 동일한 형태의 메소드로 구현했으면 할 때
		 * 		=> 메소드 통일성 확보 목적
		 * 		=> 표준화된 틀을 제공할 목적
		 * 
		 * 
		 */

	}

}
