package com.vic.contexto;

import com.vic.strategy.IEstrategia;

public class Contexto {
	private IEstrategia estrategia;
	
	public Contexto(IEstrategia estrategia) {
		this.estrategia=estrategia;
	}
	
	public void ejecutar() {
		this.estrategia.analizar(); 
	}
}
