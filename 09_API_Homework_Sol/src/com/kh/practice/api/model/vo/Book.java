package com.kh.practice.api.model.vo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {
	private String title;
	
	private String author;
	
	private String publisher;
	
	private Date publishDate;
	
	private int price;
	
	public Book() {}
	
	
	public Book(String title, String author, String publisher, Date publishDate, int price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.publishDate = publishDate;
		this.price =price;
	}
	
	
	public String getTitle() {
		return title;
	}

	public void setTitel(String title) {
		this.title =title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public Date getPublisherDate() {
		return publishDate;
	}
	
	public void setPublisherDate(Date publishDate) {
		this.publishDate=publishDate;
		
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 출간");
		String date = sdf.format(publishDate);
		
		
		return "Book " + "[title : " + title + ", author : " + author + ", publisher : " + publisher + ", publishDate : " + date + ", price" + price+"]"; 
	}
}
