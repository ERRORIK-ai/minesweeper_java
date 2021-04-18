package calculate;

public class reveal {
	public static boolean[][] donotcheck;

	public static boolean[][] reveal(boolean[][] reveal, int[][] field, int width, int height, int pos_x, int pos_y) {

		reveal[pos_x][pos_y] = true;

		// Falls Spielereingabe eine Null ist
		if (field[pos_x][pos_y] == 0) {
			setzero(reveal, pos_x, pos_y);
		}
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
