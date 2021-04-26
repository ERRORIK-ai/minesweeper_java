package gui;

import org.junit.*;

public class gametest {

	private game ga;

	@Before
	public void initgenerator() {
		ga = new game();
	}

	public static Settings settingstest = new Settings();

	@Test
	public void testgameloopn() {
		ga.gameloop(settingstest);
	}

}
