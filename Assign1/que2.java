package intAssign1;

import java.util.Scanner;

public class QUE2 {
	
static LinkedList head;
static LinkedList tail;
	
	public static class LinkedList {
		int data;
		LinkedList next = null;
		
		public LinkedList(int data) {
			this.data = data;
			this.next = null; 
		}
	}
	
	public static void main(String []args) {
		
		QUE2 l2 = new QUE2();
		QUE2 l3 = new QUE2();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Nodes: ");
		int n = sc.nextInt();
		
		System.out.println("Enter the elements: ");
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		l2.insertdata(arr);
		
		System.out.println("Enter pos: ");
		int p = sc.nextInt();
		
		l2.deleteBefore(n, p);
		
		
		/*int arr1[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}*/
		l3.insertdata(arr);
		l3.deleteAfter(n,p);
		
		
		
		

		
	}
	
	//----------------------------------------------------------------
	
	public void insertdata(int arr[]) {
		head = null;
	    tail = null;
		
		
		//10 20 30 40 50 60
		for(int val : arr) {
			LinkedList newnode = new LinkedList(val);
			if (head == null) {
				head = newnode;
				tail =  newnode;
			} else {
				tail.next = newnode;
				tail = newnode;	
			}
			// make it circular
			if (tail != null)
				tail.next = head;
			
		}
		
	}
	
	//---------------------------------------------------------------------
	
	public void deleteBefore(int n, int pos) {
		
		int index = pos-1;
		
		if(index == 0) {
			LinkedList temp = head;
			while(temp.next != tail) {
				temp = temp.next;
			}
			temp.next = tail.next;
			tail = temp;
			
			System.out.println();
			System.out.print("List after deletion before pos "+pos+": ");
			printList();
			return;
		}
		
		LinkedList temp = head;
		LinkedList prev = null;
		for(int i=1; i<index; i++) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = temp.next;
		System.out.println();
		System.out.print("List after deletion before pos "+pos+": ");
		printList();
		
	}
	
	
	
	//---------------------------------------------------------------------
	
	public void deleteAfter(int n, int pos) {
		
		int index = pos-1;
		
		if(index == n-1) {
			tail.next = head.next;
			head = tail.next;
			System.out.println();
			System.out.print("List after deletion after pos "+pos+": ");
			printList();
			return;
		}
		
		if(index == n-2) {
			LinkedList temp = head;
			for(int i=0; i<index; i++) {
				temp = temp.next;
			}
			tail = temp;
			temp.next = temp.next.next;
			
			System.out.println();
			System.out.print("List after deletion after pos "+pos+": ");
			printList();
			return;
		}
		
		LinkedList temp = head;
		for(int i=0; i<index; i++) {
			temp = temp.next;
		}
		
		temp.next = temp.next.next;
		
		System.out.println();
		System.out.print("List after deletion after pos "+pos+": ");
		printList();
		
	}
	
	// ---------------------------------------------------------------------------
	
	public void printList() {
	    if (head == null) {
	        System.out.println("List is empty.");
	        return;
	    }

	    LinkedList temp = head;
	    do {
	        System.out.print(temp.data + " ");
	        temp = temp.next;
	    } while (temp != head);
	    System.out.println("      head->"+head.data+"    tail->"+tail.data);
	    System.out.println();
	}

}
