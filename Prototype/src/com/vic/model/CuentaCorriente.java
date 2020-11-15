package com.vic.model;

import com.vic.interfaz.ICuenta;

public class CuentaCorriente implements ICuenta {

	private String tipo;
	private Double monto;
	
	public CuentaCorriente() {
		tipo="Corriente";
	}
	
	@Override
	public ICuenta clonar() {		
		CuentaCorriente cuenta=null;
		try {
			//Clonar el objeto CuentaCorriente
			cuenta=(CuentaCorriente)clone();			
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		//Retorno la instancia clonada
		return cuenta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}
	
	

}
