package com.driver;

public class Pizza {

	private int price;
	private boolean isVeg;
	private String bill;
	private boolean isBill = false;
	private int cheese = -1;
	private int toppings = -1;
	private int takeaway = -1;

	final private int basePriceOfVeg = 300;
	final private int basePriceOfNonVeg = 400;
	final private int extraCheesePrice = 80;
	final private int ExtraToppingsForVegPizza = 70;
	final private int ExtraToppingsForNonvegPizza = 120;
	final private int PaperbagPrice = 20;

	public Pizza(boolean isVeg) {
		this.isVeg = isVeg;
		// your code goes here
		if (isVeg) {
			this.price = basePriceOfVeg;
		} else {
			this.price = basePriceOfNonVeg;
		}
		this.bill = "";
	}

	public int getPrice() {
		return this.price;
	}

	public void addExtraCheese() {
		// your code goes here
		if (cheese == -1) {
			this.price += extraCheesePrice;
			cheese = extraCheesePrice;
			return;
		}
		return;
	}

	public void addExtraToppings() {
		// your code goes here
		if (toppings == -1) {
			if (this.isVeg == true) {
				this.price += ExtraToppingsForVegPizza;
				toppings = ExtraToppingsForVegPizza;
				return;
			}
			this.price += ExtraToppingsForNonvegPizza;
			toppings = ExtraToppingsForNonvegPizza;
			return;
		}
		return;
	}

	public void addTakeaway() {
		// your code goes here
		if (takeaway == -1) {
			this.price += PaperbagPrice;
			takeaway = PaperbagPrice;
		}
	}

	public String getBill() {
		// your code goes here
		if (isBill == false) {
			if (isVeg == true)
				bill += "Base Price Of The Pizza: " + basePriceOfVeg + "\n";
			else
				bill += "Base Price Of The Pizza: " + basePriceOfNonVeg + "\n";
			if (cheese != -1)
				bill += "Extra Cheese Added: " + cheese + "\n";
			if (toppings != -1)
				bill += "Extra Toppings Added: " + toppings + "\n";
			if (takeaway != -1)
				bill += "Paperbag Added: " + PaperbagPrice + "\n";
			bill += "Total Price: " + price + "\n";
			isBill = true;
		}
		return this.bill;

	}
}
