package fr.imie.tetrisProject.game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Menu extends JFrame {

	public Menu() {

		JFrame fenetre = new JFrame();
		setSize(400, 500);
		// define the default operation when
		// the frame is closed
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// define the title of the frame
		setTitle("Tetris");
		
		JPanel panneau = new JPanel(new BorderLayout());
		
		JLabel titre = new JLabel("Tetris",SwingConstants.CENTER);
		titre.setPreferredSize(new Dimension (30,100));
		titre.setBorder(BorderFactory.createLineBorder(Color.black));
		Font font = new Font("Arial",Font.BOLD,18);
		titre.setFont(font);
		fenetre.add(titre);
		
		JPanel menu = new JPanel(new GridBagLayout());
		GridBagConstraints menuList = new GridBagConstraints();
		
		JButton start = new JButton("New Game");
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Game game = new Game();
			}
		});

		JButton score = new JButton("High Score");
		score.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				HighScore highScore = new HighScore();

			}
		});

		JButton quit = new JButton("Exit");
		quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		menuList.insets = new Insets(15, 0, 15, 0);
		menuList.gridwidth = GridBagConstraints.REMAINDER;
		menuList.fill = GridBagConstraints.HORIZONTAL;
		menu.add(start, menuList);
		menu.add(score, menuList);
		menu.add(quit, menuList);

		panneau.add(titre, BorderLayout.NORTH);
		panneau.add(menu, BorderLayout.CENTER);

		setContentPane(panneau);
		setVisible(true);
	}

}
