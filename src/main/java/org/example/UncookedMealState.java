package org.example;

public class UncookedMealState implements MealState {

    @Override
    public void cook(Meal meal) {
        System.out.println("Приготовлен.");
        meal.setState(new CookedMealState());
        System.out.println(meal.toString());
    }

    @Override
    public void eat(Meal meal) {
        System.out.println("Неприготовленная еда с трудом почти съедена.");
        System.out.println(meal.toString());
        if (Math.max(meal.getCalories() - 5, 0) == 0) {
            meal.setState(new EatenMealState());
        }
        meal.setCalories(Math.max(0, meal.getCalories() - 5));
    }

    @Override
    public void heat(Meal meal) {
        System.out.println("Неприготовленная еда испорчена.");
        System.out.println(meal.toString());
        meal.setState(new SpoiledMealState());
        meal.setSpoiled(true);
    }

    @Override
    public void freeze(Meal meal) {
        System.out.println("Неприготовленная еда заморожена (ничего не произошло).");
        System.out.println(meal.toString());
    }
}
