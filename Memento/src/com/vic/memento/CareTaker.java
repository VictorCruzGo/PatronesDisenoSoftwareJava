package com.vic.memento;

import java.util.ArrayList;
//CareTaker = Cuidador, gestionador de recuerdos
public class CareTaker {
	private ArrayList<Memento> mementos=new ArrayList<>();
	
	public void addMemento(Memento m) {
		mementos.add(m);
	}

	public Memento getMemento(int index) {
		return mementos.get(index);
	}
}
