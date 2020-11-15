package com.vic.single_responsability;

public class TareaResponsabilidades {
	//Esta clase no cumple con la SRP
	public void descargarFichero(String ubicacion) {		
		System.out.println("Responsabilidad 1 - Descargado el fichero..."+ubicacion);		
	}
	public void parsearFichero(String fichero) {
		System.out.println("Responsabilidad 2 - Parseando el fichero..."+fichero);
	}
	public void guardarFichero(String fichero) {
		System.out.println("Responsabilidad 3 -guardando el fichero..."+fichero);
	}
}
