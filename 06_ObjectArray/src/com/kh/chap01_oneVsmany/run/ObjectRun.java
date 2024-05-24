package com.kh.chap01_oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsmany.model.vo.Book;

public class ObjectRun {

	public static void main(String[] args) {
		
		// 복습시간
		// 방법1. 기본생성자 생성 후 setter로 호출해서 초기화
		
		/*Book b = new Book();
		b.setTile("자바의 정석");
		b.setAuthor("차은우");
		b.setPrice(100000);
		b.setPublisher("kh");*/
		
		
		
		// 방법2 매개변수 생성자를 통해서 생성과 동시에 값을 초기화
		//Book bk = new Book("자바의 정석", "차은우", 10000,"kh");
		
		
		
		Scanner sc = new Scanner(System.in);
		
		//[응용] 사용자에게 입력받은 값으로 객체 생성 후 초기화
		/*
		
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("출판사 : ");
		String publisher = sc.nextLine();
		
		Book bk = new Book(title,author,price,publisher);
		
		System.out.println(bk.information());*/
		
		
		// 세개의 Book 객체를 관리해야 한다면?
		
		Book bk1 = null; // null : 아무것도 참조하고 있지 않음
		Book bk2 = null;
		Book bk3 = null;
		
		
		// 세 도서에 대한 정보를 반복적으로 사용자에게 입력받기
		// => 입력받은 후에 각 객체 생성과 동시에 초기화
		
		for(int i=0; i<3; i++) {
			System.out.println(i+1 +"번째 도서 정보 입력" );

			System.out.print("도서명 : ");
			String title = sc.nextLine();
			
			System.out.print("저자 : ");
			String author = sc.nextLine();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			if(i==0) {
				// bk1 생성
				bk1 = new Book(title, author, price , publisher);
			}else if(i==1) {
				//bk2 생성
				bk2 = new Book(title, author, price , publisher);
			}else {
				//bk3 생성
				bk3 = new Book(title, author, price , publisher);
			}
						
			
		} // 객체 생성 끝
		
		// 전체 도서 정보 조회 하기 => 일일히 각 객체의 출력문 작성(반복문 활용이 안됨)
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		// 도서 제목으로 검색하는 서비스
		System.out.print("검색할 책 목록 : ");
		String search = sc.nextLine();
		
		if(bk1.getTitle().equals(search)) {
			System.out.println(bk1.information());
		}
		
		if(bk2.getTitle().equals(search)) {
			System.out.println(bk2.information());
		}
		
		if(bk3.getTitle().equals(search)) {
			System.out.println(bk3.information());
		}
		
	}

}
