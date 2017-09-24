package Personajes;


import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import mapa.celda;

public class jugadorBasico extends Jugador {
	
	public jugadorBasico(celda c,int prof) {
		super(c,prof);
		resistencia=2;
		frecuencia_disparos=1;
		graficos=new Icon[4];
		
		graficos[1]= new ImageIcon(this.getClass().getResource("/Archivos/j1.png"));
		
		grafico=new JLabel();
		grafico.setIcon(graficos[0]);
   	 	
	}

	

}
