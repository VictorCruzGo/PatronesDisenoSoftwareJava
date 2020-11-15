package com.vic.receiber;

/*Objeto que implementa las funcionalidades que deseamos implementar en el concrete command*/
public class Luces {
	public boolean conectar() {
		System.out.println("...Conectando al sistema de iluminación");
		System.out.println("Conexión al sistema de iluminación establecida.");
		return true;
	}

	public boolean desconectar() {
		System.out.println("...Desconectando del sistema de iluminación");
		System.out.println("Se ha desconectado del sistema de iluminación.");
		return true;
	}

	public boolean encender() {
		System.out.println("...Encendiendo el sistema de iluminación");
		System.out.println("Sistema de iluminación encendido.");
		return true;
	}

	public boolean apagar() {
		System.out.println("...Apagando el sistema de iluminación");
		System.out.println("Sistema de iluminación apagado.");
		return true;
	}	
}
