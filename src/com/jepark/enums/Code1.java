package com.jepark.enums;

/**
 * ����� ������ �ʴ� ���̴�.
 * ��� - enum
 * @author jepark
 *
 */
public class Code1 {
	
	public static void main(String[] args) {
		/*
		 * 1. ���
		 * 2. ������
		 * 3. �ٳ���
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