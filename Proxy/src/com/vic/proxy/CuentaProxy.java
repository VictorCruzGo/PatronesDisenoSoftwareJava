package com.vic.proxy;

import java.util.logging.Logger;

import com.vic.interfaz.ICuenta;
import com.vic.interfaz.impl.CuentaBancoAimpl;
import com.vic.model.Cuenta;

public class CuentaProxy implements ICuenta {

	//private CuentaBancoAimpl cuentaReal;	
	private ICuenta cuentaReal; //Estrategia para Enchufar y desconectar
	private final static Logger LOGGER=Logger.getLogger(CuentaProxy.class.getName());
	
	//Habilitar el polimorfismo
	//iCuentaReal puesde ser cuentaBancoA o cuentaBancoB
	public CuentaProxy(ICuenta iCuentaReal) {
		this.cuentaReal=iCuentaReal;
	}
	
	@Override
	public Cuenta retirarDinero(Cuenta cuenta, double monto) {
		LOGGER.info("--Cuenta proxy - Retirar dinero--");
		if (cuentaReal == null) {
			cuentaReal=new CuentaBancoAimpl();
			return cuentaReal.retirarDinero(cuenta, monto);			
		}else {
			return cuentaReal.retirarDinero(cuenta, monto);
		}
	}

	@Override
	public Cuenta depositarDinero(Cuenta cuenta, double monto) {
		LOGGER.info("--Cuenta proxy - Depositar dinero--");
		if (cuentaReal == null) {
			cuentaReal=new CuentaBancoAimpl();
			return cuentaReal.depositarDinero(cuenta, monto);			
		}else {
			return cuentaReal.depositarDinero(cuenta, monto);
		}
	}

	@Override
	public void mostrarSaldo(Cuenta cuenta) {
		LOGGER.info("--Cuenta Proxy - Mostrar Saldo --");
		if (cuentaReal == null) {
			cuentaReal=new CuentaBancoAimpl();
			cuentaReal.mostrarSaldo(cuenta);			
		}else {
			cuentaReal.mostrarSaldo(cuenta);
		}	
	}
}
