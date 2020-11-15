package com.vic.fabrica.bd.implementacion;

import com.vic.fabrica.bd.interfaz.IConexionBD;

public class ConexionBDSqlServer implements IConexionBD {

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	public ConexionBDSqlServer() {
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
