package Q1;

import java.util.Scanner;

public class Rotate {
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length: ");
		int n = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter elements: ");
		String s[] = sc.nextLine().split(" ");
		
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		
		System.out.println("Enter position to reverse: ");
		int k =sc.nextInt();
		
		int[] rotated = new int[n];
		int index = 0;
		
		for(int i = n-k; i<n; i++) {
			rotated[index++] = arr[i];
		}
		
		for(int i=0; i<n-k; i++) {
			rotated[index++] = arr[i];
		}
		
		System.out.println();
		System.out.println("Array after rotation: ");
		for(int x : rotated) {
			System.out.print(x+" ");
		}
	}

}
