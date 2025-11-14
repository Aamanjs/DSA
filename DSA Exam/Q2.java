package Q2;

import java.util.Scanner;

public class ReverseArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length");
		int n = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter data: ");
		String[] input = sc.nextLine().split(" ");
		
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		
		reverseArray(arr);
		
		for (int num : arr) {
			System.out.print(num + " ");
		}
		
		
	}
	
	public static void reverseArray(int arr[]) {
		int left = 0, right = arr.length-1;
		while(left<right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}

}
