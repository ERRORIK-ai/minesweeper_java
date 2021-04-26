package calculate;

public class generator {

	public static int[][] generator(int width, int height, double percent_mines, double mines) {
		// percent_mines=15;
		// mines=0;
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

	public static int[][] calc(int[][] field, int width, int height) {

		int mine_counter = 0;

		height = height - 1;
		width = width - 1;

		// Oberste Reihe
		for (int y = 1; y < height; y++) {
			if (field[0][y] != 9) {
				if (field[0][y - 1] == 9) {
					mine_counter++;
				}
				if (field[1][y - 1] == 9) {
					mine_counter++;
				}
				if (field[1][y] == 9) {
					mine_counter++;
				}
				if (field[1][y + 1] == 9) {
					mine_counter++;
				}
				if (field[0][y + 1] == 9) {
					mine_counter++;
				}
				field[0][y] = mine_counter;
				mine_counter = 0;
			}

		}

		// Oberen Ecken
		if (field[0][0] != 9) {
			mine_counter = 0;
			if (field[1][0] == 9) {
				mine_counter++;
			}
			if (field[1][1] == 9) {
				mine_counter++;
			}
			if (field[0][1] == 9) {
				mine_counter++;
			}
			field[0][0] = mine_counter;
			mine_counter = 0;
		}

		if (field[0][height] != 9) {
			mine_counter = 0;
			if (field[1][height] == 9) {
				mine_counter++;
			}
			if (field[1][height - 1] == 9) {
				mine_counter++;
			}
			if (field[0][height - 1] == 9) {
				mine_counter++;
			}
			field[0][height] = mine_counter;
			mine_counter = 0;
		}

		// Die Mittleren Reihen
		for (int x = 1; x < height; x++) {
			for (int y = 1; y < width; y++) {

				if (field[y][x] != 9) {
					if (field[y - 1][x + 1] == 9) {
						mine_counter++;
					}
					if (field[y - 1][x] == 9) {
						mine_counter++;
					}
					if (field[y - 1][x - 1] == 9) {
						mine_counter++;
					}
					if (field[y][x - 1] == 9) {
						mine_counter++;
					}
					if (field[y + 1][x - 1] == 9) {
						mine_counter++;
					}
					if (field[y + 1][x] == 9) {
						mine_counter++;
					}
					if (field[y + 1][x + 1] == 9) {
						mine_counter++;
					}
					if (field[y][x + 1] == 9) {
						mine_counter++;
					}
					field[y][x] = mine_counter;
					mine_counter = 0;
				}

			}
		}

		// Die Unterste Reihe
		for (int y = 1; y < height; y++) {
			if (field[width][y] != 9) {
				if (field[width][y - 1] == 9) {
					mine_counter++;
				}
				if (field[width - 1][y - 1] == 9) {
					mine_counter++;
				}
				if (field[width - 1][y] == 9) {
					mine_counter++;
				}
				if (field[width - 1][y + 1] == 9) {
					mine_counter++;
				}
				if (field[width][y + 1] == 9) {
					mine_counter++;
				}
				field[width][y] = mine_counter;
				mine_counter = 0;
			}
		}

		// Unteren Ecken

		if (field[width][0] != 9) {
			if (field[width][1] == 9) {
				mine_counter++;
			}
			if (field[width - 1][1] == 9) {
				mine_counter++;
			}
			if (field[width - 1][0] == 9) {
				mine_counter++;
			}
			field[width][0] = mine_counter;
			mine_counter = 0;
		}

		if (field[width][height] != 9) {
			if (field[width][height - 1] == 9) {
				mine_counter++;
			}
			if (field[width - 1][height - 1] == 9) {
				mine_counter++;
			}
			if (field[width - 1][height] == 9) {
				mine_counter++;
			}
			field[width][height] = mine_counter;
			mine_counter = 0;
		}

		// Die Linke Reihe
		for (int x = 1; x < width; x++) {
			if (field[x][0] != 9) {
				if (field[x - 1][0] == 9) {
					mine_counter++;
				}
				if (field[x + 1][0] == 9) {
					mine_counter++;
				}
				if (field[x + 1][1] == 9) {
					mine_counter++;
				}
				if (field[x - 1][1] == 9) {
					mine_counter++;
				}
				if (field[x][1] == 9) {
					mine_counter++;
				}
				field[x][0] = mine_counter;
				mine_counter = 0;
			}
		}

		// Die Rechte Reihe
		for (int x = 1; x < width; x++) {
			if (field[x][height] != 9) {
				if (field[x - 1][height] == 9) {
					mine_counter++;
				}
				if (field[x + 1][height] == 9) {
					mine_counter++;
				}
				if (field[x + 1][height - 1] == 9) {
					mine_counter++;
				}
				if (field[x - 1][height - 1] == 9) {
					mine_counter++;
				}
				if (field[x][height - 1] == 9) {
					mine_counter++;
				}
				field[x][height] = mine_counter;
				mine_counter = 0;
			}
		}

		return field;
	}

}
