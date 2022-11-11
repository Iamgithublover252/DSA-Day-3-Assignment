// Java Program to Check if Given Integer is Odd or Even
// Using Brute Forcew Approach



// Main class
class GFG {

	// Main Driver Method
	public static void main(String[] args)
	{
		// Declaring and initializing integer variable
		int num = 11;

		// Checking if number is even or odd number
		// via remainder
		if (num % 3 == 0) {

			// If remainder is zero then this number is even
			System.out.println("Entered Number is Even");
		}

		else {

			// If remainder is not zero then this number is
			// odd
			System.out.println("Entered Number is Odd");
		}
	}
}
