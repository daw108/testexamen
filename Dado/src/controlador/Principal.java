package controlador;

import modelo.Dado;


public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Dado jugador1dado1=new Dado();
		Dado jugador1dado2=new Dado();
		Dado jugador2dado1=new Dado();
		Dado jugador2dado2=new Dado();
		jugador1dado1.lanzarDado();
		jugador1dado2.lanzarDado();
		jugador2dado1.lanzarDado();
		jugador2dado2.lanzarDado();
		System.out.println("Tirada jugador1: ( "+jugador1dado1.getCara()+","+jugador1dado2.getCara()+")");
		System.out.println("Tirada jugador2: ( "+jugador2dado1.getCara()+","+jugador2dado2.getCara()+")");
		int sumadadosjugador1=jugador1dado1.getCara()+jugador1dado2.getCara();
		int sumadadosjugador2=jugador2dado2.getCara()+jugador2dado2.getCara();
		if(sumadadosjugador1>sumadadosjugador2){
			System.out.println("Gana jugador 1");
		}else if(sumadadosjugador2>sumadadosjugador1){
			System.out.println("Gana jugador 2");
		}else if (sumadadosjugador2==sumadadosjugador1)
			System.out.println("Empate");
		
		System.out.println("Hola");
		System.out.println("Cara 1 ha salido: " + jugador1dado1.getNumerotiradas());
		
		System.out.println("Cara 2 ha salido: " + jugador1dado1.getNumerotiradas());
		System.out.println("Cara 3 ha salido: " + jugador1dado1.getNumerotiradas());
		System.out.println("Cara 4 ha salido: " + jugador1dado1.getNumerotiradas());
		System.out.println("Cara 5 ha salido: " + jugador1dado1.getNumerotiradas());
		System.out.println("Cara 6 ha salido: " + jugador1dado1.getNumerotiradas());
		
	

	}

}
