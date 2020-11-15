package com.vic.interfaz;

public interface ICuenta extends Cloneable {

	//Devuelve la misma interfaz porque puede haber otra clase que implemente la interfaz y
	//cumpla con el objetivo de clonar
	ICuenta clonar();
}
