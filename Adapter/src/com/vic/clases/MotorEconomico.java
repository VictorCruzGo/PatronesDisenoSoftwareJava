package com.vic.clases;

import com.vic.target.Motor;

public class MotorEconomico extends Motor {
	
	public MotorEconomico() {
		super();
		System.out.println("Creando motor economico...");
	}

	@Override
	public void encender() {
		System.out.println("Encendiendo el motor economico...");		
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando el motor economico...");		
	}

	@Override
	public void apagar() {
		System.out.println("Apagando el motor economico...");		
	}

}
