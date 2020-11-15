package com.vic.fabrica.bd.fabrica;

import com.vic.fabrica.abstracta.IFabricaAbstracta;
import com.vic.fabrica.bd.implementacion.ConexionBDMysql;
import com.vic.fabrica.bd.implementacion.ConexionBDOracle;
import com.vic.fabrica.bd.implementacion.ConexionBDSqlServer;
import com.vic.fabrica.bd.implementacion.ConexionBDVacia;
import com.vic.fabrica.bd.interfaz.IConexionBD;
import com.vic.fabrica.rest.interfaz.IConexionREST;

public class ConexionBDfabrica implements IFabricaAbstracta {	

	@Override
	public IConexionBD getBD(String motor) {
		switch (motor) {
		case "MYSQL":
			return new ConexionBDMysql();			
		case "ORACLE":
			return new ConexionBDOracle();
		case "SQLSERVER":
			return new ConexionBDSqlServer();
		default:
			return new ConexionBDVacia();	
		}
	}

	@Override
	public IConexionREST getREST(String area) {
		// TODO Auto-generated method stub
		return null;
	}

}
