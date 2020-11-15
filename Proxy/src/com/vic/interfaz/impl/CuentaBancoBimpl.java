package com.vic.interfaz.impl;

import com.vic.interfaz.ICuenta;
import com.vic.model.Cuenta;

public class CuentaBancoBimpl implements ICuenta {

	@Override
	public Cuenta retirarDinero(Cuenta cuenta, double monto) {
		double saldoActual=cuenta.getSaldoInicial()-monto;
		cuenta.setSaldoInicial(saldoActual);
		System.out.println("Saldo actual es:"+cuenta.getSaldoInicial());
		return cuenta;
	}

	@Override
	public Cuenta depositarDinero(Cuenta cuenta, double monto) {
		double saldoActual=cuenta.getSaldoInicial()+monto+0.20;// comision de 0.20 ctvs por cada deposito
		cuenta.setSaldoInicial(saldoActual);
		System.out.println("Saldo actual es:"+cuenta.getSaldoInicial());
		return cuenta;
	}

	@Override
	public void mostrarSaldo(Cuenta cuenta) {
		System.out.println("Saldo actual es:"+cuenta.getSaldoInicial());		
	}

}
