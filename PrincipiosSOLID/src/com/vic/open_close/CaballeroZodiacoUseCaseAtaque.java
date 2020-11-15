package com.vic.open_close;

import java.util.List;

public class CaballeroZodiacoUseCaseAtaque {
	public void ataque(List<ACaballeroZodiaco> caballeros) {
		caballeros.forEach(caballero->caballero.ataque());
	}
}
