# BeverageOrderAppication
BeverageOrderAppication

This application serves a variety of drinks, juices etc to the customers from its pre-defined set of menu Items.

In this application users has a choice to customize their drinks in case they want to avoid some specific ingredients from their drinks,
e.g. a person ordering "Chai Latte" which has ingredients as "tea leaves, milk, water, sugar, condiments" a person can order a chai latter without sugar and condiments.


Below are the Menu Items with their respective ingredients and prices:

  Coffee: "Coffee, milk, sugar, water" Price: 5$

  Chai: "Tea, milk, sugar, water" Price: 4$

  Banana Smoothie: "banana, milk, sugar, water" Price: 6$

  Strawberry Shake: "Strawberries, sugar, milk, water" Price: 7 $

  Mojito: "Lemon, sugar, water, soda, mint" Price 7.5 $

The order to be placed in the application always a String concatenated by exclusions.

1. "Chai, -sugar"

2. "Chai, -sugar, -milk"

3. "Chai"

4. ["Chai, -sugar", "Chai", "Coffee, -milk"]