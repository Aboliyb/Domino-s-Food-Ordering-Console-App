package com.Dominos;

import java.util.Scanner;

public class VegPizzaDetails implements VegPizza
{
	Scanner sc= new Scanner(System.in);
	int op1;
	@Override
	public void Veg() 
	{
		int op;
		int total_pay;
		int price;
		System.out.println("Enter what you want :\n1.Simple Pizza \n2.Cheese burst Pizza \n3.Volcano Pizza");
		
		op=sc.nextInt();
		
		
		int last=0;
		VegList li= new VegList();
		Size s=new Size();
		
		switch(op)
		{ 
		case 1 :
				System.out.println("Enter Your Choice :\n1.Corn Pizza \n2.Paneer Pizza \n3.Margherita \n4.Peppy Paneer \n5.Fresh veggi");
				op1=sc.nextInt();
				switch(op1)
				{
				
					case 1:	
						price=150;
						System.out.println("CORN PIZZA : "+price);
						System.out.println("GST :"+GST);
						System.out.println("dilevry charges :"+dilevry_charge);
						total_pay=GST+dilevry_charge+price;
						System.out.println("Total pay :"+total_pay);
						System.out.println();
						s.sixeType();
						li.List1();	
						last=total_pay+li.extra_cost;
						System.out.println();
						System.out.println("GRAND TOTAL :"+last);
						System.out.println("THANK YOU PLEASE VISIT AGAIN..........!");
						break;
						
					case 2:
						price=180;
						System.out.println("Paneer Pizza "+price);
						System.out.println("GST :"+GST);
						System.out.println("dilevry charges :"+dilevry_charge);
						total_pay=GST+dilevry_charge+price;
						System.out.println("Total pay :"+total_pay);
						s.sixeType();
						li.List1();		// list obj
						last=total_pay+li.extra_cost;
						System.out.println();
						System.out.println("GRAND TOTAL :"+last);
						System.out.println("THANK YOU PLEASE VISIT AGAIN..........!");
						break;
						
					case 3:
						price=225;
						System.out.println("Margherita pizza "+price);
						System.out.println("GST :"+GST);
						System.out.println("dilevry charges :"+dilevry_charge);
						total_pay=GST+dilevry_charge+price;
						System.out.println("Total pay :"+total_pay);
						s.sixeType();
						li.List1();//obj
						last=total_pay+li.extra_cost;
						System.out.println();
						System.out.println("GRAND TOTAL :"+last);
						System.out.println("THANK YOU PLEASE VISIT AGAIN..........!");
						break;
						
					case 4:
						price=245;
						System.out.println("Peppy paneer pizza "+price);
						System.out.println("GST :"+GST);
						System.out.println("dilevry charges :"+dilevry_charge);
						total_pay=GST+dilevry_charge+price;
						System.out.println("Total pay :"+total_pay);
						s.sixeType();
						li.List1();//obj
						last=total_pay+li.extra_cost;
						System.out.println();
						System.out.println("GRAND TOTAL :"+last);
						System.out.println("THANK YOU PLEASE VISIT AGAIN..........!");
						break;
						
					case 5:
						price=275;
						System.out.println("Fresh veggi "+price);
						System.out.println("GST :"+GST);
						System.out.println("dilevry charges :"+dilevry_charge);
						total_pay=GST+dilevry_charge+price;
						System.out.println("Total pay :"+total_pay);
						s.sixeType();
						li.List1();//obj list
						last=total_pay+li.extra_cost;
						System.out.println();
						System.out.println("GRAND TOTAL :"+last);
						System.out.println("THANK YOU PLEASE VISIT AGAIN..........!");
						break;
						
					default:System.out.println("invalid");
				}	
				break;
			
		case 2 :
				System.out.println("Cheese Burst Pizza");
				System.out.println("Enter Your Choice :\n1.Corn Pizza \n2.Paneer Pizza \n3.Margherita \n4.Peppy Paneer \n5.Fresh veggi");
				op1=sc.nextInt();
				switch(op1)
				{
				
					case 1:	
						price=210;
						System.out.println("CHEESE BURST CORN PIZZA : "+price);
						System.out.println("GST :"+GST);
						System.out.println("dilevry charges :"+dilevry_charge);
						total_pay=GST+dilevry_charge+price;
						System.out.println("Total pay :"+total_pay);
						System.out.println();
						s.sixeType();
						li.List1();	
						last=total_pay+li.extra_cost;
						System.out.println();
						System.out.println("GRAND TOTAL :"+last);
						System.out.println("THANK YOU PLEASE VISIT AGAIN..........!");
						break;
						
					case 2:
						price=235;
						System.out.println("CHEESE BURST PANEER PIZZA "+price);
						System.out.println("GST :"+GST);
						System.out.println("dilevry charges :"+dilevry_charge);
						total_pay=GST+dilevry_charge+price;
						System.out.println("Total pay :"+total_pay);
						s.sixeType();
						li.List1();		// list obj
						last=total_pay+li.extra_cost;
						System.out.println();
						System.out.println("GRAND TOTAL :"+last);
						System.out.println("THANK YOU PLEASE VISIT AGAIN..........!");
						break;
						
					case 3:
						price=245;
						System.out.println("CHEESE BURST Margherita pizza "+price);
						System.out.println("GST :"+GST);
						System.out.println("dilevry charges :"+dilevry_charge);
						total_pay=GST+dilevry_charge+price;
						System.out.println("Total pay :"+total_pay);
						s.sixeType();
						li.List1();//obj
						last=total_pay+li.extra_cost;
						System.out.println();
						System.out.println("GRAND TOTAL :"+last);
						System.out.println("THANK YOU PLEASE VISIT AGAIN..........!");
						break;
						
					case 4:
						price=260;
						System.out.println("CHEESE BURST Peppy paneer pizza "+price);
						System.out.println("GST :"+GST);
						System.out.println("dilevry charges :"+dilevry_charge);
						total_pay=GST+dilevry_charge+price;
						System.out.println("Total pay :"+total_pay);
						s.sixeType();
						li.List1();//obj
						last=total_pay+li.extra_cost;
						System.out.println();
						System.out.println("GRAND TOTAL :"+last);
						System.out.println("THANK YOU PLEASE VISIT AGAIN..........!");
						break;
						
					case 5:
						price=275;
						System.out.println("CHEESE BURST Fresh veggi "+price);
						System.out.println("GST :"+GST);
						System.out.println("dilevry charges :"+dilevry_charge);
						total_pay=GST+dilevry_charge+price;
						System.out.println("Total pay :"+total_pay);
						s.sixeType();
						li.List1();//obj list
						last=total_pay+li.extra_cost;
						System.out.println();
						System.out.println("GRAND TOTAL :"+last);
						System.out.println("THANK YOU PLEASE VISIT AGAIN..........!");
						break;
						
					default:System.out.println("invalid");
				}	
				break;
			
		case 3 :
				System.out.println("Volcano pizza");
				System.out.println("Enter Your Choice :\n1.Corn Pizza \n2.Paneer Pizza \n3.Margherita \n4.Peppy Paneer \n5.Fresh veggi");
				op1=sc.nextInt();
				switch(op1)
				{
				
					case 1:	
						price=250;
						System.out.println("Volcano CORN PIZZA : "+price);
						System.out.println("GST :"+GST);
						System.out.println("dilevry charges :"+dilevry_charge);
						total_pay=GST+dilevry_charge+price;
						System.out.println("Total pay :"+total_pay);
						s.sixeType();
						System.out.println();
						li.List1();	
						last=total_pay+li.extra_cost;
						System.out.println();
						System.out.println("GRAND TOTAL :"+last);
						System.out.println("THANK YOU PLEASE VISIT AGAIN..........!");
						break;
						
					case 2:
						price=270;
						System.out.println("Volcano Paneer Pizza "+price);
						System.out.println("GST :"+GST);
						System.out.println("dilevry charges :"+dilevry_charge);
						total_pay=GST+dilevry_charge+price;
						System.out.println("Total pay :"+total_pay);
						s.sixeType();
						li.List1();		// list obj
						last=total_pay+li.extra_cost;
						System.out.println();
						System.out.println("GRAND TOTAL :"+last);
						System.out.println("THANK YOU PLEASE VISIT AGAIN..........!");
						break;
						
					case 3:
						price=280;
						System.out.println("Volcano Margherita pizza "+price);
						System.out.println("GST :"+GST);
						System.out.println("dilevry charges :"+dilevry_charge);
						total_pay=GST+dilevry_charge+price;
						System.out.println("Total pay :"+total_pay);
						s.sixeType();
						li.List1();//obj
						last=total_pay+li.extra_cost;
						System.out.println();
						System.out.println("GRAND TOTAL :"+last);
						System.out.println("THANK YOU PLEASE VISIT AGAIN..........!");
						break;
						
					case 4:
						price=300;
						System.out.println("Volcano Peppy paneer pizza "+price);
						System.out.println("GST :"+GST);
						System.out.println("dilevry charges :"+dilevry_charge);
						total_pay=GST+dilevry_charge+price;
						System.out.println("Total pay :"+total_pay);
						s.sixeType();
						li.List1();//obj
						last=total_pay+li.extra_cost;
						System.out.println();
						System.out.println("GRAND TOTAL :"+last);
						System.out.println("THANK YOU PLEASE VISIT AGAIN..........!");
						break;
						
					case 5:
						price=315;
						System.out.println("Volcano Fresh veggi "+price);
						System.out.println("GST :"+GST);
						System.out.println("dilevry charges :"+dilevry_charge);
						total_pay=GST+dilevry_charge+price;
						System.out.println("Total pay :"+total_pay);
						s.sixeType();
						li.List1();//obj list
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
