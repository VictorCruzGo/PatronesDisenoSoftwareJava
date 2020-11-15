package com.vic.app;

import com.vic.app.observable.Subject;
import com.vic.app.observer.PesoArgObserver;
import com.vic.app.observer.PesoPerObserver;
import com.vic.app.observer.SoloObserver;

public class App {

	public static void main(String[] args) {
		Subject subject=new Subject();
		
//		SoloObserver BOL=new SoloObserver(subject);
//		PesoArgObserver ARG=new PesoArgObserver(subject);
//		PesoPerObserver PER=new PesoPerObserver(subject);

		//Suscribiendo los objetos OBSERVERs al OBSERVABLE
		new SoloObserver(subject);
		new PesoArgObserver(subject);
		new PesoPerObserver(subject);		
		
		//Cuando varia el estado del observable, se notifica a toos los observers
		System.out.println("Si desea cambiar 10 dolares obtendra: ");
		subject.setEstado(10);
		System.out.println("Si desea cambiar 100 dolares obtendra: ");
		subject.setEstado(100);
	}
}
