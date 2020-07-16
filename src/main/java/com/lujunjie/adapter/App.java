package com.lujunjie.adapter;

public class App {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();


        WildTurkey wildTurkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);

        testDuck(duck);
        testDuck(turkeyAdapter);
//        testDuck(wildTurkey);

    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
