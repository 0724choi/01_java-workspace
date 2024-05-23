package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;

public class ClassRun {
	public static void main(String[] agrs) {
		
		Person p = new Person();
		
		/*
		System.out.println(p.getId());
		System.out.println(p.getAge());
		*/
		// 생성 후에 필드에 담긴 값을 곧바로 알아보면
		// JVM이 초기화(값 세팅)까지 진행해줬음!
		
		/*
		p.setId("user01");
		p.setPwd("pass01");
		p.setName("최승균");
		p.setAge(25);
		p.setGender('M');
		p.setPhone("010-1234-5678");
		p.setEmail("cho1@gamil.com");
		
		System.out.println("======값 대입 후 ======");
		System.out.println(p.getId());
		System.out.println(p.getPwd());
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getPhone());
		System.out.println(p.getEmail());
		System.out.println();
		*/	
		
		
		// 첫번째 방법 : 기본생성자로 생성 후 setter 메소드 이용해서 값 초기화
		/*Product coffee = new Product();
		
		coffee.setpName("커피");
		coffee.setPrice(1000);
		coffee.setBrand("메머드");
		
		Product shoes = new Product();
		shoes.setpName("운동화");
		shoes.setPrice(1000);
		shoes.setBrand("뉴발란스");
		
		Product phone = new Product();
		phone.setpName("아이폰");
		phone.setPrice(1000);
		phone.setBrand("애플");
		
		
		// 두번째 방법 : 매개변수 생성자로 생성과 동시에 값 초기화
		// Product p2 = new Product("아이폰",1500000,"애플");
		System.out.println(p2.getpName());
		System.out.println(p2.getPrice());
		System.out.println(p2.getBrand());
		
		
		// pName : xxx , price : xxx, brand : xxx
		
		System.out.println("pName : " + p2.getpName() + " , price : "+p2.getPrice()+ " , brand : "+ p2.getBrand());
		System.out.println("pName : " + p2.getpName() + " , price : "+ p2.getPrice()+ " , brand : "+ p2.getBrand());
		
		System.out.println("========메소드를 만들고 난 후 ==========");
		
		System.out.println(p2.info());
		System.out.println(p2.info());
		
		*/
		
		

		/*System.out.println("===상품1===");
		System.out.println("상품명 : " +coffee.getpName());
		System.out.println("가격 : " + coffee.getPrice()+ "원");
		System.out.println("브랜드 : " +coffee.getBrand());
		System.out.println();
		
		System.out.println("===상품2===");
		System.out.println("상품명 : " +shoes.getpName());
		System.out.println("가격 : " + shoes.getPrice());
		System.out.println("브랜드 : " +shoes.getBrand());
		System.out.println();
		
		System.out.println("===상품3===");
		System.out.println("상품명 : " +phone.getpName());
		System.out.println("가격 : " + phone.getPrice()+ "원");
		System.out.println("브랜드 : " +phone.getBrand());*/
		
		
		Person p5 = new Person(); // 기본생성자를 사용 
		p5.setName("돌김"); 
		System.out.println(p5.getName());
		p5.setAge(24);
		System.out.println(p5.getAge());
		
		
		Person p3 = new Person("user01","pass01","차은우"); // 생성자를 사용하여 가져오고 싶은 값만 가져옴 나머지는 기본값
		System.out.println(p3.information());
		
		System.out.println();
		Person p4 = new Person("user02","pass02","장원영",20,'여',"아이폰","jang123@gmail.com");
		System.out.println(p4.information());
			
		}
		
	}
	
	
	
	


