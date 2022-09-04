package controller;

public class CorridaController extends Thread{
	
	private int distancia;
	private int salto;
	
	
	public CorridaController(int distancia, int salto) {
		this.distancia = distancia;
		this.salto = salto;
		
	}

	@Override
	public void run() {
		corrida(distancia, salto);
		
		System.out.println("Podium:\n" + "#"+ getId());
	}

	private void corrida(int distancia, int salto) {
		
		while (salto <= distancia) {
			if (salto <= distancia) {
				int novoSalto = (int)(Math.random()* 10) + 1;
				System.out.println("#" + getId() + " ==> Salto atual: " + novoSalto);
				salto = salto + novoSalto;
				System.out.println("Distancia percorrida: " + salto + "\n");
			}
		}
		int tempo = 1000;
		try {
			sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

