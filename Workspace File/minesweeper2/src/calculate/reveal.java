package calculate;

public class reveal {

	public static boolean[][] reveal(boolean[][] reveal, int[][] field, int width, int height, int pos_x, int pos_y) {

		
		if (field[pos_x][pos_y]==0) {
			
			
			
			
			
			
		}
		
		
		
		
		try {
			

		} catch (ArrayIndexOutOfBoundsException exception) {
			// handleTheExceptionSomehow(exception);
			// do nothing
		}

		return reveal;
	}

	public static boolean[][] create(int width, int height) {
		boolean[][] reveal = new boolean[width][height];

		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				reveal[x][y] = false;
			}
		}

		return reveal;
	}
	
    public void clearBlanks(int i, int j) {
        if (i==-1 || i==TILE_COLUMNS || j==-1 || j==TILE_ROWS  || getTileAt(i,j).isRaised()==false) 
            return;
        if (Mines [i][j]!=' ') {
            PressTile (getTileAt(i,j), false);
            return;
        }
        PressTile (getTileAt(i,j), false);
        for (int p=-1;p<=1;p++) {
            for (int q=-1;q<=1;q++) {
                clearBlanks (i+p,j+q);
            }
        }
    }

}
