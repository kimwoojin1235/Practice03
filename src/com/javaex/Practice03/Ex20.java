package com.javaex.Practice03;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int  num = 40;
		System.out.println("----------------------------");
		System.out.println("       [숫자 맟추기 게임]        ");
		System.out.println("----------------------------");
		while (true) {
			System.out.print(">>");	
			int a = sc.nextInt();
			if (num==a) {
				System.out.println("정답입니다.");
				System.out.print("게임을 종료 하시겠습니까?(y/n)");
				System.out.print(">>");
				char y=sc.next().charAt(0);
				if (y=='y') {
					System.out.println("----------------------------");
					System.out.println("     [숫자 맟추기 게임 종료]       ");
					System.out.println("----------------------------");
					break;
				}else if (y=='n') {
					System.out.println("----------------------------");
					System.out.println("      [숫자 맟추기 게임시작]        ");
					System.out.println("----------------------------");
				continue;
				}
				
			}else if (num<a) {
				System.out.println("더 낮게");
			}else {

				System.out.println("더 높게");
			}
			
		}

	}

}
