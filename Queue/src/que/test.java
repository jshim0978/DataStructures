package que;
import java.util.Scanner;

import que.LinkedQueue.Node;
public class test {


	 
	public static void msg()
	{
		System.out.println("1. [Queue] ���� �߰�");
		System.out.println("2. [Queue] ���� n�� ����");
		System.out.println("3. [Queue] ���� �ϳ� ����");
		System.out.println("4. [Queue] ������ ���");
		System.out.println("5. [Queue] ���� ���");
		System.out.println("6. [Queue] ù���� �� ���");
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
				System.out.println("�߰� �ϰ���� ����");
				Object a  = sc.next();
				lq.add(a);
				System.out.println("["+ a +"]�߰� �Ǿ����ϴ�");
				break;
			case 2 : 
				System.out.println("���� ��  ������ ����");
				int b  = sc.nextInt();
				for(int i =0; i <b ; i ++)
				{
					System.out.println("["+ lq.first() +"]�� ���� �Ǿ����ϴ�.");
					lq.remove();
					
				}
				break;
			case 3 : 
				
				
				System.out.println("["+ lq.first() +"]�� ���� �Ǿ����ϴ�.");
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
				System.out.println("<<����>>");
			}
			
		}while (k<7);
		
	}
	
	
}


