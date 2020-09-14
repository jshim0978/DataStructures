package que;
import java.util.Scanner;

import que.LinkedQueue.Node;
public class test {


	 
	public static void msg()
	{
		System.out.println("1. [Queue] 내용 추가");
		System.out.println("2. [Queue] 내용 n개 삭제");
		System.out.println("3. [Queue] 내용 하나 삭제");
		System.out.println("4. [Queue] 사이즈 출력");
		System.out.println("5. [Queue] 내용 출력");
		System.out.println("6. [Queue] 첫번쨰 값 출력");
	}
	/*public static void print(Node head)
	{
		
		 Node p = null;
		 if (lq.size() == 0) 
			 System.out.println(" ");
		 StringBuffer buf = new StringBuffer("(" + head.getObject());
		 for (head.setNext(p); p!=null; p.getNext().setPrev(p.getNext()))
			 System.out.println(buf.append("," + p.getObject()));
			
	
	
	
		if (lq.size() == 0)		System.out.println(" ");
				
		for(Node p =head.getNext(); p!=null; p = p.getNext())
			System.out.print(p.getObject() + " ");
		System.out.println();
	}
	*/
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		LinkedQueue lq = new LinkedQueue();
		
		Scanner sc = new Scanner(System.in);
		
		int k = 0;
		
		do
		{
			msg();
			
			k = sc.nextInt();
			switch(k)
			{
			
			case 1 : 
				System.out.println("추가 하고싶은 내용");
				Object a  = sc.next();
				lq.add(a);
				System.out.println("["+ a +"]추가 되었습니다");
				break;
			case 2 : 
				System.out.println("삭제 할  원소의 갯수");
				int b  = sc.nextInt();
				for(int i =0; i <b ; i ++)
				{
					System.out.println("["+ lq.first() +"]가 삭제 되었습니다.");
					lq.remove();
					
				}
				break;
			case 3 : 
				
				
				System.out.println("["+ lq.first() +"]가 삭제 되었습니다.");
				lq.remove();
				break;
			case 4 :
				System.out.println(lq.size());;
				break;
			case 5 : 
				lq.print();
				break;
			case 6 : 
				System.out.println(lq.first());;
				break;
			default :
				System.out.println("<<종료>>");
			}
			
		}while (k<7);
		
	}
	
	
}


