package com.vic.app.observer;

import com.vic.app.observable.Subject;
/*
Clase obstracta, para definir clases del tipo Observer
*/
public abstract class Observer {
	//El objeto esta suscrito a un observable (sujeto).
	protected Subject sujeto;
	//Metodo para sobreescribir la logica de cada objeto suscrito.
	public abstract void actualizar();
}
