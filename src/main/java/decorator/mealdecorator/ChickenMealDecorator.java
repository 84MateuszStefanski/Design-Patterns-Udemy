package decorator.mealdecorator;

public class ChickenMealDecorator extends MealDecorator {

    public ChickenMealDecorator(Meal decoratedMeal) {
        super(decoratedMeal);
    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addChciken();

    }

    private void addChciken() {
        System.out.println("Do dania dodaję kurczaka ");
    }
}
