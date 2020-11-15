package com.vic.dao;

import java.util.List;

import com.vic.model.Gente;
import com.vic.model.Medico;

public interface ICrud<T> {
	//Metodos comunes
	List<T> listarTodos();
	T leerPorId(int id);
	void registrar(T t);
	void actualizar(T t);
	void eliminar(int id);
}
