package com.vic.facade;

import com.vic.api.AvionAPI;
import com.vic.api.HotelAPI;

public class CheckFacade {

	private AvionAPI avionAPI;
	private HotelAPI hotelAPI; 
	
	public CheckFacade() {
		avionAPI=new AvionAPI();
		hotelAPI=new HotelAPI();
	}
	
	public void buscar(String fechaInicio, String fechaFinal,String desde, String hasta) {
		avionAPI.buscarVuelos(fechaInicio, fechaFinal, desde, hasta);
		hotelAPI.buscarHoteles(fechaInicio, fechaFinal, desde, hasta);
	}
}
