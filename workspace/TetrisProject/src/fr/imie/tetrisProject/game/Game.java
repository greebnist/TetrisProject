package fr.imie.tetrisProject.game;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JFrame{

		public Game(){
			JFrame fenetre = new JFrame();
			setSize(400, 500);
			// define the default operation when
			// the frame is closed
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// define the title of the frame
			setTitle("Tetris");
			
			JPanel Game = new JPanel(new BorderLayout());
			
			JButton pause = new JButton("Pause");
			pause.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
					Pause Pause = new Pause();
				}
			});
			
			getContentPane().add(Game);
			setVisible(true);
		}
}
