package com.vic.liskov_herencia;

public abstract class AFlyingBird extends ABird{

	public AFlyingBird(String eat, String sound) {
		super(eat, sound);
	}
	
	public abstract void fly();
	
}
