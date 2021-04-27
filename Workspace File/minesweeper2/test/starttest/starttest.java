package starttest;

import org.junit.*;

import start.start;

public class starttest {

	private start start;

	@Before
	public void init() {
		start = new start();
	}

	//Testet main
	@Test
	public void testmain() {
		start.main(null);

	}
}
