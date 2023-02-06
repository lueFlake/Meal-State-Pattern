package org.example;

public class CookedMealState implements MealState {

    @Override
    public void cook(Meal meal) {
        System.out.println("Приготовленная еда не готовится.");
        System.out.println(meal.toString());
    }

    @Override
    public void eat(Meal meal) {
        System.out.println("Приготовленная еда съедена.");
        meal.setState(new EatenMealState());
        meal.setCalories(0);
        System.out.println(meal.toString());
    }

    @Override
    public void heat(Meal meal) {
        System.out.println("Приготовленная еда подогрета (ничего не произошло).");
        System.out.println(meal.toString());
    }

    @Override
    public void freeze(Meal meal) {
        System.out.println("Неприготовленная еда заморожена.");
        meal.setState(new FrozenMealState());
        meal.setFrozen(true);
        System.out.println(meal.toString());
    }
}
