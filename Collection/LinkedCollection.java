package collection;

public class LinkedCollection extends AbstractCollection{

	private node head = new node();
	private final int INITIAL_LENGTH = 16;
	private int size;
	private Object[] a = new Object[INITIAL_LENGTH];
	
	public boolean add(Object object) {
		
		head.prev = head.prev.next = new node(object, head.prev, head);
		++size;
		return true;
	}
	public void resize()
	{
		Object[] aa = new Object[2*a.length];
		System.arraycopy(a, 0, aa, 0, size);
		a = aa;
	}
	public iterator iterator() {
		return new iterator() {
			private node k = head.next;
			public boolean hasNext(){
				return k != head;
			}
			public Object next(){
				if(k == head)	throw new RuntimeException();
				Object object = k.object;
				k = k.next;
				return object;
			}
		};
	}
	public int size() {
		return size;
	}

}
