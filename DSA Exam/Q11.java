package Q11;

import java.util.Scanner;

public class LinearSearch {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length:");
		int n = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter elements:");
		String s[] = sc.nextLine().split(" ");
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		
		System.out.println("Enter element to search position: ");
		int p = Integer.parseInt(sc.nextLine());
		
		int index = -1;
		for(int i=0; i<n; i++) {
			if(arr[i] == p) {
				index = i+1;
				break;
			}
		}
		
		System.out.println(index);
		
	}

}
