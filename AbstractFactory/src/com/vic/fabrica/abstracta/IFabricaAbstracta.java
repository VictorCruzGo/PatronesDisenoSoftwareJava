package com.vic.fabrica.abstracta;

import com.vic.fabrica.bd.interfaz.IConexionBD;
import com.vic.fabrica.rest.interfaz.IConexionREST;

public interface IFabricaAbstracta {
	IConexionBD getBD(String motor);
	IConexionREST getREST(String area);
}
