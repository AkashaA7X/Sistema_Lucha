package game;

import java.util.Random;

public class personajes {

	//ATRIBUTOS
	public String nombre;
	private int vida,nivel,ataque,defensa;
	private Random numAle= new Random(System.nanoTime());
	
	//Sets and Gets
	public void setVida(int vida) {
		this.vida=vida;
	}
	public int getVida() {
		return vida;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	
	

	public personajes() {
		// TODO Auto-generated constructor stub
	}
	
	
	//Metodo : Atacar, devuelve un entero con el daño que hace el personaje
	public int ataqueFisico() {
		int dañoPropio=numAle.nextInt(20);
		return nivel *dañoPropio;
		
	}
	//Metodo :Ataque enemigo, nos afectará a la vida
	public void dañarVida(int vida) {
		this.vida -=vida;
	}
	//Metodo :Ataque enemigo, nos afectará a la defensa
	public void dañarDefensa(int vidaD) {
		this.defensa-=vidaD;
	}
	
	
}
