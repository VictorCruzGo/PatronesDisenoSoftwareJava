package com.vic.invoker;

import java.util.ArrayList;
import java.util.List;

import com.vic.command.ICommand;

/*Encargada de ejecutar el metodo command.execute()*/
public class Invoker {
	private List<ICommand> operaciones=new ArrayList<>();
	
	public Invoker() {		
	}
	
	public void recibirOperacion(ICommand operacion) {
		this.operaciones.add(operacion);
	}
	
	public void run(){
		this.operaciones.forEach(x->x.execute());
		operaciones.clear();
	}
}
