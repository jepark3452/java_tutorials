package com.jepark.generic;

/**
 * 복수의 제네릭
 * @author jepark
 */
public class Code4 {
	public static void main(String[] args) {
		EmployeeInfo ei = new EmployeeInfo(1);
		Integer id = new Integer(10);
		
		Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(ei, id);
		System.out.println(p1.id.intValue());		// wrapper 클래스가 담고 있는 원시데이터타입 값을 돌려준다.
		System.out.println(p1.info.rank);
		
		// Generic 생략이 가능, JAVA가 추측
		Person p2 = new Person(ei, id);
		System.out.println(((Integer) p2.id).intValue());		
		System.out.println(((EmployeeInfo) p2.info).rank);
		
		p2.<EmployeeInfo>printInfo(ei);
		p2.printInfo(ei);
	}
}

class EmployeeInfo {
	public int rank;
	
	EmployeeInfo(int rank) {
		this.rank = rank;
	}
}

/**
 * 제네릭에는 기본데이터 타입(int, char...)는 올 수 없고, 참조(Reference)형 만 올 수 있다.
 * wrapper 클래스로 기본데이터 타입을 감싸준다.
 * @author jepark
 *
 * @param <T>
 * @param <S>
 */
class Person<T, S> {
	public T info;
	public S id;
	
	Person(T info, S id) {
		this.info = info;
		this.id = id;
	}
	
	/**
	 * Method level에서 Generic 사용
	 * @param Info
	 */
	public <U> void printInfo(U info) {
		System.out.println(info);
	}
}


