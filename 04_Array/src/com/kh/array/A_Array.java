package com.kh.array;

import java.util.Scanner;

public class A_Array {
	
	// 변수 : 하나의 공간에 하나의 값을 담을 수 있다.
	// 배열 : 하나의 공간에 여러개의 값을 담을 수 있는 개념.
	//		 "같은 자료형의 값" 으로만 담을 수 있다.
	//		 정확하게 얘기하면 배열의 각 인덱스 자리에 실제의 값이 담긴다(인덱스는 0부터 시작!)
	

	public void method1() {
		
		// 배열을 왜 쓰는지?
		
		// 변수라는것만을 이용하게 되면 => 대량의 데이터들을 보관하고자 할 때 각각의 변수를 만들어서 따로 관리
		
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
	 	int num4 = 3;
		int num5 = 4;
		
		// 출력하고자 할 때도
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		// -> 다른 표현 방법이 없을까? 
		// 반복문 불가능..
		// 일일히 출력해야 하는 불편함..
		
		// 총 합계를 구할때도 -> 일일히 더해줘야함
		int sum = num1 + num2 + num3 + num4 + num5;
		
		/*
		 * 1. 배열 선언 ( 여러개의 값을 보관할 배열을 만들겠다)
		 * [표현법]
		 * 자료형 배열명[];
		 * 자료형[] 배열명;
		 * 
		 * int a; // 변수 선언
		 * 
		 * int a[];
		 * int[] a; // 오로지 int의 값만 담을 수 있다.
		 * 
		 */
		
		
		/*
		 * 2. 배열 할당(이 배열에 몇개의 값들을 보관할건지 크기를 지정하는 과정, 그 개수만큼 방이 만들어진다!)
		 * 	  배열명 = new 자료형[배열크기];
		 *	  
		 * 
		 */
		// int[] arr;
		// arr = new int[5];
		
		// ** 배열 선언 동시에 할당 (배열 만듦과 동시에 크기 지정)
		
		int[] arr= new int[5];
		
		
		/*
		 * 3. 값 대입
		 * 	  배열명[인덱스] = 값;
		 * 
		 */
		
		/*
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		*/
		
		// 배열 장점 : 반복문을 활용 가능!
		for(int i=0; i<5; i++) {
			 arr[i] = i;
		}
		
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);*/
		
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]); // 인덱스로 접근하는 생각 하기 ! 
			
		}
			System.out.println(arr); // 실제 arr이라는 박스에는 "주소값"이 있다
			
	}
	
	public void method2() {
		
		int i = 10;
		
		// 배열 선언과 동시에 할당
		
		int iArr[] = new int[5];
		
		System.out.println(iArr);
		
		double dArr[] = new double[3];
		System.out.println(dArr);
		
		/*
		 * 실제 리터럴값을 곧바로 담을 수 있는 변수를 일반 변수라고 얘기하고
		 * 주소값을 담고 있는 변수는 참조변수(레퍼런스 변수)라고 얘기한다.
		 * 
		 * 기본자료형(boolean, char, byte, short, int ,long, float, double)으로 선언된 변수 : 소문자로 시작 소문자로 끝
		 * => 실제 리터럴값 => 일반 변수
		 * 
		 * 그 외 자료형 (int[], double[], char[], short[], 이런 배열 자료형, String ...) 으로 선언된 변수
		 * => 주소값을 담는 변수 => 참조 변수(레퍼런스 변수)
		 */
		
	}
	
	public void method3() {
		
		int[] iArr = new int[3]; // 0번 인덱스 ~ 2번 인덱스 // 선언시 heap메모리에 기본값 0 할당 -> 주소생기고 stack에서 참조하게 된다 
		double [] dArr = new double[4]; // 0번 인덱스  ~ 3번 인덱스
		// 배열 선언하고 크기지정(할당)까지만 한 상태
		// 각각의 인덱스에 초기화 돼있을까?
		
		//각각의 인덱스에 값 안담고 출력해보기
		
		
		for(int i=0; i<3; i++) {
			
			System.out.println(iArr[i]);
					
		}
			
			System.out.println("===============");
			
		for(int i=0;i<4;i++) {
			System.out.println(dArr[i]);
		}
		
		// 내가 각 인덱스에 초기화를 하지 않아도 값들이 담겨 있는것을 확인
		// Heap이라는 공간에 절대 빈공간이 존재할 수 없음
		// => 따라서 공간이 만들어질때 jvm이 기본적으로 초기화(대입)를 진행
		
		
	}
		public void method4() {
			int[] arr = new int[5];
			/*
			arr[0] = 1;
			arr[1] = 2;
			arr[2] = 3;
			arr[3] = 4;
			arr[4] = 5; */
			
			// 값대입 
			for(int i=0; i<arr.length; i++) {
				arr[i] = i+1;
			}
			
			
			for(int i=0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}
			System.out.println(arr); // 배열의 자료형 + @ + 주소값의 16진수 형태);
			System.out.println(arr.hashCode()); // 주소값의 16진수 형태
			System.out.println(arr.length); // 배열의 길이
			
			// 배열 크기 변경 요청 => 10으로 바꿔달라 => 불가능! 배열은 고칠 수 없음 
		
		}
		
		public void method5() {
			int result = 0;
			
			// 배열 쓰면서 볼 수 있는 오류들 모음
			// int[] arr; => 배열의 경우 크기 지정을 하지 않으면 사용 불가능
			
			int[] arr = null; // 아무것도 참조 하고 있지 않음
			// 주소값을 담는 변수의 기본은 null
			
			System.out.println(arr); // 초기화 안돼있어서 오류
			// null가지고 메소드들 호출한다거나 특정 어딘가에 접근하조가 한다면
			// 항상 오류 발생 !! => NullPointerException
			// System.out.println(arr.hashCode());
			// System.out.println(arr.length);
			// System.out.println(arr[0]);
			
		}
		public void method6() {
			int[] arr = new int[5];

			for (int i = 0; i < arr.length; i++) {

				arr[i] = (i + 1) * 2;
				System.out.println(arr[i]);	

			}
			
			System.out.println("arr의 해쉬코드 값 : " + arr.hashCode());
			System.out.println("arr의 길이 : " + arr.length);
			/* System.out.println(arr[5]);
			 *  java.lang.ArrayIndexOutOfBoundsException
			 *  배열의 길이를 넘어서는 곳에 값을 넣었기 때문
			 */
			
			
			// 배열의 가장 큰 단점
			// - 한번 지정된 배열의 크기가 변경이 불가
			// => 배열의 크기를 변경하고자 한다면 다시 만들어야 함			
			arr = new int[7];
			System.out.println("변경 후의 arr의 해시코드 값 : " + arr.hashCode());
			System.out.println("변경 후의 arr의 길이 : "+ arr.length);
			// 주소값이 변경 됨 => 새로운 곳 참조하고 있음
			
			/*
			 * 연결이 끊어진 기존 배열은 heap영역에 둥둥 떠다님(어디에도 참조되어 있지 않으므로 필요없는 존재임 == 지워주는게 좋음)
			 * => 자바가 일정 시간이 지나면 "가비지 컬렉터(GC)"가 자동으로 삭제
			 * => 자바에서의 "자동 메모리 관리" 특징 !! == 개발자가 코드 작성에만 신경 쓸 수 있음
			 * 
			 */
			
			// 배열을 강제로 삭제시키고자 한다면? == 연결고리를 끊으면 됨!
			arr = null; // 아무것도 참조하지 않겠다.
			
			System.out.println(arr); // null 
			
			// null.xxx -> 무조건 NullPointerException 에러 발생! 
			
		}
		
		public void method7(){
			// 배열 선언 , 할당, 초기화 다 동시에 하기
			
			// 표현법1
			int[] arr1 = new int[] { 1,2,3,4,};
			
			// 표현법
			int[] arr2 = {1, 2, 3, 4}; // 자주 사용
			
			System.out.println(arr1 == arr2); // false인 이유 
			// -> 서로 주소값을 보고 비교하기 때문
		}
		
		public void method8() {
			//  1. 크기 10짜리 정수 배열 생성 후
			//  2. 반복문 활용하여 0번 인덱스 ~ 마지막까지 순차접급하면서 값 대입
			//	 매번 1~100 사이에 발생되는 랜덤값
			//	3. 반복문을 활용하여 헤당 배열의 0번 인덱스 ~ 마지막까지 담긴 값 출력
			// 	arr[x] = xx형식으로 출력
			
			int iArr[] = {1,2,3,4,5,6,7,8,9,10};
			
				for(int i=0; i<iArr.length; i++) {
					iArr[i] = (int)(Math.random()*100+1);
				
			}for(int i=0; i<iArr.length; i++) {
				System.out.println("arr["+ i +"] : " + iArr[i]);
			}
			
		}
		
		public void method9() {
			// 1. 사용자에게 배열의 길이 입력받은 후 그 크기만큼의 문자열 배열 생성
			// 2. 반복문 활용 매번 사용자에게 과일명 입력 받음 그 값을 매 인덱스 자리에 대입
			// 3. 반복문으로 출력
			
			
			Scanner sc = new Scanner(System.in);
			System.out.print("배열의 길이를 입력해주세요 : ");
			int num = sc.nextInt();

			sc.nextLine(); // 버퍼 제거 
			
			String sArr[] = new String[num];
		
			for(int i=0; i<sArr.length; i++) {

				System.out.print("과일명 입력 : ");
				String fruit = sc.nextLine();
				sArr[i] = fruit;
				
				
			}for(int i=0; i<sArr.length;i++) {
				System.out.println("arr["+ i +"] : " + sArr[i]);
				
			}
		}
		public void method10() {
			// 사용자에게 문자열 하나를 입력받은 후 
			// 각각의 인덱스에 있는 문자들을 char 배열에 옮겨담으세요.
			// 반복문 활용해서 배열의 0~마지막 인덱스까지 출력
			
			Scanner sc = new Scanner(System.in);
			System.out.print("문자열을 하나 입력해주세요 :  ");
			String str = sc.nextLine();
			
			//찾고자하는 문자 하나 입력받기
			System.out.print("찾고 싶은 문자 : ");
			char ch = sc.nextLine().charAt(0);
			
			// 2. char 배열 생성 => 배열의 크기 == 입력한 문자열의 길이
			char arr[] = new char[str.length()];
			int count = 0;
			// 3. 반복문 활용해서 해당 문자열에서 각 인덱스별 문자를 char 배열에 대입
			for(int i=0; i<str.length(); i++) {	
				arr[i] = str.charAt(i); // 표현법 암기하기!! 
				if(ch==arr[i]) {
					count++;
				}
				System.out.println("arr["+ i +"] : " + arr[i]);
				
			}
			System.out.println("찾아진 문자 개수 : " + count + "개");
			// 찾아진 문자 개수 : ?개
			
		}
		public void method11() {
			//1. 사용자한테 배열의 길이를 입력 받은 후 해당 크기만큼의 정수형 배열 생성
			Scanner sc = new Scanner(System.in);
			System.out.print("배열의 길이 입력 : ");
			int size = sc.nextInt();
			
			int arr[] = new int[size];
			
			//2. 반복문 활용해서 0번인덱스~마지막인덱스까지 매번 1~100사이의 랜덤값대입
			
			for(int i=0; i<arr.length; i++) {
				arr[i] = (int)(Math.random()*100+1);
				
			}
			// 3. 반복문 활용해서0번~마지막 인덱스까지 담긴 값을 출력과 동시에
			// 해당 그인덱스에 담긴 값이 짝수인 값들의 총합
			
			int sum = 0;
			
			for(int i=0; i<arr.length; i++) {
				System.out.println("arr["+ i + "} : " + arr[i]);
				if(arr[i]%2==0) {
					sum += arr[i];
				}
			}
			System.out.println("해당배열의 짝수의 총합 : " + sum);
		}
			
		}


		

