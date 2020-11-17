package com.javaex.Practice03;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력: ");
		int num = sc.nextInt();
		int x=0;
		int sum = 0;
		for (int i = 1; i <= num;i++) {
			//입력이 되는 num과 i가 같아질때 까지 증가
			if (i%5==0) {//5의 배수인건만 통과
				x++;//5의 배수인것만 더해
			sum +=i;//i가 증가 하면서 5의 배수인것만 거른걸 더함
			}
		}
		System.out.println("5의배수의 개수"+x);
		System.out.println("5의배수의 개수"+sum);

	}

}
