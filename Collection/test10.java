package collection;
import java.util.*;

public class test10 {

	public static void msg()
	{
		System.out.println("1. [Collection] 내용 추가");
		System.out.println("2. [Collection] 해당 내용이 있는지 확인");
		System.out.println("3. [Collection] 내용 출력");
		System.out.println("4. [Collection] 종료");
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
				System.out.println("추가 하고싶은 내용");
				String a  = sc.next();
				lc.add(a);
				System.out.println("["+ a +"]추가 되었습니다");
				break;
			case 2 : 
				System.out.println("확인하고 싶은 내용");
				String b  = sc.next();
				if (lc.contains(b)==true)
					System.out.println("존재합니다");
				else
					System.out.println("존재하지 않습니다.");
				
				break;
			case 3 : 
				
				for(iterator it = lc.iterator(); it.hasNext()==true;)
					{
						System.out.print(it.next() + " ");
					}
					
				
				System.out.println();
				break;
			default :
				System.out.println("<<종료>>");
				break;
			}
		}while (k<4);
	}

}
