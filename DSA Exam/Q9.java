package Q9;

import java.util.Scanner;

public class Recursion1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		System.out.println(sumOfDigit(num, 0));
		
	}
	
	public static int sumOfDigit(int num, int sum) {
		
		if(num == 0) {
			return sum;
		}
		
		sum = sum + num % 10;
		num = num / 10;
		
		return sumOfDigit(num, sum);		
		
	}

}
