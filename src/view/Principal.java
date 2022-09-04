package view;

import controller.CorridaController;

public class Principal {

	public static void main(String[] args) {
		
		int distancia = 100;
		int salto = 0;
	
		for (int i = 0; i < 5; i++) {
			Thread sapos = new CorridaController(distancia, salto);
			sapos.start();
		}
	}
}


