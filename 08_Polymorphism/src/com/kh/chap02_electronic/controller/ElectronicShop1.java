package com.kh.chap02_electronic.controller;

import com.kh.chap02_electronic.model.vo.Desktop;
import com.kh.chap02_electronic.model.vo.NoteBook;
import com.kh.chap02_electronic.model.vo.Tablet;

// 다형성을 적용 안했을때
public class ElectronicShop1 {
	
	// 용산 전자상가에 있는 가게
	// 3개 제품을 놓을 자리만 만들것
	
	// 필드부
	private Desktop desk;
	private NoteBook note;
	private Tablet tab; // 객체 생성은 안되고 텅 비어있음
	
	
	
	// 메소드부
	// 반환값을 모르겠으면 일단 void로 만들기
	// Desktop 객체를 받아 줄 수 있게 메소드 작성
	public void insert(Desktop d) { // Desktop desk = new Desktop(~~~~);
		desk = d;
	}
	// 오버로딩 개념 : 매개변수가 다르기 때문에
	public void insert(NoteBook n) {
		note = n;
	}
	
	public void insert(Tablet t) {
		tab = t;
	}
	
	// 동일한 클래스에 동일한 메소드명으로 여러개 만들어져있는 것 => 오버로딩
	// 단, 매개변수 타입이 달라야한다!
	// 오버로딩 적용 되어있음.
	
	// 조회용 메소드
	// 반환형 모르겠으면 void로!
	
	public Desktop selectDesktop() {
		return desk;
	}
	
	public NoteBook selecNoteBook() {
		return note;
	}
	
	public Tablet selscTablet() {
		return tab;
	}		// 내가 리턴하고자 하는 값의 자료형을 반환!
	
	// insert처럼 select도 같은 이름으로 하면 안되는 이유는?
	// 매개변수가 없기 때문에 불가능하다... 
}
