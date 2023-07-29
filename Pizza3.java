

package piackageofpizza;

 class Pizza
{
	private int price;
	
	private  Boolean veg;
	
	private int extraCheesePrice = 100;
	
	private int extraToppingPrice = 150;
	
	private int backpackPrice = 20;
	
	private int basePizzaPrice;
	
	private boolean isExtraCheeseAdded = true;
	
	private boolean isExtraToppingsAdded= false;
	
	private boolean isOptedForTakeAway= false;
	
	
	public Pizza(Boolean veg)
	{
		this.veg=veg;
		if(this.veg)
		{
			this.price = 300;
			
		}
		else
		{
			this.price = 400;
		}
		basePizzaPrice = this.price;
	}
	
	public void addExtraCheese()
	{
		isExtraCheeseAdded = true;
		System.out.println("Extra Cheese addded");
		this.price+= extraCheesePrice ;
		
	}
	public void addExtraTopping()
	{
		isExtraToppingsAdded = true;
		System.out.println("Extra topping addded");
		this.price+= extraToppingPrice ;
		
	}
	public void takeaway()
	{
		isOptedForTakeAway = true;
		System.out.println("Take away opted");
		this.price+= backpackPrice;

		
	}
	public void getBill()
	{
		String bill= "";
		System.out.println("Pizza:"+basePizzaPrice);
		if(isExtraCheeseAdded)
		{
			bill+=  "Extra cheese added: " +extraCheesePrice+ "\n";
		}
		if(isExtraToppingsAdded)
		{
			bill+= "Extra Topping Added:"  +extraToppingPrice+ "\n";
		}
		if(isOptedForTakeAway)
		{
			bill+= "Take away:" +backpackPrice+ "\n";
		}
		
		bill +="Bill:"+this.price+"\n";
		System.out.println(bill);
	}
	
}
 //base pizza = 300;
 //Topping : 150;
 //Cheese :100;
 //Take away :20
  class DeluxePizza extends Pizza
 {
	 
	 public DeluxePizza(Boolean veg)
	 {
		 super(veg);
		 super.addExtraCheese();
		 super.addExtraTopping();
	 }

	@Override
	public void addExtraCheese() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addExtraTopping() {
		// TODO Auto-generated method stub
		
	}
	 
 }

public class Pizza3
{
	public static void main(String args[])
	{
		/*
		 * Pizza p = new Pizza(true); p.addExtraCheese(); p.addExtraTopping();
		 * p.takeaway(); p.getBill();
		 */
		DeluxePizza d = new DeluxePizza(true);
		d.addExtraCheese();
		d.addExtraTopping();
		d.takeaway();
		d.getBill();
		
	}
}
