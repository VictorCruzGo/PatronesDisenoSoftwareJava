package com.vic;

import com.vic.decorator.SeguroCuentaDecorador;
import com.vic.interfaz.ICuentaBancaria;
import com.vic.interfaz.implementacion.CuentaAhorro;
import com.vic.model.Cuenta;

public class App {
	public static void main(String args[]) {
		Cuenta c =new Cuenta (1,"Victor Cruz");
		
		ICuentaBancaria cuenta=new CuentaAhorro();
		ICuentaBancaria cuentaConSeguro=new SeguroCuentaDecorador(cuenta);
		//cuenta.abrirCuenta(c);
		cuentaConSeguro.abrirCuenta(c);
	}
}
