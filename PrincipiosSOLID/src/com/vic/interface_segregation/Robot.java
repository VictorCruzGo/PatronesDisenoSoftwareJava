package com.vic.interface_segregation;

public class Robot implements IWorker {

	@Override
	public void work() {
		System.out.println("Robot trabajando...");		
	}
}
