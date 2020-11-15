package com.vic.api;

public class AvionAPI {
	public void buscarVuelos(String fechaInicio, String fechaFinal,String origen, String destino)  {
		System.out.println("--------------------------------------------------------------");
		System.out.println("Vuelos encontrados para "+destino+" desde "+origen);
		System.out.println("Fecha de IDA:"+ fechaInicio +" Fecha de Vuelta"+fechaFinal);
		System.out.println("--------------------------------------------------------------");
	}
}
