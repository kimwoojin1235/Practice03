package com.javaex.Practice03;

import java.util.FormatFlagsConversionMismatchException;

public class Ex05 {

	public static void main(String[] args) {
		int i = 1;
		boolean flag = true;
		while (flag) {
			if (i>=5) {
				flag =false;
			}
			System.out.println(i);
			i=i+1;
		}
		//i가 5가 되면 종료
	}

}
