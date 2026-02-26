package com.Dominos;

import java.util.Scanner;

public class App 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int choice1;
		System.out.println("What you want : \n1.VEG PIZZA \n2.NON VEG PIZZA");
		choice1=sc.nextInt();
		switch(choice1)
		{
		case 1:
			VegPizzaDetails v1=new VegPizzaDetails();
			v1.Veg();
			break;
		case 2:
			NonVegPizzaDetails n1=new NonVegPizzaDetails();
			n1.Nonveg();
			break;
			
		default:System.out.println("invalid");
		}
		
	}

}


