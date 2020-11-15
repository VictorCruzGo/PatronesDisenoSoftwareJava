package com.vic.app.observable;

import java.util.ArrayList;
import java.util.List;

import com.vic.app.observer.Observer;

/*
El subjecto o observable tiene la funcion de:
	-Agregrar a los observers
	-Notificar los cambios a los observers
*/
public class Subject {
	private List<Observer> observadores=new ArrayList<Observer>();
	private int estado;
	
	public int getEstado() {
		return estado;
	}
	
	public void setEstado(int estado) {
		this.estado=estado;
		notificarTodoObservadores();
	}
	
	//Notifica el cambio a todos los observer
	private void notificarTodoObservadores() {
		observadores.forEach(x->x.actualizar());		
	}

	public void agregar(Observer observador) {
		observadores.add(observador);
	}
	
}
