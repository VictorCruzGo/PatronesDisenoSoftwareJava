package com.vic.fabrica.rest.implementacion;

import com.vic.fabrica.rest.interfaz.IConexionREST;

public class ConexionRESTventas implements IConexionREST {

	@Override
	public void leerURL(String url) {
		System.out.println("Conectandose a :"+url);
		
	}

}
