package rushithaa;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
/**
 * This is a functional test which needs to return success in a particular time period 
 * This will calculate the time differnce between the start and end time and returns true if it is executed before the mentioned time interval.
 * @author rushitha
 * @version 0.1
 * since 09-06-2022
 *
 */
public class fts {

	@Test
	public void sst() {
	
		Sd1 play2 = new Sd1();
		double mrr[]= {10,63,39,95,29,19,56,62,20,83,92,96,72,30,80,82,84,40,19,49,92,34,50,11,12,55,45,65,75,85,95,24,26,27,13,14,15,88,99,77,66,22,11,64,68,97,99,05,34,24,16,17,18,14,15};
		double start = System.currentTimeMillis();
		double op = play2.runsts(mrr);
		double end = System.currentTimeMillis();
		double finalt = end-start;
		assertTrue(finalt<40);}
	
}