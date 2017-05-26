package com.jepark.generic;

/**
 * ���׸��� ����
 * @author jepark
 */
public class Code5 {
	public static void main(String[] args) {
		Person2 p1 = new Person2<EmployeeInfo2>(new EmployeeInfo2(1));
		//Person<String> p2 = new Person<String>("����");
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
 * T�� Info �̰ų�, Info�� �ڽĵ鸸�� �� �� �ִ�.
 * �θ�� interface�� �߻�Ŭ���� Ŭ������ �� �� �ִ�.
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
