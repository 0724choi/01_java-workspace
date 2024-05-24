package com.hw1.run;

import com.hw1.model.Employee;

public class Run {
	

	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Employee[] emp = new Employee[3];
		
		emp[0] = new Employee();
		System.out.println(emp[0].information());
		
		emp[1] = new Employee(1,"홍길동",19,'M',"01022223333","서울 잠실");
		System.out.println(emp[1].information());
		
		emp[2] = new Employee(2,"강말순","교육부","강사",20,'F',1000000,0.01,"010111122222","서울 마곡");
		System.out.println(emp[2].information());
		
		System.out.println("===============================================================================");
		
		emp[0].setEmpName("김말똥");
		emp[0].setDept("영업부");
		emp[0].setAddress("서울시송파구");
		emp[0].setBounsPoint(0.2);
		emp[0].segAge(30);
		emp[0].setGender('F');
		emp[0].setSalary(1000000);
		emp[0].setPhone("010123456879");
		emp[0].setJob("대리");
		emp[0].setEmpno(0);
		
		System.out.println(emp[0].information());
		
		emp[1].setDept("영업부");
		emp[1].setJob("부장");
		emp[1].setSalary(1000000);
		emp[1].setBounsPoint(0.3);
		
		System.out.println(emp[1].information());
		
		System.out.println("===============================================================================");
		int sum = 0;
		int total = 0;
		
		
		for(int i=0; i<emp.length; i++) {
			total = (int)(12*(emp[i].getSalary()+(emp[i].getSalary() * emp[i].getBounsPoint())));
			System.out.println(emp[i].getEmpName()+ "의 연봉 : "+ total);
			sum += total;
		}
			System.out.println("최승균");
			System.out.println("직원들의 연봉의 평균 : " + sum / emp.length );
			   
		
		/*
		 *  for each문으로 변경하는 방법
		for(Employee e :emp) { // e = emp[0] => e=emp[1] = > e=emp[2]
			total = (int)(12*(e.getSalary()+(e.getSalary() * e.getBounsPoint())));
			System.out.println(e.getEmpName()+ "의 연봉 : "+ total);
			sum += total;
		}
		
		System.out.println("직원들의 연봉의 평균 : " + sum / emp.length );
*/
	}
	
	


}