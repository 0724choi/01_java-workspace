package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	// 기본생성자
	public TokenController() {}
	
	
	
	// 메소드부
	
	public String afterToken(String str) {
		StringTokenizer stn = new StringTokenizer(str," ");
		String str1 = "";
		while(stn.hasMoreTokens()) {
			str1 += stn.nextToken();
		}
		return str1;

	}
	
	public String firstCap(String input) {
		char ch = input.toUpperCase().charAt(0); // A
		String str11 = ch + input.substring(1,input.length());  // A + pple
		
		return str11;
	}
	
	
	

	
	public int findChar(String input, char one) { // kiwi  // i
		int count =0;
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i)==one) {
				count++;
				
			}
		}
			
		return count;
		
	
}
	
	}

	


