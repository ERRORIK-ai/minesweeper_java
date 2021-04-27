package calculatetest;

import org.junit.*;

import calculate.winorlose;

public class winorlosetest {

	private winorlose win;

	@Before
	public void init() {
		win = new winorlose();
	}
	
	//Testet Winorlose
	byte[][] winarraybol = new byte[3][3];
	int[][] winarrayint = new int[3][3];
	
	@Test
	public void testwinorlose() {
		win.winorlose(winarrayint, winarraybol);
	}



}
