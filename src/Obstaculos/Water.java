package Obstaculos;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import mapa.celda;

public class Water extends obstaculo{

	public Water(celda c,int prof) {
		profundidad=prof;
		cell=c;
		
		ImageIcon icon = new ImageIcon(this.getClass().getResource("/Archivos/s_1_3.png"));
		Image img = icon.getImage(); //convertimos icon en una imagen
		Image otraimg = img.getScaledInstance(40,40,java.awt.Image.SCALE_SMOOTH); //creamos una imagen nueva dándole las dimensiones que queramos a la antigua
		ImageIcon otroicon = new ImageIcon(otraimg);
		
		grafico=new JLabel();
		grafico.setIcon(otroicon);
		
	}
}
