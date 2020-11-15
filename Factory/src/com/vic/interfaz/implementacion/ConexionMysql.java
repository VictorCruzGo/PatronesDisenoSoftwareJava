package com.vic.interfaz.implementacion;

import com.vic.interfaz.IConexion;

public class ConexionMysql implements IConexion {
	
	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	public ConexionMysql() {
		this.host="localhost";
		this.puerto="123";
		this.usuario="postgres";
		this.contrasena="abc";
	}

	@Override
	public void conectar() {
		System.out.println("Me he conectado desde Mysql");
		
	}

	@Override
	public void desconectar() {
		System.out.println("Me desconecte de Mysql");
		
	}

}
