package com.vic.concrete.command;

import com.vic.command.ICommand;
import com.vic.receiber.Puerta;

/*Define las acciones a ejecutar.*/
public class CerrarPuerta implements ICommand {

	private Puerta puerta;
	
	public CerrarPuerta() {
		puerta=new Puerta();
	}
	
	@Override
	public void execute() {
		puerta.conectar();
		puerta.cerrar();
		puerta.desconectar();		
	}
}
