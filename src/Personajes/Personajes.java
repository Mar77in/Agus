package Personajes;

import javax.swing.Icon;

import main.gameObject;
import mapa.celda;

public abstract class Personajes extends gameObject {

	protected Icon[] graficos;
	protected int resistencia;
	protected int daño;
	protected int rango;
	private volatile  boolean moviendo=false;
	
	
	
	
	public int getResistencia(){
		return resistencia;
	}
	
	public int getDaño(){
		return daño;
	}
	
	
	public void intercambiar_celdas(celda C){
		moviendo=true;
	    C.getObjects()[profundidad]=this;
		cell.getObjects()[profundidad]=null;
		cell=C;
		//moverGrafico();
	}
	
}
