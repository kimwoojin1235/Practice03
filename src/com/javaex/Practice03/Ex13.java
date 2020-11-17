package com.javaex.Practice03;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력: ");
		int num = sc.nextInt();//수를 입력받음
		int sum = 0;//초기화
		for (int i=1; i <=num; i++) {
			sum+=i;//sum과i를 더한값을 sum에 넣으면서 
			       //증가한 i와 값을 더함.
		}
		 System.out.println("합계: "+sum);
	}

}
