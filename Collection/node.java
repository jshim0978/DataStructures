package collection;

public class node {
	public Object object;
	public node prev = this;
	public node next = this;
	
	
	public node()
	{
		prev = next = this ;
		
	}
	public node(Object object, node prev, node next)
	{
		this.object = object;
		this.prev = prev;
		this.next = next;
	}
	public Object getObject()
	{
		return object;
	}
	public node getPrev()
	{
		return prev;
	}
	public node getNext()
	{
		return next;
	}
	public void setObject(Object object)
	{
		this.object = object;
	}
	public void setPrev(node prev)
	{
		this.prev = prev;
	}
	public void setNext(node next)
	{
		this.next = next;
	}
}
