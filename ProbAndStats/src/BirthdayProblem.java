
//Sources: https://www.youtube.com/watch?v=KtT_cgMzHx8

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

/**
 * This program calculates the experimental probability of at least two 
 * people in a group having the same birthday.
 * 
 * @author leah-eva
 *
 */
public class BirthdayProblem {
	
	
	
	//An integer to store the number of birthday matches
	private int numberOfCollisions;
	
	
	
	/**
	 * This method runs the program for a given number of trials and a given
	 * number of people. 
	 * 
	 * @param numberOfTrials The number of trials.
	 * @param numberOfPeople The number of people in the group.
	 */
	public void run(int numberOfTrials, int numberOfPeople) {
		
		//loop through indices from 0 up to given numberOfTrials
		for(int i = 0; i < numberOfTrials; i++) {
			
			//create new ArrayList birthdays
			ArrayList<Integer> birthdays = generateRandomBirthdays(numberOfPeople);
			
			//check if there is at least one birthday match in the ArrayList
			// birthdays
			if(birthdayCollision(birthdays) == true) {
				
				//increment numberOfCollisions
				numberOfCollisions++;
				
			}
			
		}
		
		//create double probability to store the number of trials that have a 
		// birthday collision divided by the total numberOfTrials
		double probability = ((double)numberOfCollisions) / 
				((double)numberOfTrials);
		
		printResult(numberOfTrials, numberOfPeople, probability);
		
		//reset numberOfCollisions to 0 for next run
		numberOfCollisions = 0;
		
	}
	
	
	
	/**
	 * This method gets the number of trials in which at least one birthday 
	 * match was found.
	 * 
	 * @return An integer representing the number of trials in which at least 
	 * 		one birthday match was found.
	 */
	public int getNumberOfCollisions() {
		
		return numberOfCollisions;
		
	}
	
	
	
	/**
	 * This method generates random birthdays for a group of people.
	 * 
	 * @param numberOfPeople The number of people.
	 * @return An ArrayList of Integer objects representing the birthdays of 
	 * 		a group of people.
	 */
	public ArrayList<Integer> generateRandomBirthdays(int numberOfPeople){
		
		//create new ArrayList birthdays
		ArrayList<Integer> birthdays = new ArrayList<Integer>();
		
		//create new Random object rand
		Random rand = new Random();
		
		//loop through indices from 0 up to given numberOfPeople
		for(int i = 0; i < numberOfPeople; i++) {
			
			//create int bday to store random integer from 0 to 365 exclusive
			int bday = rand.nextInt(365);
			
			//add random integer bday to ArrayList birthdays
			birthdays.add(bday);
			
		}
		
		//return ArrayList of random birthdays
		return birthdays;
		
	}
	
	
	
	/**
	 * This method finds whether or not there is a birthday match in a 
	 * group of birthdays.
	 * 
	 * @param birthdays An ArrayList of Integer objects representing 
	 * 		birthdays. 
	 * @return A boolean representing whether or not there is at least one
	 * 		birthday match.
	 */
	public boolean birthdayCollision(ArrayList<Integer> birthdays) {
		
		//sort given ArrayList birthdays
		Collections.sort(birthdays);
		
		//create int numberOfPeople to store size of ArrayList birthdays
		int numberOfPeople = birthdays.size();
		
		//loop through indices in sorted ArrayList excluding index 0
		for (int i = 1; i < numberOfPeople;i++) {
			
			//create int firstValue and store value at previous index
			int firstValue = birthdays.get(i-1);
			
			//create int secondValue and store value at current index
			int secondValue = birthdays.get(i);
			
			//check if value at previous index is equal to value at current
			//index
			if (firstValue == secondValue) {
				
				//return true to indicate a birthday match being found
				return true;
				
			}
			
		}
		
		//return false to indicate that no birthday match has been found
		return false;
		
	}
	
	
	
	/**
	 * Prints the results of the program given the number of runs, the 
	 * number of people in the group, and the experimental probability of
	 * at least one birthday match.
	 * 
	 * @param numberOfRuns The number of trials.
	 * @param numberOfPeople The number of people in the group.
	 * @param probability A double representing the experimental probability
	 * 		of at least one birthday match.
	 */
	public void printResult(int numberOfTrials, int numberOfPeople, double probability) {
		
		System.out.print("Given: ");
		
		System.out.println(numberOfPeople + " people, over " + numberOfTrials + " runs,");
		
		System.out.println("the experimental probability of any two people having the same birthday is " + probability + ".");
		
		System.out.println();
		
	}
	
}
