package com.vic.model;


public class Conexion {

	//clave
	private static Conexion instancia;
	
	//clave
	private Conexion() {
		
	}
	
	public static Conexion getConexion() {
		if (instancia ==null) {
			instancia=new Conexion();
		}
		
		return instancia;
	}
	
	public void conectar() {
		System.out.println("Me conecte a la base de datos");
	}
	
	public void desconectar() {
		System.out.println("Me desconecte a la base de datos");
	}
}
