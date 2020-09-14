package DS02_01_201502071_╫иа╓©Л;

public class TestArrayStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack s = new ArrayStack(10);
		
		System.out.println("Push : 1"  );
		s.push("1");
		System.out.println("Push : 2");
		s.push("2");
		System.out.println("Push : 3");
		s.push("3");
		System.out.println("Push : 4");
		s.push("4");
		System.out.println("Push : 5");
		s.push("5");
		System.out.println("Pop : "+ s.pop());
		
		System.out.println("Push : 6");
		s.push("6");
		System.out.println("Push : 7");
		s.push("7");
		System.out.println("Push : 8");
		s.push("8");
		System.out.println("Push : 9");
		s.push("9");
		System.out.println("Push : 10");
		s.push("10");
		
		System.out.println("Pop : " + s.pop());
		System.out.println("Pop : "+ s.pop());
		System.out.println("Pop : "+ s.pop());
		System.out.println("Pop : "+ s.pop());
		System.out.println("Pop : "+ s.pop());
		System.out.println("Pop : "+ s.pop());
		System.out.println("Pop : "+ s.pop());
		System.out.println("Pop : "+ s.pop());
		System.out.println("Pop : "+ s.pop());
		System.out.println( "Pop : "+s.pop());
		
		
	}

}
