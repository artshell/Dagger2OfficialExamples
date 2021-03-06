package com.artshell;

import dagger.Component;

import javax.inject.Singleton;

public class CoffeeApp {

    @Singleton
    @Component(modules = DripCoffeeModule.class)
    public interface Coffee {
        CoffeeMaker marker();
    }

    public static void main(String[] args) {
        Coffee coffee = DaggerCoffeeApp_Coffee.create();
        coffee.marker().brew();
    }
}
