package Linkedlist;

import java.util.PriorityQueue;

public class A8 {
public static void main(String[] args) {
	PriorityQueue p=new PriorityQueue();
	p.offer(10);
	p.offer(20);
	p.offer(30);
	p.offer(40);
	p.offer(50);
	while(!(p.isEmpty())) {
		System.out.println(p.poll()+" "+p.peek());
	}
}
}
