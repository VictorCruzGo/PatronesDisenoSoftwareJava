package com.vic.concrete.command;

import com.vic.command.ICommand;
import com.vic.receiber.Cuenta;

public class RetirarCuenta implements ICommand {

	private Cuenta cuenta;
	private double monto;
	
	
	public RetirarCuenta(Cuenta cuenta, double monto) {
		this.cuenta=cuenta;
		this.monto=monto;
	}
	
	//Comando a ejecutar para retirar dinero de una cuenta
	@Override
	public void execute() {
		this.cuenta.abrir();
		this.cuenta.depositar(this.monto);
		this.cuenta.cerrar();
	}

}
