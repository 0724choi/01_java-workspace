package com.kh.answer;

import java.util.Arrays;
import java.util.Scanner;

public class Answer {
	public void a1() { //반복문 12번 문제 switch case / printf 사용해서 다시 풀어보기 
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.print("연산자 (+,-,*,/,%) : ");
			String op = sc.nextLine();
			
			if (op.equals("exit")) {
				System.out.println("프로그램을 종료합니다");
				break;
			} 
			
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();

			System.out.print("정수2 : ");
			int num2 = sc.nextInt();

			sc.nextLine();
			
			if (op.equals("/") && num2 == 0) {
				System.out.println("0으로 나눌수 없습니다. 다시 입력해주세요.");
			}
			
		}
			
		}
		public void a2() { // 반복문 14번 문제 역으로 별찍기
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			
			for(int i=1; i<=num; i++) { // 1에서 num까지 늘어난다 (행)
				for(int j=num; j>=1; j--) { // num에서 1까지 줄어든다 (열)
						System.out.print("*");
					}
				System.out.println();
				}		
			}
		public void a3() { // 배열 12번 문제 
			/*10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
				1~10 사이의 난수를 발생시켜 배열에 초기화 후
			배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.*/
			
			int arr[] = new int[10];
			
			for(int i=0; i<arr.length; i++) {
				arr[i] = (int)(Math.random()*10+1);
			}
			
			for(int i=0; i<arr.length;i++) {
				System.out.print(arr[i]+ " ");
			}
			System.out.println();
			
			int max = arr[0];
			int min = arr[0];
			
			for(int i=0; i<arr.length-1; i++) {//최대값 최소값 비교하는 방법
				
				if(max<arr[i]) {
					max = arr[i];
				}
				if(min>arr[i]) {
					min = arr[i];	
				}
			}		
			System.out.println("최대값 : " + max);
			System.out.println("최소값 : " + min);		
		}
		
		public void a4() { // 배열 12번 문제 
			/*10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
				1~10 사이의 난수를 발생시켜 배열에 초기화 후
			배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.*/
			
			int arr[] = new int[10];
			
			for(int i=0; i<arr.length; i++) {
				arr[i] = (int)(Math.random()*10+1);
			}
			
			for(int i=0; i<arr.length;i++) {
				System.out.print(arr[i]+ " ");
			}
			System.out.println();
			
			int max = arr[0];
			int min = arr[0];
		
			// 배열 정렬
			Arrays.sort(arr);
			min =arr[0];
			max = arr[arr.length-1];
			
			System.out.println("최대값 : " + max);
			System.out.println("최소값 : " + min);
			
		}	
		
		public void a5() { // 배열 실습문제 14번
			/*로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력하세요. */
			
			int lotto[] = new int[6];
			
			
			for(int i=0; i<lotto.length; i++) {
				lotto[i] = (int)(Math.random()*45+1);
				for(int j=0; j<i; j++) { // j와 i의 첫번째는 비교하지 않기 위해
					if(lotto[i]==lotto[j]) {
						i--; // 증감식을 막아서 코드를 다시 돌림
					}
					
				}
			}
		 Arrays.sort(lotto);
		 for(int i=0; i<lotto.length; i++) {
			 System.out.print(lotto[i]+ " ");
		 }
			
		}

		public void a6() { // 배열 실습문제 15번
			/*
			 * 문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고 문자의 개수와 함께 출력하세요.
			 */

			Scanner sc = new Scanner(System.in);
			System.out.print("문자열 :  ");
			String str = sc.nextLine();

			char arr[] = new char[str.length()];
			
			int count = 0;

			for (int i = 0; i < arr.length; i++) {
				arr[i] = str.charAt(i);

				boolean flag = true;

				for (int j = 0; j < i; j++) {

					if (arr[i] == arr[j]) {
						flag = false; // 중복값이 있다
						break;
					}

				}
				if (flag == true)
					
				{ // 중복값이 없다
					if (i == 0) {
						System.out.print(arr[i]);
					} else {
						System.out.print(", " + arr[i]);
					}
					count++;
				}

			}
			System.out.println();
			System.out.println("문자 개수 : " + count);
		}
		
		public void a7() {
			Scanner sc = new Scanner(System.in);
			System.out.print("배열의 크기를 입력하세요 : ");
			int num = sc.nextInt();
			 sc.nextLine();
			
			String origin[] = new String[num];
			
			// 배열복사
			 String copy[] = origin; // 얕은복사 주소값 복사
			// String copy[] = origin.clone(); // 깊은복사 , 크기지정 불가능
			// String copy[] = Arrays.copyOf(origin, num); // 깊은 복사, 크기가 넘으면 알아서 초기값 채워줌
			
			for(int i = 0; i<origin.length; i++) {
				System.out.printf("%d번째 문자열 : ",i+1);
				origin[i] = sc.nextLine();
			}
			while(true) {
				System.out.print("더 값을 입력하시겠습니다?(Y/N) : ");
				char ch = sc.nextLine().charAt(0);
				
				if(ch=='y'|| ch=='Y') {
					
					System.out.print("더 입력하고 싶은 개수 : ");
					num = sc.nextInt();
					
					sc.nextLine();
					
					copy = Arrays.copyOf(origin, origin.length + num);
					
					
					for(int i = origin.length; i<copy.length; i++) {
					System.out.printf("%d번째 문자열 : ",i+1);
					copy[i] = sc.nextLine();
					
					}
					
					origin = copy;
					
				}else if(ch =='n' || ch == 'N') {
					System.out.print("[");
					
					for(int i=0; i<copy.length;i++) {
						
						if(i == copy.length - 1) { // 마지막 인덱스 출력
							System.out.printf("%s",copy[i]);
						}else {
							System.out.printf("%s,",copy[i]);
						}
						} 
					System.out.print("]");
					break;
					
				}
					
			}
			
		}
		public void a8() {// 실습문제 10
			/*주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
			단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.*/
			
			Scanner sc = new Scanner(System.in);
			System.out.print("주민등록번호(-포함) : ");
			String rrn = sc.nextLine();
			
			char arr[] = new char[rrn.length()];
			
			for(int i=0; i<arr.length; i++) {
				arr[i] = rrn.charAt(i);
				
			}
			
			char arrCopy[] = arr.clone();
			
			for(int i=8; i<arrCopy.length;i++) {
				arrCopy[i] = '*';
			}
			
			for(int i=0; i<arrCopy.length;i++) {
				System.out.print(arrCopy[i]);
			}
		}
	}
	