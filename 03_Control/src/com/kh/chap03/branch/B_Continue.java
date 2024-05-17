package com.kh.chap03.branch;

public class B_Continue {
	/*
	 * continue : 		반복문 안에 기술되는 구문 continue; 구문 실행시 그 뒤의 구문을 실행하지 않고,  
	 * 					곧바로 현재 속해있는 반복문 위로 올라감
	 *
	 */

	public void method1() {
		// for문으로부터 1부터 10까지 홀수 출력
		/*
		 * for(int i=1; i<11; i++) { if(i%2==1) { System.out.print(i + " "); } }
		 */

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) { // i가 짝수인 경우
				continue; // 건너뛰기라고 생각
				// 반복문 실행안하고 반복문 위로 올라감 = > 증감식으로 가라!
			}
			System.out.print(i + " ");
		}
	}
	
	public void method2() {
		// 1부터 100까지 총합계 
		// 단, 6의 배수값은 제외
		int sum = 0;
		for(int i =1; i<101; i++) {
			if( i % 6 == 0) {
				continue; // 6의 배수의 경우 건너뛰기
			}else {
				sum += i;
			}
		}
		System.out.println(sum);
	}
	
	public void method3() {
		// 2~9단 출력
		// 단, 3 6 9 단은 제외
		
		for(int i=2;i<10;i++) {
			
			if(i==3 || i==6 || i==9) { // dan % 3 == 0 : 3의 배수단
				continue;
			}else {
				System.out.println("====" + i + "단"+ "====");
				for(int j=1; j<10; j++) {
				System.out.printf("%d x %d = %d\n",i,j,i*j);
					
				}
				System.out.println();
			}
			
		}
		
		
	}
	
}
