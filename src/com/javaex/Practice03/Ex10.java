package com.javaex.Practice03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		int num,top = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		for (int i = 0; i < 5; i++) {//숫자를 5개 적을때 까지 증가
			System.out.print("숫자: ");
			num = sc.nextInt();
			if (top <num) {//top이num보다 작다면은
				top = num;//num중에서 최고 값을 top에 넣음
			}	
		}
		System.out.println("최대값은"+top+"입니다.");
		
	}

}
