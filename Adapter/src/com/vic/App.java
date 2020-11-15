package com.vic;

import java.util.Scanner;

import com.vic.adapter.MotorElectricoAdapter;
import com.vic.clases.MotorComun;
import com.vic.clases.MotorEconomico;
import com.vic.target.Motor;

public class App {

	private static Scanner S=new Scanner(System.in);
	private static Motor motor; //Reference de la clase abstracta
	
	public static void main(String[] args) {
		int opcion;
		do {

			opcion = pregutarOpcion();
			switch (opcion) {
			case 1: 
				motor=new MotorComun();
				usarMotor();
				break;
			case 2: 
				motor=new MotorEconomico();
				usarMotor();
				break;
			case 3: 
				motor=new MotorElectricoAdapter();
				usarMotor();
				break;
			case 4: 
				System.out.println("Cerrando programa!");
				break;				
			default:
				System.out.println("Cerrando programa!");
			}
			
		}while(opcion!=4);		
	}
			
	private static int pregutarOpcion() {
		System.out.println(
				"MENU DE OPCIONES\n"
				+ "1. Encender motor comun\n"
				+ "2. Encender motor economico\n"
				+ "3. Encender motor electrico\n"
				+ "4. Salir\n"
				+ "Seleccione opcion:"
						
				);
		
		return Integer.parseInt(S.nextLine());
	}
			
	private static void usarMotor() {
		motor.encender();
		motor.acelerar();
		motor.apagar();
	}
}
