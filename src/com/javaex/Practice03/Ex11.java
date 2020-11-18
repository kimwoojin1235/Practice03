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
			//num을 i에 넣으므로서 i가num이 되어 i가 0 이될때까지 2씩 차감
			//그래서 결과적으로 i가 0이 된다면 홀수 아니면 짝수이다.
			y+=i;
			//i가 2씩 차감되어 여기 누적이됨
		}
		System.out.println("결과값: "+y);

	}

}
