package main;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.border.EmptyBorder;

import GUI.GUI;
import Personajes.Jugador;
import Personajes.JugadorBasico;
import mapa.map;

public class Juego {
	
	private static GUI frame;
	private Jugador jugador;

	public static void main(String[] args) {
		

		new Juego();
	}

	
	public Juego() {
		
		jugador= new Jugador(null, 1);
		pantallaPrincipal();
	}
	
	
	public void pantallaPrincipal(){
		
		
		   
		   crearGUI();
		   
	}
	
	public void crearGUI(){
		 
		  
		   
		   frame=new GUI(this);
		   new map(frame,jugador,this);
		   frame.setVisible(true);
	   }
}
