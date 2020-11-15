package com.vic;

import com.vic.fabrica.ConexionFabrica;
import com.vic.interfaz.IConexion;

public class App {
	public static void main(String args[]) {
		ConexionFabrica fabrica=new ConexionFabrica();
		
		IConexion cx1=fabrica.getConexion("ORACLE");
		cx1.conectar();
		cx1.desconectar();
		
		IConexion cx2=fabrica.getConexion("MYSQL");
		cx2.conectar();
		cx2.desconectar();
		
		IConexion cx3=fabrica.getConexion("SQLSERVER");
		cx3.conectar();
		cx3.desconectar();
		
		IConexion cx4=fabrica.getConexion("");
		cx4.conectar();
		cx4.desconectar();
	}
}
