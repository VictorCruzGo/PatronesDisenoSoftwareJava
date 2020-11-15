package com.vic.fabrica.rest.fabrica;

import com.vic.fabrica.abstracta.IFabricaAbstracta;
import com.vic.fabrica.bd.interfaz.IConexionBD;
import com.vic.fabrica.rest.implementacion.ConexionRESTcompras;
import com.vic.fabrica.rest.implementacion.ConexionRESTnoarea;
import com.vic.fabrica.rest.implementacion.ConexionRESTventas;
import com.vic.fabrica.rest.interfaz.IConexionREST;

public class ConexionRESTfabrica implements IFabricaAbstracta {

	@Override
	public IConexionBD getBD(String motor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IConexionREST getREST(String area) {
		switch (area) {
		case "COMPRAS":
			return new ConexionRESTcompras();			
		case "VENTAS":
			return new ConexionRESTventas();
		default:
			return new ConexionRESTnoarea();	
		}
	}

}
