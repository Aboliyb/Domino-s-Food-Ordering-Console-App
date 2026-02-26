package com.Dominos;

import java.util.Scanner;

public class VegList 
{
	Scanner sc= new Scanner(System.in);
	int op1;
	int extra_cost;
	public void List1()
	{
		System.out.println();
			System.out.println("Anything Extra :\n1.Cheese \n2.Onion \n3.Paneer \n4.Jalapeno \n5.Fresh Tomato \n6.Grilled Mushrooms \n7.black Olive");
			op1=sc.nextInt();
			
			switch(op1)
			{
			case 1:
				extra_cost=50;
				System.out.println("Extra cheese :"+extra_cost);
				break;
				
			case 2:
				extra_cost=25;
				System.out.println("Extra Onion :"+extra_cost);
				break;
				
			case 3:
				extra_cost=65;
				System.out.println("Extra Paneer :"+extra_cost);
				break;
			case 4:
				extra_cost=35;
				System.out.println("Extra cheese Jalapeno :"+extra_cost);
				break;
			case 5:
				extra_cost=35;
				System.out.println("Extra Fresh Tomato :"+extra_cost);
				break;
			case 6:
				extra_cost=35;
				System.out.println("Extra Grilled Mushrooms :"+extra_cost);
				break;
			case 7:
				extra_cost=35;
				System.out.println("Black olive :"+extra_cost);
				break;
			default:System.out.println("invalid");
					
			}
	}
//	public static void main(String[] args) {
//		VegList l=new VegList();
//		l.List1();
//	}

}
