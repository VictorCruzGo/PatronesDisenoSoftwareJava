package com.vic.clases;

import com.vic.target.Motor;

public class MotorComun extends Motor {

	public MotorComun() {
		super();
		System.out.println("Creando el motor comun");
	}

	@Override
	public void encender() {
		System.out.println("Encendiendo el motor comun...");		
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando el motor comun...");		
	}

	@Override
	public void apagar() {
		System.out.println("Apagando el motor comun...");		
	}

}
