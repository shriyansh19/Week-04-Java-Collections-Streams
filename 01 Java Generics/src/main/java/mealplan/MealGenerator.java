package mealplan;

import java.util.ArrayList;
import java.util.List;

// Class to generate and validate meal plans
public class MealGenerator {
    private List<Meal<? extends MealPlan>> meals;

    public MealGenerator() {
        meals = new ArrayList<>();
    }

    // Add a meal to the generator
    public <T extends MealPlan> void addMeal(Meal<T> meal) {
        meals.add(meal);
    }

    // Validate and generate a personalized meal plan
    public <T extends MealPlan> void generateMealPlan(Meal<T> meal) {
        if (isValidMealPlan(meal)) {
            System.out.println("Generated Meal Plan: " + meal);
        } else {
            System.out.println("Invalid Meal Plan: " + meal.getMealName());
        }
    }

    // Validate the meal plan
    private <T extends MealPlan> boolean isValidMealPlan(Meal<T> meal) {
        // Add validation logic here (e.g., check if the meal plan is supported)
        return true; // Placeholder for simplicity
    }

    // Display all meals in the generator
    public void displayMeals() {
        System.out.println("Meals in Generator:");
        for (Meal<? extends MealPlan> meal : meals) {
            System.out.println(meal);
        }
    }

    // Get all meals in the generator
    public List<Meal<? extends MealPlan>> getAllMeals() {
        return meals;
    }
}