package com.demo.de;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue q1 = new PriorityQueue<>(); //FIFO
		q1.add(10);
		q1.add(12);
		q1.add(50);
		q1.add(33);
		q1.add(99);
		q1.add(45);
		q1.remove();
		System.out.println(q1);
		
		PriorityQueue p1 = new PriorityQueue<>();
		p1.add(26);
		p1.add(12);
		p1.add(99);
		p1.add(44); 
		p1.add(10);
		p1.add(65);
		p1.remove();
		System.out.println(p1);
	}
	
}
