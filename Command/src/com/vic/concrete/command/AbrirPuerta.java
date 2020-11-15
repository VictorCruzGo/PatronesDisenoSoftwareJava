package com.vic.concrete.command;

import com.vic.command.ICommand;
import com.vic.receiber.Puerta;
/*Define las acciones a ejecutar.*/
public class AbrirPuerta implements ICommand {

	private Puerta puerta;
	
	public AbrirPuerta() {
		puerta=new Puerta();
	}
	
	@Override
	public void execute() {
		puerta.conectar();
		puerta.abrir();
		puerta.desconectar();
	}
}
