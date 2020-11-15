package com.vic.invoker;

import com.vic.command.ICommand;

/*Encargada de ejecutar el metodo command.execute()*/
public class Invoker {
	private ICommand orden;
	
	public Invoker(ICommand orden) {
		this.orden=orden;
	}
	
	public void run() {
		orden.execute();
	}
}
