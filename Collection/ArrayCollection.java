package collection;

public class ArrayCollection extends AbstractCollection{

	private final int INITIAL_LENGTH = 16;
	private int size;
	private Object[] a = new Object[INITIAL_LENGTH];
	
	
	
	public boolean add(Object object) {
		// TODO Auto-generated method stub
		
		if(size == a.length)	resize();
		a[size++] = object;
		return true;
		
		
	}

	public void resize()
	{
		Object[] aa = new Object[2*a.length];
		System.arraycopy(a, 0, aa, 0, size);
		a = aa;
	}

	public iterator iterator() {
		// TODO Auto-generated method stub
		return new iterator() {
			private int i = 0;
			public boolean hasNext(){
				return (i<size);
			}
			public Object next(){
				if(i ==size)	throw new RuntimeException();
				return a[i++];
			}
		};
	}


	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	
	
}
