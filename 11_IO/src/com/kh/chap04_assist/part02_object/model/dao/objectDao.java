package com.kh.chap04_assist.part02_object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class objectDao {
	
	
	// 파일은 우리가 보려고 만드는것이 아니고 나중에 컴퓨터가 읽어오기 위함
	public void fileSave() {
	
		// 출력할 데이터 (Phone객체)
		Phone ph1 = new Phone("아이폰",1300000);
		Phone ph2 = new Phone("갤럭시",1200000);
		Phone ph3 = new Phone("플립",1500000);
		
		// 객체 단위로 출력해줄 수 있는 보조스트림 필요!
		
		// ObjectXXXX => 얘는 Reader, Writer가 없음!
		
		// FileOutputStream 	: 파일과 연결해서 1바이트 단위로 출력할 수 있는 기반 스트림
		// ObjectOutputStream	: 객체 단위로 출력할 수 있도록 도움을 주는 보조스트림!!!
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_phone.txt"))){
		
			oos.writeObject(ph1);
			oos.writeObject(ph2);
			oos.writeObject(ph3);
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}

}
	
	public void fileRead() {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_phone.txt"))){
			
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());			
			System.out.println(ois.readObject());	// 파일의 끝을 만나는 순간 예외가 발생 EOFException => End Of File
			
			
		} catch (FileNotFoundException e) {
			//System.out.println("1");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("파일을 다 읽어들였습니다");
			
		} catch (ClassNotFoundException e) {
			//System.out.println("3");
			e.printStackTrace();
		}
		System.out.println("ㅎㅇ");
	}
	
}
