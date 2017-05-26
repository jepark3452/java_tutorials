package com.jepark.generic;

/**
 * StudentPerson과 EmployeePerson은 사실상 똑같은 메커니즘을 갖는 코드이다.(중복의 발생)
 * 공통적인 코드로 중복을 제거, 극복
 * 
 * @author jepark
 */
/*public class Code2 {
	public static void main(String[] args) {
		StudentInfo si = new StudentInfo(2);
		StudentPerson sp = new StudentPerson(si);
		System.out.println(sp.info.grade);	// 2
		
		EmployeeInfo ei = new EmployeeInfo(1);
		EmplyeePerson ep = new EmplyeePerson(ei);
		System.out.println(ep.info.rank);	// 1
	}
}

class StudentInfo{
	public int grade;
	
	StudentInfo(int grade) {
		this.grade = grade;
	}
}

class StudentPerson {
	public StudentInfo info;
	
	StudentPerson(StudentInfo info) {
		this.info = info;
	}
}

class EmployeeInfo {
	public int rank;
	
	EmployeeInfo(int rank) {
		this.rank = rank;
	}
}

class EmplyeePerson {
	public EmployeeInfo info;
	
	EmplyeePerson(EmployeeInfo info) {
		this.info = info;
	}
}
*/

