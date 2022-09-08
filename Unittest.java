package rushithaa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * This is a unit test performed for the Standard deviation variables
 * @author rushitha
 * @version 0.1
 * since 09-06-2022
 *We need to get the positive test case
 */
class Unittest {

	@Test
	void test() {
		Sd1 me7 = new Sd1();
		double arr2[]= {77,34,65,23,88,95,62,11};
		double op = me7.runsts(arr2);
		assertEquals(30.925890678939457,op);
	}

}
