import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * This program tests the methods in StatsLibrary.java, BirthdayProblem.java,
 * and MontyHallSimulation.java using a few test values of the data type
 * specified by each method.
 * 
 * @author leah-eva
 *
 */
public class StatsLibraryTester {
	
	public static void main(String args[]) {
		
		
		
		/*
		 * StatsLibrary.java tests
		 * 
		 */
		
		//call default constructor to create a StatsLibrary object
		StatsLibrary test = new StatsLibrary();
		
		//test findMean method
		ArrayList<Integer> someNumbers = new ArrayList<>();
		
		someNumbers.add(2);
		someNumbers.add(3);
		someNumbers.add(1);
		someNumbers.add(4);
		
		double meanResult = test.findMean(someNumbers);
		
		System.out.println("---");
		System.out.println("Test findMean method");
		System.out.println("\tGiven values: " + someNumbers);
		System.out.println("\tAverage of input: " + meanResult);

		//test findMedian method
		double[] coolNumbers = {4,4,4,1,1,2,2,3};
		
		double medianResult = test.findMedian(coolNumbers);
		
		System.out.println("---");
		System.out.println("Test findMedian method");
		System.out.println("\tGiven values: " 
				+ Arrays.toString(coolNumbers));
		System.out.println("\tMedian of input: " 
				+ test.findMedian(coolNumbers));
		
		//test findMode method
		double modeResult = test.findMode(coolNumbers);
		
		System.out.println("---");
		System.out.println("Test findMode method");
		System.out.println("\tGiven values: " 
				+ Arrays.toString(coolNumbers));
		System.out.println("\tMode of input: " + modeResult);

		//test findStandardDeviation method
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(46);
		nums.add(69);
		nums.add(32);
		nums.add(60);
		nums.add(52);
		nums.add(41);
		
		System.out.println("---");
		System.out.println("Test findStandardDeviation method");
		System.out.println("\tGiven values: " + nums);
		System.out.println("\tStandard deviation of input: " 
				+ test.findStandardDeviation(nums));

		//test findVariance method
		System.out.println("---");
		System.out.println("Test findVariance method");
		System.out.println("\tGiven values: " + nums);
		System.out.println("\tVariance of input: " + test.findVariance(nums));
		
		//test findIntersection method
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(2);
		list2.add(4);
		list2.add(6);
		
		System.out.println("---");
		System.out.println("Test findIntersection method");
		System.out.println("\tFirst list: " + list1);
		System.out.println("\tSecond list: " + list2);
		System.out.println("\tIntersection: " 
				+ test.findIntersection(list1, list2));
		
		//test findUnion method
		System.out.println("---");
		System.out.println("Test findUnion method");
		System.out.println("\tFirst list: " + list1);
		System.out.println("\tSecond list: " + list2);
		System.out.println("\tUnion: " 
				+ test.findUnion(list1, list2));
				
		//test findUniqueValues method
		ArrayList<Integer> listWithRepeatedValues = new ArrayList<Integer>();
		
		listWithRepeatedValues.add(1);
		listWithRepeatedValues.add(1);
		listWithRepeatedValues.add(2);
		listWithRepeatedValues.add(7);
		listWithRepeatedValues.add(7);
		listWithRepeatedValues.add(7);
		
		System.out.println("---");
		System.out.println("Test findUniqueValies method");
		System.out.println("\tInput List: " + listWithRepeatedValues);
		System.out.println("\tList of Unique Values: " 
				+ test.findUniqueValues(listWithRepeatedValues));
				
		//test findComplement method
		ArrayList<Integer> universalList = new ArrayList<Integer>();
		
		universalList.add(1);
		universalList.add(4);
		universalList.add(9);
		universalList.add(16);
		universalList.add(25);
		universalList.add(36);
		universalList.add(49);
		
		ArrayList<Integer> subList = new ArrayList<Integer>();
		
		subList.add(4);
		subList.add(25);
		subList.add(36);
		
		System.out.println("---");
		System.out.println("Test findComplement method");
		System.out.println("\tUniversal list: " + universalList);
		System.out.println("\tSublist: " + subList);
		System.out.println("\tComplement of sublist: " 
				+ test.findComplement(universalList, subList));
		
		//test findFactorial method
		int num = 10;
		
		System.out.println("---");
		System.out.println("Test findFactorial method");
		System.out.println("\tInput: " + num);
		System.out.println("\tFactorial of " + num + ": " 
				+ test.findFactorial(num));
		
		//test findNumberOfCombinations method
		int n = 10;
		int r = 2;
		
		System.out.println("---");
		System.out.println("Test findNumberOfCombinations method");
		System.out.println("\tTotal items: " + n);
		System.out.println("\tChosen items: " + r);
		System.out.println("\tTotal possible combinations of " + r 
				+ " objects chosen from " + n + " total objects: "
				+ test.findNumberOfCombinations(n,r));
		
		//test findNumberOfPermutations method
		System.out.println("---");
		System.out.println("Test findNumberOfPermutations method");
		System.out.println("\tTotal items: " + n);
		System.out.println("\tChosen items: " + r);
		System.out.println("\tTotal possible permutations of " + r 
				+ " objects chosen from " + n + " total objects: "
				+ test.findNumberOfPermutations(n,r));
		
		//test findProbabilityBinomial
		int N = 10;
		int y = 7;
		double p = 0.8;
		
		System.out.println("---");
		System.out.println("Test findProbabilityBinomial method");
		System.out.println("\tNumber of trials: " + N);
		System.out.println("\tNumber of successes: " + y);
		System.out.println("\tProbability of success: " + p);
		System.out.println("\tProbability of " + y + " successes after " 
				+ N + " trials: " + test.findProbabilityBinomial(N,y,p));
		
		//test findProbabilityGeometric
		int x = 6;
		double P = 0.5;
		
		System.out.println("---");
		System.out.println("Test findProbabilityGeometric method");
		System.out.println("\tTrial of first success: " + x);
		System.out.println("\tProbability of success: " + P);
		System.out.println("\tProbability of obtaining first success on trial " 
				+ x + ": " + test.findProbabilityGeometric(x, P));
		
		/*
		 * BirthdayProgram.java tests
		 * 
		 */
		
		//call default constructor to create a BirthdayProgram object
		BirthdayProblem birthdayTest = new BirthdayProblem();
		
		// Runs the program for 10000 trials and 2 people
		birthdayTest.run(10000, 2);
				
		// Runs the program for 10000 trials and 23 people
		birthdayTest.run(10000, 23);
				
		// Runs the program for 10000 trials and 365 people
		birthdayTest.run(10000, 365);
		
		
		/*
		 * MontyHallSimulation.java tests
		 * 
		 */
		
		//call default constructor to create a MontyHallSimulation object
		
	}
}
