package com.vic.strategy;

public abstract class AAnalisisAvanzado implements IEstrategia {

	@Override
	public void analizar() {
		iniciar();
		analizarMemoria();
		analizarKeyLogger();
		analizarRootKits();
		descomprimirZip();
		detener();
	}

	protected abstract void detener();

	protected abstract void descomprimirZip();

	protected abstract void analizarRootKits();

	protected abstract void analizarKeyLogger();

	protected abstract void analizarMemoria();
	
	protected abstract void iniciar();

	
}
