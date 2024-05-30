package com.kh.chap04_assist.part02_object.run;

import com.kh.chap04_assist.part02_object.model.dao.objectDao;

public class objectrun {

	public static void main(String[] args) {
		
		objectDao dao = new objectDao();
		// dao.fileSave();
		dao.fileRead();
	}

}
