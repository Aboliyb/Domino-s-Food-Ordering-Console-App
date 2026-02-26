package com.Dominos;

import java.util.Scanner;

public class NonVegPizzaDetails implements NonVegPizza
{
	Scanner sc=new Scanner(System.in);
	@Override
	public void Nonveg() 
	{
		
		int total_pay;
		int price;
		int last=0;
		NonVeglist li=new NonVeglist();
		
		int op;
		System.out.println("Enter what you want :\n1.Simple chicken Pizza \n2.Cheese burst chicken Pizza \n3.Volcano chicken Pizza");
		op=sc.nextInt();
		
		switch(op)
		{ 
		case 1 :
				System.out.println("Simple chicken Pizza");
				System.out.println("Enter Your Choice :\n1.Corn chicken Pizza \n2.Paneer chicken Pizza \n3.Margherita chicken Pizza \n4.Peppy chicken Paneer \n5.Fresh chicken veggi");
				int opn1=sc.nextInt();
				switch(opn1)
				{
				
					case 1:	
						price=150;
						System.out.println("CORN CHICKEN PIZZA : "+price);
						System.out.println("GST :"+GST);
						System.out.println("dilevry charges :"+dilevry_charge);
						total_pay=GST+dilevry_charge+price;
						System.out.println("Total pay :"+total_pay);
						System.out.println();
						li.nonlist();
						last=total_pay+li.extra_cost;
						System.out.println();
						System.out.println("GRAND TOTAL :"+last);
						System.out.println("THANK YOU PLEASE VISIT AGAIN..........!");
						break;
						
					case 2:
						price=180;
						System.out.println("Paneer chicken Pizza "+price);
						System.out.println("GST :"+GST);
						System.out.println("dilevry charges :"+dilevry_charge);
						total_pay=GST+dilevry_charge+price;
						System.out.println("Total pay :"+total_pay);
						li.nonlist();
						last=total_pay+li.extra_cost;
						System.out.println();
						System.out.println("GRAND TOTAL :"+last);
						System.out.println("THANK YOU PLEASE VISIT AGAIN..........!");
						break;
						
					case 3:
						price=225;
						System.out.println("Margherita chicken pizza "+price);
						System.out.println("GST :"+GST);
						System.out.println("dilevry charges :"+dilevry_charge);
						total_pay=GST+dilevry_charge+price;
						System.out.println("Total pay :"+total_pay);
						li.nonlist();
						last=total_pay+li.extra_cost;
						System.out.println();
						System.out.println("GRAND TOTAL :"+last);
						System.out.println("THANK YOU PLEASE VISIT AGAIN..........!");
						break;
						
					case 4:
						price=245;
						System.out.println("Peppy paneer chicken pizza "+price);
						System.out.println("GST :"+GST);
						System.out.println("dilevry charges :"+dilevry_charge);
						total_pay=GST+dilevry_charge+price;
						System.out.println("Total pay :"+total_pay);
						li.nonlist();
						last=total_pay+li.extra_cost;
						System.out.println();
						System.out.println("GRAND TOTAL :"+last);
						System.out.println("THANK YOU PLEASE VISIT AGAIN..........!");
						break;
						
					case 5:
						price=275;
						System.out.println("Fresh chicken veggi "+price);
						System.out.println("GST :"+GST);
						System.out.println("dilevry charges :"+dilevry_charge);
						total_pay=GST+dilevry_charge+price;
						System.out.println("Total pay :"+total_pay);
						li.nonlist();
						last=total_pay+li.extra_cost;
						System.out.println();
						System.out.println("GRAND TOTAL :"+last);
						System.out.println("THANK YOU PLEASE VISIT AGAIN..........!");
						break;
						
					default:System.out.println("invalid");
				}	
				break;
			
		case 2 :
			System.out.println("Cheese burst chicken Pizza");
			System.out.println("Enter Your Choice :\n1.Corn chicken Pizza \n2.Paneer chicken Pizza \n3.Margherita chicken Pizza \n4.Peppy chicken Paneer \n5.Fresh chicken veggi");
			opn1=sc.nextInt();
			switch(opn1)
			{
			
				case 1:	
					price=150;
					System.out.println("Cheese burst CORN chicken PIZZA : "+price);
					System.out.println("GST :"+GST);
					System.out.println("dilevry charges :"+dilevry_charge);
					total_pay=GST+dilevry_charge+price;
					System.out.println("Total pay :"+total_pay);
					System.out.println();
					li.nonlist();
					last=total_pay+li.extra_cost;
					System.out.println();
					System.out.println("GRAND TOTAL :"+last);
					System.out.println("THANK YOU PLEASE VISIT AGAIN..........!");
					break;
					
				case 2:
					price=180;
					System.out.println("Cheese burst Paneer chicken Pizza "+price);
					System.out.println("GST :"+GST);
					System.out.println("dilevry charges :"+dilevry_charge);
					total_pay=GST+dilevry_charge+price;
					System.out.println("Total pay :"+total_pay);
					li.nonlist();
					last=total_pay+li.extra_cost;
					System.out.println();
					System.out.println("GRAND TOTAL :"+last);
					System.out.println("THANK YOU PLEASE VISIT AGAIN..........!");
					break;
					
				case 3:
					price=225;
					System.out.println("Cheese burst Margherita chicken pizza "+price);
					System.out.println("GST :"+GST);
					System.out.println("dilevry charges :"+dilevry_charge);
					total_pay=GST+dilevry_charge+price;
					System.out.println("Total pay :"+total_pay);
					li.nonlist();
					last=total_pay+li.extra_cost;
					System.out.println();
					System.out.println("GRAND TOTAL :"+last);
					System.out.println("THANK YOU PLEASE VISIT AGAIN..........!");
					break;
					
				case 4:
					price=245;
					System.out.println("Cheese burst Peppy paneer chicken pizza "+price);
					System.out.println("GST :"+GST);
					System.out.println("dilevry charges :"+dilevry_charge);
					total_pay=GST+dilevry_charge+price;
					System.out.println("Total pay :"+total_pay);
					li.nonlist();
					last=total_pay+li.extra_cost;
					System.out.println();
					System.out.println("GRAND TOTAL :"+last);
					System.out.println("THANK YOU PLEASE VISIT AGAIN..........!");
					break;
					
				case 5:
					price=275;
					System.out.println("Cheese burst Fresh chicken veggi "+price);
					System.out.println("GST :"+GST);
					System.out.println("dilevry charges :"+dilevry_charge);
					total_pay=GST+dilevry_charge+price;
					System.out.println("Total pay :"+total_pay);
					li.nonlist();
					last=total_pay+li.extra_cost;
					System.out.println();
					System.out.println("GRAND TOTAL :"+last);
					System.out.println("THANK YOU PLEASE VISIT AGAIN..........!");
					break;
					
				default:System.out.println("invalid");
			}	
				break;
			
		case 3 :
			System.out.println("Volcano chicken Pizza chicken Pizza");
			System.out.println("Enter Your Choice :\n1.Corn chicken Pizza \n2.Paneer chicken Pizza \n3.Margherita chicken Pizza \n4.Peppy chicken Paneer \n5.Fresh chicken veggi");
			opn1=sc.nextInt();
			switch(opn1)
			{
			
				case 1:	
					price=150;
					System.out.println("Volcano CORN chicken PIZZA : "+price);
					System.out.println("GST :"+GST);
					System.out.println("dilevry charges :"+dilevry_charge);
					total_pay=GST+dilevry_charge+price;
					System.out.println("Total pay :"+total_pay);
					System.out.println();
					li.nonlist();
					last=total_pay+li.extra_cost;
					System.out.println();
					System.out.println("GRAND TOTAL :"+last);
					System.out.println("THANK YOU PLEASE VISIT AGAIN..........!");
					break;
					
				case 2:
					price=180;
					System.out.println("Volcano Paneer chicken Pizza "+price);
					System.out.println("GST :"+GST);
					System.out.println("dilevry charges :"+dilevry_charge);
					total_pay=GST+dilevry_charge+price;
					System.out.println("Total pay :"+total_pay);
					li.nonlist();
					last=total_pay+li.extra_cost;
					System.out.println();
					System.out.println("GRAND TOTAL :"+last);
					System.out.println("THANK YOU PLEASE VISIT AGAIN..........!");
					break;
					
				case 3:
					price=225;
					System.out.println("Volcano Margherita chicken pizza "+price);
					System.out.println("GST :"+GST);
					System.out.println("dilevry charges :"+dilevry_charge);
					total_pay=GST+dilevry_charge+price;
					System.out.println("Total pay :"+total_pay);
					li.nonlist();
					last=total_pay+li.extra_cost;
					System.out.println();
					System.out.println("GRAND TOTAL :"+last);
					System.out.println("THANK YOU PLEASE VISIT AGAIN..........!");
					break;
					
				case 4:
					price=245;
					System.out.println("Volcano Peppy paneer chicken pizza "+price);
					System.out.println("GST :"+GST);
					System.out.println("dilevry charges :"+dilevry_charge);
					total_pay=GST+dilevry_charge+price;
					System.out.println("Total pay :"+total_pay);
					li.nonlist();
					last=total_pay+li.extra_cost;
					System.out.println();
					System.out.println("GRAND TOTAL :"+last);
					System.out.println("THANK YOU PLEASE VISIT AGAIN..........!");
					break;
					
				case 5:
					price=275;
					System.out.println("Volcano Fresh chicken veggi "+price);
					System.out.println("GST :"+GST);
					System.out.println("dilevry charges :"+dilevry_charge);
					total_pay=GST+dilevry_charge+price;
					System.out.println("Total pay :"+total_pay);
					li.nonlist();
					last=total_pay+li.extra_cost;
					System.out.println();
					System.out.println("GRAND TOTAL :"+last);
					System.out.println("THANK YOU PLEASE VISIT AGAIN..........!");
					break;
					
				default:System.out.println("invalid");
			}	
				break;
			
		default : 
				System.out.println("invalid");
			
		}
		
	}
	

}
