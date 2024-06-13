package com.kh.chap02_tcp.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerProgram {

		/*
		 * TCP(Transmission Controll Protocol)
		 * - 서버, 클라이언트 간의 1:1 소켓 통신
		 * - 데이터를 교환하기에 앞서 서버, 클라이언트가 연결되어 있어야 함! (서버가 먼저 실행되어 클라이언트의 요청을 기다림)
		 * - 신뢰성 있는 데이터 전달 가능
		 * 
		 * * 소켓(socket)
		 * - 프로세스간의 통신 담당
		 * - Input / OutputStream을 가지고 있음 (이 스트림을 통해 입출력이 이뤄질거임!)
		 * 
		 * * Server Socket
		 * - 포트와 연결되어(Bind) 외부의 연결 요청을 기다리다 연결 요청이 오면 수락해줄 용도
		 * 	수락 => 통신할 수 있는 Socket 생성
		 */

		// 서버용 프로그램
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			BufferedReader br = null; // 입력 보조 스트림
			PrintWriter pw = null; // 한줄씩 읽어오는 출력보조스트림
			
			// 1) 포트번호지정(서버측에서 몇번 포트로 통로를 열거냐)
			int port = 3000;
			
			ServerSocket server = null;
			
			try {
				// 2) Server Socket 객체 생성시 포트 결합(Bind) => ServerSocket은 클라이언트의 연결 요청을 받아줄 용도의 소켓
				server = new ServerSocket(port);
				
				// 3) 클라이언트로 부터 접속 요청이 올 때 까지 대기 상태...
				System.out.println("클라이언트의 요청을 기다리고 있습니다...");
				
				// 4) 연결 요청이 오면 요청 수락 후 해당 클라이언트와 통신할 수 있는 서버측 소켓 객체 생성
				Socket socket = server.accept();
				System.out.println(socket.getInetAddress().getHostAddress() + "가 연결을 요청함 ...");
				
				// 5) 클라이언트와 입출력 스트림 생성(바이트스트림 밖에 안됨!! => 1byte짜리) => 성능이 별로 안좋음
				// 6) 보조스트림을 통해 성능 개선
				
				
				// 클라이언트로부터 전달된 값을 한 줄 단위로 읽어들이기 위한 입력용 스트림!
				// 입력용 스트림 = 1byte짜리 바이트 스트림을 문자스트림으로 변경해줌 => 보조스트림사용
				
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				// 출력용 스트림 (클라이언트에게 값을 한 줄 단위로 출력해줄 수 있는 출력용 스트림)
				pw = new PrintWriter(socket.getOutputStream());
				// PrintWriter : 데이터 출력시 print(), println() 메소드 사용 가능!!
				
				// 7) 스트림을 통해 읽고 쓰기
				// 클라이언트로 부터 전달된 메시지가 있을 경우 서버측 읽어들임! (입력)
				while(true) {
					
					String message = br.readLine();
					System.out.println("클라이언트로 부터 전달받은 메시지 : " + message);
					
					// 8) 반대로 클라이언트에게 데이터 전달 (출력)
					System.out.print(socket.getInetAddress().getHostAddress()+ "클라이언트에게 보낼 내용 : ");
					String sendMessage = sc.nextLine();
					
					pw.println(sendMessage); // 클라이언트에게 출력
					pw.flush(); // 현재 통로에 있는 데이터를 갖에로 내보내주는 메소드 **필수!!
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				// 9) 통신 종료
				try {
					pw.close();
					br.close();
					
					server.close();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		
		
		
		
		
	}

}
