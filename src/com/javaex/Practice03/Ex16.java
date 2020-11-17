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
			if (i%5==0) {
				x++;
			sum +=i;
			}
		}
		System.out.println("5의배수의 개수"+x);
		System.out.println("5의배수의 개수"+sum);

	}

}
