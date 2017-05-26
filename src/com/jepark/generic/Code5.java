package com.jepark.generic;

/**
 * 제네릭의 제한
 * @author jepark
 */
public class Code5 {
	public static void main(String[] args) {
		Person2 p1 = new Person2<EmployeeInfo2>(new EmployeeInfo2(1));
		//Person<String> p2 = new Person<String>("부정");
	}
}

interface Info {
	int getLevel();
}

class EmployeeInfo2 implements Info {
	public int rank;
	
	EmployeeInfo2(int rank) {
		this.rank = rank;
	}

	@Override
	public int getLevel() {
		System.out.println("this.rank: " + this.rank);
		return this.rank;
	}
}

/**
 * T는 Info 이거나, Info의 자식들만이 올 수 있다.
 * 부모는 interface나 추상클래스 클래스가 될 수 있다.
 * @author jepark
 *
 * @param <T>
 */
class Person2<T extends Info> {
	public T info;
	
	Person2(T info) {
		this.info = info;
		info.getLevel();
	}
}
