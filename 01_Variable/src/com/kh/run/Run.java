package com.kh.run;

import com.kh.variable.A_Variable;
import com.kh.variable.B_KeyboardInput;
import com.kh.variable.C_Printf;
import com.kh.variable.D_Cast;

public class Run { 
	public static void main(String[] args) { // 메인 메소드(실행용 클래스)
		 A_Variable a = new A_Variable(); // 구현용 클래스 메인 메소드로 불러오기 
		// a.printVariable(); // 메소드 호출
		// a.decleareVariable();
		
		
		 B_KeyboardInput b = new B_KeyboardInput();
		// b.inputTest1();
		// b.inputTest2();
		 // b.inputTest3();
		// b.inputTest4();
		//b.charAtTest();
		
		
		C_Printf c  = new C_Printf();
		//c.printfTest();
		
		// 클래스명 별칭 = new 클래스명(); 
		// -> 실행용 클래스에서 구현용 클래스 돌리는 방법
		// 별칭.메소드명(); -> 구현용 클래스 내 메소드 호출 
		
		
		D_Cast d = new D_Cast();
		// d.autoCasting();
		d.forceCasting();
		
	}

}
