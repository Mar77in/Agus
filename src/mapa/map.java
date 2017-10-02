package mapa;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import GUI.GUI;
import Personajes.Enemigo;
import Personajes.Jugador;
import Personajes.JugadorBasico;
import main.Juego;
import main.gameObject;




public class map{
	
	private GUI gui;
	private celda[][] celdas;
	private Juego juego;
	private JLabel puntaje;
	
	private Jugador j1;
	private Enemigo E1;
	private int cont;
	private int score;
	
	public map(GUI migui,Jugador player,Juego j) {
		gui=migui;
		cont=0;
		j1= player;
		E1=new Enemigo(null, 1);
		juego=j;
		gui.setResizable(false);
		celdas= new celda[10][10];
		
		//A�adimos el fondo
		
		JLabel fondo=new JLabel(new ImageIcon(this.getClass().getResource("/Archivos/fondo.jpg")));
		fondo.setBounds(0, 0, 592,592);
		gui.add(fondo,new Integer(0));
		
		
		
		JButton botonAliado= new JButton("Agregar Aliado");
		botonAliado.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				agregarJugador();
			}	
		});
		botonAliado.setBounds(450,20, 135, 30);
		botonAliado.setVisible(true);
		gui.add(botonAliado,new Integer(4));
		
		//Jlabel contador
		

		puntaje=new JLabel(""+score);
		puntaje.setFont(new Font("Serif", Font.PLAIN, 20));
   	 	puntaje.setForeground(Color.red);
   	 	puntaje.setBounds(450,100,135,30);
   	 	gui.add(puntaje,new Integer(2));
		
   	 	
   	 	
		
		JButton botonEnemigo= new JButton("Agregar Enemigo");
		botonEnemigo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				if(cont==0) {
					agregarEnemigo();
					gui.repaint();
					cont=1;
				}else {
					eliminarEnemigo();
					gui.repaint();
					score+=50;
					puntaje.setText(""+score);
					cont=0;
					
				}
				
			}	
		});
		botonEnemigo.setBounds(450,60, 135, 30);
		botonEnemigo.setVisible(true);
		gui.add(botonEnemigo,new Integer(4));
		
		
		
		try{
		inicializarCeldas();
		
		//agregarJugador();
		
		}catch(FileNotFoundException e){
   		 System.out.println("ERROR, ARCHIVO DE MAPA NO ENCONTRADO.");
   	 }
   	 catch(IOException e){
   		 System.out.println("ERROR INESPERADO LEYENDO EL ARCHIVO.");
   	 }
		
				
	}

	
	private void agregarJugador() {
		
		gameObject[] objetos=celdas[3][2].getObjects();
		objetos[1]=j1;
		j1.setCelda(celdas[3][2]);
		JLabel graf=j1.getGrafico();
		graf.setBounds(25+16*3, 100+16*2, 30, 30);
		gui.add(graf,new Integer(4));
		
		
	}
	
	
	
	
	public void agregarEnemigo() {
		
		gameObject[] objetos=celdas[6][6].getObjects();
		objetos[2]=E1;
		E1.setCelda(celdas[0][0]);
		JLabel graf=E1.getGrafico();
		graf.setBounds(25+16*6, 100+16*6, 30, 30);
		gui.add(graf,new Integer(4));
		
		
	}
	
	public void eliminarEnemigo() {
		E1.setCelda(null);
		gui.remove(E1.getGrafico());
		
		
		
	}
	private void inicializarCeldas() throws FileNotFoundException, IOException{
	    String sCurrentLine="";
	 
	  
	    InputStream is = getClass().getResourceAsStream("/Archivos/mapa.txt");
        InputStreamReader isr = new InputStreamReader(is);

	    BufferedReader b = new BufferedReader(isr);
	  
	    int j=0;
	    while ((sCurrentLine = b.readLine()) != null) {
	    	
	    	for (int x=0;x<sCurrentLine.length();x++){
	    		char letra_actual=sCurrentLine.charAt(x);
	    		celdas[x][j]=new celda(letra_actual,this,x,j);
	    		gameObject[] objetos=celdas[x][j].getObjects();
	    		if(objetos[0]!=null){
	    			JLabel graf=objetos[0].getGrafico();
	    			graf.setBounds(32+40*x,128+40*j,40,40);
	    		    gui.add(graf,new Integer(1));
	    			
	    		}else
	    			if(objetos[2]!=null){
	    				JLabel graf=objetos[2].getGrafico();
	    				graf.setBounds(32+40*x,128+40*j,40,40);
	    				gui.add(graf,new Integer(3));
	    			}
	    		  
	    		    	    		
	    	}
	    	 j++;
	    }
	   b.close();
	   
	}
	
	public Jugador getJugador(){
   	 return j1;
    }
	
	 public celda getCelda(int x, int y){
    	 return celdas[x][y];
     }
	 
	 public GUI getGui(){
    	 return gui;
     }
}
