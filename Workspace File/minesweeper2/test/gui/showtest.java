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

	@Test
	public void testshow() {
		sho.show();
	}

	@Test(expected = NullPointerException.class)
	public void testpaintNullPointerException() {
		sho.paint(null);
	}

	@Test
	public void testaddButtons() {
		sho.addButtons(null, 0, 0, shoarrayint, shoarrayby);
	}

	@Test(expected = NullPointerException.class)
	public void testactionPerformedNullPointerException() {
		sho.actionPerformed(null);
	}

	@Test
	public void testsurrounding() {
		sho.surrounding();
	}

	@Test
	public void testrevealmap() {
		sho.revealmap(0, 0);
	}

	@Test
	public void testwin() {
		sho.win();
	}

}
