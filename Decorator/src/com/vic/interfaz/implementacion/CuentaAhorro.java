package com.vic.interfaz.implementacion;

import com.vic.interfaz.ICuentaBancaria;
import com.vic.model.Cuenta;

public class CuentaAhorro implements ICuentaBancaria {

	@Override
	public void abrirCuenta(Cuenta c) {
		System.out.println("------------");
		System.out.println("Se abrio una CUENTA AHORRO");
		System.out.println("Cliente:"+c.getCliente());		
	}
}
