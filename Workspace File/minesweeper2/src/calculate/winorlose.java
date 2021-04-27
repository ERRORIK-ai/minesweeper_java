package calculate;

public class winorlose {

	//kontrolliert ob man schon gewonnen oder verloren hat
	public static boolean winorlose(int[][] mapB, byte[][] markedfields) {
		for (int yb = 0; yb < mapB[0].length; yb++) {
			for (int xb = 0; xb < mapB.length; xb++) {
				if (mapB[xb][yb] != 9 && markedfields[xb][yb] != 1) {
					return false;
				}
			}
		}
		return true;
	}
}
