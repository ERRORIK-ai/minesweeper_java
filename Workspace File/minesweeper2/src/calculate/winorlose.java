package calculate;

public class winorlose {

	//kontrolliert ob man schon gewonnen oder verloren hat
	public static int winorlose(boolean[][] reveal, int[][] field, int width, int height) {
		int winorlose = 0;
		int countreveal = 0;
		int total_without_mines = 0;
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				if (field[x][y] != 9) {
					total_without_mines++;
				}

				if (reveal[x][y] == true && field[x][y] == 9) {
					winorlose = -1;

				}

				if (reveal[x][y] == true && field[x][y] != 9) {
					countreveal++;
				}
			}
		}
		//Wenn alle aufgedeckten Felder gleich alle Felder ohne Minen, dann winorlose = 1
		if (countreveal == total_without_mines) {
			winorlose = 1;

		}
		//Wenn (winorlose = 1)Gewonnen
		//Wenn (winorlose = 0)Spiel geht weiter
		//Wenn (winorlose = -1)Verloren
		return winorlose;
	}
}
