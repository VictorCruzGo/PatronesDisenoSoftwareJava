package com.vic.dao;

import com.vic.model.Persona;

public interface IPersonaDao extends ICrud<Persona> {
//	List<Persona> listarTodos();
//	Persona leerPorId(int id);
//	void registrar(Persona persona);
//	void actualizar(Persona persona);
//	void eliminar(int id);
	
	void mostrarNombre();
	public void setConexion(IConexion conexion);
}
