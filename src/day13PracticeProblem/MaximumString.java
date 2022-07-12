package day13PracticeProblem;

public class MaximumString {
	public static void main(String[] args) {

		System.out.println("Welcome To Maximum Of Three Generic Program");

		/*
		 * Creation Of Object
		 * testMaximum implements maximum of three String
		 */
		MaximumOfThree maximumOfThree = new MaximumOfThree();
		String maxString = maximumOfThree.testMaximum("Apple", "Banana", "Orange");
		System.out.println("Maximum String is: " + maxString);

	}
}




