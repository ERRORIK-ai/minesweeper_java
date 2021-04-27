package calculatetest;

import org.junit.*;

import calculate.reveal;

public class revealtest {

	private reveal rev;

	@Before
	public void init() {
		rev = new reveal();
	}

	//Testet reveal
	byte[][] revarraybol = new byte[3][3];
	int[][] revarrayint = new int[3][3];
	
	@Test
	public void testreveal() {
		rev.reveal(revarrayint, revarraybol, 3, 3);
		rev.reveal(revarrayint, revarraybol, 3, 6);
		rev.reveal(revarrayint, revarraybol, 6, 2);
	}

}
