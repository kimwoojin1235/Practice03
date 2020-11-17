package com.javaex.Practice03;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			//밑으로 늘어나는 줄이라서 별로 달라지는 것은없다.
			for (int j = n; j > i; j--) {
				//처음에는 입력값보다 크게 하고 감소를 시킨다.
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
