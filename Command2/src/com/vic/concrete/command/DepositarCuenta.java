package com.vic.concrete.command;

import com.vic.command.ICommand;
import com.vic.receiber.Cuenta;

public class DepositarCuenta implements ICommand {

	private Cuenta cuenta;
	private double monto;
	
	
	public DepositarCuenta(Cuenta cuenta, double monto) {
		this.cuenta=cuenta;
		this.monto=monto;
	}
	
	//Comando que va a ejecutar para Depositar en un cuenta
	@Override
	public void execute() {
		this.cuenta.abrir();
		this.cuenta.depositar(this.monto);
		this.cuenta.cerrar();	
	}
}
