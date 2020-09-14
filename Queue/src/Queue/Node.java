package Queue;

public class Node {
	
	 Object object;
	 Node prev = null;
	 Node next = null;
	public Node(Object object)
	{
		this.object = object;
	}
	public Node()
	{
		next = null;
		prev = null;
		
	}
	public Node(Object object, Node prev, Node next)
	{
		this.next = next;
		this.prev =	prev;
		this.object =object;
	}
	public Object getObject()
	{
		return object;
	}
	public Node getPrev()
	{
		return prev;
	}
	public Node getNext()
	{
		return next;
	}
	public void setObject(Object object)
	{
		this.object = object;
	}
	public void setPrev(Node prev)
	{
		this.prev = prev;
	}
	public void setNext(Node next)
	{
		this.next = next;
	}
	
}
