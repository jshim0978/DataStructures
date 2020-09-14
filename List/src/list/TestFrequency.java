package list;
import java.util.*;


public class TestFrequency {
	static String[] countries = {"KO", "DE", "ES", "FR" , "DE" , "ES", "DE"};
	public static List list = Arrays.asList(countries);
	
	
	static int frequency(List list, Object object) 
	{
		int f = 0;
		for (Iterator it = list.iterator(); it.hasNext(); )
			if (it.next().equals(object)) ++f;
		return f;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "frequency(list, "+ "DE" +") : " + frequency(list, "DE"));
		System.out.println( "frequency(list, "+ "KO" +") : " + frequency(list, "KO"));
		System.out.println( "frequency(list, "+ "ES" +") : " + frequency(list, "ES"));
		System.out.println( "frequency(list, "+ "FR" +") : " + frequency(list, "FR"));
		
	}

}
