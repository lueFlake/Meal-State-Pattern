package org.example;

public class FrozenMealState implements MealState {

    @Override
    public void cook(Meal meal) {
        System.out.println("Нечего готовить.");
        System.out.println(meal.toString());
    }

    @Override
    public void eat(Meal meal) {
        System.out.println("Съедено чуть-чуть холодной еды");
        if (Math.max(meal.getCalories() - 1, 0) == 0) {
            meal.setState(new EatenMealState());
        }
        meal.setCalories(Math.max(meal.getCalories() - 1, 0));
        System.out.println(meal.toString());
    }

    @Override
    public void heat(Meal meal) {
        System.out.println("Еда разморожена.");
        meal.setFrozen(false);
        meal.setState(new CookedMealState());
        System.out.println(meal.toString());
    }

    @Override
    public void freeze(Meal meal) {
        System.out.println("Нечего замораживать.");
        System.out.println(meal.toString());
    }
}
