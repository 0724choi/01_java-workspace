package com.kh.chap04_assist.part01_buffer.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDao {
	
	/*
	 *  보조스트림 : 기반스트림으로 부족했던 성능을 보다 향상 시켜주는 스트림
	 *  		   기반스트림에서 제공하지 않는 추가적인 메소드 제공 / 데이터 전송 속도 향상 시킴 / +a
	 *  		>> 외부매체와 직접적으로 연결되는 스트림은 아니다!!
	 *  		   단독으로는 사용 불가능(기반스트림과 함께 사용)
	 */

	
	// 프로그램 ----> 파일 (출력)
	public void fileSave() {
		// FileWriter 기반스트림 가지고 해보자! (기반스트림 필수!!)
		// 파일과 직접적으로 연결해서 2바이트 단위로 출력을 할 수 있는 스트림
		
		//BufferedWriter : 버퍼라는 공간을 제공해주는 보조스트림(속도향상) : 기반스트림이랑 이름 맞춰야함
		
		// BufferedWriter bw = new BufferedWriter("c_buffer.txt"); 단독사용 불가!
		/*
		BufferedWriter bw = null;
		
		try {
			
			// 1. 기반 스트림 생성
			FileWriter fw = new FileWriter("c_buffer.txt");
			// 2. 보조 스트림 생성시 기반 스트림 객체를 전달하면서 생성
			BufferedWriter bw = new BufferedWriter(fw);
			
			
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			
			// write 메소드 이용해서 데이터 출력
			bw.write("안녕하세요\n");
			bw.write("반갑습니다");
			bw.newLine(); // 추가적인 메소드 활용 가능
			bw.write("저리가세요");
			// 버퍼라는 공간에 계속 쌓아놓다가 한 번에 출력해줌 => 속도향상에 좋다.
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
			bw.close();
		
		}catch (IOException e) {
			e.printStackTrace();
		}
	}*/
		
		// try~with~resource 구문으로 자원반납까지 더 간단하게 작업할 수 있음!
		// jdk7 버전 이상부터
		
		
		/*
		 *	try(try블럭 내에서 사용할 스트림 객체 생성구문){ // try구문을 다 끝나면 해당 stream알아서 반납해줌
		 
		 *
		 *	}catch(예외클래스 매개변수){
		 *
		 *	}
		 */
		
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))) {
			
			bw.write("안녕하세요\n");
			bw.write("반갑습니다");
			bw.newLine();
			bw.write("저리가세요");
			
		} catch (IOException e) {
			e.printStackTrace();
		} // 자원반납구문 안써도됨 자동으로 반납까지 해줌!
	}
	
	public void fileRead() {
		// FileReader : 파일로 연결해서 2바이트 단위로 데이터 입력받을수있는 기반 스트림
		// BufferedReader : 속도 향상에 도움이 되는 보조 스트림
		
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))){
			
			//br.read();
			// br.readLine();	// 한문장씩가져오기 돼있음 반환형 스트링
			/*
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine()); // 파일의 끝을 만나면 null이 나옴
			*/
			
			String value = null;
			while((value = br.readLine())!= null) { //null과 비교시는 equals가 아님!
				System.out.println(value);
				// 반납구문 안써도됨! 자동으로 반납됨!
			}
			
			
			
			
		} catch (FileNotFoundException e) { // 자식
			e.printStackTrace(); 
		} catch (IOException e) { // 부모
			e.printStackTrace();
		}
	}

}

