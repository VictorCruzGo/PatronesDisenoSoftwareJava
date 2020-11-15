package com.vic.app.observer;

import com.vic.app.observable.Subject;

public class PesoPerObserver extends Observer {

	private double valorCambio=3.40;
	
	public PesoPerObserver() {
	
	}
	
	public PesoPerObserver(Subject sujeto) {
		this.sujeto=sujeto;
		this.sujeto.agregar(this);
	}
	
	@Override
	public void actualizar() {
		System.out.println("Peso Peruano: "+(sujeto.getEstado()*this.valorCambio));		
	}

}
