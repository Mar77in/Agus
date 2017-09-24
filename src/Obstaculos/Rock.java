package Obstaculos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import mapa.celda;

public class Rock extends obstaculo{
	private int resistencia;
	
	public Rock(celda c,int prof) {
		cell=c;
		profundidad=prof;
		resistencia=3;
		grafico=new JLabel();
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Archivos/b.png")));
	}
	public int getResistencia() {
		return resistencia;
	}
	
}
