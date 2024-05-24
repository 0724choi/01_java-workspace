package com.kh.chap01_oneVsmany.model.vo;

public class Book {
	
	// 필드부
	// 도서명, 저자, 가격, 출판사
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	
	// 생성자부
	//기본 생성자 (기본으로 만들기)
	public Book() {};
	
	
	
	// 전체 매개변수 생성자(기본으로 만들기2)
	public Book(String title, String author, int price, String publisher) {
		this.title=title;
		this.author=author;
		this.price=price;
		this.publisher=publisher;
		
	};
	
	
	
	
	
	
	
	// 매소드부
	// 각 필드에 대한 getter-setter
	
	public String getTitle() {
		return title;
	}
	
	public void setTile(String title) {
		this.title = title;  // this -> 객체의 주소값을 의미한다.
	}
	
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;	
	}

	public String setPublisher() {
		return publisher;
	}
	
	public void getPubliser(String publisher) {
		this.publisher = publisher;
	}
	
	
	
	public String information() {
		return title + ", " + author + ", " + price + ", " + publisher;
	}
}
