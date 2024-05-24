package com.kh.chap02_objectArray.run;

import com.kh.chap02_objectArray.model.vo.Phone;

public class WrongSample {

	public static void main(String[] args) {
		
		Phone[] arr = new Phone[3];
		
		arr[0] = new Phone();		
		arr[1] = new Phone();		
		arr[2] = new Phone(
				
				
				);		
		for(int i=0; i<=arr.length; i++) {
			System.out.println(arr[i].getName());
			
		}
		
		// 잘못된 부분 
		// 1. NullPointerException : 객체배열의 각 인덱스에 담긴 값을 null인 상태로 메소드를 호출하려고 했기때문
		//							 조치내용 : 각 객체배열은 만든 다음 각 인덱스별로 객체 생성을 진행해야ㅏㅎ
		// 12. ArrayIndexOutOfBoundsExceptio :배열의 적절하 인덱스 범위를 벗어났기 때문에 조건식으로 i<[배열
ㅈ		
		

	}

}
