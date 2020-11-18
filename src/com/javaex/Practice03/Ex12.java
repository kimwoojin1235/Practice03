package com.javaex.Practice03;

import java.io.PrintStream;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		int n = 1;
		//n의 초기값은 반드시 1이여야함 0이라면 입력받은 수가
		//0이 되어버린다 즉 1이여야한다.
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력: ");
		i = sc.nextInt();
		
		for (int x = 1; x <= i; x++) {//x가i와 같아지게 증가
			n *=x; //증가할때마다 곱해지고 n은 곱해진 값으로변한다.
		}
		System.out.print("결과값: "+n);
	}

}
