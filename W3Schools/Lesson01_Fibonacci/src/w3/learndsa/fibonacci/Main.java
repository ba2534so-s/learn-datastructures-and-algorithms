package w3.learndsa.fibonacci;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci fib = new Fibonacci();
		fib.fibonacciForLoop();
		fib.fibonacciRecursive();
		System.out.println(fib.findNthFibonacci(19));
	}

}
