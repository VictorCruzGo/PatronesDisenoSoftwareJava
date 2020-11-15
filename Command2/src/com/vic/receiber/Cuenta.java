package com.vic.receiber;

public class Cuenta {
	private int id;
	private double saldo;
	
	public Cuenta(int id, double saldo) {
		this.id=id;
		this.saldo=saldo;
	}
	
	public void retirar(double monto) {
		this.saldo=this.saldo-monto;
		System.out.println("[COMMAN RETIRAR] Cuenta "+this.id+" Saldo: "+this.saldo);
	}
	
	public void depositar(double monto) {
		this.saldo=this.saldo-monto;
		System.out.println("[COMMAN DEPOSITAR] Cuenta "+this.id+" Saldo: "+this.saldo);
	}
	
	public void abrir() {	
		System.out.println("[COMMAN ABRIR] Se abrio la cuenta");
	}
	
	public void cerrar() {	
		System.out.println("[COMMAN CERRAR] Se cerro la cuenta");
	}
}
