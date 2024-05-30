package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// DAO (Date Access Object)
public class FileByteDao { 
	
	/*
	 * "바이트 기반 스트림" 가지고 데이터 입출력 해보기!!
	 * 
	 * - 바이트 스트림 : 데이터를 1byte 단위로 전송하는 통로(좁은통로 1바이트면 한글은 깨진다..)
	 * - 기반 스트림 : 외부매체와 직접적으로 연결되는 통로
	 * 
	 * 
	 * XXXInputStream : XXX매체로부터 데이터를 입력받는 통로 (외부매체로부터 데이터를 읽어오겠음!)
	 * XXXOutputStream : XXX매체로부터 데이터를 출력하는 통로 (외부매체로 데이터를 내보내겠음!)
	 * 
	 * 
	 */
	
	// 프로그램(자바 또는 메모리) ----------------> 외부매체(파일) 출력:프로그램상 데이터를 파일로 내보내기, 즉 파일로 저장하는것들
	public void fileSave() {
		
		// FileOutputStream : 파일과 직접적으로 연결해서 1바이트 단위로 출력하는 스트림
		
		// 1. 스트림 생성 (통로 만들기)
		// 2. 스트림으로 데이터를 출력 (메소드 활용)
		// 3. 다 사용한 후 스트림 반납
		
		FileOutputStream fout = null; // null로 초기화
		
		try {
			// 1. FileOutputStream 객체 생성 => 해당 파일과의 연결통로가 만들어짐
			 fout = new FileOutputStream("a_byte.txt");// 없으면 새로 만들어주고 통로연결 / 있으면 통로 연결 
			
			/*
			 * true 미작성시 => 해당 파일이 존재할 경우 기존의 데이터를 덮어 쓰워진다 (기본값:false)
			 * true 작성시  => 해당 파일이 존재할 경우 기존의 데이터에 이어서 작성
			 */
			
			// 2. 파일에 데이터를 출력하고자 할 때 write 메소드 사용
			//	  숫자를 출력하든 문자를 출력하든 실상 파일에 문자로 기록됨(아스키 코드를 사용함)
			
			fout.write(97);
			fout.write('b');
			fout.write('헐'); // 한글은 2바이트짜리여서 깨져서 저장됨
			
			byte[ ]arr = {99,100,101};
			fout.write(arr); // cde 저장
			
			// write(byte[] b, int off, int len) : byte 배열의 off인덱스로부터 len의 개수만큼 출력
			
			fout.write(arr,1,2);
		
			
			
			// fout.close(); // 위에서 write() 메소드 IOException 발생했을경우 => catch 블럭 실행 후 빠져나갈거임 (반납하는 코드 실행안됨!!)
			
		
		
		
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 이 안에 작성된 코드는 어떤 예외가 발생했던간에 무조건 실행하고 빠져나간다.
			try {	
				// 3. 스트림 다 이용했으면 반납하기! (반드시!!)
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	// 프로그램 <-----------파일(입력 : 파일로부터 데이터를 가져오기)
	public void fileRead() {
		
		//FileInputStream : 파일로부터 데이터를 1바이트 단위로 입력받는 스트림
		
		// 1. 스트림 생성 (통로 만들기)
		// 2. 스트림 통해서 입력받아옴(메소드 활용)
		// 3. 사용이 끝난 스트림 반납
		
		FileInputStream fin = null;
		
		try {
			// 1. FileInputStream 객체 생성 => 해당 파일과 연결 통로 만들어짐
			fin = new FileInputStream("a_byte.txt");
			
			// 2. 파일로부터 데이터를 읽어들이고자 할 때 read 메소드 사용
			//		1바이트 단위로 하나씩 읽어온다
			//		반환형이 int여서 숫자로 읽어들임
			
			/*
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());  
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read()); // 파일의 끝을 만나는 순간 -1을 받아오는거 확인!
			*/
			
			
			/* 반복문 수행시 read()가 두번씩 실행되기 때문에 퐁당퐁당 읽여들여짐 => 잘못됨
			while(fin.read() != -1) { // 읽어들린 값이 -1이 아닐 경우에만 반복적으로 실행되도록
				
				System.out.println(fin.read());
			}
			*/
			
			// read() 호출 반복문 수행시만 실행되도록
			// 해결방법1. 무한반복문 돌리면서 매번 조건검사
			
			while(true) {
				int value = fin.read();
				if(value == -1) {
					break;
				}
				System.out.println(value);
			}
			
			// 해결방법2 : 권장사항
			int value = 0;
			while((value = fin.read())!= -1) {
				System.out.println(value);
				
			}
			
			
			} catch (FileNotFoundException e) {	
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 3. 다 사용한 스트림 반납
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
