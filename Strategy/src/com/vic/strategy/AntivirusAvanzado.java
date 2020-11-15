package com.vic.strategy;

public class AntivirusAvanzado extends AAnalisisAvanzado {

	@Override
	protected void iniciar() {
		System.out.println("Antivirus avanzado - Analisis avanzado iniciado");
	}
	

	@Override
	protected void analizarRootKits() {
		try {
			System.out.println("Analizando rootkits...");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	@Override
	protected void analizarKeyLogger() {
		try {
			System.out.println("Analizando keylogger...");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	@Override
	protected void analizarMemoria() {
		try {
			System.out.println("Analizando memoria...");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	@Override
	protected void descomprimirZip() {
		try {
			System.out.println("Descomprimiendo zip...");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}


	@Override
	protected void detener() {
		System.out.println("Analisis avanzado	- Analisis avanzado finalizado");		
	}

}
