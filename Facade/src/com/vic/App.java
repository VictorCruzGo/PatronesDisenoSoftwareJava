package com.vic;

import com.vic.facade.CheckFacade;

public class App {
	public static void main(String args[]) {
		//Buscar hoteles y vuelos
		CheckFacade cliente1=new CheckFacade();
		cliente1.buscar("01/01/2020","15/01/2020","Lima","Cancun");
		
		CheckFacade cliente2=new CheckFacade();
		cliente2.buscar("01/01/2020","15/01/2020","Santa Cruz","La Paz");		
	}
}
