package com.kh.library.controller;

import java.util.ArrayList;

import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Magazine;

//BookManager 인터페이스 구현
public class BookController implements BookManager {
	
	public ArrayList<Book> bList = new ArrayList<Book>(); // []
	
	
	
	// 메뉴들어가서 실행
	@Override
	public void addBook(Book nBook) {
		
		bList.add(nBook);

		
// ===============================================
		
	}
	
	// 1-1. 도서관 전체 소장책 조회하기
	@Override
	public ArrayList<Book> getAllBook() {
		
		return bList;
	}

	
	@Override
	public Book searchBookBybNo(String bNo) {
		
		return null;
	}

	 
	@Override
	public ArrayList<Book> searchBookByTitle(String title) {
		return null;
	}
	
	// 1-2. 일반도서만 조회하기(잡지 제외)
	@Override
	public ArrayList<Book> onlySearchBook() {
		
		ArrayList<Book> bookList =new ArrayList<Book>();
		for(Book b: bList) {
			if(!(b instanceof Magazine)) {
				bookList.add(b);
			}
			
		}
		
		return bookList;
	}

	// 1-3. 잡지만 조회하기(일반도서 제외)
	@Override
	public ArrayList<Book> onlySearchMagazine() {
		
		ArrayList<Book> magazineList = new ArrayList<Book>();
		for(Book b:bList) {
			if(b instanceof Magazine) {
				magazineList.add(b);
			}
		}
		
		
		return magazineList;
	}

	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		ArrayList<Book> list = new ArrayList<Book>();
		for(Book b :bList) {
			if(b instanceof Magazine) {
				if(((Magazine) b).getYear() == year) {
					list.add(b);
					
				}
			}
		}
		return list;
	}

	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
		return null;
	}

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		return null;
	}

	@Override
	public int getTotalPrice() {
		return 0;
	}

	@Override
	public int getAvgPrice() {
		return 0;
	}
	

}
