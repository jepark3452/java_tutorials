package com.jepark.enums;

/**
 * ����� ������ �ʴ� ���̴�.
 * ���� ���α׷����� �ڱ��ڽ��� �����ϴ� ���̴�.
 * ��� - enum
 * enum�� �������̶�� �θ���. �������� ���� ������ ������� �����̶�� �� �� �ִ�.
 * enum ���� Ŭ����
 * �ڵ尡 �ſ� �ܼ��� ����.
 * �ν��Ͻ� ������ ����� �����Ѵ�.
 * Ű���� enum�� ����ϱ� ������ ������ �ǵ��� �������� �и��ϰ� ��Ÿ�� �� �ִ�.
 * �������� ������ ��������� �����Ѵ�. �� �� ������ ������� �ʵ��� �����Ѵ�.
 * �Ӹ� �ƴ϶� ������ ��ü�� Ŭ�����̱� ������ ������ ���ο� ������, �ʵ�, �޼ҵ带 ���� �� �־ �ܼ��� ����� �ƴ϶� �� ���� ������ �� �� �ִ�.
 * @author jepark
 *
 */
public class Code6 {
	
	public static void main(String[] args) {
		Fruits type = Fruits.APPLE;
		switch(type) {
			case APPLE:
				System.out.println(57 + "kcal, color " + Fruits.APPLE.getColor());
				break;
			case PEACH:
				System.out.println(34 + "kcal, color " + Fruits.PEACH.getColor());
				break;
			case BANANA:
				System.out.println(93 + "kcal, color " + Fruits.BANANA.getColor());
				break;
		}
		System.out.println("======");
		for(Fruits f : Fruits.values()) {
			System.out.println(f);
		}		
	}
}

enum Fruits {
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	/*
	// ���� ���� �ڵ�
	public static final Fruits APPLE = new Fruits();
	public static final Fruits PEACH = new Fruits();
	public static final Fruits BANANA = new Fruits();
	*/
	
	private String color;
	public String getColor() {
		return this.color;
	}
	//enum�� ������
	Fruits(String color) {
		System.out.println("Call Constructor " + this);
		this.color = color;
	}
}

enum Companys {
	GOGGLE, APPLE, ORACLE
	/*
	// ���� ���� �ڵ�
	public static final Companys GOGGLE = new Companys();
	public static final Companys APPLE = new Companys();
	public static final Companys ORACLE = new Companys();
	*/
}



