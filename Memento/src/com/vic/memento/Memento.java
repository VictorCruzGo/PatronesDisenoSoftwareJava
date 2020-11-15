package com.vic.memento;

//Memento = Recuerdo
public class Memento {
	private Juego estado;
	
	public Memento(Juego estado) {
		this.estado=estado;
	}
	
	public Juego getEstado() {
		return estado;
	}

	public void setEstado(Juego estado) {
		this.estado = estado;
	}	
}
