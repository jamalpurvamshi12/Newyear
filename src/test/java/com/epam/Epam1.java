package com.epam;

import java.util.ArrayList;
import java.util.Scanner;

public class Epam1
{
	 static ArrayList<Giftpack>al=new ArrayList<Giftpack>();
   public static void main(String args[])
   { 
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the no. of gifts you want");
	  int n=sc.nextInt();
	  for(int i=0;i<n;i++)
	  {
		System.out.println("Enter what you want to gift\n 1.chocolates  \n 2.sweets");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:inputChoclates();
		break;
		case 2:inputSweets();
		break;
		
		
		default :System.out.println("please choose your choice correctly");
		break;
		
		}
	  }
	  System.out.println(al);
   }
   
   
  public static void inputSweets()
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the sweet name \nRasmalai \nKheer");
	  String name=sc.next();
	  System.out.println("Enter the sweet price");
	  int price=sc.nextInt();
	  System.out.println("Enter the sweet weight");
	  int weight=sc.nextInt();
	  if(name.equals("Rasmalai"))
	  {
		 Rasmalai dm=new Rasmalai(name,price,weight);
		 al.add(dm);
	  }
	  else
	  {
		  Kheer sk=new Kheer(name,price,weight);
		  al.add(sk);
	  }
	  
	  
  }
  
  
  
  
  
  public static void inputChoclates()
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the choclate name");
	  String name=sc.next();
	  System.out.println("Enter the choc price");
	  int price=sc.nextInt();
	  System.out.println("Enter the choc weight");
	  int weight=sc.nextInt();
	  if(name.equals("Dairymilk"))
	  {
		  Dairymilk dm=new Dairymilk(name,price,weight);
		  al.add(dm);
	  }
	  else
	  {
		  Snickers sk=new Snickers(name,price,weight);
		  al.add(sk);
	  }
	  
	  
  }
}
