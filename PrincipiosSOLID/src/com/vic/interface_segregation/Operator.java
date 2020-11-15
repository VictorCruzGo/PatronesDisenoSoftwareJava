package com.vic.interface_segregation;

public class Operator implements IWork {

	@Override
	public void work() {
		System.out.println("Operador trabajando...");
	}

	@Override
	public void signWork() {
		System.out.println("Operador firmando trabajo");
	}

}
