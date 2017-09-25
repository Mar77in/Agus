package Disparo;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Personajes.Personajes;
import mapa.celda;

public class DisparoPlayer extends Disparo {
	
	public DisparoPlayer(celda c,Personajes p,int prof,int vel) {
		
		super(c,p,prof,vel);
		grafico=new JLabel();
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Archivos/disparo.png")));
	  	grafico.setBounds(32+16*cell.getPosX(), 128+16*cell.getPosY(), 16, 16);
		cell.getGui().add(grafico,new Integer(2));
		
		
		
		}

}
