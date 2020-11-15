package com.vic;

import com.vic.command.ICommand;
import com.vic.concrete.command.AbrirPuerta;
import com.vic.concrete.command.ApagarLuces;
import com.vic.concrete.command.CerrarPuerta;
import com.vic.concrete.command.EncenderLuces;
import com.vic.invoker.Invoker;

/*Cliente*/
public class App {
	public static void main(String args[]) {
		ICommand iCommand;
		//String accion="EncenderLuces";
		String accion="CerrarPuerta";
		
		switch (accion) {
		case "EncenderLuces":
			iCommand=new EncenderLuces();
			break;
		case "ApagarLuces":			
			iCommand=new ApagarLuces();
			break;
		case "AbrirPuerta":			
			iCommand=new AbrirPuerta();
			break;
		case "CerrarPuerta":			
			iCommand=new CerrarPuerta();
			break;		
		default:
			iCommand=null;
			break;
		}
		
		Invoker invoker=new Invoker(iCommand);
		invoker.run();
	}
}
