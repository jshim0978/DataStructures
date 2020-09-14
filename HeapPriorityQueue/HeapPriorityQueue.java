package DS02_02_201502071_╫иа╓©Л;

public class HeapPriorityQueue implements PriorityQueue {

	private static int CAPACITY  = 100;
	
	private Comparable[] a;
	private int size;
	
	public HeapPriorityQueue()
	{
		this(CAPACITY);
	}
	
	public HeapPriorityQueue(int cap) {
		// TODO Auto-generated constructor stub
		a = new Comparable[cap];
	}

	public void add(Object object) {
		// TODO Auto-generated method stub
		if (!(object instanceof Comparable))
			throw new IllegalArgumentException();
		
		Comparable x = (Comparable)object;
		if (size == a.length)	resize();
		int i = size++;
		while(i>0){
			int j = i;
			i = (i-1)/2;
			if(a[i].compareTo(x)>=0){
				a[j] = x;
				return;
				
			}
			a[j] = a[i];
		}
		a[i] = x;
		
	}

	
	public Object best() {
		// TODO Auto-generated method stub
		if(size == 0)	System.out.println("Heap is empty");
		if(size <0)		System.out.println("EMPTY!");
		return a[0];
	}

	public void heapify(int i, int n){
		Comparable ai = a[i];
		while(i<n/2)
		{
			int j = 2*i +1;
			if(j+1 < n && a[j+1].compareTo(a[j]) > 0)	++j;
			if(a[j].compareTo(ai)<= 0)	break;
			a[i] = a[j];
			i=j;
			
		}
		a[i] = ai;
	}
	
	public Object removeBest() {
		// TODO Auto-generated method stub
		Object best = best();
		if (size != 0)
			a[0] = a[--size];
		else
			best = null;
			System.out.println("EMPTY");
		heapify(0,size);
		
		return best;
	}

	
	public int size() {
		// TODO Auto-generated method stub
		
		return size;
	}
	private void resize(){
		Comparable[] aa = new Comparable[2*a.length];
		System.arraycopy(a, 0, aa, 0, a.length);
		a = aa;
	}
	public String toString(){
		if (size == 0)	return "{}";
		
		StringBuffer buf = new StringBuffer("{" + a[0]);
		for(int i = 1; i<size; i++)
		{
			 buf.append(","+ a[i]);

		}
		return buf + "}";
	}

}
