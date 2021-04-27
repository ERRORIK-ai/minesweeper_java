package calculate;

public class generator {

	public static int[][] generator(int width, int height, double percent_mines, double mines) {

		// Generiere Minesweeperfeld
		int[][] field = new int[width][height];

		if (mines > 0 && percent_mines == 0) {
			// IF SET COUNT OF MINES
			int count_mines = 0;

			while (count_mines < mines) {

				while (count_mines < mines) {

					for (int x = 0; x < width; x++) {
						for (int y = 0; y < height; y++) {
							if (Math.random() < mines / (width * height) && count_mines < mines && field[x][y] != 9) {
								field[x][y] = 9;
								count_mines++;
							}
						}
					}
				}

			}
		} else {
			// Falls kein Prozentwert mitgegeben wurde, wird 10% genommen
			if (percent_mines == 0)
				percent_mines = 10;

			// If Set PERCENTAGE
			for (int x = 0; x < width; x++) {
				for (int y = 0; y < height; y++) {
					double asfddas = Math.random();
					if (asfddas < percent_mines / 100) {
						field[x][y] = 9;
					}
				}
			}
		}

		return field;
	}

	//Rechne umliegende Minen zusammen
	public static int[][] calc(int[][] mapB) {
		int surrounding = 0;
		for (int xa = 0; xa < mapB.length; xa++) {
			for (int ya = 0; ya < mapB[0].length; ya++) {
				for (int xb = -1; xb <= 1; xb++) {
					for (int yb = -1; yb <= 1; yb++) {
						try {
							if (mapB[xa + xb][ya + yb] == 9 && !(xb == 0 && yb == 0)) {
								surrounding++;
							}
						} catch (IndexOutOfBoundsException e) {
						}
					}
				}
				if (mapB[xa][ya] != 9) {
					mapB[xa][ya] = surrounding;
				}
				surrounding = 0;
			}
		}
		return mapB;
	}

}
