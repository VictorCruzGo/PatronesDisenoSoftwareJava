package com.vic.interface_segregation;

public class Boss implements IWork {

	@Override
	public void work() {
		System.out.println("Boss trabajando...");
	}

	@Override
	public void signWork() {
		System.out.println("Boss trabajando...");
	}

}
