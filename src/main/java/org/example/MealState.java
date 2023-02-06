package org.example;

public interface MealState {
    void cook(Meal meal);
    void eat(Meal meal);
    void heat(Meal meal);
    void freeze(Meal meal);
}
