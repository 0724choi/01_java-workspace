package com.kh.chap02_electronic.controller;

import com.kh.chap02_electronic.model.vo.Electronic;
import com.kh.chap02_electronic.model.vo.NoteBook;
import com.kh.chap02_electronic.model.vo.Tablet;

// 2. 다형성 적용 했을 경우 (ElectronicShop2 )
public class ElectronicShop2 {
	
	
	// 자리를 마련하자
	// 다형성 : 부모타입 레퍼런스 하나로 다양한 자식객체를 담을 수 있음!
	
	// 부모 : Electronic
	// 자식 : Desktop, NoteBook, Tablet
	
	
	// Parent[] arr = new Parent[4];
	// Parent 타입이지만..
	// arr[0] = new Child1();
	// arr[2] = new Child2();
	
	// 부모타입의 객체 배열로 모든 지식 객체 다루기
	
	private	Electronic[] elec = new Electronic[3];
	private int count = 0;
	//insert함수구현
	
	public void insert(Electronic any) {
		elec[count++] = any;
		
		// 맨처음 => count=0 
		// elec[0] = new Desktop("삼성","데스크탑",1200000,"gtx01070"));
		
		// 그다음 => count=1
		// elec[1] =(new NoteBook("LG","그램",2000000,4)); 
		
		//그다음 => count=2 
		// elec[2] = (new Tablet("apple","아이패드",800000,false));

	}
	
	public Electronic select(int index) { // 0 1 2 
		// elec 배열에 있는 값들을 출력해야되니까 해당 인덱스를 받아와야함
		return elec[index]; // 3개를 다 받을 수 있는 Electonic으로 반환형!
	}
	

}
