package com.kh.library.run;

import java.util.ArrayList;

import com.kh.library.model.vo.LoseTeam;
import com.kh.library.model.vo.Team;
import com.kh.library.model.vo.WinTeam;

public class TeamRun {

	public static void main(String[] args) {
		ArrayList<Team>teamList = new ArrayList<Team>();
		// S 팀명 S 경기결과 I 관중수 I 순위 I 유효숫 숫자 - team
		// S 팀명 S 경기결과 I 관중수 I 순위 I 유효숫 숫자 I 득점수 S 최고선수- Winteam
		// S 팀명 S 경기결과 I 관중수 I 순위 I 유효숫 숫자 I 실점수 S 최악선수- Loseteam
		// 
		teamList.add(new WinTeam("맨시티","승",500000,1,10,5,"홀란드"));
		teamList.add(new WinTeam("아스날","승",400000,2,9,4,"이사크"));
		teamList.add(new WinTeam("리버풀","승",400000,3,8,4,"살라"));
		teamList.add(new WinTeam("애스턴빌라","승",300000,4,7,3,"왓킨스"));
		
		teamList.add(new Team("토트넘","무",350000,5,4));
		teamList.add(new Team("첼시","무",350000,6,3));
		
		teamList.add(new LoseTeam("뉴캐슬","패",250000,7,2,3,"카리우스"));
		teamList.add(new LoseTeam("맨유","패",300000,8,2,4,"안토니"));
		teamList.add(new LoseTeam("웨스트햄","패",170000,9,3,2,"파비안스키"));
		teamList.add(new LoseTeam("펠리스","페",180000,10,2,1,"존스톤"));
		
		
		
		
		

	}

}
