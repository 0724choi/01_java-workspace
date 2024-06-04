package com.kh.library.controller;

import java.util.ArrayList;

import com.kh.library.model.vo.Team;

public interface TeamManager  {
	
	//컨트롤러에 있는 정보를 추가하는 메소드
	// + 0팀추가하기 
	void addTeam(Team nTeam);
	
	
	// 1 조회하기
	//전체조회
	ArrayList<Team>searchAllTeam ();
	// 승리팀조회+득점수
	ArrayList<Team>searchWinTeam();
	//패배팀조회+실점수
	ArrayList<Team>searchLoseTeam();
	//무승부팀조회 (상속말고 스트링으로 찾아야함)
	ArrayList<Team>searchDrawTeam();
	// 팀랭킹조회
	ArrayList<Team>searchRankTeam(int teamRank);
	// 팀찾기
	ArrayList<Team>findTeam(String teamName);
	
	
	
	// 2 추가삭제수정
	// 팀추가하기 0번으로 
	
	// 팀삭제하기
	ArrayList<Team>removeTeam(String team);
	
	
	
	// 3 선수수정하기
	// 최고선수 수정
	ArrayList<Team>editBestPlayer(String bestPlayer);
	// 최악선수 수정
	ArrayList<Team>editWorstPlayer(String worstPlayer);
	
	// 4 경기확인
	//최고선수 확인
	ArrayList<Team>findBestPlayer(String bestPlayer);
	
	//최악선수 확인
	ArrayList<Team>findWorstPlayer(String worstPlayer);
	
	
	// 관중수보기
	// 모든팀 전체 관중수
	int getTotalGP();
	// 모든팀 평균 관중수
	int getAvgGP();
	//승리팀전체관중수
	int getTotalWinGP();
	//승리팀평균관중수
	int getAvgWinGP();
	//패배팀전체관중수
	int getTotalLoseGP();
	//패배팀평균관중수
	int getAvgLoseGP();

	
	
	
	
	
	

}
