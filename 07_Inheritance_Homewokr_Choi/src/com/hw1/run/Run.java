package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Person;
import com.hw1.model.vo.Student;

public class Run {
	

	public static void main(String[] args) {
		Student info[] = new Student[3];
		info[0] = new Student("홍길동",20,178.2,70.0,1,"정보시스템공학과");
		info[1] = new Student("김말동",21,187.3,80.0,2,"경영학과");
		info[2] = new Student("강개순",23,167.0,45.0,4,"정보통신공학과");
		
		for(int i=0; i<info.length; i++) {
			System.out.println(info[i]);
			
		}
		
		Scanner sc = new Scanner(System.in);	
		Employee[] emp = new Employee[10];
		int count = 0;
		
		while(count<10) { // while start
				System.out.print("이름 : ");
				String name = sc.nextLine();
				
				System.out.print("나이 : ");
				int age = sc.nextInt();
				
				System.out.print("신장 : ");
				double height = sc.nextDouble();
				
				System.out.print("몸무게 : ");
				double weight = sc.nextDouble();
				
				System.out.print("급여 : ");
				int salary = sc.nextInt();
				sc.nextLine();
				
				System.out.print("부서 : ");
				String dept = sc.nextLine();
				
				emp[count] = new Employee(name,age,height,weight,salary,dept);
				
				count++;
				
				System.out.print("계속 하시겠습니까? : ");
				char yn = sc.nextLine().charAt(0);
				if(yn== 'n' || yn == 'N') {
					break;
				}

			}// while end
			
			for(int i=0; i<count; i++) {
				System.out.println(emp[i]);
			}
			
			
		}
		
		
		
		
	}
