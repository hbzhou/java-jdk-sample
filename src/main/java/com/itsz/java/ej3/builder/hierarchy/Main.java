package com.itsz.java.ej3.builder.hierarchy;

public class Main {

    public static void main(String[] args) {

        Pizza nyPizza = new NewYorkPizza.Builder(NewYorkPizza.Size.LARGE).addTopping(Pizza.Topping.HAM).build();
        Pizza calzonePizza = new CalzonePizza.Builder().sauceInside().addTopping(Pizza.Topping.MUSHROOM).build();

        System.out.println(nyPizza);
        System.out.println(calzonePizza);
    }
}
