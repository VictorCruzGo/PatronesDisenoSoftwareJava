package com.vic;


import com.vic.concrete.command.DepositarCuenta;
import com.vic.concrete.command.RetirarCuenta;
import com.vic.invoker.Invoker;
import com.vic.receiber.Cuenta;

/*Cliente*/
public class App {
	public static void main(String args[]) {
		Cuenta cuenta=new Cuenta(1,200);
		
		DepositarCuenta opDepositar=new DepositarCuenta(cuenta,100);
		RetirarCuenta opRetirar=new RetirarCuenta(cuenta,50);
		
		//Invoker recibe las ordenes para ejecutar los comandos concretos
		Invoker ivk=new Invoker();		
		ivk.recibirOperacion(opDepositar);
		ivk.recibirOperacion(opRetirar);
		
		ivk.run();
		
		
	}
}
