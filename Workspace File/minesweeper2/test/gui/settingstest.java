package gui;

import org.junit.*;

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
