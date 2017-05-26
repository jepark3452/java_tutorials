package com.jepark.enums;

/**
 * 상수는 변하지 않는 값이다.
 * 상수 - enum
 * @author jepark
 *
 */
public class Code2 {
	
	private final static int APPLE = 1;
	private final static int PEACH = 2;
	private final static int BANANA = 3;
	
	public static void main(String[] args) {
		int type = APPLE;
		switch (type) {
			case APPLE:
				System.out.println(57 + "kcal");
				break;
			case PEACH:
				System.out.println(34 + "kcal");
				break;
			case BANANA:
				System.out.println(93 + "kcal");
				break;
		}
	}
}
