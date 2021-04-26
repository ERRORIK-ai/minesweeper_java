package calculate;

import org.junit.*;

public class generatortest {

	private generator gen;

	@Before
	public void init() {
		gen = new generator();
	}

	//Testet Generator
	@Test
	public void testgenerator() {
		gen.generator(10, 10, 10, 10);
	}

	@Test(expected = NegativeArraySizeException.class)
	public void testgeneratorNegativeArraySizeExceptionIllegalArgument() {
		gen.generator(-10, -10, -10, -10);
	}

	//Testet Calc
	int[][] calcarray = new int[3][3];

	@Test
	public void testcalc() {
		gen.calc(calcarray, 3, 3);
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testcalcArrayIndexOutOfBoundsException() {
		gen.calc(calcarray, 1, 1);
	}

}
