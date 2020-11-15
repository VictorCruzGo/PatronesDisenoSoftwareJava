package com.vic.receiber;

/*Objeto que implementa las funcionalidades que deseamos implementar en el concrete command*/
public class Puerta {
	public boolean conectar() {
		System.out.println("...Conectando al sistema de la puerta");
		System.out.println("Conexión al sistema de la puerta establecida.");
		return true;
	}

	public boolean desconectar() {
		System.out.println("...Desconectando del sistema de la puerta");
		System.out.println("Se ha desconectado del sistema de la puerta.");
		return true;
	}

	public boolean abrir() {
		System.out.println("...Abriendo la puerta");
		System.out.println("puerta abierta.");
		return true;
	}

	public boolean cerrar() {
		System.out.println("...Cerrando la puerta");
		System.out.println("puerta cerrada.");
		return true;
	}

}
