package collection;
import java.util.*;

public class test10 {

	public static void msg()
	{
		System.out.println("1. [Collection] ���� �߰�");
		System.out.println("2. [Collection] �ش� ������ �ִ��� Ȯ��");
		System.out.println("3. [Collection] ���� ���");
		System.out.println("4. [Collection] ����");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = 0;
		LinkedCollection lc = new LinkedCollection();
		do
		{
			msg();
			k = sc.nextInt();
			switch(k)
			{
			case 1 : 
				System.out.println("�߰� �ϰ���� ����");
				String a  = sc.next();
				lc.add(a);
				System.out.println("["+ a +"]�߰� �Ǿ����ϴ�");
				break;
			case 2 : 
				System.out.println("Ȯ���ϰ� ���� ����");
				String b  = sc.next();
				if (lc.contains(b)==true)
					System.out.println("�����մϴ�");
				else
					System.out.println("�������� �ʽ��ϴ�.");
				
				break;
			case 3 : 
				
				for(iterator it = lc.iterator(); it.hasNext()==true;)
					{
						System.out.print(it.next() + " ");
					}
					
				
				System.out.println();
				break;
			default :
				System.out.println("<<����>>");
				break;
			}
		}while (k<4);
	}

}
