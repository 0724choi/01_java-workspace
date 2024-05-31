package com.kh.chap01_list.part02_mvc.controller;

import java.io.Serializable;
import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

// 사용자의 요청 처리해주는 클래스 ! 출력문 쓰지 않기!
public class MusicController {
	
	private ArrayList<Music> list = new ArrayList<>();
	
	
	{ // 초기화 블럭 => 알아보기
		list.add(new Music("Attention", "뉴진스"));
		list.add(new Music("새삥", "지코"));
		list.add(new Music("새삥말고 헌삥", "김시연"));
	}

	public void insertMusic(String title, String artist) {
		list.add(new Music(title,artist));
	}

	public ArrayList<Music> selctMusic() { // 반환할 자료형 잘보기!
		return list;
		
		}

	public int deletMusic(String title) {
		
		int result = 0; // 삭제시키는것을 확인하려는 변수
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
			//	System.out.println("성공적으로 삭제됐습니다");
				result = 1;
				break;  // 찾았으면 포문 더 돌지말고 탈출(메모리아끼기)
			}
		}
		// result = 0 (삭제할 곡을 못찾음) | 1 (성공적으로 삭제된거임!)
		return result;
	}
	// 1. 기본버전
	public ArrayList<Music> searchMusic(String keyword) {
		ArrayList<Music> searchList = new ArrayList<Music>();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				searchList.add(list.get(i));
			}
		} 
		return searchList;
		
		
				
		}
	// 2. 심화버전
	public ArrayList<Music> searchMusic(int menu, String keyword) {
		
		ArrayList<Music> searchList = new ArrayList<Music>();
		
		if(menu == 1) { // 곡명으로 검색
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getTitle().contains(keyword)){
					searchList.add(list.get(i));
				}
			}
		}else { 
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getTitle().contains(keyword)){
					searchList.add(list.get(i));
		}
			}
			
		}
			return searchList;
		
		
	}
	public int updateMusic(String title, String upArtist , String upTitle) {
		int result = 0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.get(i).setArtist(upArtist);
				list.get(i).setTitle(upTitle);
				result = 1;
				break;
			}
		}
		return result;
	}
		
	}
	


