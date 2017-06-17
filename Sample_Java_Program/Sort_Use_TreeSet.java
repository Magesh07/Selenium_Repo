package interviewqustions;

import java.util.Set;
import java.util.TreeSet;

public class Sort_Use_TreeSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int a[] = {-8,-9,-5,0,8,5,1,6,-8,1};
		String d = "";
		String b = "COGNIZANT";
		char c[] = b.toCharArray();
		Set<Integer> sI = new TreeSet<Integer>();
		
		for(int sx :a)
		{
			sI.add(sx);
		}
		
		System.out.println("Sotted number is " +sI);
		
		for(int h :sI)
		{
			System.out.print(h);
			
		}
		
		Set<Character> sC = new TreeSet<Character>();
		for( char sZ:c)
		{
			sC.add(sZ);
		}
		System.out.println();
		System.out.println("Sotted Character is " +sC);
		for(char t :sC)
		{
			 d = d+t;
			
		}
		System.out.println(d);
	}

}
