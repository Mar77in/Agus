package mapa;

import java.io.*;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import GUI.GUI;
import Personajes.Jugador;
import Personajes.jugadorBasico;
import main.Juego;
import main.gameObject;




public class map{
	
	private GUI gui;
	private celda[][] celdas;
	private Juego juego;
	
	private Jugador j1;
	
	public map(GUI migui,Jugador player,Juego j) {
		gui=migui;
	
		j1= player;
		juego=j;
		gui.setResizable(false);
		celdas= new celda[10][10];
		
		//A�adimos el fondo
		
		JLabel fondo=new JLabel(new ImageIcon(this.getClass().getResource("/Archivos/fondo.jpg")));
		fondo.setBounds(0, 0, 592,592);
		gui.add(fondo,new Integer(0));
		
		try{
		inicializarCeldas();
		
		agregarJugador();
		
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
		graf.setBounds(25+16*3, 114+16*2, 30, 30);
		gui.add(graf,new Integer(4));
		
		
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
