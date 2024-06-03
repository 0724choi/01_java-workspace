package com.kh.library.model.vo;

public class Team {
	
	private String teamName; // 팀명
	private String gameResult; // 경기결과
	private int gatePeople; // 관중수
	private int teamRank; // 순위
	private int gameShoot; // 유효숫 숫자
	
	
	public Team() {}


	public Team(String teamName, String gameResult, int gatePeople, int teamRank, int gameShoot) {
		this.teamName = teamName;
		this.gameResult = gameResult;
		this.gatePeople = gatePeople;
		this.teamRank = teamRank;
		this.gameShoot = gameShoot;
	}


	public String getTeamName() {
		return teamName;
	}


	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	public String getGameResult() {
		return gameResult;
	}


	public void setGameResult(String gameResult) {
		this.gameResult = gameResult;
	}


	public int getGatePeople() {
		return gatePeople;
	}


	public void setGatePeople(int gatePeople) {
		this.gatePeople = gatePeople;
	}


	public int getTeamRank() {
		return teamRank;
	}


	public void setTeamRank(int teamRank) {
		this.teamRank = teamRank;
	}


	public int getGameShoot() {
		return gameShoot;
	}


	public void setGameShoot(int gameShoot) {
		this.gameShoot = gameShoot;
	}


	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", gameResult=" + gameResult + ", gatePeople=" + gatePeople
				+ ", teamRank=" + teamRank + ", gameShoot=" + gameShoot + "]";
	}	
	
	
}
