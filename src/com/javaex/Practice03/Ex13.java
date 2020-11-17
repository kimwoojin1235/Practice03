package com.javaex.Practice03;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력: ");
		int num = sc.nextInt();
		int i;
		int sum;
		for (i = 1,sum = 0; i <= num; i++) {
			 sum +=i;
		}
		 System.out.println("합계: "+sum);
	}

}
