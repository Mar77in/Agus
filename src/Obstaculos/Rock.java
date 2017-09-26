package Obstaculos;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import mapa.celda;

public class Rock extends obstaculo{
	private int resistencia;
	
	public Rock(celda c,int prof) {
		cell=c;
		profundidad=prof;
		resistencia=3;
		
		ImageIcon icon = new ImageIcon(this.getClass().getResource("/Archivos/b.png"));
		Image img = icon.getImage(); //convertimos icon en una imagen
		Image otraimg = img.getScaledInstance(40,40,java.awt.Image.SCALE_SMOOTH); //creamos una imagen nueva dándole las dimensiones que queramos a la antigua
		ImageIcon otroicon = new ImageIcon(otraimg);
		
		grafico=new JLabel();
		grafico.setIcon(otroicon);
	}
	public int getResistencia() {
		return resistencia;
	}
	
}
