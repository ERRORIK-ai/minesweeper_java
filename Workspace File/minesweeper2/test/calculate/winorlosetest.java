package calculate;

import org.junit.*;

public class winorlosetest {

	private winorlose win;

	@Before
	public void initgenerator() {
		win = new winorlose();
	}

	boolean[][] winarraybol = new boolean[3][3];
	int[][] winarrayint = new int[3][3];

	@Test
	public void testrevealNullPointerException() {
		win.winorlose(winarraybol, winarrayint, 2, 2);
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testrevealArrayIndexOutOfBoundsException() {
		win.winorlose(winarraybol, winarrayint, 4, 4);
	}

}
