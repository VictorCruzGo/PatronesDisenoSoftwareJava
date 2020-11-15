package com.vic.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.vic.model.dao.IPersonaDao;
import com.vic.model.dao.PersonaDaoImpl;
import com.vic.model.model.Persona;

@Named
@ViewScoped
//Se comunica con el modelo
public class PersonaController implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<Persona> lista;
	private PersonaDaoImpl dao;
		
	public PersonaController() {
		System.out.println("constructor personaController");
		lista=new ArrayList<Persona>();
		dao=new PersonaDaoImpl();
		this.listar();
	}
	
	public void listar() {
		System.out.println("a");
		lista=dao.listar();
		lista.forEach(x-> System.out.println(x.getNombre()));
		System.out.println("b");
	}

	public List<Persona> getLista() {
		System.out.println("tamano de la lista es "+lista.size());
		return lista;
	}

	public void setLista(List<Persona> lista) {
		this.lista = lista;
	}

	public IPersonaDao getDao() {
		return dao;
	}

	public void setDao(PersonaDaoImpl dao) {
		this.dao = dao;
	}

	

}
