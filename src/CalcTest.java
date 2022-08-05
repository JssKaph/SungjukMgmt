import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalcTest {

	@Test
	public void testCalc() {
		Student [] array = {new Student("2022-001", "한지민", 67,89,100,77)};
		Calc calc = new Calc(array);
		calc.calc(1);
		assertEquals(67+89+100+77, array[0].getTot());
	}
}