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
	private IPersonaDao dao;
	
	public PersonaController() {
		lista=new ArrayList<Persona>();
		dao=new PersonaDaoImpl();
	}
	
	public void listar() {
		lista=dao.listar();
	}

	public List<Persona> getLista() {
		return lista;
	}

	public void setLista(List<Persona> lista) {
		this.lista = lista;
	}

	public IPersonaDao getDao() {
		return dao;
	}

	public void setDao(IPersonaDao dao) {
		this.dao = dao;
	}
	

}
