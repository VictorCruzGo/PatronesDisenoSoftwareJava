package com.vic.api;

public class HotelAPI {
	public void buscarHoteles(String fechaInicio, String fechaFinal,String origen, String destino)  {
		System.out.println("--------------------------------------------------------------");
		System.out.println("Hoteles encontrados para "+destino+" desde "+origen);
		System.out.println("Fecha de Llegada:"+ fechaInicio +" Fecha de Salida"+fechaFinal);
		System.out.println("Hotel A");
		System.out.println("Hotel B");
		System.out.println("Hotel C");
		System.out.println("--------------------------------------------------------------");
	}
}
