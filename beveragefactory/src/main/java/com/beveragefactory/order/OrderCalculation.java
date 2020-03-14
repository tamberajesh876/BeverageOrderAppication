package com.beveragefactory.order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderCalculation {

	public static void main(String[] args) {
		try {

			Map<String, Double> actualItem = new HashMap<String, Double>();
			Map<String, Double> ingredientItem = new HashMap<String, Double>();

			Map<String, List<String>> mainItem = new HashMap<String, List<String>>();

			actualItem.put("Coffee", 5.0);
			actualItem.put("Chai", 4.0);
			actualItem.put("Banana Smoothie", 6.0);
			actualItem.put("Strawberry Shake", 7.0);
			actualItem.put("Mojito", 7.5);

			ingredientItem.put("milk", 1.0);
			ingredientItem.put("sugar", 1.0);
			ingredientItem.put("soda", 1.0);
			ingredientItem.put("mint", 1.0);
			ingredientItem.put("water", 1.0);

			mainItem.put("Coffee", new ArrayList<String>(Arrays.asList("Coffee", "milk", "sugar", "water")));
			mainItem.put("Chai", new ArrayList<String>(Arrays.asList("Tea", "milk", "sugar", "water")));
			mainItem.put("Banana Smoothie", new ArrayList<String>(Arrays.asList("banana", "milk", "sugar", "water")));
			mainItem.put("Strawberry Shake",
					new ArrayList<String>(Arrays.asList("strawberries", "milk", "sugar", "water")));
			mainItem.put("Mojito", new ArrayList<String>(Arrays.asList("Lemon", "sugar", "water", "soda", "mint")));

			Double orderPrice = 0.0;
			for (String s : args) {
				if (s.matches(".*[0-9].*"))
					throw new IllegalArgumentException(s + ". Order should contains only string");
				String[] arr = s.trim().split(",");
				Double mainItemPrice = 0.0;
				Double ingredientPrice = 0.0;
				for (String ele : arr) {

					if (mainItem.get(arr[0].trim()).size() == arr.length - 1) {
						throw new IllegalArgumentException(s + ".\nYou can not exclude all ingredients.");
					}

					if (ele == arr[0])
						mainItemPrice = actualItem.get(ele.trim());
					else
						ingredientPrice = ingredientPrice + ingredientItem.get(ele.replace("-", "").trim());

				}
				orderPrice = orderPrice + (mainItemPrice - ingredientPrice);
			}

			System.out.println(orderPrice);
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid order - " + e.getLocalizedMessage() + "\nPlease enter valid order!");
		}

	}

}
