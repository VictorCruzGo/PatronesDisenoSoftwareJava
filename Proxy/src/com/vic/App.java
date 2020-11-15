package com.vic;

import com.vic.interfaz.ICuenta;
import com.vic.interfaz.impl.CuentaBancoAimpl;
import com.vic.interfaz.impl.CuentaBancoBimpl;
import com.vic.model.Cuenta;
import com.vic.proxy.CuentaProxy;

public class App {
	public static void main(String[] args) {
		Cuenta c=new Cuenta(1,"Victor Cruz Gomez",100);
		//ICuenta iCuentaProxy=new CuentaProxy(new CuentaBancoAimpl());
		ICuenta iCuentaProxy=new CuentaProxy(new CuentaBancoBimpl());
		iCuentaProxy.mostrarSaldo(c);
		c=iCuentaProxy.depositarDinero(c, 50);
		c=iCuentaProxy.retirarDinero(c, 20);
		iCuentaProxy.mostrarSaldo(c);
	}
}
