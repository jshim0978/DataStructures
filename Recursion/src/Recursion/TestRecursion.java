package Recursion;

import java.util.Scanner;


public class TestRecursion {
	static Quicksort qs = new Quicksort(0);
	public static void print(Quicksort Sort)
	{
		System.out.print(qs.getFirst() );
		for (int i = 1; i < qs.size(); i ++)
		{
			System.out.print(" , " + qs.array[i] );
		}
		System.out.println();
	}
	public static void msg()
	{
		System.out.println("1. [Recursive] add");
		System.out.println("2. [Recursive] sort");
		System.out.println("3. [Recursive] print");
		System.out.println("4. 종료");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = 0;
		do
		{
			msg();
			k = sc.nextInt();
			switch(k)
			{
			case 1 : 
				System.out.println("추가하고싶은 내용을 입력하세요");
				int data  = sc.nextInt();
				qs.add(data);
				break;
			case 2 : 
				qs.sorting();
				System.out.println("내림차순으로 정렬되었습니다");
				break;
			case 3 : 
				print(qs);
				break;
			default :
				System.out.println("<<종료>>");
			}
		}while (k<4);
	}
}
