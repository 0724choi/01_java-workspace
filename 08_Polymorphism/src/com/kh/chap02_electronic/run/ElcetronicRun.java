package com.kh.chap02_electronic.run;

import com.kh.chap02_electronic.controller.ElectronicShop1;
import com.kh.chap02_electronic.controller.ElectronicShop2;
import com.kh.chap02_electronic.model.vo.Desktop;
import com.kh.chap02_electronic.model.vo.Electronic;
import com.kh.chap02_electronic.model.vo.NoteBook;
import com.kh.chap02_electronic.model.vo.Tablet;

public class ElcetronicRun {

	public static void main(String[] args) {
		// 실행용 클래스는 납품업체
		/*
		// 1. 다형성 미적용시
		
		ElectronicShop1 es = new ElectronicShop1();
		// es에서 마련해놓은 desk, note, tab 이라는 필드에
		// 객체를 생성해서 넣어주기 위해 es 생성
		// 객체를 생성하는 순간 해당 클래스에 제시된 3개의 필드가 메모리상에 할당
		
		
		// 메소드를 써서 생성하겠음
		// 먼저 필요한 메소드를 생각해보자
		
		// 아직은 없지만 
		// 추가용 메소드 => insert
		// 전자기기객체를 생성해서 넘기는 메소드
		
		
		es.insert(new Desktop("Samsung","데스크탑",1200000,"gtx1070"));
		// 아직은 해당 메소드가 없기 때문에 에러가 남
	
		// 노트북 객체를 생성해서 넘기는 메소드
		es.insert(new NoteBook("Lg","그램",2000000,4));
		// Desktop을 받는 메소드는 있지만, NoteBook을 받는 메소드는 없음
		// => 각각 만들어줌
		
		es.insert(new Tablet("애플","아이패드",800000,false));
		// Desktop, NoteBook을 받는 메소드는 있지만, Tablet메소드는 없음
		
		
		
		// 가게에 해당 객체들이 잘 생성되어있는지 확인해보자
		// 조회용 메소드 => select
		
		
		Desktop d = es.selectDesktop();
		NoteBook n = es.selecNoteBook();
		Tablet t = es.selscTablet();
		// return 이기 때문에 콘솔에 안보임
		// 출력하고 싶다면 sysout 나와야함!
		
		// 우리가 toString 오버라이딩 했기 때문에 주소값이 아닌 값 출력문이 나온다.
		
		
		System.out.println(n);
		System.out.println(d);
		System.out.println(t);
		*/
		
		
		// 2. 다형성 적용 했을 경우 (ElectronicShop2 )
		ElectronicShop2 es = new ElectronicShop2();
		
		es.insert(new Desktop("삼성","데스크탑",1200000,"gtx01070"));
		es.insert(new NoteBook("LG","그램",2000000,4));
		es.insert(new Tablet("apple","아이패드",800000,false));
		
		//Desktop d = es.select(0);
		//실제로 들어있는 값은 Desktop 객체가 맞으나 반환형이 Electronic 이라서 맞춰줘야함!
		//문제가 되는 부분을 형변환을 해줘야함!
	
		/*
		Desktop d = (Desktop)es.select(0);	
		NoteBook n = (NoteBook)es.select(1);
		Tablet t = (Tablet)es.select(2);
		// 다운캐스팅의 예시
		*/

		Electronic d = es.select(0);
		Electronic n = es.select(1);
		Electronic t = es.select(2);
		// 다형성을 적용해서 이렇게 받을수도 있다
		
		System.out.println(d.toString());
		// toString()이 마치 부모것을 호출하는것처럼 보이지만
		// 동적바인딩이 일어나서 오버라이딩을 통해 자식것이 나오게된다.
		
		System.out.println(n);
		System.out.println(t);
		
		
		/*
		 * 다형성을 사용하는 이유 
		 * 1. 부모타입의 레퍼런스로 다양한 자식객체를 받을 수 있다는 장점
		 * 2. 메소드 정의시 매개변수로 다형성을 적용하게 되면 메소드 개수가 확 줄어든다!
		 * 3. 필수로 사용해야하는 곳이 있음!! => 추상클래스(인터페이스) => 클래스를 추상화한것
		 */
	
	
	
	
	
	
	
	
	
	
	}
	

}
