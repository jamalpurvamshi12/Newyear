package com.epam;

public abstract class Sweets  extends Giftpack
{
    abstract void display();
	private String sweet_name;
	private int price;
	private int weight;

	public Sweets(String sweet_name,int price2, int weight2)
	{
		
		super(price2, weight2);
		this.sweet_name=sweet_name;
		this.price=price2;
		this.weight=weight2;
		
		// TODO Auto-generated constructor stub
	}
	
	
	public String get_name()
	{
		return sweet_name;
		
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
		return "\nSweet name:"+this.sweet_name+"\nPrice:Rs. "+this.price+"\nweight:"+this.weight+"grams";
		
	}
	

}
