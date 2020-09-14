package Queue;

public class LinkedQueue {

	private Node head = new Node();
	//private Node newNode = new Node();
	private int size;
	
	public void add(Object object)
	{
		head.prev = head.prev.next = new Node(object, head.prev, head);
		
		/*if(size == 0)
		{
			head.setPrev(newNode);
			head.setNext(newNode);
			newNode.setNext(head);
			newNode.setPrev(head);
		}
		else
		{
			(head.getPrev()).setNext(newNode); 
			head.setPrev(newNode);
			newNode.setPrev(head.getPrev());
			newNode.setNext(head);
		}*/
		++size;
		
	}
	public Object first()
	{
		if(size == 0)
			System.out.println("비어있습니다");
		return head.next.object;
		
	}
	public int size()
	{
		return size;
	}
	public Node getHead()
	{
		return head;
	}
	public Object remove()
	{
		Object object = head.next.object;
		head.next = head.next.next;
		head.next.prev = head;
		--size;
		
		return object;
		
	}
	
	 public String toString() {
		 if (size == 0) return "()";
		 String buf = "(" + head.getObject();
		 for (Node p=head.getNext(); p!=null; p = p.getNext())
			 buf = buf + ("," + p.getObject());
		 return buf + ")";
		}
}
