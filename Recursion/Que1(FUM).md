# Fibonacci Using Memoization

## 1. Climbing Stairs (with memoization)
### You are climbing a staircase. It takes n steps to reach the top. Each time you can either climb 1 or 2 steps. How many distinct ways can you climb to the top?

## Solution
```java
package Recursion_methods;

public class Memoi1 {
	
	static int[] memo;

    public static void main(String[] args) {
        int n = 10; // Number of steps
        memo = new int[n + 1];
        // Initialize memo array with -1 to indicate uncalculated
        for (int i = 0; i <= n; i++) {
            memo[i] = -1;
        }

        System.out.println("Ways to climb " + n + " steps: " + climbStairs(n));
        System.out.println("Memo array: " + java.util.Arrays.toString(memo));
    }
    
    public static int climbStairs(int n) {
    	//When n = 0 (meaning you're already at the top or no steps to climb), there's exactly 1 way to be there — by doing nothing.
    	//When n = 1, there's also exactly 1 way to climb that single step.
    	//Therefore, the base case for climbing stairs is:
    	if(n==0 || n==1) {
    		return 1;
    	}
    	//Because the number of ways to climb 0 or 1 step is 1, not 0 or 1 like Fibonacci.
    	else if(memo[n] != -1) {
    		return memo[n];
    	}
    	memo[n] = climbStairs(n-1) + climbStairs(n-2);
    	return memo[n];
    }  

}
