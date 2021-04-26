package calculate;

public class reveal {
	//Felder die schon kontrolliert wurden, werden in dieser Array abgespeichert
	public static boolean[][] donotcheck;

	public static boolean[][] reveal(boolean[][] reveal, int[][] field, int width, int height, int pos_x, int pos_y) {

		reveal[pos_x][pos_y] = true;

		// Falls die Koordinaten des Spielers Null ist, werden die umliegenden Feldern auch aufgedeckt
		if (field[pos_x][pos_y] == 0) {
			setzero(reveal, pos_x, pos_y);
		}
		
		//Falls ein leeres Feld aufgedeckt ist, werden die umliegenden Feldern auch aufgedeckt
		for (int i = 0; i < 1; i = i) {
			i = 1;
			for (int x = 0; x < width; x++) {
				for (int y = 0; y < height; y++) {
					if (field[x][y] == 0 && reveal[x][y] == true && donotcheck[x][y] == false) {

						setzero(reveal, x, y);
						donotcheck[x][y] = true;
						i = 0;
					}
				}
			}

		}
		return reveal;
	}

	//Hier werden die Arrays erstellt und mit dem Wert false gefüllt
	public static boolean[][] createreveal(int width, int height) {
		boolean[][] reveal = new boolean[width][height];
		donotcheck = new boolean[width][height];

		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				reveal[x][y] = false;
				donotcheck[x][y] = false;
			}
		}

		return reveal;
	}

	//Setzt umliegende Felder auf true (aufgedeckt) von der koordinate pos_x / pos_y
	public static boolean[][] setzero(boolean[][] reveal, int pos_x, int pos_y) {

		try {
			reveal[pos_x + 1][pos_y] = true;
		} catch (ArrayIndexOutOfBoundsException exception) {
		}

		try {
			reveal[pos_x + 1][pos_y + 1] = true;
		} catch (ArrayIndexOutOfBoundsException exception) {
		}

		try {
			reveal[pos_x][pos_y + 1] = true;
		} catch (ArrayIndexOutOfBoundsException exception) {
		}

		try {
			reveal[pos_x - 1][pos_y + 1] = true;
		} catch (ArrayIndexOutOfBoundsException exception) {
		}

		try {
			reveal[pos_x - 1][pos_y] = true;
		} catch (ArrayIndexOutOfBoundsException exception) {
		}

		try {
			reveal[pos_x - 1][pos_y - 1] = true;
		} catch (ArrayIndexOutOfBoundsException exception) {
		}

		try {
			reveal[pos_x][pos_y - 1] = true;
		} catch (ArrayIndexOutOfBoundsException exception) {
		}

		try {
			reveal[pos_x + 1][pos_y - 1] = true;
		} catch (ArrayIndexOutOfBoundsException exception) {
		}

		return reveal;

	}

}
