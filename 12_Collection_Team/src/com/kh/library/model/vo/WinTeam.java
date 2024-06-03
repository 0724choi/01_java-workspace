package com.kh.library.model.vo;

public class WinTeam extends Team{
	private int goalPoints;
	private String bestPlayer;
	
	public WinTeam() {}

	public WinTeam(String teamName, char gameResult, int gatePeople, int teamRank, int gameShoot,int goalPoints,String bestPlayer) {
		super(teamName,gameResult, gatePeople,gatePeople,gameShoot);
		this.goalPoints = goalPoints;
		this.bestPlayer = bestPlayer;
	}

	public int getGoalPoints() {
		return goalPoints;
	}

	public void setGoalPoints(int goalPoints) {
		this.goalPoints = goalPoints;
	}

	public String getBestPlayer() {
		return bestPlayer;
	}

	public void setBestPlayer(String bestPlayer) {
		this.bestPlayer = bestPlayer;
	}

	@Override
	public String toString() {
		return "WinTeam [goalPoints=" + goalPoints + ", bestPlayer=" + bestPlayer + "]";
	}
	
	
	
	

}