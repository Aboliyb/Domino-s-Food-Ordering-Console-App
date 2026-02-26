package com.Dominos;

import java.util.Scanner;

public class NonVeglist 
{
	int extra_cost=0;
	public void nonlist()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println();
		System.out.println("Anything Extra : \n1.Peri peri chicken  \n2.chicken saugage \n3. chicken keema \n4.chicken tikka");
		int opn=sc.nextInt();
		
		
		
		switch(opn)
		{
		case 1:
			extra_cost=50;
			System.out.println("Extra Peri peri chicken :"+extra_cost);
			break;
		case 2:
			extra_cost=70;
			System.out.println("Extra chicken saugage :"+extra_cost);
			break;
				
		case 3:
			extra_cost=70;
			System.out.println("Extra chicken keema :"+extra_cost);
			break;
		case 4:
			extra_cost=70;
			System.out.println("Extra chicken tikka :"+extra_cost);
			break;
				
		default:System.out.println("invalid");
		}
	}

}
