package com.kh.library.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;

import com.kh.library.model.vo.LoseTeam;
import com.kh.library.model.vo.Team;
import com.kh.library.model.vo.WinTeam;

public class TeamController implements TeamManager{
	public ArrayList<Team> teamList = new ArrayList<Team>();

	@Override
	public void addTeam(Team nTeam) {
		teamList.add(nTeam);
	}

	@Override
	public ArrayList<Team> searchAllTeam() {
		
		return teamList;
	}

	@Override
	public ArrayList<Team> searchWinTeam() {
		ArrayList<Team> winTeam = new ArrayList<Team>();
		for(Team t: teamList) {
			if(t instanceof WinTeam) {
				winTeam.add(t);
			}
		}
		return winTeam;
	}

	@Override
	public ArrayList<Team> searchLoseTeam() {
		ArrayList<Team>loseTeam = new ArrayList<Team>();
		for(Team t : teamList) {
			if(t instanceof LoseTeam) {
				loseTeam.add(t);
			}
		}
		return loseTeam;
	}

	@Override
	public ArrayList<Team> searchDrawTeam() {
		ArrayList<Team>darwTeam = new ArrayList<Team>();
		for(Team t : teamList) {
			if(t.getGameResult().equals("무")){
				darwTeam.add(t);
			}
		}
		return darwTeam;
	}

	@Override
	public ArrayList<Team> searchRankTeam(int teamRank) {
		return null;
	}

	@Override
	public ArrayList<Team> findTeam(String teamName) {
		ArrayList<Team>findTeam = new ArrayList<Team>();
		
		return null;
	}

	@Override
	public ArrayList<Team> removeTeam(String team) {
		return null;
	}

	@Override
	public ArrayList<Team> editBestPlayer(String bestPlayer) {
		return null;
	}

	@Override
	public ArrayList<Team> editWorstPlayer(String worstPlayer) {
		return null;
	}

	@Override
	public ArrayList<Team> findBestPlayer(String bestPlayer) {
		return null;
	}

	@Override
	public ArrayList<Team> findWorstPlayer(String worstPlayer) {
		return null;
	}

	@Override
	public int getTotalGP() {
		return 0;
	}

	@Override
	public int getAvgGP() {
		return 0;
	}

	@Override
	public int getTotalWinGP() {
		return 0;
	}

	@Override
	public int getAvgWinGP() {
		return 0;
	}

	@Override
	public int getTotalLoseGP() {
		return 0;
	}

	@Override
	public int getAvgLoseGP() {
		return 0;
	}

}
