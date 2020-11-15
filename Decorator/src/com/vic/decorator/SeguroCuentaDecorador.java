package com.vic.decorator;

import com.vic.interfaz.ICuentaBancaria;
import com.vic.model.Cuenta;

public class SeguroCuentaDecorador extends ACuentaDecorador {

	public SeguroCuentaDecorador(ICuentaBancaria iCuentaDecorada) {
		//Envia la ICuentaBancaria al contrustor de ACuentaDecorador
		super(iCuentaDecorada);
	}
	
	@Override //Sobreescribir el metodo de la clase ACuentaDecorador
	public void abrirCuenta(Cuenta c) {
		iCuentaDecorada.abrirCuenta(c);
		agregarSeguroTarjeta(c); //funcionalidad 1
		agregarSeguroPerdidaTarjeta(c); //funcionalidad 2
	}
	
	public void agregarSeguroTarjeta(Cuenta c) {
		System.out.println("---Se agrego el seguro de tarjeta a la cuenta del cliente "+c.getCliente());
	}
	public void agregarSeguroPerdidaTarjeta(Cuenta c) {
		System.out.println("---Se agrego el seguro de perdida de tarjeta a la cuenta del cliente "+c.getCliente());
	}
}
