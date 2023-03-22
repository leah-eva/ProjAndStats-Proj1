
/**
 * This program tests BirthdayProblem.java, using a few test values for number of
 * trials and number of people.
 * 
 * @author leah-eva
 *
 */

public class BirthdayProblemTest {
	
	/* This is the main method for testing the BirthdayProblem program
	 */
	public static void main(String[] args) {
		
		//create new BirthdayProblem object test
		BirthdayProblem test = new BirthdayProblem();
		
		// Runs the program for 10000 trials and 2 people
		test.run(10000, 2);
		
		// Runs the program for 10000 trials and 23 people
		test.run(10000, 23);
		
		// Runs the program for 10000 trials and 365 people
		test.run(10000, 365);
		
	}
	
}
