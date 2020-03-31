package com.programs;

import java.util.TreeSet;

class A{
	void show() {System.out.println("A");}
}

class B extends A{
	void show() {System.out.println("b");}
}

public class TestCovasis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int data = 25/0;
		}
		finally {
			System.out.println("hello");
		}
		

	}
	
	

}
