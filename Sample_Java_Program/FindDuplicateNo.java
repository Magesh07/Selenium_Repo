package interviewqustions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicateNo {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
	  int a[] = {1,2,3,7,1,2,4};
	  int flag =0;
	  Arrays.sort(a);
	  int ln = a.length;
	  System.out.println("Duplicat no given in the list are::");
	  for(int i=1; i<ln; i++)
	  {
		  if(a[i]==a[i-1])
		  {
			  
			  System.out.println(+a[i]);
		  }
	  }
	}
}
