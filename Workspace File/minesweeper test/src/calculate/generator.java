package calculate;

import java.util.Random;

public class generator {

	public static int[][] generator(int width, int height, double percent_mines, double mines) {

		int[][] field = new int[width][height];
		if (mines == 0) {
			// If Set PERCENTAGE
			for (int x = 0; x < width; x++) {
				for (int y = 0; y < height; y++) {
					double asfddas = Math.random();
					if (asfddas < percent_mines / 100) {
						field[x][y] = 9;
					}
				}
			}
		} else if (percent_mines == 0) {
			// IF SET COUNT OF MINES
			int count_mines = 0;
			for (; count_mines < mines;) {
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
		return field;
	}

	public static int[][] calc(int[][] field) {
		int check_num_x;
		int check_num_y;
		
		int m = field.length;
        int n = field[0].length;
        int[][] C = new int[n][m];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                C[j][i] = A[i][j];
        return C;
    }

		return field;
	}

}
