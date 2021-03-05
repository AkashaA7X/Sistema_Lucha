package game;

import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {

		//Inicio del programa
		int aleatorio,vida=0;
		boolean dead=false;
		Random numAle= new Random(System.nanoTime());
		Scanner teclado=new Scanner(System.in);
		personajes jugador=new personajes();
		personajes enemigo1=new personajes();
		
		//Le damos valores a los objetos de los personajes
		System.out.println("Nombre del personaje:");
		jugador.setNombre(teclado.nextLine());
		jugador.setAtaque(50);
		jugador.setNivel(1);
		jugador.setDefensa(100);
		jugador.setVida(100);
		
		//Le damos valores al objeteo personaje enemigo
		enemigo1.setAtaque(50);
		enemigo1.setNivel(1);
		enemigo1.setNombre("MaloMaloso");
		enemigo1.setDefensa(100);
		enemigo1.setVida(100);
		
		System.out.println("########################################");
		System.out.printf("%s\t\t VIDA:%d \t DEFENSA:%d \n",jugador.getNombre(),jugador.getVida(),jugador.getDefensa());
		System.out.printf("%s\t\t VIDA:%d \t DEFENSA:%d \n",enemigo1.getNombre(),enemigo1.getVida(),enemigo1.getDefensa());
		System.out.println("########################################");
		
		
		//Sistema de batalla
		
		do {
			//Cuanto daño va a hacer nuestro personaje
			aleatorio=numAle.nextInt(2);
			
				vida=jugador.ataqueFisico();
			
			System.out.println(enemigo1.getNombre()+" ha realizado un ataque de :"+vida);
//			if(aleatorio==1) {
//				
//				//se activa la defensa, el daño afecta a la defensa
//				System.out.println("Defensa Activada del enemigo");
//				if(enemigo1.getDefensa()<=0) {
//					System.out.println("El escudo del enemigo esta roto");
//					enemigo1.dañarVida(vida);
//				}else
//					enemigo1.dañarDefensa(vida);
//				
//			}else {
//				System.out.println("El enemigo no se pudo defender");
//				enemigo1.dañarVida(vida);
//			}
				
//			//Empieza tu turno, define que quieres hacer
			System.out.println("¿Que quieres hacer? (1)Atacar (2)Defenderse (3)Usar pocion");
			int opcionPlayer=teclado.nextInt();
			switch(opcionPlayer) {
				case 1://Ataque
					vida=jugador.ataqueFisico();
					System.out.println(jugador.getNombre()+" ha realizado un ataque de: "+vida);
						if(enemigo1.getDefensa()<=0) {
							System.out.println("El escudo del enemigo esta roto");
							enemigo1.dañarVida(vida);
						}else
							enemigo1.dañarDefensa(vida);
					break;
				case 2://Defensa
					jugador.dañarDefensa(vida);
					System.out.println("DEFENSA DE "+jugador.getNombre()+ " ACTIVADA");
				}
			
			
			
			
			
			
			
			
			
			//Cuanto daño va a hacer el enemigo
			aleatorio=numAle.nextInt(4);
			
				vida=enemigo1.ataqueFisico();
			
			System.out.println(enemigo1.getNombre()+" ha realizado un ataque de :"+vida);
//			if(aleatorio==1) {
//				//se activa la defensa, el daño afecta a la defensa
//				System.out.println("Defensa Activada de "+jugador.getNombre());
//				if(jugador.getDefensa()<=0) {
//					System.out.println("Tu escudo esta roto");
//					jugador.dañarVida(vida);
//				}else
//					jugador.dañarDefensa(vida);
//			}else {
//				System.out.println(jugador.getNombre()+" no se pudo defender");
//				jugador.dañarVida(vida);
//			}
			
			
			if(jugador.getVida() <= 0 || enemigo1.getVida()<=0) {
				dead=true;
			}
			
			System.out.println("########################################");
			System.out.printf("%s\t\t VIDA:%d \t DEFENSA:%d \n",jugador.getNombre(),jugador.getVida(),jugador.getDefensa());
			System.out.printf("%s\t\t VIDA:%d \t DEFENSA:%d \n",enemigo1.getNombre(),enemigo1.getVida(),enemigo1.getDefensa());
			System.out.println("########################################");
			
		}while(dead==false);
		
		System.out.println();
		if(jugador.getVida()>0) {
			System.out.println("HA GANADO "+jugador.getNombre()+"!!!!");
		}else if(enemigo1.getVida()>0) {
			System.out.println("Has perdido contra "+enemigo1.getNombre()+" D:");
		}
		
	}

}
