package com.rsg.collections;

import java.util.PriorityQueue;

public class QueueDemo1 {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		
		System.out.println(priorityQueue.peek());
		
		for(int i=0;i<=10;i++) {
			priorityQueue.offer(i);
		}
		
		System.out.println(priorityQueue);
		
		System.out.println(priorityQueue.poll());
		
		System.out.println(priorityQueue);

	}

}
