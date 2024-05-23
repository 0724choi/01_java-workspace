package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {
		
		// 1. 기본 생성자로 객체 생성
		User u1 = new User();
		System.out.println(u1.information());
		
		// 각 필드에 JVM의 초기값들이 담겨 있음!
		
		
		// 회원가입시 필수입력사항만 입력받는다면?
		/*
		User u2 = new User();
		u2.setUserId("user02");
		u2.setUserPwd("pass02");
		u2.setUserName("차은우");
		*/
		
		// 2. 매개변수 3개짜리 생성자로 객체 생성
		User u2 = new User("user02","pass02","차은우");
		System.out.println(u2.information());
		
		// setter를 안만든다면? => 안된다! (개인정보수정시에)
		
		u2.setUserName("차차은우");
		System.out.println(u2.information());
		
		
		// getter를 안만든다면? => 사이트하다보면 아이디찾기나 비밀번호찾기경우에 아이디나 비밀번호만 보여줘야함
		
		// 3. 매개변수 5개짜리 생성자로 객체 생성
		User u3 = new User("user03","pass03","장원영",23,'여');
		
	}

}
