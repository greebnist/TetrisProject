package fr.imie.tetrisProject.game;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameOver {
	
	public GameOver(){
		
		JFrame fenetre1 = new JFrame();
		fenetre1.setSize(400, 300);
		// define the default operation when
		// the frame is closed
		fenetre1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// define the title of the frame
		fenetre1.setTitle("Tetris");
		
		JPanel p1 = new JPanel();
		p1.setBackground(Color.white);
		
		ImageIcon icon2 = new ImageIcon(new ImageIcon("Game_Over.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
        
		JLabel gameOver = new JLabel(new ImageIcon("Image\\Game_Over.png")); 
		gameOver.setBounds(0, 0, 100, 100); 
		p1.add(gameOver);
		
		JButton perdu = new JButton("My button");
		p1.add(new JButton("Exit"));
		
		fenetre1.getContentPane().add(p1);
		fenetre1.setVisible(true);
	}

}
