package com.kh.library.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.library.controller.TeamController;
import com.kh.library.model.vo.LoseTeam;
import com.kh.library.model.vo.Team;
import com.kh.library.model.vo.WinTeam;

public class TeamRun {

	public static void main(String[] args) {
		ArrayList<Team>teamList = new ArrayList<Team>();
		
		// S 팀명 S 경기결과 I 관중수 I 순위 I 유효숫 숫자 - team
		// S 팀명 S 경기결과 I 관중수 I 순위 I 유효숫 숫자 I 득점수 S 최고선수- Winteam
		// S 팀명 S 경기결과 I 관중수 I 순위 I 유효숫 숫자 I 실점수 S 최악선수- Loseteam
		
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
		
		
		printTeam(teamList);
	}
	
	public static void printTeam(ArrayList<Team> ts) {
		
		TeamController tc = new TeamController();
		
		for(Team teamList:ts) {
			tc.addTeam(teamList);
		}
		
		boolean flag = true; // 메뉴 스위치

		while (flag == true) { // 메뉴 스위치가 켜져있는 동안 무한반복
			System.out.println("===============================");
			System.out.println("EPL 경기 결과 관리 페이지입니다.");
			System.out.println("1. 팀 조회하기");
			System.out.println("2. 팀추가삭제하기");
			System.out.println("3. 선수 평점 수정하기");
			System.out.println("4. MoM과 Worst선수 확인하기 ");
			System.out.println("5. 관중수 확인하기");
			System.out.println("6. 프로그램 종료하기");
			System.out.println("===============================");

			Scanner sc = new Scanner(System.in);
			System.out.print("메뉴번호를 입력해주세요 : ");
			int menu = sc.nextInt(); // 메뉴 번호 입력
			
			switch(menu) {
			case 1 : // 1. 경기 조회하기
				System.out.println("===============================");
				System.out.println("어떤 경기를 조회하겠습니까?");
				System.out.println("1. 전체팀 정보 조회");
				System.out.println("2. 승리팀 조회");
				System.out.println("3. 패배팀 조회");
				System.out.println("4. 비긴팀 조회");
				System.out.println("5. 랭킹 조회");
				System.out.println("6. 팀 찾기");
				System.out.println("0. 이전으로");
				System.out.println("===============================");
				
				sc.nextLine();
				
				System.out.print("메뉴번호를 입력해주세요 : ");
				int search  = sc.nextInt();
				
				if (search == 1) {
					
					System.out.println(tc.searchAllTeam());
				}
			
				else if (search == 2) {
					System.out.println(tc.searchWinTeam());

				}
				else if (search == 3) {
					System.out.println(tc.searchLoseTeam());

				}
				else if (search == 4) {
					System.out.println(tc.searchDrawTeam());
				}
				
				else if (search == 5) {
					System.out.print("랭킹을 조회하고 싶은 팀을 입력하세요 : ");
					String team = sc.nextLine();
					
				}
				
				else if (search == 6) {
				}
				
				else if (search == 0) {
					
				}
				
				break;
				
			case 2: // 2. 팀추가삭제하기
				System.out.println("===============================");
				System.out.println("1. 팀 추가하기 ");
				System.out.println("2. 팀 삭제하기  ");
				System.out.println("0. 이전으로");
				System.out.println("===============================");
				
				sc.nextLine();

				System.out.print("메뉴번호를 입력해주세요 : ");
				int searchTeam = sc.nextInt();
				
				
				if (searchTeam == 1) {
					
				}
				else if (searchTeam  == 2) {

				}
				else if (searchTeam  == 0) {

				}
		
				break;
			case 3: // 3. 선수평점수정
				System.out.println("===============================");
				System.out.println("1. MOM 수정하기 ");
				System.out.println("2. Worst Player 수정하기  ");
				System.out.println("0. 이전으로");
				System.out.println("===============================");
				
				sc.nextLine();

				System.out.print("메뉴번호를 입력해주세요 : ");
				int searchPlayer = sc.nextInt();
				
				
				if (searchPlayer == 1) {
					
				}
				else if (searchPlayer  == 2) {

				}
				else if (searchPlayer   == 0) {

				}
				break;
		
		
			
		case 4: // 4. MoM과 Worst선수 확인하기 
			System.out.println("===============================");
			System.out.println("1. MOM 조회하기 ");
			System.out.println("2. Worst Player 조회하기 ");
			System.out.println("0. 이전으로");
			System.out.println("===============================");
			
			
			
			sc.nextLine();

			System.out.print("메뉴번호를 입력해주세요 : ");
			int searchPlayer2= sc.nextInt();
			
			
			if (searchPlayer2 == 1) {
				
			}
			else if (searchPlayer2  == 2) {

			}
			else if (searchPlayer2   == 0) {

			}
			break;
	
			
		case 5: // 5. 관중수 확인하기
			System.out.println("===============================");
			System.out.println("1. 모든팀 전체관중수 확인하기 ");
			System.out.println("2. 모든팀 평균관중수");
			System.out.println("3. 승리팀 전체관중수 확인하기");
			System.out.println("4. 승리팀 평균관중수 확인하기");
			System.out.println("5. 패배팀 평균관중수 확인하기");
			System.out.println("6. 패배팀 평균관중수 확인하기");
			System.out.println("0. 이전으로");
			System.out.println("===============================");
			
			sc.nextLine();

			System.out.print("메뉴번호를 입력해주세요 : ");
			int searchGatePeople= sc.nextInt();
			
			
			if (searchGatePeople == 1) {
				
			}
			else if (searchGatePeople == 2) {

			}
			else if (searchGatePeople  == 3) {

			}
			else if (searchGatePeople  == 4) {
				
			}
			else if (searchGatePeople  == 5) {
				
			}
			else if (searchGatePeople  == 6) {
				
			}
			else if (searchGatePeople  == 0) {
				
			}
			break;
	
		case 6:  // 종료
			System.out.println("프로그램을 종료합니다");
			return;
		default:
			break;	
		
			
			}
		}
	}
}