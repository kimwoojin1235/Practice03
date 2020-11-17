package com.javaex.Practice03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자: ");
		int num = sc.nextInt();
		int y = 0;
		
		for (int i = num; i > 0; i-=2) {
			y+=i;
		}
		System.out.println("결과값: "+y);

	}

}
