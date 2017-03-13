package fr.imie.tetrisProject.game;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class HighScore extends JFrame {

	public HighScore() {
		JFrame fenetreScore = new JFrame();
		setSize(400, 500);
		// define the default operation when
		// the frame is closed
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// define the title of the frame
		setTitle("Tetris");

		JPanel highScore = new JPanel(new BorderLayout());
		
		JLabel score = new JLabel("Score : ",SwingConstants.CENTER);
		score.setPreferredSize(new Dimension (30,100));
		Font font = new Font("Arial",Font.BOLD,18);
		score.setFont(font);
		fenetreScore.add(score);
		
		/*Ajout fichier sauvegarde-----------------------------------------------------------------------------------------------------
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		JPanel retour = new JPanel(new GridBagLayout());
		GridBagConstraints menuList = new GridBagConstraints();
		
		JButton retourMenu = new JButton("Menu");
		retourMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Menu retourMenu = new Menu();
			}
		});
		
		JButton highScoreExit = new JButton("Exit");
		highScoreExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		retour.add(retourMenu, menuList);
		retour.add(highScoreExit, menuList);
		highScore.add(score, BorderLayout.NORTH);
		highScore.add(retour, BorderLayout.SOUTH);
				
		setContentPane(highScore);
		setVisible(true);
		
	}

}
