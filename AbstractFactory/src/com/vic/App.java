package com.vic;

import com.vic.fabrica.abstracta.IFabricaAbstracta;
import com.vic.fabrica.bd.interfaz.IConexionBD;
import com.vic.fabrica.productor.FabricaProductor;
import com.vic.fabrica.rest.interfaz.IConexionREST;

public class App {
	public static void main(String args[]) {
		IFabricaAbstracta fabricaBD=FabricaProductor.getFactory("BD");
		IConexionBD cxBD1=fabricaBD.getBD("MYSQL"); 
		cxBD1.conectar();
		cxBD1.desconectar();
		
		IFabricaAbstracta fabricaREST=FabricaProductor.getFactory("REST");
		IConexionREST cxREST1=fabricaREST.getREST("VENTAS");
		cxREST1.leerURL("http://yoututbe.com");
	}
}
