
//Sources: https://www.youtube.com/watch?v=4Lb-6rxZxx0

import java.util.Random;
import java.util.ArrayList;

/**
 * 
 * This program simulates the famous Monty Hall Problem (Three Doors Problem)
 * to determine the probability of winning the game when switching doors or 
 * staying with the original choice.
 * 
 * @author leah-eva
 *
 */
public class MontyHallSimulation {

	
	
	//create int wins to track number of wins throughout multiple trials
    private int wins;
    
    
    
    /**
     * This method runs the program for a given number of trials, dependent
     * on whether the door choice is changed or not.
     * 
     * @param change A boolean representing whether or not to change the 
     * 		door choice.
     * @param numberOfRuns The number of trials.
     */
    public void run(boolean change, int numberOfRuns) {
    	
    	//checks if the door choice is changed
    	if(change == true) {
    		
    		//runs program with changing door choice
    		runChange(numberOfRuns);
    		
    	}
    	
    	//if door choice is not changed
    	else {
    		
    		//runs program without changing door choice
    		runNoChange(numberOfRuns);
    		
    	}
    	
    	//create double result and store number of wins divided by total number
    	// of trials
    	double result = (wins/(numberOfRuns*1.0));
    	
    	printResult(change, numberOfRuns, result);
    	
    	wins = 0;
    	
    }
    
    
    
    /**
     * This method runs the program without changing door choice.
     * 
     * @param numberOfRuns The number of trials.
     */
    public void runNoChange(int numberOfRuns){
    	
    	//loop through indices from 0 up to numberOfRuns
        for(int i = 0; i < numberOfRuns; i++) {
        	
        	//create new ArrayList theDoors to store door values
            ArrayList<Integer> theDoors = new ArrayList<Integer>();

            //create Random object rng
            Random rng = new Random();

            //create int winningDoor and store random integer from 0 to 3 
            // exclusive
            int winningDoor = rng.nextInt(3);

            //loop through indices from 0 to 3 exclusive
            for(int j = 0; j < 3; j++){
            	
            	//check if index is equal to winning door chosen
                if(j == winningDoor) {
                	
                	//add value 1 to indicate winning door at index j
                    theDoors.add(1);
                    
                }
                
                //if index is not equal to winning door chosen
                else {
                	
                	//add value 0
                    theDoors.add(0);
                    
                }
                
            }

            //create int guess and store random integer from 0 to 3 exclusive 
            // to store random guess
            int guess = rng.nextInt(3);

            //check if original guess is winning door
            if(theDoors.get(guess) == 1){
            	
            	//increment wins, since no guess is not changed
                wins++;
                
            }
            
        }
        
    }
    
    
    
    /**
     * This method runs the program with changing door choice.
     * 
     * @param numberOfRuns The number of trials.
     */
    public void runChange(int numberOfRuns){
        
    	//loop through indices from 0 up to numberOfRuns
        for(int i = 0; i < numberOfRuns; i++) {
        	
        	//create new ArrayList theDoors to store door values
            ArrayList<Integer> theDoors = new ArrayList<Integer>();

            //create Random object rng
            Random rng = new Random();

            //create int winningDoor and store random integer from 0 to 3 
            // exclusive
            int winningDoor = rng.nextInt(3);

            //loop through indices from 0 to 3 exclusive
            for(int j = 0; j < 3; j++){
            	
            	//check if index is equal to winning door chosen
                if(j == winningDoor) {
                	
                	//add value 1 to indicate winning door at index j
                    theDoors.add(1);
                    
                }
                
                //if index is not equal to winning door chosen
                else {
                	
                	//add value 0
                    theDoors.add(0);
                    
                }
                
            }

            //create int guess and store random integer from 0 to 3 exclusive 
            // to store random guess
            int guess = rng.nextInt(3);

            //check if original guess is winning door
            if(theDoors.get(guess) == 1){
            	
                //do nothing since guess is changed from winning door
            	
            }
            
            //if original guess is not winning door
            else{
            	
            	//increment wins since guess is changed TO winning door
                wins++;
                
            }
            
        }
        
    }
    
    

    /**
     * This method gets the current number of wins throughout completed trials.
     * 
     * @return An integer representing the current number of wins throughout 
     * 		completed trials.
     */
    public int getWins(){
    	
        return wins;
        
    }
    
    
    
    /**
     * This method prints the result of the program given whether or not the
     * door choice is changed, the number of trials, and the probability of 
     * winning.
     * 
     * @param change A boolean representing whether or not to change the 
     * 		door choice.
     * @param numberOfRuns The number of trials.
     * @param probability The probability of winning.
     */
	public void printResult(boolean change, int numberOfRuns, double probability) {
		
		System.out.print("Given: ");
		
		System.out.println("\tChange: " + change);
		
		System.out.println("\tTrials: " + numberOfRuns);
		
		System.out.println("The experimental probability of winning the Monty "
				+ "Hall Game is :" + probability);
		System.out.println();
		
	}

}
