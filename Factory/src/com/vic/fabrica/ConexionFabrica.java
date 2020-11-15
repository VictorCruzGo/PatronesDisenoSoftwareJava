package com.vic.fabrica;

import com.vic.interfaz.IConexion;
import com.vic.interfaz.implementacion.ConexionMysql;
import com.vic.interfaz.implementacion.ConexionOracle;
import com.vic.interfaz.implementacion.ConexionSqlServer;
import com.vic.interfaz.implementacion.ConexionVacia;

public class ConexionFabrica {
	
	public IConexion getConexion(String motor) {
		switch (motor) {
		case "MYSQL":
			return new ConexionMysql();			
		case "ORACLE":
			return new ConexionOracle();
		case "SQLSERVER":
			return new ConexionSqlServer();
		default:
			return new ConexionVacia();	
		}
	}

}
