package com.vic.app.observer;

import com.vic.app.observable.Subject;

public class SoloObserver extends Observer {

	private double valorCambio=6.96;
	
	public SoloObserver() {
	
	}
	
	public SoloObserver(Subject sujeto) {
		this.sujeto=sujeto;
		this.sujeto.agregar(this);
	}
	
	@Override
	public void actualizar() {
		System.out.println("Peso Boliviano: "+(sujeto.getEstado()*this.valorCambio));		
	}
}
