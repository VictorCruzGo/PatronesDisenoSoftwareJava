package com.vic.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.vic.model.model.Persona;

public class PersonaDaoImpl implements IPersonaDao {

	@Override
	public List<Persona> listar() {
		List<Persona> lista=new  ArrayList<>();
		//List<Persona> lista2=new  ArrayList<Persona>();
		//List<Persona> lista3=new  List<Persona>() {};
		Persona per1=new Persona();
		per1.setId(1);
		per1.setNombre("Victor Cruz Gomez");
		per1.setEdad(35);
		
		lista.add(per1);
				
		Persona per2=new Persona();
		per2.setId(1);
		per2.setNombre("Victor Cruz Gomez");
		per2.setEdad(35);
		
		lista.add(per2);
		
		return lista;
	}
}
