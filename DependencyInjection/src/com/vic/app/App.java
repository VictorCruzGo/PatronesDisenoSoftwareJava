package com.vic.app;

import com.vic.dao.ConexionMysql;
import com.vic.dao.ConexionPostgres;
import com.vic.dao.IConexion;
import com.vic.dao.IPersonaDao;
import com.vic.dao.PersonaDaoImpl;

public class App {

	public static void main(String[] args) {
		IConexion cx1=new ConexionMysql("mitocode","123","localhost");
		IConexion cx2=new ConexionPostgres("mitocode2","456","localhost");
		
		System.out.println("---Conexion a Postgres---");
		IPersonaDao dao = new PersonaDaoImpl(cx2);//inyeccion por contructor				
		dao.listarTodos().forEach(x -> System.out.println(x.getNombres()));
		
		System.out.println("---Conexion a Mysql---");
		IPersonaDao dao2 = new PersonaDaoImpl();
		dao2.setConexion(cx1);//inyeccion por metodo
		dao2.listarTodos().forEach(x -> System.out.println(x.getNombres()));		
	}
}
