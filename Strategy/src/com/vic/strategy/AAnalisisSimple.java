package com.vic.strategy;

public abstract class AAnalisisSimple implements IEstrategia {

	@Override
	public void analizar() {
		iniciar();
		saltarZip();
		detener();		
	}
	
	abstract void iniciar();
	abstract void saltarZip();
	abstract void detener();
	
}
