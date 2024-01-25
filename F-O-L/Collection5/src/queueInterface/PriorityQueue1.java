package queueInterface;

import java.util.PriorityQueue;

public class PriorityQueue1 {
	public static void main(String[] args) {
		PriorityQueue p = new PriorityQueue();
		
		p.add(10);
		p.add(50);
		p.add(2);
		p.add(30);
		p.add(80);
		p.add(1);
		
		for(Object i:p) {
			System.out.print(i+" ");
		}
	}
}
