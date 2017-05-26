package com.jepark.enums;

/**
 * 상수는 변하지 않는 값이다.
 * 좋은 프로그래밍은 자기자신을 견제하는 것이다.
 * 상수 - enum
 * enum은 열거형이라고 부른다. 열거형은 서로 연관된 상수들의 집합이라고 할 수 있다.
 * enum 또한 클래스
 * 코드가 매우 단순해 진다.
 * 인스턴스 생성과 상속을 방지한다.
 * 키워드 enum을 사용하기 때문에 구현의 의도가 열거임을 분명하게 나타낼 수 있다.
 * 열거형은 연관된 상수값들을 저장한다. 또 그 값들이 변경되지 않도록 보장한다.
 * 뿐만 아니라 열거형 자체가 클래스이기 때문에 열거형 내부에 생성자, 필드, 메소드를 가질 수 있어서 단순히 상수가 아니라 더 많은 역할을 할 수 있다.
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
	// 위와 같은 코드
	public static final Fruits APPLE = new Fruits();
	public static final Fruits PEACH = new Fruits();
	public static final Fruits BANANA = new Fruits();
	*/
	
	private String color;
	public String getColor() {
		return this.color;
	}
	//enum의 생성자
	Fruits(String color) {
		System.out.println("Call Constructor " + this);
		this.color = color;
	}
}

enum Companys {
	GOGGLE, APPLE, ORACLE
	/*
	// 위와 같은 코드
	public static final Companys GOGGLE = new Companys();
	public static final Companys APPLE = new Companys();
	public static final Companys ORACLE = new Companys();
	*/
}



