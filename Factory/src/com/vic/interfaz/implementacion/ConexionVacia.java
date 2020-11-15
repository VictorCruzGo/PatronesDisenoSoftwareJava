package com.vic.interfaz.implementacion;

import com.vic.interfaz.IConexion;

public class ConexionVacia implements IConexion {

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	public ConexionVacia() {
		this.host="localhost";
		this.puerto="123";
		this.usuario="postgres";
		this.contrasena="abc";
	}
	
	@Override
	public void conectar() {
		System.out.println("No puede conectarme");
		
	}

	@Override
	public void desconectar() {
		System.out.println("No puede desconectarme");
		
	}

}
