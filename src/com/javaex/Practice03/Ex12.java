package com.javaex.Practice03;

import java.io.PrintStream;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		int n = 1;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력: ");
		i = sc.nextInt();
		
		for (int x = 1; x <= i; x++) {
			n =n*x;
		}
		System.out.print("결과값: "+n);
	}

}
