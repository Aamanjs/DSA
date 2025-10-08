
public class Queue1 {
	
	static class Queue {
		static int arr[];
		static int size;
		static int rear = -1;
		static int front = 0;
		
		public Queue(int size) {
			arr = new int[size];
			this.size = size;
		}
		
		public static boolean isEmpty(){
			return rear == -1;
		}
		
		//enqueue or add
		public void add(int data) {
			if(rear == size-1) {
				System.out.println("full queue");
				return;
			}
			
			rear++;
			arr[rear] = data;
			
			System.out.println(data+" added at "+rear+" position");
			
		}
		
		//dequeue or remove
		public void remove() {
			if(isEmpty()) {
				System.out.println("Stack empty");
			}
			
//			front = arr[0];
//			for(int i=0; i<rear; i++) {
//				arr[i] = arr[i+1];
//			}
			
//			return front;
			
			System.out.println("Dequed element: "+arr[front]);
			front ++;
			
			System.out.print("Remaining elements in queue: ");
			for(int i = front; i<=rear; i++) {
				System.out.print(arr[i]+", ");
			}
			System.out.println("");
			
			
		}
		
		//peek
		public void peek() {
			if(isEmpty()) {
				System.out.println("Stack empty");
			}
			
			System.out.println("Peeked element is "+arr[front]);
		}
		
	}
	
	public static void main(String[] Args) {
		Queue q11 = new Queue(5);
		
		
		q11.add(1);
		q11.add(2);
		q11.add(3);
		q11.add(4);
		q11.remove();
		q11.peek();
	}

}
