package com.jepark.enums;

/**
 * 상수는 변하지 않는 값이다.
 * 좋은 프로그래밍은 자기자신을 견제하는 것이다.
 * 상수 - enum
 * @author jepark
 *
 */
public class Code4 {
	
	public static void main(String[] args) {
		
		if(FRUIT.APPLE == COMPANY.APPLE) {
			System.out.println("과일 애플과 기업 애플은 같습니다.");
		}
		
		int type = FRUIT.APPLE;
		switch (type) {
			case FRUIT.APPLE:
				System.out.println(57 + "kcal");
				break;
			case FRUIT.PEACH:
				System.out.println(34 + "kcal");
				break;
			case FRUIT.BANANA:
				System.out.println(93 + "kcal");
				break;
		}
	}
}

interface FRUIT {
	int APPLE = 1, PEACH = 2, BANANA = 3;
}

interface COMPANY {
	int GOGGLE = 1, APPLE = 2, ORACLE = 3;
}

