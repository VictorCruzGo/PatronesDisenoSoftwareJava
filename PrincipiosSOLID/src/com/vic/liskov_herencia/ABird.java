package com.vic.liskov_herencia;

public abstract class ABird {
	private String eat;
	private String sound;
	
	public ABird(String eat, String sound) {
		this.eat = eat;
		this.sound = sound;
	}

	public void eat() {
		System.out.println("Comiendo "+this.eat);
	}
	
	public void sound() {
		System.out.println("Sound "+this.sound);
	}
	
	public String getEat() {
		return eat;
	}

	public void setEat(String eat) {
		this.eat = eat;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
	
	
}
