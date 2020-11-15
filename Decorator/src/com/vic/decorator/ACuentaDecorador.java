package com.vic.decorator;

import com.vic.interfaz.ICuentaBancaria;
import com.vic.model.Cuenta;

public abstract class ACuentaDecorador implements ICuentaBancaria{

	//Clave para acceder desde clases derivadas
	protected ICuentaBancaria iCuentaDecorada;
	
	//Recibe cuaalquier implementacion de ICuentaBancaria
	//Cuenta corriente o Cuenta Ahorro
	public ACuentaDecorador(ICuentaBancaria iCuentaDecorada) {
		this.iCuentaDecorada=iCuentaDecorada;
	}
	
	@Override
	public void abrirCuenta(Cuenta c) {
		this.iCuentaDecorada.abrirCuenta(c);
	}

}
