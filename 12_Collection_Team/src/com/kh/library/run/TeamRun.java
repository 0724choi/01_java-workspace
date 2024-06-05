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
      
      teamList.add(new WinTeam("맨시티", "승", 500000, 1, 10, 5, "홀란드"));
      teamList.add(new WinTeam("아스날", "승", 400000, 2, 9, 4, "이사크"));
      teamList.add(new WinTeam("리버풀", "승", 400000, 3, 8, 4, "살라"));
      teamList.add(new WinTeam("애스턴빌라", "승", 300000, 4, 7, 3, "왓킨스"));
      
      teamList.add(new Team("토트넘", "무", 350000, 5, 4));
      teamList.add(new Team("첼시", "무", 350000, 6, 3));
      
      teamList.add(new LoseTeam("뉴캐슬", "패", 250000, 7, 2, 3, "카리우스"));
      teamList.add(new LoseTeam("맨유", "패", 300000, 8, 2, 4, "안토니"));
      teamList.add(new LoseTeam("웨스트햄", "패", 170000, 9, 3, 2, "파비안스키"));
      teamList.add(new LoseTeam("펠리스", "패", 180000, 10, 2, 1, "존스톤"));
      
      
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
         System.out.println("2. 팀 추가/삭제하기");
         System.out.println("3. MoM과 Worst선수 확인하기");
         System.out.println("4. MoM과 Worst선수 수정하기");
         System.out.println("5. 경기 관중수 확인하기");
         System.out.println("6. 프로그램 종료하기");
         System.out.println("===============================");

         Scanner sc = new Scanner(System.in);
         System.out.print("메뉴번호를 입력해주세요 : ");
         int menu = sc.nextInt(); // 메뉴 번호 입력
         
         switch(menu) {
         case 1 : // 1. 경기 조회하기
            System.out.println("===============================");
            System.out.println("어떤 방법으로 팀을 조회하겠습니까?");
            System.out.println("1. 전체팀 정보 조회");
            System.out.println("2. 승리팀 정보 조회");
            System.out.println("3. 패배팀 정보 조회");
            System.out.println("4. 비긴팀 정보 조회");
            System.out.println("5. 랭킹으로 조회(1~10위)");
            System.out.println("6. 원하는 팀 찾기(팀명으로)");
            System.out.println("0. 이전으로");
            System.out.println("===============================");
            
            sc.nextLine();
            
            System.out.print("메뉴번호를 입력해주세요 : ");
            int search  = sc.nextInt();
            sc.nextLine();
            
            if (search == 1) {
            	ArrayList<Team> selectTeam = tc.searchAllTeam();
				for(Team b : selectTeam) {
					System.out.println(b);
				}
            }
            else if (search == 2) {
            	ArrayList<Team> WinTeam = tc.searchWinTeam();
				for(Team b : WinTeam) {
					System.out.println(b);
				}
            }
            else if (search == 3) {
            	ArrayList<Team> LoseTeam = tc.searchLoseTeam();
				for(Team b : LoseTeam) {
					System.out.println(b);
				}
            }
            else if (search == 4) {
            	ArrayList<Team> DrawTeam = tc.searchDrawTeam();
				for(Team b : DrawTeam) {
					System.out.println(b);
				}
            }
            else if (search == 5) {
            	while(true) {
            	System.out.print("\n순위를 입력하세요. : ");
                int teamRank = sc.nextInt();
                sc.nextLine();
                
                ArrayList<Team> t = tc.searchRankTeam(teamRank);
                
                if(t.isEmpty()) {
                	System.out.println("\n잘못 입력하셨습니다. 다시 입력해주세요.");
                	continue;
                }else {
                	for(Team t1 : t)
                	System.out.println(t1);
                	break;
                }
            	}
            }
            else if (search == 6) {
            	System.out.print("\n팀 명을 입력하세요. : ");
            	String teamName = sc.nextLine();
            	
            	ArrayList<Team> TeamList = tc.findTeam(teamName);
				
            	if(TeamList.isEmpty()) {
            		System.out.println("\n랭킹에 존재하지 않는 팀입니다.");
            	}else {
            		for(Team b : TeamList) {
            			System.out.println();
            			System.out.println(b);
            		}
            	}
            	
            }
            
            else if (search == 0) {
            	flag = true;
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
            sc.nextLine();
            //S 팀명 S 경기결과 I 관중수 I 순위 I 유효숫 숫자
            if (searchTeam == 1) {
               System.out.print("팀명을 입력하세요. : ");
               String teamName = sc.nextLine();
               
               System.out.print("경기결과를 입력하세요.(승/무/패) : ");
               String gameResult = sc.nextLine();
               
               System.out.print("관중 수를 입력하세요. : ");
               int gatePeople = sc.nextInt();
               
               boolean a = true;
               int teamRank = 0;
               while(a) {
            	   System.out.print("순위를 입력하세요.(11위 이상) : ");
               int teamRank2 = sc.nextInt();
               if(teamRank2<11) {
            	   System.out.println("다시 입력해주세요.");
               }else {
            	   a= false;
            	   teamRank= teamRank2;
            	   
               }
               }
               System.out.print("유효슈팅 수를 입력하세요. : ");
               int gameShoot = sc.nextInt();
               
               Team Team1 = null;
               Team1 = new Team(teamName, gameResult, gatePeople, teamRank, gameShoot);
               boolean add = false;

				for(Team b : tc.teamList) {
					
					if(b.getTeamName().equals(Team1.getTeamName())) {
						add = true;
					}
				}
				
				if(add == false) {
					tc.addTeam(Team1);
					System.out.println("\n성공적으로 팀이 추가되었습니다!");
				}else {
					System.out.println("\n해당 팀은 이미 등록 되있습니다.");
				}
            }
            else if (searchTeam  == 2) {
            	System.out.print("\n삭제고자 하는 팀명 : ");
            	String teamName = sc.nextLine();
            	
            	int result = tc.removeTeam(teamName);
            	
            	if(result == 1) {
        			System.out.println("\n성곡적으로 삭제되었습니다.");
        		}else {
        			System.out.println("\n삭제할 팀을 찾지 못했습니다.");
        		}
            }
            else if (searchTeam  == 0) {
            	flag = true;
            }
      
            break;
         case 3: // 3. MoM과 Worst선수 확인하기
            System.out.println("===============================");
            System.out.println("1. MOM 조회하기");
            System.out.println("2. Worst Player 조회하기");
            System.out.println("0. 이전으로");
            System.out.println("===============================");
            
            sc.nextLine();

            System.out.print("메뉴번호를 입력해주세요 : ");
            int searchPlayer = sc.nextInt();
            
            sc.nextLine();
            
            if (searchPlayer == 1) {
            	 System.out.print("팀을 입력하세요 : ");
                 String mom = sc.nextLine();
                 
                 String bestPlayer = tc.findBestPlayer(mom);
                 
                 if(bestPlayer != null) {
                    System.out.println(bestPlayer);
                 }else {
                    System.out.println("승리팀이 아닙니다.");
                 }
            }
            else if (searchPlayer  == 2) {
            	System.out.print("팀을 입력하세요 : ");
                String worst = sc.nextLine();
                
                String WorstPlayer = tc.findWorstPlayer(worst);
                
                if(WorstPlayer != null) {
                   System.out.println(WorstPlayer);
                }else {
                   System.out.println("패배팀이 아닙니다.");
                }
            }
            else if (searchPlayer   == 0) {
            	flag = true;
            }
            break;
      
      
         
      case 4: // 4. 선수평점수정 
         System.out.println("===============================");
         System.out.println("1. MOM 수정하기 ");
         System.out.println("2. Worst Player 수정하기");
         System.out.println("0. 이전으로");
         System.out.println("===============================");
         
         
         
         sc.nextLine();

         System.out.print("메뉴번호를 입력해주세요 : ");
         int searchPlayer2= sc.nextInt();
         sc.nextLine();
         
         if (searchPlayer2 == 1) {
        	 System.out.println("\n=== MOM선수 수정 ===");
     		
     		System.out.print("수정 하고자 하는 팀 명 : ");
     		String teamName = sc.nextLine();
     		
     		System.out.print("수정 내용(선수) : ");
     		String upMom = sc.nextLine();
     		
     		int result = tc.editBestPlayer(teamName, upMom);
     		
     		if(result == 0) {
    			System.out.println("MOM이 존재하지 않는팀입니다.");
    		}else {
    			System.out.println("성공적으로 수정되었습니다.");
    		}
         }
         else if (searchPlayer2  == 2) {
        	 System.out.println("\n=== Worst Player선수 수정 ===");
      		
      		System.out.print("수정 하고자 하는 팀 명 : ");
      		String teamName = sc.nextLine();
      		
      		System.out.print("수정 내용(선수) : ");
      		String upWorst = sc.nextLine();
      		
      		int result = tc.editWorstPlayer(teamName, upWorst);
      		
      		if(result == 0) {
     			System.out.println("WorstPlayer가 존재하지 않는팀입니다.");
     		}else {
     			System.out.println("성공적으로 수정되었습니다.");
     		}
         }
         else if (searchPlayer2   == 0) {
        	 flag = true;
         }
         break;
   
         
      case 5: // 5. 관중수 확인하기
         System.out.println("===============================");
         System.out.println("1. 모든팀 관중 수 총합 확인하기 ");
         System.out.println("2. 모든팀 평균 관중 수 확인하기");
         System.out.println("3. 승리팀 관중 수 총합 확인하기");
         System.out.println("4. 승리팀 평균 관중 수 확인하기");
         System.out.println("5. 패배팀 관중 수 총합 확인하기");
         System.out.println("6. 패배팀 평균 관중 수 확인하기");
         System.out.println("0. 이전으로");
         System.out.println("===============================");
         
         sc.nextLine();

         System.out.print("메뉴번호를 입력해주세요 : ");
         int searchGatePeople= sc.nextInt();
         
         
         if (searchGatePeople == 1) {
        	 System.out.println("모든팀 관중 수 총합 : " + tc.getTotalGP() + "명");
         }
         else if (searchGatePeople == 2) {
        	 System.out.println("모든팀 관중 수 평균 : " + tc.getAvgGP() + "명");
         }
         else if (searchGatePeople   == 3) {
        	 System.out.println("승리 팀의 총 관중수: " + tc.getTotalWinGP()+ "명");

         }
         else if (searchGatePeople   == 4) {
        	 System.out.println("승리 팀의 평균 관중수: " +tc.getAvgWinGP()+ "명");

         }
         else if (searchGatePeople   == 5) {
        	 System.out.println("패배 팀의 총 관중수: " + tc.getTotalLoseGP()+ "명");

         }
         else if (searchGatePeople   == 6) {
        	 System.out.println("패배 팀의 평균 관중수: " + tc.getAvgLoseGP()+ "명");
         }
         else if (searchGatePeople   == 0) {
        	 flag = true;
         }
         break;
   
      case 6:  
         System.out.println("프로그램을 종료합니다");
         return;
      default:
         break;   
      
         
         }
      }
   }
}