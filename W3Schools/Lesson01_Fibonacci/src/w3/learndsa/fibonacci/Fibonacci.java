package w3.learndsa.fibonacci;

public class Fibonacci {
	
	// 1. Start with the two Fibonacci numbers 0 and 1
	// 		a. Add the two previous numbers together to create a new Fibonacci number
	// 		b. Update the values of the previous two numbers
	// 2. Do point a and b 18 times to get the 20th Fibonacci
	
	public void fibonacciForLoop() {
		int prev2 = 0;
		int prev1 = 1;
		System.out.println(prev2);
		System.out.println(prev1);
		
		for (int i = 0; i < 18; i++)
		{
			int nextFibo = prev2 + prev1;
			System.out.println(nextFibo);
			prev2 = prev1;
			prev1 = nextFibo;
		}
	}
	
	public void fibonacciRecursive() {
		int firstFib = 0;
		int secondFib = 1;
		System.out.println(firstFib);
		System.out.println(secondFib);
		
		fibonacciRecursive(firstFib, secondFib, 3);
		
	}
	
	private void fibonacciRecursive(int prev2, int prev1, int counter) {
		if (counter > 20) {
			return;
		}
		
		int nextFib = prev2 + prev1;
		System.out.println(nextFib);
		fibonacciRecursive(prev1, nextFib, counter+1);
	}
	
	

}
