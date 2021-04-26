package gui;

import org.junit.*;

public class showtest {

	private show sho;

	byte[][] shoarrayby = new byte[3][3];
	int[][] shoarrayint = new int[3][3];

	@Before
	public void init() {
		sho = new show(shoarrayint, shoarrayby);
	}

	//Testet show
	@Test
	public void testshow() {
		sho.show();
	}

	//Testet paint
	@Test(expected = NullPointerException.class)
	public void testpaintNullPointerException() {
		sho.paint(null);
	}

	//Testet addButtons
	@Test
	public void testaddButtons() {
		sho.addButtons(null, 0, 0, shoarrayint, shoarrayby);
	}

	//Testet actionPerformed
	@Test(expected = NullPointerException.class)
	public void testactionPerformedNullPointerException() {
		sho.actionPerformed(null);
	}

	//Testet surrounding
	@Test
	public void testsurrounding() {
		sho.surrounding();
	}

	//Testet revealmap
	@Test
	public void testrevealmap() {
		sho.revealmap(0, 0);
	}

	//Testet win
	@Test
	public void testwin() {
		sho.win();
	}

}
