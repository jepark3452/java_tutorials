package com.jepark.generic;

/**
 * ������ ���׸�
 * @author jepark
 */
public class Code4 {
	public static void main(String[] args) {
		EmployeeInfo ei = new EmployeeInfo(1);
		Integer id = new Integer(10);
		
		Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(ei, id);
		System.out.println(p1.id.intValue());		// wrapper Ŭ������ ��� �ִ� ���õ�����Ÿ�� ���� �����ش�.
		System.out.println(p1.info.rank);
		
		// Generic ������ ����, JAVA�� ����
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
 * ���׸����� �⺻������ Ÿ��(int, char...)�� �� �� ����, ����(Reference)�� �� �� �� �ִ�.
 * wrapper Ŭ������ �⺻������ Ÿ���� �����ش�.
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
	 * Method level���� Generic ���
	 * @param Info
	 */
	public <U> void printInfo(U info) {
		System.out.println(info);
	}
}


