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
		// Set 은 중복을 데이터 중복은 허용하지 않고, 순서를 저장하지 않는다.
		Iterator<Integer> hi = a.iterator();
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}
		System.out.println("LIST ----");
		// List 는 중복을 허용하고, 순서를 저장한다.
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
		
		//a.addAll(b);	// a와 b를 합쳐서 a로 만든다.(합집합)
		//a.retainAll(b);	// retain 간직하다, a에도 있고 b에도 있는 원소 값들만 a에다가 담겠다.(교집합)
		a.removeAll(b);	// a에서 b를 뺀 차집합
		
		Iterator<Integer> hi1 = a.iterator();
		while(hi1.hasNext()) {
			System.out.println(hi1.next());
		}
	}
}
