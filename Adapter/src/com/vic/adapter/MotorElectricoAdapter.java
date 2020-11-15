package com.vic.adapter;

import com.vic.adapty.MotorElectrico;
import com.vic.target.Motor;

public class MotorElectricoAdapter extends Motor {

	private MotorElectrico motorElectrico;
	
	public MotorElectricoAdapter() {
		super();
		System.out.println("Creando el motor electrico adapter");
		this.motorElectrico=new MotorElectrico();
	}

	@Override
	public void encender() {
		System.out.println("Encendiendo el motor electrico adapter.");
		this.motorElectrico.conectar();
		this.motorElectrico.activar();
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando el motor electrico adapter.");
		this.motorElectrico.moverMasRapido();
		
	}

	@Override
	public void apagar() {
		System.out.println("Apagando el motor electrico adapter.");
		this.motorElectrico.detener();
		this.motorElectrico.desconectar();		
	}

}
