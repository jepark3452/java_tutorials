package com.jepark.collectionsFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Code2 {
	
	public static void main(String[] args) {
		Set<Integer> a = new HashSet<>();
		a.add(1);
		a.add(2);
		a.add(2);
		a.add(2);
		a.add(2);
		a.add(3);
		
		List<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(2);
		al.add(2);
		al.add(2);
		al.add(3);
		
		System.out.println("SET ----");
		// Set �� �ߺ��� ������ �ߺ��� ������� �ʰ�, ������ �������� �ʴ´�.
		Iterator<Integer> hi = a.iterator();
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}
		System.out.println("LIST ----");
		// List �� �ߺ��� ����ϰ�, ������ �����Ѵ�.
		Iterator<Integer> hl = al.iterator();
		while(hl.hasNext()) {
			System.out.println(hl.next());
		}
		
		
		HashSet<Integer> b = new HashSet<>();
		b.add(3);
		b.add(4);
		b.add(5);
		
		HashSet<Integer> c= new HashSet<>();
		c.add(1);
		c.add(2);
		
		System.out.println(a.containsAll(b));	// false
		System.out.println(a.containsAll(c));	// true
		
		//a.addAll(b);	// a�� b�� ���ļ� a�� �����.(������)
		//a.retainAll(b);	// retain �����ϴ�, a���� �ְ� b���� �ִ� ���� ���鸸 a���ٰ� ��ڴ�.(������)
		a.removeAll(b);	// a���� b�� �� ������
		
		Iterator<Integer> hi1 = a.iterator();
		while(hi1.hasNext()) {
			System.out.println(hi1.next());
		}
	}
}
