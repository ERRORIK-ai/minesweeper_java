package start;

import org.junit.*;

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
