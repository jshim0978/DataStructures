package Recursion;
public class Quicksort {
	public int [] array;
	private int size, i;
	private int  maxSize = 100;
	public Quicksort(int size)
	{
		this.array = new int [maxSize];
		this.size = size;
		this.maxSize = 100;
	}
	public void quickSortRecursively(int left, int right)
	{
		  if(left < right)
	        {
	            int mid = partition( left, right);
	            if(mid > 1) quickSortRecursively(left, mid - 1);
	            if(mid + 1 < right) quickSortRecursively( mid + 1, right);
	        }
	}
	public void sorting()//
	{
		this.quickSortRecursively(0, size-1);
	}
	public int partition(int left, int right)//
	{
		int pivot = left;
		int data = this.array[pivot];
		right++;
		do{
			do {
				left++;
			}while(this.array[left] > data);
			do{
				right--;
			}while(this.array[right] < data);
			if(left<right)
			{
				this.swap(left, right);
			}
		}while(left<right);
		this.swap(pivot, right);
		return right;
	}
	public void swap(int a , int b)
	{
		 int temp = array[a];
		 array[a] = array[b];
		 array[b] = temp;
	}
	public boolean add(int data)
	{
		array[size++] = data;
		return true;
	}
	public int getFirst()
	{
		return array[0];
	}
	public int getNext()
	{
		return array[++i];
	}
	public int size()
	{
		return size;
	}
}
