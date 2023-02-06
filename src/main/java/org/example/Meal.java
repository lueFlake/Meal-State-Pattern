package org.example;

public class Meal {
    private MealState state;
    private int calories;
    private boolean spoiled;
    private boolean cooked;
    private boolean frozen;

    public Meal(int calories) {
        this.calories = calories;
        this.spoiled = false;
        this.cooked = false;
        this.frozen = false;
        this.state = new UncookedMealState();
    }

    public void setState(MealState state) {
        this.state = state;
    }

    public void eat() {
        state.eat(this);
    }

    public void cook() {
        state.cook(this);
    }

    public void freeze() {
        state.freeze(this);
    }

    public void heat() {
        state.heat(this);
    }

    public boolean isSpoiled() {
        return spoiled;
    }

    public void setSpoiled(boolean spoiled) {
        this.spoiled = spoiled;
    }

    public boolean isCooked() {
        return cooked;
    }

    public void setCooked(boolean cooked) {
        this.cooked = cooked;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public void setFrozen(boolean frozen) {
        this.frozen = frozen;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return String.format("Meal: %d calories, spoiled: %b, cooked: %b, frozen %b", calories, spoiled, cooked, frozen);
    }
}
