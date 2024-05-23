package com.kh.chap04_field.model.vo;

// 클래스변수(static 변수), 상수필드에 대해서 알아보기

public class FieldTest3 {
	
	// static은 공유의 개념
	// static이 붙은 애들은 프로그램 실행과 동시에 메모리에 static 영역에 올라감!
	// 프로그램 실행과 동시에 메모리상에 한번 올려놓고 필요시마다 가져다 쓰는 개념!
	// public과 같이 사용하도록 하자 (공유의 개념)
	
	public static String sta= "static_fieldTest3";
	
	// static : 공유의 개념
	// final : 상수의 개념(한번 지정된 값 변경x)	
	
	// 상수 필드(static final) : 프로그램 시작시 값이 저장되면 더 이상 변경되지 않고 공유하면서 사용할 목적
	
	public static final String STA_FIN = "static_final"; // 선언만 하면 안되고 값을 넣어야한다!
	
}
