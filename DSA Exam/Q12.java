package Q12;

import java.util.Scanner;

public class BinarySearch {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length: ");
		int n = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the data: ");
		String s[] = sc.nextLine().split(" ");
		
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		
		System.out.println("Enter element to search position: ");
		int e = Integer.parseInt(sc.nextLine());
		
		int left = 0;
		int right = n-1;
		
		int result = -1;
		
		while(left<=right) {
			int mid = (left + right)/2;
			
			if(arr[mid] == e) {
				result = mid+1;
				break;
			}
			
			else if(e < arr[mid]) {
				right = mid-1;
			}
			
			else {
				left = mid + 1;
			}
		}
		
		System.out.println(result);
	}

}
