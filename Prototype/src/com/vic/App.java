package com.vic;

import com.vic.model.CuentaCorriente;

public class App {
	public static void main(String args[])
	{
		CuentaCorriente cuentaCorriente=new CuentaCorriente();	
		cuentaCorriente.setMonto(200d);
		CuentaCorriente cuentaClonada=(CuentaCorriente)cuentaCorriente.clonar();
		System.out.println(cuentaClonada.getMonto());
		System.out.println(cuentaClonada.getTipo());
	}
	
	
}
