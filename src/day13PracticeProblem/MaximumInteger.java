package day13PracticeProblem;

public class MaximumInteger  {
	public static void main(String[] args) {
		System.out.println("Welcome To Maximum Of Three Generic Program");
		/*
		 * Creation Of Object
		 * testMaximum implements maximum of three integer
		 */
		MaximumOfThree maximumOfThree = new MaximumOfThree();
		Integer maxInt = maximumOfThree.testMaximum(20, 25, 15);
		System.out.println("Maximum Integer is: " + maxInt);

	}
}
