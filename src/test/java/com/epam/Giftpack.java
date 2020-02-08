package com.epam;

abstract  class Giftpack 
{
  abstract void display();
  private int price;
  private int weight;
  
  public Giftpack(int price2, int weight2)
  {
	  this.price=price2;
	  this.weight=weight2;
	// TODO Auto-generated constructor stub
}

public int getPrice()
  {
	  return price;
  }
  
  public int getweight()
  {
	  return weight;
  }
  
  public String toString()
  {
	  return "Price :Rs. "+this.getPrice()+"\nWeight :"+this.weight;
  }
  
}
