package com.javaex.Practice03;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력: ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {//i가 num까지 증가함
			 sum +=i;//sum과i를 더한값을 sum에 넣으면서 
		       //증가한 i와 값을 더함.
			 System.out.print(i);//i가 증가하는 것을 보여줘
			 if (i==num) {//입력한 값과 같다면 +를 붙이지 마라
				System.out.println();
			}else {//입력한 값보다 작다면 +를 붙여
				System.out.print("+");
			}
		}
		 System.out.println("합계: "+sum);

	}

}
