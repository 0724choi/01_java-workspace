package com.kh.chap01_poly.run;

import com.kh.chap01_poly.model.vo.Child1;
import com.kh.chap01_poly.model.vo.Child2;
import com.kh.chap01_poly.model.vo.Parent;

public class PolyRun {

	public static void main(String[] args) {
		// 다형성
		
		// 기억해둘 것! '=' 기준으로 왼쪽과 오른쪽의 자료형(타입)은 같아야 한다!
		
		System.out.println("1. 부모타입 레퍼런스로 부모객체를 다루는 경우");
		Parent p1 = new Parent();
		p1.printParent();
		// p1.printchild1(); 부모객체(Parent)로 만들었기때문에 자식객체의 것은 사용 불가능
		// p1 레퍼런스로 Parent에만 접근 가능
		
		
		System.out.println("2. 자식타입 레퍼런스로 자식객체를 다루는 경우");
		Child1 c1 = new Child1();
		c1.printchild1();
		c1.printParent(); // 자동형변환! (Child1 -> Parent)
		// ((Parent)c1).printParent();
		// c1 레퍼런스로 Child1, Parent 둘다 접근 가능
		// Parent 접근식 자동으로 형변환 된 채로 진행
		
		System.out.println("3. 부모타입 레퍼런스로 자식객체를 다루은 경우 ");
		Parent p2 =/*(Parent)*/ new Child1();
		//Parent p2 = new Child1(); // 자료형이 다르다? 근데 에러가 안뜸 => 자동형변환이 된거임!
		p2.printParent();
		//p2.printChild();
		((Child1)p2).printchild1(); // 강제형변환 하면 호출은 가능
		
		// p2 레퍼런스로 지금 당장은 Parent에만 접근 가능하지만
		// Child1에 접근하고자 한다면 강제형변환으로 접근 가능
		
		
		/*
		 * 상속 구조의 클래스들 간에는 형 변환 가능!
		 * 
		 * 
		 *	1. UpCasting 
		 *	   자식타입 -> 부모타입으로 변경됨
		 *		자동형변환
		 *		ex) 자식. 부모메소드();
		 *		부모 = 자식 자식객체
		 *
		 *2.	DownCasting
		 *		부모타입 -> 자식타입으로 형변환
		 *		강제형번환
		 *		ex) ((자식)부모).(자식메소드)
		 */
		
		// String str = (String)new Child1(); 상속구조가 아니면 불가능
		
		// 다형성 정의
		// - 부모타입으로부터 파생된 여러가지 타입의 자식객체들을 부모 클래스 타입 하나로도 다룰수있다.
		
		
		// 다형성의 목적

		// 다형성을 배우기전
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1,2,4);	
		arr1[1] = new Child1(2,3,5);
		
		
		Child2[] arr2 =new Child2[2];
		arr2[0]	= new Child2(2,8,7);
		arr2[1]	= new Child2(7,9,8);
		
		// ----------------------------------
		
		// 다형성 적용시 
		
		Parent[] arr = new Parent[4];
		// Parent 타입
		arr[0] = new Child1(1,2,4);
		arr[1] = new Child1(1,3,7);
		arr[2] = new Child2(5,7,2);
		arr[3] = new Child2(3,7,8);
		
		// 하나의 부모타입으로 여러 자식 객체들을 받을 수 있음 -> 편하다, 코드길이 감소
		
		
		System.out.println("================================");
		
		// arr[0].printParent();
		((Child1)arr[0]).printchild1();
		// ((Child2)arr[1]).printChild2();  ClassCastException : 부적절한 형변환
		((Child1)arr[1]).printchild1();
		((Child2)arr[2]).printChild2();
		((Child2)arr[3]).printChild2();
		
		System.out.println("========== 반목문을 이용해서 출력 ===========");
		
		for(int i=0; i<arr.length; i++) {
			/*
			 * instanceof 연산자 => 연산결과 true / false로 반환
			 * 현재 레퍼런스가 실질적으로 어떤 클래스 타입을  참조하는지 확인할 때 사용
			 * 
			 */
			
			// if(i==0 || i==1) {
			if(arr[i] instanceof Child1) { // 해당 레퍼런스가 실제 Child1 참조하고 있다면 true 아니면 false 리턴
				((Child1)arr[i]).printchild1();
			}else {
				((Child2)arr[i]).printChild2();	
			}
			
		}
		
		System.out.println("============================");
		Parent pp = new Child1();
		pp.print();
		
		/*
		 * 동적바인딩 : 프로그램이 실행되기 전에는 컴파일 되면서 정적바인딩 (레퍼런스 타입의 메소드를 가리킴)
		 * 			 단,	실질적으로 참조하는 자식클래스에서 해당메소드 오버라이딩 되어있다면
		 * 			 프로그램 실행시 동적으로 그 자식클래스의 오버라이딩 된 메소드를 찾아서 실행
		 * 
		 */
		
		for(int i=0; i<arr.length; i++) {
			arr[i].print();
		}

		
	}

}
