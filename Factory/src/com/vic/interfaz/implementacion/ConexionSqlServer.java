package com.vic.interfaz.implementacion;

import com.vic.interfaz.IConexion;

public class ConexionSqlServer implements IConexion {

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	public ConexionSqlServer() {
		this.host="localhost";
		this.puerto="123";
		this.usuario="postgres";
		this.contrasena="abc";
	}
	
	@Override
	public void conectar() {
		System.out.println("Me he conectado desde SqlServer");
		
	}

	@Override
	public void desconectar() {
		System.out.println("Me desconecte de SqlServer");
		
	}

}
