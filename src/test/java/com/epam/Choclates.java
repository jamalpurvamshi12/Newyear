package com.epam;

public abstract class Choclates extends Giftpack
{

	private String t_name;
	private int weight;
	private int price;

	public Choclates(String t_name,int price, int weight)
	{
		super(price, weight);
		this.t_name=t_name;
		this.price=price;
		this.weight=weight;
		// TODO Auto-generated constructor stub
	}
	
	
	public String get_name()
	{
		return t_name;
	}
	
	public int getprice()
	{
		return price;
	}
	
	public int getweight()
	{
		return weight;
	}
	
	public String toString()
	{
       return "\n2CHOCLATE name :"+this.t_name+"\nPrice :Rs."+this.price+"\nWeight :"+this.weight+"grams";
		
	}

}
