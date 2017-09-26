package Obstaculos;

import mapa.celda;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import main.Visitor;

public class Grass extends obstaculo {

	private char tipo;
	
	public Grass(celda c,int prof) {
		this.tipo=tipo;
		
		profundidad=prof;
		cell=c;
		
		ImageIcon icon = new ImageIcon(this.getClass().getResource("/Archivos/2_0.png"));
		Image img = icon.getImage(); //convertimos icon en una imagen
		Image otraimg = img.getScaledInstance(40,40,java.awt.Image.SCALE_SMOOTH); //creamos una imagen nueva dándole las dimensiones que queramos a la antigua
		ImageIcon otroicon = new ImageIcon(otraimg);
		
		grafico=new JLabel();
		grafico.setIcon(otroicon);
	}
	
	public boolean Accept(Visitor V){
		return V.visitGrass(this);
	}

	

	
}
