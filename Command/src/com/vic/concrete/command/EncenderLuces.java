package com.vic.concrete.command;

import com.vic.command.ICommand;
import com.vic.receiber.Luces;

/*Define las acciones a ejecutar.*/
public class EncenderLuces implements ICommand {

	private Luces luces;
	
	public EncenderLuces() {
		luces=new Luces();
	}
	
	@Override
	public void execute() {
		luces.conectar();
		luces.encender();
		luces.desconectar();
	}
}
