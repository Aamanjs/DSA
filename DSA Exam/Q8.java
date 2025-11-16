package Q8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryNumbers {
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length: ");
		int n = sc.nextInt();
		
		generateBinary(n);
		
	}
	
	public static void generateBinary(int n) {
		
		Queue<String> queue = new LinkedList<>();
		
		queue.add("1");
		
		for(int i=0; i<n; i++) {
			String current = queue.poll();
			System.out.print(current+" ");
			
			queue.add(current+"0");
			queue.add(current+"1");
			
		}
	}

}
