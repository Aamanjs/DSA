import java.util.Scanner;

public class BubbleSort1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        System.out.println("Enter no of rows: ");
		int r = sc.nextInt();

        System.out.println("Enter no of columns: ");
		int c = sc.nextInt();
		
		int arr[][] = new int[r][c];
		
		
		//input
        System.out.println("Enter values for matrix: ");
		//rows
		for(int i=0; i<r; i++) {
			//columns
			for(int j=0; j<c; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		//output
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Enter the number to search:");
		int num = sc.nextInt();
		
		boolean found = false;
		
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				if(num == arr[i][j]) {
					System.out.println("The number "+ num +" is available in matrix");
					System.out.println("The index of " +num+ " in matrix is ("+ i +","+ j+ ")");
					found = true;
				} 
			}
		}
		
		if(found == false) {
			System.out.println("The number "+ num +" is not available in matrix");
		}
		
		sc.close();
	}

}
