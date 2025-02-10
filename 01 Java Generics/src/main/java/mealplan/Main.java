package mealplan;

// Main class to demonstrate the meal plan generator
public class Main {
    public static void main(String[] args) {
        // Create meal plans
        VegetarianMeal vegetarianMeal = new VegetarianMeal();
        VeganMeal veganMeal = new VeganMeal();
        KetoMeal ketoMeal = new KetoMeal();
        HighProteinMeal highProteinMeal = new HighProteinMeal();

        // Create meals
        Meal<VegetarianMeal> vegMeal = new Meal<>("Vegetarian Pasta", vegetarianMeal);
        Meal<VeganMeal> veganMealPlan = new Meal<>("Vegan Salad", veganMeal);
        Meal<KetoMeal> ketoMealPlan = new Meal<>("Keto Steak", ketoMeal);
        Meal<HighProteinMeal> proteinMealPlan = new Meal<>("High-Protein Shake", highProteinMeal);

        // Create meal generator and add meals
        MealGenerator generator = new MealGenerator();
        generator.addMeal(vegMeal);
        generator.addMeal(veganMealPlan);
        generator.addMeal(ketoMealPlan);
        generator.addMeal(proteinMealPlan);

        // Display all meals
        generator.displayMeals();

        // Generate personalized meal plans
        generator.generateMealPlan(vegMeal);
        generator.generateMealPlan(veganMealPlan);
        generator.generateMealPlan(ketoMealPlan);
        generator.generateMealPlan(proteinMealPlan);
    }
}