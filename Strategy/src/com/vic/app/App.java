package com.vic.app;

import com.vic.contexto.Contexto;
import com.vic.strategy.AntivirusAvanzado;
import com.vic.strategy.AntivirusSimple;

public class App {

	public static void main(String[] args) {
		//Contexto contexto=new Contexto(new AntivirusSimple());
		Contexto contexto=new Contexto(new AntivirusAvanzado());
		contexto.ejecutar();
	}

}
