package com.vic.dao;

import java.util.ArrayList;
import java.util.List;

import com.vic.model.Medico;
import com.vic.model.Persona;

public class PersonaDaoImpl implements IPersonaDao {

	//Metodos o comportamientos de la clase Persona
	@Override
	public List<Persona> listarTodos() {
		List<Persona> lista=new ArrayList<>();
		Persona p1=new Persona();
		p1.setId(1);
		p1.setNombres("Victor");
		
		Persona p2=new Persona();
		p2.setId(2);
		p2.setNombres("Grace");
		
		lista.add(p1);
		lista.add(p2);
		
		return lista;
	}

	@Override
	public Persona leerPorId(int id) {
		Persona p1=new Persona();
		p1.setId(3);
		p1.setNombres("jhon");
						
		return p1;
	}

	@Override
	public void registrar(Persona persona) {
		System.out.println("Persona "+persona.getNombres()+ " registrada");
		
	}

	@Override
	public void actualizar(Persona persona) {
		System.out.println("Persona "+persona.getNombres()+ " actualizada");		
	}

	@Override
	public void eliminar(int id) {
		System.out.println("Id "+id+" eliminado");
	}


	@Override
	public void mostrarNombre() {
		System.out.println("El nombre es...");
	}

}
