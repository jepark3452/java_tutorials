package com.jepark.generic;

/**
 * StudentPerson과 EmployeePerson은 사실상 똑같은 메커니즘을 갖는 코드이다.(중복의 발생)
 * 공통적인 코드로 중복을 제거, 극복
 * @author jepark
 */
/*public class Code3 {
	public static void main(String[] args) {
		StudentInfo si = new StudentInfo(2);
		StudentPerson sp = new StudentPerson(si);
		System.out.println(sp.info.grade);	// 2
		
		EmployeeInfo ei = new EmployeeInfo(1);
		EmplyeePerson ep = new EmplyeePerson(ei);
		System.out.println(ep.info.rank);	// 1	
		
		Person p1 = new Person("부장");				// 잘못된 코드이지만, 오류가 발생하지 않고, 실행도 된다.
		EmployeeInfo ei = (EmployeeInfo) p1.info;	// 컴파일시점에서는 오류가 발생하지 않지만, 런타임할때 예외가 발생한다.
		System.out.println(ei.rank);				// 타입이 안전하지 않다.
		
	}
}

class StudentInfo{
	public int grade;
	
	StudentInfo(int grade) {
		this.grade = grade;
	}
}

class EmployeeInfo {
	public int rank;
	
	EmployeeInfo(int rank) {
		this.rank = rank;
	}
}

class Person {
	public Object info;
	
	Person(Object info) {
		this.info = info;
	}
}
*/
/*
class StudentPerson {
	public StudentInfo info;
	
	StudentPerson(StudentInfo info) {
		this.info = info;
	}
}

class EmplyeePerson {
	public EmployeeInfo info;
	
	EmplyeePerson(EmployeeInfo info) {
		this.info = info;
	}
}
*/