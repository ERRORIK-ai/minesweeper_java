
//OLD ALTE VERSION (NEU=MINESWEEPER2) 

package calculate;

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
		int mine_counter;
		

		//Oberste Reihe
		for (int x = 0; x < field.length-1; x++) {
			if (field[x][0]!=9) {
			if (field[x-1][0]==9) {mine_counter++;}
			if (field[x-1][1]==9) {mine_counter++;}
			if (field[x][1]==9) {mine_counter++;}
			if (field[x+1][1]==9) {mine_counter++;}
			if (field[x+1][0]==9) {mine_counter++;}
			}
			field[x][0] = mine_counter;
			mine_counter=0;
		}

				
				
				
				
		
		//Die Mittleren Reihen
		for (int x = 0; x < field.length; x++) {
			for (int y = 0; y < field[x].length; y++) {

				for (int check_y=y - 1; check_y<y + 1; check_y++) {
				    for (int check_x=x - 1; check_x<x + 1; check_x++) {
				   if (check_x != 0 AND check_y != 0) {
				   }
				   }
				    }
				}
				
				
				
			}
		}

	// Die Untere Reihe

	return field;
}

}
