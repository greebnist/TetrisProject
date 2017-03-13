package fr.imie.tetrisProject.game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Pause{

	public Pause(){
		
		JFrame fenetrePause = new JFrame();
		fenetrePause.setSize(400, 300);
		// define the default operation when
		// the frame is closed
		fenetrePause.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// define the title of the frame
		fenetrePause.setTitle("Tetris");
		
		JPanel pause = new JPanel();
		
		JLabel titrePause= new JLabel("Pause ",SwingConstants.CENTER);
		titrePause.setPreferredSize(new Dimension (30,100));
		Font font = new Font("Arial",Font.BOLD,18);
		titrePause.setFont(font);
		fenetrePause.add(titrePause);
		
		JLabel descritpionPause = new JLabel("Voulez-vous reprendre?");
		descritpionPause.setPreferredSize(new Dimension (30,100));
		Font font2 = new Font("Arial",Font.BOLD,16);
		descritpionPause.setFont(font2);
		fenetrePause.add(fenetrePause);
		
		JButton reprendre = new JButton("Reprendre");
		reprendre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JButton returnMenu = new JButton("Menu");
		returnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Menu retourMenu = new Menu();
			}
		});
		
		setContentPane(pause);
		fenetrePause.setVisible(true);
		
		
		
	}
}
