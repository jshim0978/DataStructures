package DS02_03_201502071_╫иа╓©Л;

import java.nio.Buffer;

public class Graph {

	private int size;
	private String[] vertices;
	List[] a;
	
	
	public Graph(String[] args){
		size = args.length;
		a = new List[size];
		for(int  i = 0; i<size; i++)
		{
			a[i] = new List(args[i]);
		}
	}
	public void add(String v, String w){
		a[index(v)].add(index(w));
		a[index(w)].add(index(v));
	}
	public int index(String v){
		for(int i =0;i<size;i++)
		{
			if (a[i].vertex.equals(v))	return i;
		}
		return a.length;
	}
	public String toString(){
		if(size == 0) return "{}";
		
		StringBuffer buf = new StringBuffer("{" + a[0]);
		for (int i = 1; i<size ; i ++)
		{
			buf.append(" , " + a[i]);
		}
		return buf + "}";
	}
	
	public int calc_degree(){
		int k=0;
		if(vertices[i].)
		
		return k;
	
	}
	class List
	{
		String vertex;
		Node edges;
		
		List(String vertex){
			this.vertex = vertex;
		}
		public void add(int index) {
			// TODO Auto-generated method stub
			edges = new Node(index, edges);
		}
		
	
		private class Node{
			private int data;
			private Node next;
		
			public Node(int data, Node next)
			{
				this.data = data;
				this.next = next;
			
			}
		
		}
		
		public String toString(){
			
			//for loop vertices
			
			StringBuffer buf = new StringBuffer(vertex);
			
			if (edges !=null)
					buf.append(":");
				
				for(Node p = edges; p!=null; p = p.next)
				{
					buf.append(Graph.this.a[p.data].vertex);
				}
				return  "" + buf + "";
			
		}
		
		
	}
}
	
	

