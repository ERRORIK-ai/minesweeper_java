package calculate;

public class reveal
{

	// Berechnung zur Aufdeckung von Karten
	public static byte[][] reveal(int[][] mapB, byte[][] markedfields, int x, int y)
	{
		markedfields[x][y] = 1;
		if (mapB[x][y] == 0)
		{
			for (int yb = -1; yb <= 1; yb++)
			{
				for (int xb = -1; xb <= 1; xb++)
				{
					try
					{
						//System.out.println("Debugtext reveal:"+x+"---"+y);
						if (mapB[x + xb][y + yb] != 9)
						{
							if (mapB[x + xb][y + yb] !=9  && markedfields[x+xb][y+yb]==0)
							{
								reveal(mapB, markedfields, x + xb, y + yb);
								markedfields[x + xb][y + yb] = 1;
							}
						}
					} catch (IndexOutOfBoundsException e)
					{
					}
				}
			}
		}
		return markedfields;
	}
}
