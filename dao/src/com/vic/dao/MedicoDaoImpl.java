package com.vic.dao;

import java.util.ArrayList;
import java.util.List;

import com.vic.model.Medico;
import com.vic.model.Medico;

public class MedicoDaoImpl implements IMedicoDao {

	//Metodos o comportamientos de la clase Medico
	@Override
	public List<Medico> listarTodos() {
		List<Medico> lista=new ArrayList<>();
		Medico p1=new Medico();
		p1.setId(1);
		p1.setNombres("Victor");
		
		Medico p2=new Medico();
		p2.setId(2);
		p2.setNombres("Grace");
		
		lista.add(p1);
		lista.add(p2);
		
		return lista;
	}

	@Override
	public Medico leerPorId(int id) {
		Medico p1=new Medico();
		p1.setId(3);
		p1.setNombres("jhon");
						
		return p1;
	}

	@Override
	public void registrar(Medico medico) {
		System.out.println("Medico "+medico.getNombres()+ " registrada");
		
	}

	@Override
	public void actualizar(Medico medico) {
		System.out.println("Medico "+medico.getNombres()+ " actualizada");		
	}

	@Override
	public void eliminar(int id) {
		System.out.println("Id "+id+" eliminado");
	}

	@Override
	public void curar() {
		System.out.println("El medico esta curando.");		
	}



}
