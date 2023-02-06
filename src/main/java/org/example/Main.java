package org.example;

public class Main {
    public static void main(String[] args) {
        Meal meal = new Meal(100);
        System.out.println(meal.toString());
        meal.eat();
        meal.cook();
        meal.freeze();
        meal.eat();
        meal.heat();
        meal.eat();
        meal.eat();
    }
}