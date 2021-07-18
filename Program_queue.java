package test;

import java.util.PriorityQueue;

public class Program_queue {
	
	public static void main(String[] args) {
	
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		for(int i=10;i>0;i--) {
			queue.add(i);
		}
		//output of this queue without Priority queue
		//(front)10,9,8,7,6,5,4,3,2,1(rear)
		
		//But after priority queue, the input is like this
		//(front)1,2,3,4,5,6,7,8,9,10(rear)  <--- This is the queue now
		
		//remove elements from front
		//add elements from rear
		
		//display rear in queue
		System.out.println("Initial front: "+queue.peek());
		System.out.println("Queue size: " +queue.size());
		
		
		queue.poll();
		System.out.println("New front: "+queue.peek());
		System.out.println("Queue size after poll: " +queue.size());
	}
}
