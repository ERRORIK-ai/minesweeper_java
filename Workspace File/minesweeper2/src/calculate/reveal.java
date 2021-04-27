package calculate;

public class reveal {

	// Berechnung zur Aufdeckung von Karten
	public static byte[][] reveal(int[][] mapB, byte[][] markedfields, int x, int y) {

		for (int yb = -1; yb <= 1; yb++) {
			for (int xb = -1; xb <= 1; xb++) {
				try {
					if (markedfields[x + xb][y + yb] != 1) {
						markedfields[x + xb][y + yb] = 1;
						if (mapB[x + xb][y + yb] == 0) {
							reveal(mapB, markedfields,x + xb, y + yb);
						}
					}
				} catch (IndexOutOfBoundsException e) {
				}
			}
		}
		return markedfields;
	}
}
