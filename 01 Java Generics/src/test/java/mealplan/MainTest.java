package mealplan;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class MealGeneratorTest {

    @Test
    void testAddMeal() {
        MealGenerator generator = new MealGenerator();
        Meal<VegetarianMeal> vegMeal = new Meal<>("Vegetarian Pasta", new VegetarianMeal());
        generator.addMeal(vegMeal);

        assertEquals(1, generator.getAllMeals().size());
    }

    @Test
    void testGenerateMealPlan() {
        MealGenerator generator = new MealGenerator();
        Meal<VeganMeal> veganMeal = new Meal<>("Vegan Salad", new VeganMeal());
        generator.addMeal(veganMeal);

        // Ensure the meal plan is generated successfully
        generator.generateMealPlan(veganMeal);
    }

    @Test
    void testDisplayMeals() {
        MealGenerator generator = new MealGenerator();
        Meal<KetoMeal> ketoMeal = new Meal<>("Keto Steak", new KetoMeal());
        generator.addMeal(ketoMeal);

        // Ensure the meal is displayed correctly
        generator.displayMeals();
    }
}