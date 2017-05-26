package com.jepark.enums;

/**
 * 상수는 변하지 않는 값이다.
 * 상수 - enum
 * @author jepark
 *
 */
public class Code3 {
	
	private final static int FRUIT_APPLE = 1;
	private final static int FRUIT_PEACH = 2;
	private final static int FRUIT_BANANA = 3;
	
	private final static int COMPNAY_GOGGLE = 1;
	private final static int COMPNAY_APPLE = 2;
	private final static int COMPNAY_ORACLE = 2;
	
	public static void main(String[] args) {
		int type = FRUIT_APPLE;
		switch (type) {
			case FRUIT_APPLE:
				System.out.println(57 + "kcal");
				break;
			case FRUIT_PEACH:
				System.out.println(34 + "kcal");
				break;
			case FRUIT_BANANA:
				System.out.println(93 + "kcal");
				break;
		}
	}
}
