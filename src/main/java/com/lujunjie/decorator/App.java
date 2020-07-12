package com.lujunjie.decorator;

public class App {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();

        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);

        System.out.println(beverage.getDescription() + "," + beverage.cost());
    }
}
