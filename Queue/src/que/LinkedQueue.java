package que;

import Queue.Node;
import java.util.*;
public class LinkedQueue {
	
	private  Node head = new Node(null);
	private int size;
	
	public void add(Object object)
	{
		head.prev = head.prev.next = new Node(object, head.prev, head);
		++size;
		
	}

	public Object first()
	{
		if(size == 0)
			System.out.println("비어있습니다");
		return head.next.object;
	
	}
	public Object remove()
	{
		Object object = head.next.object;
		head.next = head.next.next;
		head.next.prev = head;
		--size;
		
		return object;
	}
	

	public int size()
	{
		return size;
	}
	public Node getHead()
	{
		return head;
	}
	public  void print() {
		
		
		Node n = head;
	
	    for(int i= 0; i < size ; i ++) {
	        
	        n = n.next;
	        System.out.print(n.object + " ");
	        
	    }
	    System.out.println(" ");
	}

	static class Node
	{
		Object object;
		 Node prev = this;
		 Node next = this;
		 Node(Object object)
			{
				this.object = object;
			}
		 public Node(Object object, Node prev, Node next)
			{
				this.next = next;
				this.prev =	prev;
				this.object =object;
			}
	}
}
