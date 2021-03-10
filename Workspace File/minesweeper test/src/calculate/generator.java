package calculate;

import java.util.Random;

public class generator {

	public void main() {
	}

	public generator(int width, int height, int percent_mines, int mines) {

		int[][] field = new int[width][height];

		// If Set PERCENTAGE
		for (int x = 0; x <= width; x++) {
			for (int y = 0; y <= height; y++) {
				if (Math.random() < percent_mines / 10) {
					field[x][y] = 9;
				}
			}
		}

		// IF SET COUNT OF MINES

		int rand_number = Random.nextInt(1 - 0 + 1) + 0;
				if (rand_number=1) {}

	}

}
