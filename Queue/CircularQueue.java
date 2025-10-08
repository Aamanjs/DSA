package queue;

import queue.Queue1.Queue;

public class CircularQueue {
	
	static class Queue {
		static int arr[];
		static int size;
		static int rear = -1;
		static int front = -1;
		
		public Queue (int size) {
			arr = new int[size];
			this.size = size;
		}
		
		public static boolean isEmpty() {
			return rear == -1 && front == -1;
		}
		
		public static boolean isFull() {
			return (rear+1) % size == front;
		}
		
		public void add(int data) {
			if(isFull()) {
				System.out.println("Stack is full");
				return;
			}
			if(isEmpty()) {
				front = 0;
			}
			
			rear = (rear + 1) % size;
			arr[rear] = data;	
			System.out.println(data+" added at "+rear+" position");
		}
		
		public void remove() {
			if(isEmpty()) {
				System.out.println("Stack is empty");
			}
			
			System.out.println("Dequed element: "+arr[front]);
			if(rear == front) {
				rear = front = -1;
			}else {
				front = (front + 1) % size;
			}
			
			System.out.print("Remaining elements in queue: ");
			for(int i = front; i<=rear; i++) {
				System.out.print(arr[i]+", ");
			}
			System.out.println("");
			
		}
		
		public void peek() {
			if(isEmpty()) {
				System.out.println("Stack is Empty");
			}
			System.out.println("Peeked element is "+arr[rear]);
		}
		
	}
	
	
	
	public static void main(String[] Args) {
		Queue q11 = new Queue(5);
		
		
		q11.add(1);
		q11.add(2);
		q11.add(3);
		q11.add(4);
		q11.add(5);
		q11.remove();
		q11.remove();
		q11.remove();
		q11.add(6);
		q11.peek();
	}

}
