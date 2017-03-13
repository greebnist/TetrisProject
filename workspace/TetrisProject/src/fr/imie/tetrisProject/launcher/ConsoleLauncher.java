package fr.imie.tetrisProject.launcher;

public class ConsoleLauncher {

	public static void main(String[] args) {

		ConsoleLauncher launcher = new ConsoleLauncher();
		launcher.start();
	}

	public void start() {
		try {

			int[][] plateau = new int[21][10];
			for (int i = 0; i < plateau.length; i++) {
				for (int j = 0; j < plateau[0].length; j++) {
					System.out.print(plateau[i][j] = 0);
				}
				System.out.print("\n");
			}
			System.out.println("Génial!!");

			int p = 3;
			int score = 0;
			int s = 0;

			if (p != 0) {
				// Pour 1 ligne ajout de 10pts
				if (p == 1) {
					s = 10;
				}
				// Pour 2 lignes ajout de 30pts
				if (p == 2) {
					s = 30;
				}
				// Pour 3 lignes ajout de 50pts
				if (p == 3) {
					s = 50;
				}
				// Pour 4 lignes ajout de 80pts
				if (p == 4) {
					s = 80;
				}
				// calcul du score
				score += s;
			}
			System.out.println(s);
			System.out.println(score);

		} catch (Exception e) {
			return;
		}

	}

}
