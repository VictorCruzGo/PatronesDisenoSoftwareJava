package com.vic.dao;

import com.vic.model.Medico;

public interface IMedicoDao extends ICrud<Medico> {
//	List<Medico> listarTodos();
//	Medico leerPorId(int id);
//	void registrar(Medico medico);
//	void actualizar(Medico medico);
//	void eliminar(int id);
	
	void curar();
}
