package guitest;

import org.junit.*;

import gui.Settings;

public class settingstest {

	private Settings set;

	@Before
	public void init() {
		set = new Settings();
	}

	//Testet actionPerformed
	@Test(expected = NullPointerException.class)
	public void testactionPerformedNullPointerException() {
		set.actionPerformed(null);
	}

	@Test
	public void testisNumeric() {
		set.isNumeric("");
	}

}
