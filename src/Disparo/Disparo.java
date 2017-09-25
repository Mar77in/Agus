package Disparo;

import Personajes.Personajes;
import mapa.celda;

public abstract class Disparo extends Personajes  {
	
	protected Personajes p;
	protected int ancho;
	protected int alto;
	protected int velocidad;
	
	
	public Disparo(celda c,Personajes P,int prof,int vel) {
		
		profundidad=prof;
		p=P;
		ancho=16;
		alto=16;
		cell=c;
		cell.getObjects()[profundidad]=this;
		velocidad=vel;
		
		//creemos que hay que usar visitor en disparo que esté en la clase Personajes
		
		
	}
	
	public int getAlto(){
     	 return alto;
      }
      public int getAncho(){
     	 return ancho;
      }
	
	

}
