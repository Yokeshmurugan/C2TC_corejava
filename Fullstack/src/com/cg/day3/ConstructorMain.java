package com.cg.day3;

public class ConstructorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id = 101;
		String name = "Yokesh";
		ConstructorMethod m = new ConstructorMethod(name,id);
		m.display();
		ConstructorMethod mv = new ConstructorMethod();
		mv.display();

	}
}
