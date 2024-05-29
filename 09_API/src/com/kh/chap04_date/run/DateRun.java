package com.kh.chap04_date.run;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRun {

	public static void main(String[] args) {
		
		/*
		 * java.util.Date
		 * 
		 */
		
		// 기본생성자를 통해 생성 => 현재 날짜 및 시간(시스템 날짜 및 시간)을 담고있음
		Date date1 = new Date();
		System.out.println(date1);
		
		// 내가 원하는 날짜 (2024년 5월 9일)
		// 1. 매개변수 생성자를 통해서 생성하는 방법
		Date date2 = new Date(2024-1900, 5-1, 9);
		System.out.println(date2);
		// 옛날에 만든거라 이상함....
		
		// 2. 기본생성자로 생성 후 setter 메소드로 값 변경
		
		date1.setMonth(5-1);
		date1.setDate(9);
		System.out.println(date1);
		
		// 2024년 5월 9일 03시 20분 13초
		// 내 마음대로 포맷을 적용하는 방법
		// java.text.SimpleDateFormat 클래스 사용
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String formatDate = sdf.format(date1);
		System.out.println(formatDate);
		
		
		
	}

}
