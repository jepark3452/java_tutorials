package com.jepark.enums;

/**
 * ����� ������ �ʴ� ���̴�.
 * ���� ���α׷����� �ڱ��ڽ��� �����ϴ� ���̴�.
 * ��� - enum
 * @author jepark
 *
 */
public class Code4 {
	
	public static void main(String[] args) {
		
		if(FRUIT.APPLE == COMPANY.APPLE) {
			System.out.println("���� ���ð� ��� ������ �����ϴ�.");
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

