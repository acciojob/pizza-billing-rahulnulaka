package com.driver;

import com.driver.Pizza;

public class DeluxePizza extends Pizza {

	public DeluxePizza(boolean b) {
		super(b);
		// your code goes here
		addExtraCheese();
		addExtraToppings();
	}
}
