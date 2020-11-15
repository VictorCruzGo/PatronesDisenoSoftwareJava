package com.vic.single_responsability;

public class Tarea {
	//En la clase tarea se hace la composicion de metodos.
	Downloader downloader=new Downloader();
	Parser parser=new Parser();
	Storer storer=new Storer();
	
	public void descargarFichero(String ubicacion) {
		downloader.descargarFichero(ubicacion);
	}
	
	public void parsearFichero(String fichero) {
		parser.parsearFichero(fichero);
	}
	
	public void guardarFicher(String fichero) {
		storer.guardarFicher(fichero);
	}
}
