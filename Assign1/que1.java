
import java.util.Scanner;

public class Q1 {
	
static LinkedList head;
	
	public static class LinkedList {
		int data;
		LinkedList next = null;
		
		public LinkedList(int data) {
			this.data = data;
			this.next = null; 
		}
	}
	
	public static void main(String []args) {
		
		Q1 l1 = new Q1();
		
		l1.insertdata();
		
		System.out.println("");
		System.out.print("Updated List: ");
		l1.deleteData();
		l1.displayLink();
		
	}
	
	public void insertdata() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length: ");
		int n = sc.nextInt();
		
		System.out.println("Enter the elements: ");
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		//12,15,10,11,5,6,2,3
		//10,20,30,40,50
		System.out.println("List: ");
		for(int i = 0; i < arr.length; i++) {
			LinkedList newnode = new LinkedList(arr[i]);
			if (head == null) {
				head = newnode;
			} else {
				LinkedList temp = head;
				while (temp.next != null) {
					temp = temp.next;
				}
				temp.next = newnode;
			}

			LinkedList temp = head;
			while (temp != null) {
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
			System.out.println(" ");
		}
		
	}
	
	public void displayLink() {
		LinkedList temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println(" ");
	}
	
	public void deleteData() {
		LinkedList newNode = new LinkedList(0);
		newNode.next = head;
		head = newNode;
		//insertion at the beggining decoy

		LinkedList prev = head;
		LinkedList temp = head.next;
		LinkedList tempn = head.next.next;

		while (tempn != null) {
			if (tempn.data > temp.data) {
				prev.next = tempn;
				
				temp = prev.next;
				tempn = temp.next;
			}
			else {
				prev = prev.next;
				temp = temp.next;
				tempn = tempn.next;
			}

		}
		head = head.next;

	}


}
