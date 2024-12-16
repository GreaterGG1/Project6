package Project6;

public class PrimeNumberMethod {
	public static void main(String[] args) {
	    System.out.println("The first 50 prime numbers are \n");
	    printPrimeNumbers(50);
	  }

	  public static void printPrimeNumbers(int numberOfPrimes) {
	    final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
	    int count = 0; // Count the number of prime numbers
	    int number = 2; // A number to be tested for primeness

	    // Repeatedly find prime numbers
	    while (count < numberOfPrimes) {
	      // Print the prime number and increase the count
	      if (isPrime(number)) {
	        count++; // Increase the count

	        if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
	          // Print the number and advance to the new line
	          System.out.printf("%-5s\n", number);
	        }
	        else
	          System.out.printf("%-5s", number);
	      }

	      // Check if the next number is prime
	      number++;
	    }
	  }

	  /** Check whether number is prime */
	  public static boolean isPrime(int number) {
	    for (int divisor = 2; divisor <= number / 2; divisor++) {
	      if (number % divisor == 0) { // If true, number is not prime
	        return false; // number is not a prime
	      }
	    }

	    return true; // number is prime
	 }
}

/**
 * Describe a Class: A class holds constructors, and functions in it. And is like an expanded function, but with more features. 
 * Describe a Interface: An interface is something that can be implemented in classes, but is not created in one, so multiple classes can use them.
 * Describe Data fields: Variables declared in classes. The public, private, protected, etc variables made in classes.
 * Describe methods: They can be called on to perform the actions in them, so if you make a multiplaying method to multiply two numbers, you can call it 1000 times if you need.
 */
