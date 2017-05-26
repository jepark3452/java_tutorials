package com.jepark.enums;

/**
 * 상수는 변하지 않는 값이다.
 * 상수 - enum
 * @author jepark
 *
 */
public class Code1 {
	
	public static void main(String[] args) {
		/*
		 * 1. 사과
		 * 2. 복숭아
		 * 3. 바나나
		 */
		int type = 1;
		switch (type) {
			case 1:
				System.out.println(57 + "kcal");
				break;
			case 2:
				System.out.println(34 + "kcal");
				break;
			case 3:
				System.out.println(93 + "kcal");
				break;
		}
	}
}