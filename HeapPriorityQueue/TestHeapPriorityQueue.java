package DS02_02_201502071_╫иа╓©Л;


public class TestHeapPriorityQueue {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue p = new HeapPriorityQueue();
		
		
		System.out.println("Add : 1" );
		p.add(1);
		System.out.println("Add : 2" );
		p.add(2);
		System.out.println("Add : 3" );
		p.add(3);
		System.out.println("Add : 4" );
		p.add(4);
		System.out.println("Add : 5" );
		p.add(5);
		
		System.out.println("Remove : " + p.removeBest() +" | Elements : "+ p.toString());
		
		
		System.out.println("Add : 6" );
		p.add(6);
		System.out.println("Add : 7" );
		p.add(7);
		System.out.println("Add : 8" );
		p.add(8);
		System.out.println("Add : 9" );
		p.add(9);
		System.out.println("Add : 10" );
		p.add(10);
		
		System.out.println("Remove : "+ p.removeBest() +" | Elements : "+ p.toString());

		System.out.println("Remove : "+ p.removeBest() +" | Elements : "+ p.toString());

		System.out.println("Remove : "+ p.removeBest() +" | Elements : "+ p.toString());

		System.out.println("Remove : "+ p.removeBest() +" | Elements : "+ p.toString());

		System.out.println("Remove : "+ p.removeBest() +" | Elements : "+ p.toString());

		System.out.println("Remove : "+ p.removeBest() +" | Elements : "+ p.toString());

		System.out.println("Remove : "+ p.removeBest() +" | Elements : "+ p.toString());

		System.out.println("Remove : "+ p.removeBest() +" | Elements : "+ p.toString());

		System.out.println("Remove : "+ p.removeBest() +" | Elements : "+ p.toString());

		
		System.out.println("Remove : "+ p.removeBest() +" | Elements : "+ p.toString());
	
		
	}

}
