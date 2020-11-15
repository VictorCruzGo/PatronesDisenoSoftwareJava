package com.vic.liskov_herencia;

public class Eagle extends AFlyingBird {

	public Eagle(String eat, String sound) {
		super(eat, sound);
	}

	@Override
	public void fly() {
		System.out.println("Soy Eagle y puedo volar...");		
	}
}
