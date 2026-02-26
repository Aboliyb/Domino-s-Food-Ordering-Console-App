package com.Dominos;

import java.util.Scanner;

public class Size 
{
	public void sixeType()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Size : \n1.REgular \n2.Medium \n3.Large");
		int size=sc.nextInt();
		
		switch(size)
		{
		case 1:
			System.out.println("Regular size");
			break;
		case 2:
			System.out.println("Medium size");
			break;
		case 3:
			System.out.println("Large size");
			break;
			default:System.out.println("invalid");
		}
	}

}
