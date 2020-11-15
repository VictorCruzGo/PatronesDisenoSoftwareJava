package com.vic.app.observer;

import com.vic.app.observable.Subject;

public class PesoArgObserver extends Observer{

	private double valorCambio=1000;
	
	public PesoArgObserver() {
	
	}
	
	//El objeto se suscribirse a un observable
	public PesoArgObserver(Subject sujeto) {
		this.sujeto=sujeto;
		this.sujeto.agregar(this);
	}
	
	@Override
	public void actualizar() {		
		System.out.println("Peso Argentino: "+(sujeto.getEstado()*this.valorCambio));		
	}
}
