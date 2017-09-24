package GUI;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

import main.Juego;

import javax.swing.*;

public class GUI extends JFrame  {
	
	private JLayeredPane contentPane;
	private static Juego j;

	public GUI(final Juego J) {
		super("GOT");
		
		getContentPane().setLayout(null);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 598, 618);
		setLocationRelativeTo(null);
		
		contentPane = new JLayeredPane();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		
		j=J;
	}
}
