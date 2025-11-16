package Q7.java;

import java.util.Scanner;

public class CircularQueue {
	
	static int front = -1;
	static int rear = -1;
	static int size;
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Length: ");
		size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter command: ");
		while(true) {
			String command = sc.next();
			
			if(command.equals("ENQUEUE")) {
				int x = sc.nextInt();
				enqueue(arr, x);
			}
			else if(command.equals("DEQUEUE")) {
				dequeue();
			}
			else if(command.equals("DISPLAY")) {
				display(arr);
			}
			else if(command.equals("STOP")) {
				break;
			}
		}
		
		
	}
	
	public static void enqueue(int arr[], int x) {
		
		if((rear + 1) % size == front) {
			System.out.println("Queue is full");
			return;
		}
		
		if(front == -1) {
			front = 0;
		}
		
		rear = (rear + 1) % size;
		arr[rear] = x;
		
	}
	
	public static void dequeue() {
		
		if(front == -1) {
			System.out.println("Queue is empty");
			return;
		}
		
		if(front == rear) {
			front = rear = -1;
		} else {
			front = (front + 1) % size;
		}
	}
	
	public static void display(int arr[]) {
		
		if(front == -1) {
			System.out.println("Queue is empty");
			return;
		}
		
		int i = front;
		while(true) {
			System.out.print(arr[i]+ " " );
			
			if (i == rear) {
				break;
			}
			
			i = (i + 1) % size;
		}
		System.out.println();
	}

}
