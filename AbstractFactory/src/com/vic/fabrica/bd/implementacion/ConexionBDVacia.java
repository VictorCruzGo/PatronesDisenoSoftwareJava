package com.vic.fabrica.bd.implementacion;

import com.vic.fabrica.bd.interfaz.IConexionBD;

public class ConexionBDVacia implements IConexionBD {

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	public ConexionBDVacia() {
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
