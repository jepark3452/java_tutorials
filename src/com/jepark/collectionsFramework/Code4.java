package com.jepark.collectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Code4 {
	
	public static void main(String[] args) {
		List<Computer> computers = new ArrayList<>();
		computers.add(new Computer(500, "egoing"));
		computers.add(new Computer(200, "leezche"));
		computers.add(new Computer(3233, "graphittie"));
		Iterator<Computer> iter = computers.iterator();
		System.out.println("before");
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		Collections.sort(computers);
		System.out.println("\nafter");
		iter = computers.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		String a = "a";
		String b = "b";
		System.out.println(a.compareTo(b));
		
		
		Integer one = new Integer(1);
		Integer two = new Integer(55);
		System.out.println(one.compareTo(two));
	}
	
}

class Computer implements Comparable<Computer> {
	
	int serial;
	String owner;
	
	Computer(int serial, String owner) {
		this.serial = serial;
		this.owner = owner;
	}
	
	@Override
	public int compareTo(Computer computer) {
		return this.serial - computer.serial;
	}
	
	public String toString() {
		return serial + " " + owner;
	}
}