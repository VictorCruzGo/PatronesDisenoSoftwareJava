package com.vic.receiber;

/*Objeto que implementa las funcionalidades que deseamos implementar en el concrete command*/
public class Luces {
	public boolean conectar() {
		System.out.println("...Conectando al sistema de iluminaci�n");
		System.out.println("Conexi�n al sistema de iluminaci�n establecida.");
		return true;
	}

	public boolean desconectar() {
		System.out.println("...Desconectando del sistema de iluminaci�n");
		System.out.println("Se ha desconectado del sistema de iluminaci�n.");
		return true;
	}

	public boolean encender() {
		System.out.println("...Encendiendo el sistema de iluminaci�n");
		System.out.println("Sistema de iluminaci�n encendido.");
		return true;
	}

	public boolean apagar() {
		System.out.println("...Apagando el sistema de iluminaci�n");
		System.out.println("Sistema de iluminaci�n apagado.");
		return true;
	}	
}
