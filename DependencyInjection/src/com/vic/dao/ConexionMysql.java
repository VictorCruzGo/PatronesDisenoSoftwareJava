package com.vic.dao;

public class ConexionMysql implements IConexion {
	private String usuario;
	private String contrasena;
	private String servidor;

	public ConexionMysql(String usuario, String contrasena, String servidor) {
		this.usuario=usuario;
		this.contrasena=contrasena;
		this.servidor=servidor;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getServidor() {
		return servidor;
	}

	public void setServidor(String servidor) {
		this.servidor = servidor;
	}

	@Override
	public void conectar() {
		System.out.println("Conectando a Mysql");
	}
}
