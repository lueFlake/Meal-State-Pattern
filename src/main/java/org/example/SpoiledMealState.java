package org.example;

public class SpoiledMealState implements MealState {

    @Override
    public void cook(Meal meal) {
        System.out.println("Нечего готовить.");
        System.out.println(meal.toString());
    }

    @Override
    public void eat(Meal meal) {
        System.out.println("Нечего есть.");
        System.out.println(meal.toString());
    }

    @Override
    public void heat(Meal meal) {
        System.out.println("Нечего греть.");
        System.out.println(meal.toString());
    }

    @Override
    public void freeze(Meal meal) {
        System.out.println("Нечего замораживать.");
        System.out.println(meal.toString());
    }
}
