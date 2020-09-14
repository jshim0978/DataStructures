package DS02_01_201502071_╫иа╓©Л;



public class ArrayStack implements Stack{

	private Object[] a;
	private int size;
	
	public ArrayStack(int capacity)
	{
		a = new Object[capacity];
	}
	
	public void push(Object object) {
		// TODO Auto-generated method stub
	
		if(size == a.length)	resize();
		a[size++] = object;
	}
	

	
	public Object pop() {
		// TODO Auto-generated method stub
		if(size == 0)	throw new IllegalStateException("stack is empty");
		Object object = a[--size];
		a[size] = null;
		
		return object;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (size == 0);
	}

	
	public Object peek() {
		// TODO Auto-generated method stub
		if(size == 0)	throw new IllegalStateException("stack is empty");
		return a[size-1];
	}

	
	public void resize() {
		// TODO Auto-generated method stub
		Object[] aa= a;
		a = new Object[2*aa.length];
		System.arraycopy(aa, 0, a, 0, size);
		
	}
}
