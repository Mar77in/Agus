package Obstaculos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import mapa.celda;

public class Water extends obstaculo{

	public Water(celda c,int prof) {
		profundidad=prof;
		cell=c;
		grafico=new JLabel();
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Archivos/s_1_3.png")));
		
	}
}
