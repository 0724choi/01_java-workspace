package com.kh.chap04_assist.part01_buffer.run;

import com.kh.chap04_assist.part01_buffer.model.dao.BufferDao;

public class BufferRun {

	public static void main(String[] args) {
		
		BufferDao bw = new BufferDao();
		//bw.fileSave();
		bw.fileRead();
	}

}
