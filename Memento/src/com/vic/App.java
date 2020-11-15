package com.vic;

import com.vic.memento.CareTaker;
import com.vic.memento.Juego;
import com.vic.memento.Originator;

public class App {
	public static void main(String args[]) {
		CareTaker careTaker=new CareTaker();
		Originator originator=new Originator();
		
		String nombreJuego="Crash Bandicoot";
		
		Juego juego	=new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(1);
				
		juego=new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(2);
		
		originator.setEstado(juego);
						
		juego=new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(3);
		
		originator.setEstado(juego);		
		careTaker.addMemento(originator.guardar()); //Posicion 0
		
		
		juego=new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(4);
		
		originator.setEstado(juego);
		careTaker.addMemento(originator.guardar()); //Posicion 1
	
		
		juego=new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(5);
		
		originator.setEstado(juego);
		careTaker.addMemento(originator.guardar()); //Posicion 2
	
		
		originator.restaurar(careTaker.getMemento(0));		
		
		juego=originator.getEstado();
		System.out.println(juego);
	}
}
