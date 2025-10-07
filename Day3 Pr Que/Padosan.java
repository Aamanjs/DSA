package practiceQuestionDay3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Padosan2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of squares: ");
		int n = sc.nextInt();
		
		System.out.println("Enter vertices: ");
		int arr[][] = new int [n][8];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		//input 1
		//4
		// 1 1 3 1 3 3 1 3 3 1 5 1 5 3 3 3 1 3 3 3 3 5 1 5 3 3 5 3 5 5 3 5
		
		//input 2
		 // 7
		// 1 1 3 1 3 3 1 3 3 1 5 1 5 3 3 3 5 1 7 1 7 3 5 3 1 3 3 3 3 5 1 5 1 7 3 7 3 9 1 9 3 7 5 7 5 9 3 9 5 4 7 4 7 6 5 6
		
		
		//to print 2d array after entering the input values
		for(int i=0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		HashMap<Integer, Integer> hp = new HashMap<>();
		
		//to compare input values(vertices) with every vertices of given squares
		for(int i=0; i<arr.length; i++) {
			int extCount = 0;
			for(int j=0; j<arr.length; j++) {
				int count = 0;
				if(i!=j) {

					System.out.println("======================");
					System.out.println(Arrays.toString(arr[i]));
					System.out.println(Arrays.toString(arr[j]));
					System.out.println("======================");
					
					//to compare each vertices of a square with another vertices of other square 
					for(int k=0; k<arr[i].length-1; k=k+2) {
						for(int l=0; l<arr[j].length-1; l=l+2) {
							if(arr[i][k] == arr[j][l] && arr[i][k+1] == arr[j][l+1]) {
								count++;
							}
						}
					}	
				}
				if(count >= 2) {
					extCount++;
				}
			}
			// i+1 is used to denote square no, since in for loop i was starting with 0, here i+1 was used
			hp.put(i+1, extCount);
		}
		
		for(Map.Entry<Integer,Integer> p: hp.entrySet()) {
			System.out.println(p.getKey()+" "+p.getValue());
		}
		
		
		sc.close();
	}

}
