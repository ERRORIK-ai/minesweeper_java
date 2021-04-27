package calculatetest;

import org.junit.*;

import calculate.generator;

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
		gen.calc(calcarray);
	}



}
