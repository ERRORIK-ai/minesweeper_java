package calculate;

import org.junit.*;

public class revealtest {

	private reveal rev;

	@Before
	public void init() {
		rev = new reveal();
	}

	boolean[][] revarraybol = new boolean[3][3];
	int[][] revarrayint = new int[3][3];

	@Test(expected = NullPointerException.class)
	public void testrevealNullPointerException() {
		rev.reveal(revarraybol, revarrayint, 3, 3, 2, 1);
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testrevealArrayIndexOutOfBoundsException() {
		rev.reveal(revarraybol, revarrayint, 3, 3, 2, 3);
		rev.reveal(revarraybol, revarrayint, 4, 3, 3, 1);
	}

}
