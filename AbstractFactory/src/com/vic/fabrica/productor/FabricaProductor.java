package com.vic.fabrica.productor;

import com.vic.fabrica.abstracta.IFabricaAbstracta;
import com.vic.fabrica.bd.fabrica.ConexionBDfabrica;
import com.vic.fabrica.rest.fabrica.ConexionRESTfabrica;

public class FabricaProductor{
	public static IFabricaAbstracta getFactory(String fabrica) {
		switch (fabrica) {
		case "BD":
			return new ConexionBDfabrica();			
		case "REST":
			return new ConexionRESTfabrica();
		default:
			return null;	
		}
	}	
}
