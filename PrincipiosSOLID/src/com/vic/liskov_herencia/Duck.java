package com.vic.liskov_herencia;

public class Duck extends AFlyingBird {

	public Duck(String eat, String sound) {
		super(eat, sound);
	}

	@Override
	public void fly() {
		System.out.println("Soy Duck y puedo volar...");
	}
	
}
