package com.vic.concrete.command;

import com.vic.command.ICommand;
import com.vic.receiber.Luces;

/*Define las acciones a ejecutar.*/
public class ApagarLuces implements ICommand {
	private Luces luces;
	
	public ApagarLuces() {
		luces=new Luces();
	}
	
	@Override
	public void execute() {
		luces.conectar();
		luces.apagar();	
		luces.desconectar();
	}
}
