package Obstaculos;

import mapa.celda;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import main.Visitor;

public class Grass extends obstaculo {

	private char tipo;
	
	public Grass(celda c,int prof) {
		this.tipo=tipo;
		
		profundidad=prof;
		cell=c;
		grafico=new JLabel();
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Archivos/2_0.png")));
	}
	
	public boolean Accept(Visitor V){
		return V.visitGrass(this);
	}

	

	
}
