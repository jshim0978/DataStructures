package DS02_03_201502071_심정우;

public class TestGraph {

	public static void main(String[] args)
	{
		
	
	Graph g = new Graph(new String []{"A","B","C","D","E","F","G","H",});
	
	
	
	g.add("A","B");
	g.add("A","E");
	
	g.add("B","C");
	g.add("B","F");
	
	g.add("C","D");
	g.add("C","H");
	
	g.add("D","H");
	
	g.add("E","F");
	
	g.add("F","G");
	
	System.out.println(g);
	
	System.out.println("정점           인접한 정점 수");
	System.out.println(g.calc_degree());
	}
	
}
