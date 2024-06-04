package com.kh.library.model.vo;

public class LoseTeam extends Team {
	private int losePoints;
	private String worstPlayer;
	
	public LoseTeam() {}

	public LoseTeam(String teamName, String gameResult, int gatePeople, int teamRank, int gameShoot,int losePoints,String worstPlayer) {
		super(teamName,gameResult, gatePeople,gatePeople,gameShoot);
		this.losePoints = losePoints;
		this.worstPlayer = worstPlayer;
	}

	public int getLosePoints() {
		return losePoints;
	}

	public void setLosePoints(int losePoints) {
		this.losePoints = losePoints;
	}

	public String getWorstPlayer() {
		return worstPlayer;
	}

	public void setWorstPlayer(String worstPlayer) {
		this.worstPlayer = worstPlayer;
	}

	@Override
	public String toString() {
		return super.toString() + "losePoints=" + losePoints + ", worstPlayer=" + worstPlayer + "]";
	}	
	
	

}
