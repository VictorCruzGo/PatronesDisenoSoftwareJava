package com.vic.app;

import com.vic.dao.ICrud;
import com.vic.dao.PersonaDaoImpl;
import com.vic.model.Persona;

public class App {

	public static void main(String[] args) {
		// IPersonaDao dao=new PersonaDaoImpl();//Orientado a interfaces para desacoplar
		// el codigo
		// IMedicoDao dao=new MedicoDaoImpl();

		ICrud<Persona> dao = new PersonaDaoImpl();
		// ICrud<Medico> dao=new MedicoDaoImpl();
		dao.listarTodos().forEach(x -> System.out.println(x.getNombres()));

		Persona per = new Persona();
		per.setId(10);
		per.setNombres("Hector");

		dao.registrar(per);
	}
}
