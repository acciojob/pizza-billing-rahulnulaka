package com.driver;

import com.driver.DeluxePizza;
import com.driver.Pizza;

public class Main {
	public static void main(String[] args) {
		DeluxePizza dp = new DeluxePizza(true);
		System.out.println(dp.getPrice());
		dp.addTakeaway();
		dp.addExtraCheese();
		dp.addTakeaway();
		System.out.println(dp.getBill());

		Pizza p = new Pizza(true);
		p.addExtraCheese();
		p.addExtraToppings();
		p.addTakeaway();
		System.out.println(p.getBill());
	}
}