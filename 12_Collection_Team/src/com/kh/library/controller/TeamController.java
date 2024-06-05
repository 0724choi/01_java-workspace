package com.kh.library.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.kh.library.model.vo.LoseTeam;
import com.kh.library.model.vo.Team;
import com.kh.library.model.vo.WinTeam;

public class TeamController implements TeamManager{
	
	public ArrayList<Team> teamList = new ArrayList<Team>();
	public ArrayList<WinTeam> winTeam = new ArrayList<WinTeam>();

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
		ArrayList<Team> WinTeam = new ArrayList<Team>();
		
		for(Team t : teamList) {
			if(t.getGameResult().equals("승")) {
				WinTeam.add(t);
			}
		}
		return WinTeam;
	}

	@Override
	public ArrayList<Team> searchLoseTeam() {
		ArrayList<Team> LoseTeam = new ArrayList<Team>();
		
		for(Team t : teamList) {
			if(t.getGameResult().equals("패")) {
				LoseTeam.add(t);
			}
		}
		return LoseTeam;
	}

	@Override
	public ArrayList<Team> searchDrawTeam() {
		ArrayList<Team> DrawTeam = new ArrayList<Team>();
		
		for(Team t : teamList) {
			if(t.getGameResult().equals("무")) {
				DrawTeam.add(t);
			}
		}
		return DrawTeam;
	}

	@Override
	public ArrayList<Team> searchRankTeam(int teamRank) {
		ArrayList<Team> TeamRank = new ArrayList<Team>();
		
		for(Team t : searchAllTeam()) {
			if(t.getTeamRank() == teamRank) {
				TeamRank.add(t);
			}
		}
		return TeamRank;
	}

	@Override
	public ArrayList<Team> findTeam(String teamName) {
		ArrayList<Team> TeamList = new ArrayList<>();
		
		for(Team b : teamList) {
			if(b.getTeamName().contains(teamName)) {
				TeamList.add(b);
			}
		}
		
		return TeamList;
	}

	@Override
	public int removeTeam(String team) {
		
		int result = 0;
		
		for(int i=0; i<teamList.size(); i++) {
			if(teamList.get(i).getTeamName().equals(team)) {
				teamList.remove(i);
				result = 1;
				break; 
			}
		}
		return result;
	}

	@Override
	public String findBestPlayer(String mom) {
		
		String best = null;
	      for(Team t:teamList) {
	         if(t instanceof WinTeam) {
	            if(((WinTeam) t).getTeamName().equals(mom)) {
	               
	               best = ((WinTeam)t).getBestPlayer();
	            }
	         }
	      }
	               
	    return best;
	}

	@Override
	public String findWorstPlayer(String worst) {
		String str = null;
	      for(Team t:teamList) {
	         if(t instanceof LoseTeam) {
	            if(((LoseTeam) t).getTeamName().equals(worst)) {
	               
	               str = ((LoseTeam)t).getWorstPlayer();
	            }
	         }
	      }
	               
	    return str;
	}
	
	@Override
	public int editBestPlayer(String teamName, String upMom) {
		int result = 0;
		
		for(Team t : teamList) {
			if(t instanceof WinTeam) {
				if(((WinTeam)t).getTeamName().equals(teamName)) {
					((WinTeam)t).setBestPlayer(upMom);
					result =1;
					break;
				}
			}
		}
		
		return result;
		
	}

	@Override
	public int editWorstPlayer(String teamName, String upWorst) {
		int result = 0;
		
		for(Team t : teamList) {
			if(t instanceof LoseTeam) {
				if(((LoseTeam)t).getTeamName().equals(teamName)) {
					((LoseTeam)t).setWorstPlayer(upWorst);
					result =1;
					break;
				}
			}
		}
		
		return result;
	}
	
	@Override
	public int getTotalGP() {
		int sum = 0;
		
		for(int i = 0; i < teamList.size(); i++) {
			sum += teamList.get(i).getGatePeople();
		}
		return sum;
	}

	@Override
	public int getAvgGP() {
		return getTotalGP() / teamList.size();
	}

	@Override
	public int getTotalWinGP() {
		
		 int totalAttendance = 0;
         for (Team team : teamList) {
             if (team instanceof WinTeam) {
                 totalAttendance += team.getGatePeople();
             }
         }
        
      return totalAttendance;

	}

	@Override
	public int getAvgWinGP() {
		 ArrayList<Team> WinTeam = new ArrayList<Team>();
	      
	      for(Team t : teamList) {
	         if(t.getGameResult().equals("승")) {
	            WinTeam.add(t);
	         }
	      }
	      return getTotalWinGP() / WinTeam.size();

	}

	@Override
	public int getTotalLoseGP() {
		int LoseTotal = 0;
	      for(Team team : teamList) {
	         if(team instanceof LoseTeam) {
	            LoseTotal += team.getGatePeople();
	         }
	      }
	      return LoseTotal;

	}

	@Override
	public int getAvgLoseGP() {
		 ArrayList<Team> loseTeam = new ArrayList<Team>();
	      
	      for(Team t : teamList) {
	         if(t.getGameResult().equals("패")) {
	            loseTeam.add(t);
	         }
	      }
	      return getTotalLoseGP() / loseTeam.size();

	}

}
