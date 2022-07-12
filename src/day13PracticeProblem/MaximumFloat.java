package day13PracticeProblem;

public class MaximumFloat {
	public static void main(String[] args) {

		System.out.println("Welcome To Maximum Of Three Generic Program");

		/*
		 *  Creation Of Object
		 *  testMaximum implements maximum of three float
		 */
		MaximumOfThree maximumOfThree = new MaximumOfThree();
		
		Float maxFloat = maximumOfThree.testMaximum(10.2f, 11.3f, 10.5f);
	
		System.out.println("Maximum Float is: " + maxFloat);
	
	}
}

