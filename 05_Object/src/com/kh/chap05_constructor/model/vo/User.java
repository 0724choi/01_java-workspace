package com.kh.chap05_constructor.model.vo;

public class User {
	
	// 추상화와 캡슐화의 원칙
	//필드부
	private String userId;
	private String userPwd;
	private String userName;
	private int userAge;
	private	char gender;
	
	/*
	 * 생성자
	 * public 클래스명([매개변수, 매개변수 , ... ]) {
	 *  
	 * }
	 * 
	 * 왜 사용하는가? 
	 * 생성자 작성하는 이유
	 * 1. 객체를 생성하기 위해서
	 * 
	 * 생성자 작성시 주의사항
	 * 1. 반드시 생성자명은 클래스명과 동일해야 한다 (대/소문자를 구문)
	 * 2. 반환형이 존재하지 않음(만일 반환형을 쓰게 되면 메소드로 인식해버림)
	 * 3. 매개변수 생성자를 명시적으로 작성하게 되면 기본생성자를 JVM이 자동으로 만들어주지 않는다!
	 * 	즉, 어찌됐던 간에 기본생성자는 항상 작성하는 습관 들이자!
	 */
	
	public User() {}; // 기본 생성자 , 매개변수 없는 생성자 : 객체 생성만을 목적으로 할 때 사용
					// 기본 생성자 생략시 => JVM이 만들어줘서 원래는 생략 가능!
	
	// 매개변수 생성자
	// 객체 생성과 동시에 전달값들을 매개변수로 받아서 해당 각 필드에 초기화할 목적
	public User(String userId, String userPwd, String userName) {
		// setter 메소드 실행시 수행됐던 코드들
		this.userId= userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	public User(String userId, String userPwd, String userName, int userAge, char gender ) {
		/* 위와 중복되는 부분 줄이는 방법 
		this.userId= userId;
		this.userPwd = userPwd;
		this.userName = userName;
		*/
		
		this(userId,userPwd,userName); // this 생성자 => 사용시 코드를 간결하게 사용 가능!
		/*
		 *  위와 같이 중복되는 동일한 초기화하는 내용의 생성자가 이미 존재할 경우 
		 *  this() 생성자 활용 가능!
		 *  => 같은 클래스내에 생성자에서 또다른 생성자를 호출하고자 할 때 사용된다
		 *  **유의사항 : 반드시 첫줄에 작성! 위치가 맨 위에 존재해야한다 아닐시 오류발생! 
		 */
		
		this.userAge = userAge;
		this.gender = gender;
	}
	
	//메소드 부 
	// 이번에는 getter - setter 한쌍으로 만들어보기
	
	// String user ID
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId=userId;
	}


	// String userPWD
	public String getUserPwd() {
		return userPwd;
	}
	
	public void setUserPwd(String userPwd) {
		this.userPwd=userPwd;
	
	}
	
	
	// String userName
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	// int userAge
	public int getUserAge() {
		return userAge;
		
	}
	
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	
	
	// char gender
	public char getGerder() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender=gender;
	}
	
	
	public String information() {
		return "userId : " + userId + ", userPwd : " + userPwd + "userName : "+ userName + ", userAge" + userAge + ", gender" + gender;
	}
}


