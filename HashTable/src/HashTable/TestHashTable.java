package HashTable;

import java.util.Scanner;

public class TestHashTable {
	public static void msg()
	{
		System.out.println("1. [Hash] put");
		System.out.println("2. [Hash] get");
		System.out.println("3. 종료");
	}

	public static void main(String[] args) {
		
		HashTable ht = new HashTable(10, (float) 0.75);
		Scanner sc = new Scanner(System.in);
		int k = 0;
		do
		{
			msg();
			k = sc.nextInt();
			switch(k)
			{
			case 1 : 
				System.out.println("key 를 입력하세요");
				Object key  = sc.next();
				
				System.out.println("국가 를 입력하세요");
				String country = sc.next();
					
				System.out.println("언어 를 입력하세요");
				String language = sc.next();
				
				Country co = new Country(country,language);
				
				ht.put(key, co);
				break;
			case 2 : 
				System.out.println("key 를 입력하세요");
				Object key2  = sc.next();
				ht.get(key2);
				
				break;
			default :
				System.out.println("<<종료>>");
			}
			
		}while (k<3);
	}

}
