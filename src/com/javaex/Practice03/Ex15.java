package com.javaex.Practice03;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력: ");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {//입력한 값과i가 같앚질때 까지 
			//i의증가
			if (num%i==0)
				//i가 증가할때마다 들어와서 num과 나누기를 한뒤 나머지가 0이 아니
				//라면 i가 증가를 하여 다시num과 나누기를 한다.
			System.out.println(i);//0으로 나누어 떨어지는 수를 출력
		}

	}

}
