package Personajes;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import mapa.celda;

public class Jugador extends Personajes{
	
	protected int vidas;
	protected int frecuencia_disparos;
	private int alto;
	private int ancho;
	
	
	
	public Jugador(celda c, int prof){
    	alto=30;
    	ancho=30;
    	cell=c;
    	vidas=3;
    	this.profundidad=prof;		
    	graficos= new Icon[4];
    	grafico=new JLabel();
    	setGraficos();
    }
	
	
	
	public void setGraficos() {
		
		graficos[1]=new ImageIcon(this.getClass().getResource("/Archivos/megaCharizard.gif"));
		
		grafico.setIcon(graficos[1]);
	}
	
	public int getAlto(){
    	 return alto;
    }
    
	public int getAncho(){
    	 return ancho;
    }
     
    public int getFrecuenciaDisparos(){
    	 return frecuencia_disparos;
    }
     
     
    

}
