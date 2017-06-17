package interviewqustions;

import java.util.Scanner;

public class Floyd_Triangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	
	{
		int digit,getTriangle,num=1,j,Left_Align_Floyed;
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
			System.out.println("Enter the triangle no:");
			digit = sc.nextInt();
			for(getTriangle =1; getTriangle<=digit; getTriangle++)
			{
				for(j=1; j<=getTriangle; j++)
				{
					System.out.print(num+"");
					num++;
				}
				System.out.println();
			}
		  
	  }
	}


