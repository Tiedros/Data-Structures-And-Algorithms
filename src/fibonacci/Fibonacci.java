package fibonacci;

public class Fibonacci {
//3 Different ways to print Fibonacci series

	/*
	 Method 1 – Iterative: Initialize the first and second numbers to 0 and 1.
	  Following this, we print the first and second numbers. 
	  Then we send the flow to the iterative while loop 
	  where we get the next number by adding the previous two number 
	  and simultaneously we swap the first number with the second 
	  and the second with the third.
	Below is the implementation of the above approach:
	 
	  */
	
	
	//Time Complexity: O(N) 
	//Auxiliary Space: O(1)
	
	// Function to print N Fibonacci Number
    static void Fibonacci_Iterative(int N)
    {
        int num1 = 0, num2 = 1;
  
        int counter = 0;
  
        // Iterate till counter is N
        while (counter < N) {
  
            // Print the number
            System.out.print(num1 + " ");
  
            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }
    
    /*
     
     Method 2 – Using Recursion: 
     Since Fibonacci Number is the summation of the two previous numbers.
      We can use recursion as per the following condition:
	Get the number whose Fibonacci series needs to be calculated.
	Recursively iterate from value N to 1:
	Base case: If the value called recursively is less than 1, the return 1 the function.
	Recursive call: If the base case is not met, then recursively call for previous two value as:
	recursive_function(N – 1) + recursive_function(N – 2);

	Return statement: At each recursive call(except the base case), return the recursive function for the previous two value as:
	recursive_function(N – 1) + recursive_function(N – 2);

Below is the implementation of the above approach:
      
      */
    
   // Time Complexity: O(2N)  
    //Auxiliary Space: O(1)
 // Function to print the fibonacci series
    static int fib_Recursion(int n)
    {
        // Base Case
        if (n <= 1)
            return n;
  
        // Recursive call
        return fib_Recursion(n - 1)
            + fib_Recursion(n - 2);
    }
  
    /*
     Method 3 – Using Dynamic Programming: We can avoid the repeated work done in method 2 by storing the Fibonacci numbers calculated so far. Below are the steps:

Create an array arr[] of size N.
Initialize arr[0] = 0, arr[1] = 1.
Iterate over [2, N] and update the array arr[] as:
arr[i] = arr[i – 2] + arr[i – 1]

Print the value of arr[N].
Below is the implementation of the above approach:
     */
    
   // Time Complexity: O(N) 
   // Auxiliary Space: O(N)
    
 // Function to find the fibonacci Series
    static int fib_Dynamic_Programming(int n)
    {
  
        // Declare an array to store
        // Fibonacci numbers.
        // 1 extra to handle case, n = 0
        int f[] = new int[n + 2];
  
        int i;
  
        // 0th and 1st number of
        // the series are 0 and 1
        f[0] = 0;
        f[1] = 1;
  
        for (i = 2; i <= n; i++) {
  
            // Add the previous 2 numbers
            // in the series and store it
            f[i] = f[i - 1] + f[i - 2];
        }
  
        // Nth Fibonacci Number
        return f[n];
    }
    
     // Driver Code
        public static void main(String [] args){
            // Given Number N
            int n = 10;
      System.out.println("**********Iterative************");
            // Function Call
            Fibonacci_Iterative(n);
            
      System.out.println("\n**********Recursion************");
         // Print the first N numbers
            for (int i = 0; i < n; i++) {
      
                System.out.print(fib_Recursion(i) + " ");
            }
            System.out.println("\n**********Dynamic_Programming************");
            //fib_Dynamic_Programming
            for (int i = 0; i < n; i++)
                System.out.print(fib_Dynamic_Programming(i) + " ");
        }
        
    
	
	
	
}
