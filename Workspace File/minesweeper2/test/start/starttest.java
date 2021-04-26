package start;

import org.junit.*;

public class starttest {

	private start start;

	@Before
	public void initstart() {
		start = new start();
	}

	@Test
	public void testmain() {
		start.main(null);

	}
}
