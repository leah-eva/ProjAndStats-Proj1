
/**
 * This program tests MontyHallSimulation.java using test values for the number
 * of trials and whether the original door guess is changed or not.
 * 
 * @author leah-eva
 *
 */

public class MontyHallSimulationTest {
	
	//This is the main method for testing MontyHallSimulation.java
	public static void main(String[] args) {
		
		//create a MontyHallSimulation instance test
        MontyHallSimulation test = new MontyHallSimulation();
        
        //runs program for 3000 trials with change
        test.run(true, 3000);
        
        //runs program for 3000 trials without change
        test.run(false, 3000);
        
    }
	
}
