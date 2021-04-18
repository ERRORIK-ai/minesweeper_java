package calculate;

public class winorlose {

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
		if (countreveal == total_without_mines) {
			winorlose = 1;

		}
		return winorlose;
	}
}
