package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	public void p1() {
		int[] arr = new int[10];
		
		for(int i=0; i<10; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	public void p2() {
		int[] arr = new int[10];
		
		for(int i=0; i<10; i++) {
			arr[i] = i+1;
			
		}
		for(int i=9; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
		
	}

	public void p3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		
		for(int i =0; i<num; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
			
		}
		
	}
	public void p4() {
		String arr[] = {"사과","귤","포도","복숭아","참외"};
		System.out.println(arr[1]);
		
	}
	
	public void p5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
	
		int count = 0;
		System.out.print(str + " 에 " + ch +"가 존재하는 위치(인덱스) : " );
		
		char arr[] = new char[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i);
			if(ch==str.charAt(i)) {
				System.out.print(i + " ");
				count++;
				
			}
		}
		
		System.out.printf("\n%s 개수 : %d",ch,count);
		
		
	}

		public void p6() {
			
		Scanner sc = new Scanner(System.in);
		
		String sArr[] = {"월요일", "화요일", "수요일" ,"목요일" ,"금요일" , "토요일", "일요일"};
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		if(num>6 || num<0) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			System.out.println(sArr[num]);
		}
		
	}
		
		public void p7() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 : ");
			int num = sc.nextInt();
		
			int arr[] = new int[num];

			int sum = 0;
			
			for(int i=0; i<arr.length; i++) {
				
			System.out.printf("배열 %d번째 인덱스에 넣을 값 :",i);
			 arr[i] = sc.nextInt();
			 sum += arr[i];
			}
			for(int i =0; i<arr.length; i++) {
				System.out.print(arr[i]+ " ");
			}
			System.out.printf("\n총 합 : %d",sum);
		}
		
		public void p8() {
			
			Scanner sc = new Scanner(System.in);
			
			while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if(num>2 && num%2 ==1) {
				int nArr[] = new int[num];
				
				for(int i=1; i<=nArr.length; i++) {
					
					if(i<(nArr.length/2)) {
						System.out.print(i + " ");
					}else {
						System.out.print(i + " ");
					}
				}
				System.out.println();
			}else {
				System.out.println("다시 입력하세요.");
			}
			}
		}
		public void p9() {
			Scanner sc = new Scanner(System.in);
			
			String sArr[] = {"후라이드", "양념" , "반반", "간장", "파닭"}; // 5짜리 배열
			System.out.print("치킨 이름을 입력하세요 : ");
			String str = sc.nextLine();
			
			 for (int i = 0; i < sArr.length; i++) {

			if(sArr[i].equals(str)) {
				 System.out.println(str + " 치킨 배달 가능.");
				 break;

				 
			}else if (i == sArr.length - 1) {
				System.out.println(str + " 치킨은 없는 메뉴입니다.");

			}
			
				
			 }
		
		}
		//주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
		// 단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
		public void p10() {
			Scanner sc = new Scanner(System.in);
			System.out.print("주민등록번호(-포함) : ");
			String rrd = sc.nextLine();
			
			char rrdArr[] = new char[rrd.length()];
			char rrdCopy[] = new char[rrd.length()];
			
			for(int i=0; i<rrd.length(); i++) {
				 rrdArr[i] =rrd.charAt(i);
			}
			for(int i=0; i<rrdArr.length;i++) {
				if(i>7) {
					rrdCopy[i] = '*';
				}else {
				rrdCopy[i]=rrdArr[i];
				}
				System.out.print(rrdCopy[i]);
			}
				
		}
		/*10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요. */
		
		public void p11() {
			
			int nArr[] = new int[10];
			
			for(int i=0; i<10; i++) {
				int random = (int)(Math.random()*10+1);
				nArr[i] = random;
				System.out.print(nArr[i]+ " ");
			}
			
			
		}
		
		/*10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		1~10 사이의 난수를 발생시켜 배열에 초기화 후
		배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요. */
		
		public void p12() {
			int arr[] = new int[10];
			
			System.out.println("arr[0] : " + arr[0]);
			
			 //int max = arr[0];
			 //int min = arr[0];
			
			for(int i=0; i<10; i++) {
				arr[i] = (int)(Math.random()*10+1); // 1~10
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			
			int max = arr[0];
			int min = arr[0];
			
			for(int i=0; i<arr.length-1; i++) {
				if(max<arr[i]) {
					max = arr[i];
				}
				if(min>arr[i]) {
					min = arr[i];
				}
				
			}
			System.out.println("최대 : " + max);
			System.out.println("최소 : " + min);
			
		}
		
		public void p13() {
			/*10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
			1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.*/
			int arr[] = new int[10];
			
			for(int i=0; i<10; i++) {
				arr[i] = (int)(Math.random()*10+1);
				 for(int j=0; j<i; j++) {
			            if(arr[i] == arr[j]) {
			              i--;

						}

					}
				}
			  for(int i=0; i<arr.length; i++) {
		            System.out.print(arr[i] + " ");

		}		  
	}
		
		public void p14() {
			/*문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
			문자의 개수와 함께 출력하세요.*/
			
			Scanner sc = new Scanner(System.in);
			int count = 0;
			System.out.print("문자열 : ");
			String str = sc.nextLine();
			char arr[] = new char[str.length()];
			
			for(int i=0; i<str.length(); i++) {
				arr[i] = str.charAt(i);
				
				boolean flag = true;
				
				for(int j=0; j<i; j++) {
					if(arr[i]==arr[j]) {
						flag = false;
						break;
					}
					
				}
				if(flag) {
					if (i == 0) {
						System.out.print(arr[i]);
					} else {
						System.out.print(", " + arr[i]);
					}
					
			}
			
		}
			System.out.println();
			System.out.println(count);
}
		
		/*
		 * 사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
			배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
			단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
			늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
			사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요. */
			
		public void p15() {
			Scanner sc = new Scanner(System.in);
			System.out.print("배열의 크기를 입력하세요 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			String origin[] = new String[num];
			String copy[] = origin; // 얕은복사
			
			for(int i=0; i <origin.length; i++) {
				System.out.printf("%d번째 문자열 : ",i+1);
				origin[i] = sc.nextLine();	
				}
			if()
		}
}

