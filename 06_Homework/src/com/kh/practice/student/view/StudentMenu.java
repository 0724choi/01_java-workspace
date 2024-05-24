package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	
	private StudentController ssm = new StudentController();
	
	// 생성자부
	public StudentMenu() {
		
		System.out.println("=========학생정보출력============");
		Student[] sArr = ssm.printStudent();
		for(int i=0; i<sArr.length; i++) {
			System.out.println(sArr[i].inform());
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
