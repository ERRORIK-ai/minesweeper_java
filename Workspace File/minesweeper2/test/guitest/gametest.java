package guitest;

import org.junit.*;

import gui.Settings;
import gui.game;

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
