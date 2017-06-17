package interviewqustions;

public class Recursion_factorial {

	/**
	 * @param args
	 */
	static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 4;// It is the number to calculate factorial
		System.out.println("Factorial of " + number + " is: " + factorial(number));

	}

	

}
