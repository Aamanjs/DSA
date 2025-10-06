
import java.util.Scanner;

//transpose of matrix

public class BubbleSort2 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows: ");
		int r = sc.nextInt();
		
		System.out.println("Enter the number of columns: ");
		int c = sc.nextInt();
		
		int arr[][] = new int[r][c];
		
		
		//input
		System.out.println("Enter the values for matrix:");
		//row
		for(int i=0; i<r; i++) {
			//columns
			for(int j=0; j<c; j++) {
				arr[i][j] = sc.nextInt() ;
			}
		}
		
		//output
		System.out.println(" ");
		System.out.println("The Matrix is: ");
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		//transpose
		System.out.println(" ");
		System.out.println("The transpose of given matrix is: ");
		
		for(int j=0; j<r; j++) {
			for(int i=0; i<c; i++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		sc.close();
	}

}
