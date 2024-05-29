package com.kh.practice.api.controller;

import com.kh.practice.api.model.vo.Book;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class BookController {

	public BookController() {
	}

	private Book[] books = new Book[5];

	// SimpleDateFormat date = new SimpleDateFormat("yyyy년 MM월 dd일");

	{
		books[0] = new Book("자바의 정석", "차은우", "나무", new Date(2023 - 1900, 06 - 1, 14), 10000);
		books[1] = new Book("여러분 파이팅", "주지훈", "사과", new Date(2023 - 1900, 05 - 1, 11), 20000);
		books[2] = new Book("API의 모든것", "문동은", "오렌지", new Date(2020 - 1900, 04 - 1, 25), 35000);
		books[3] = new Book("언어의 천재", "장원영", "키위", new Date(2015 - 1900, 01 - 1, 01), 70000);
		books[4] = new Book("개발왕국", "시연쌤", "바나나", new Date(2022 - 1900, 12 - 1, 25), 80000);

	}

	public void printAll() {
			int count = 0;
			for (Book b : books) {
				System.out.println(b);
				count++;
			
		}
	}

	public void insertBook(String newTitle, String newAuthor, String newPublisher, String newDate, String newPrice) {
		
		 
		// 1. 매개변수로 전달받은 newPrice값  ==>      String --> int로 변환 작업 (int price라는 변수에 담으시오) 
		//                  "20000" -->  20000 
		int price = Integer.parseInt(newPrice);
		   
		// 2. 매개변수로 전달받은 newDate값   ==>       String --> Date로 변환 작업  (Date publishDate에 담으시오) 
		//   '-'를 구분자로 StringTokenizer를 이용하여 문자열 분리 후 각각 년,월,일 을 Date에 적용 
         // 1) StringTokenizer를 이용한 방법 
		  //  1_1) StringTokenizer를 이용하여 먼저 "2020-07-01" 을 각각 문자열로 분리("2020", "07", "01") 
		StringTokenizer stn = new StringTokenizer(newPublisher,"-");
		
		  //  1_2) 각 분리된 문자열들을 매번 뽑아서 int 변수들에 담기 
		  //  1_3) year, month, date 가지고 Date객체 생성하기 
		
		int year = Integer.parseInt(stn.nextToken()) - 1900;
		int month = Integer.parseInt(stn.nextToken()) - 1;
		int date = Integer.parseInt(stn.nextToken());
		
		Date publishDate = new Date(year, month, date);
		   
		  // 2) split 메소드를 이용한 방법 
		   
		  // 2_1) split 메소드를 이용하여 먼저 "2020-07-01" 을 각각 문자열로 분리후 String[] 배열에 담기 
		   
		  // 2_2) 각 분리된 문자열들이 담겨있는 해당 배열에 인덱스에 접근해서 int 변수들에 담기 
		   
		  // 2_3) year, month, date 가지고 Date객체 생성하기 
		     
		 
		  // 3. 나머지 전달받은 값들과 위에서 변환작업을 해준 price와 date값을 가지고 
		  //   Book클래스의 매개변수 생성자를 통해 생성
		
		Book[] copy = new Book[books.length + 1];
		// copy??
		
		copy[books.length] = new Book(newTitle, newAuthor, newPublisher, publishDate, price);
		books = copy;
		System.out.println("도서 추가 성공!!");
		
		
		
		
	}

	public void printBookPublisherDate() {

	}

	public void searchBook(String seachTitle) {

	}
}
