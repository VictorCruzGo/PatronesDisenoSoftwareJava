package com.vic.adapty;

public class MotorElectrico {

	private boolean conectado=false;
	
	public MotorElectrico() {
		System.out.println("Creando el motor electrico...");
		this.conectado=false;
	}
	
	public void conectar() {
		System.out.println("Conectando al motor electrico...");
		this.conectado=true;
	}
	
	public void activar() {
		if (!this.conectado) {
			System.out.println("No se puede activar por que no esta conectado al motor electrico");
		}else {
			System.out.println("Esta activado, activando el motor electrico");
		}
	}
	
	public void moverMasRapido() {
		if(!this.conectado) {
			System.out.println("No se puede mover rapido el motor electrico porque no esta conectado.");
		}else {
			System.out.println("Moviendo mas rapido, aumentando voltaje del motor electrico.");
		}
	}
	
	public void detener() {	
		System.out.println("Deteniendo el motor electrico.");
	}
	
	public void desconectar() {	
		System.out.println("Desconectando el motor electrico.");
	}
}
