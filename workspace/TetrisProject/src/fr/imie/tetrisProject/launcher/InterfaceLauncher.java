package fr.imie.tetrisProject.launcher;

import Interface.Interface;
import fr.imie.tetrisProject.game.Menu;
import fr.imie.tetrisProject.game.Pause;

public class InterfaceLauncher {

	public static void main(String[] args) {
		System.out.println("Welcome aboard!");
		InterfaceLauncher launcher = new InterfaceLauncher();
		launcher.start();

	}

	public void start() {

		try {

			new Menu();
			System.out.println("Génial!!");
			/*new Pause();
			System.out.println("Pause fonctionne");

			/*
			 * JFrame fenetre = new JFrame(); setSize(400, 300); // define the
			 * default operation when // the frame is closed
			 * setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // define the
			 * title of the frame setTitle("Tetris");
			 * 
			 * /*JPanel p2 = new JPanel(); p2.setBackground(Color.white);
			 * 
			 * JLabel Game_Over = new JLabel(new ImageIcon("./Game_Over.png"));
			 * p2.add(Game_Over); Game_Over.setLayout(null);
			 * 
			 * JButton start = new JButton("My button"); p2.add(new
			 * JButton("Exit"));
			 * 
			 * getContentPane().add(p2); setVisible(true);
			 */

		} catch (Exception e) {
			return;
		}
	}
}
