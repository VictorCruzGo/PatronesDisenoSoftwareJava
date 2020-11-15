package com.vic.strategy;

public class AntivirusSimple extends AAnalisisSimple{
	@Override
	void iniciar() {
		System.out.println("Antivirus simple - Analisis simple iniciado");	
	}

	@Override
	void saltarZip() {
		try {
			System.out.println("Analizando...");	
			Thread.sleep(2500);
			System.out.println("No se puede analizar con extension .zip");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	void detener() {
		System.out.println("Analisis simple	- Analisis simple finalizado");
		
	}
}
