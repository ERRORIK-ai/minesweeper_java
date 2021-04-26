package gui;

import org.junit.*;

public class gametest {

	private game ga;

	@Before
	public void init() {
		ga = new game();
	}

	public static Settings settingstest = new Settings();

	//Testet gameloop
	@Test
	public void testgameloopn() {
		ga.gameloop(settingstest);
	}

}
