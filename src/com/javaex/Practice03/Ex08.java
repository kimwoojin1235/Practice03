package com.javaex.Practice03;

public class Ex08 {

	public static void main(String[] args) {
		int i, x;
		for (i = 1; i <=9; i++) {
			for (x = 2; x <=9; x++) {
				System.out.print(x+"*"+i+"="+(i*x)+"\t");
			}
			System.out.println("");
		}
	}
}
