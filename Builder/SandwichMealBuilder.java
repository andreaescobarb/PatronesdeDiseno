/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author andre
 */
public class SandwichMealBuilder implements MealBuilder {

    private Meal meal = new Meal();

    @Override
    public void addSides(String side) {
        meal.setSides(side);
    }

    @Override
    public void addDrink(String drink) {
        meal.setDrink(drink);
    }

    @Override
    public void addSandwich(String sandwich) {
        meal.setSandwich(sandwich);
    }

    @Override
    public void addOffer(String offer) {
        meal.setOffer(offer);
    }

    @Override
    public Meal getMeal() {
        return meal;
    }

    @Override
    public void setPrice(double d) {
        meal.setPrice(d);
    }

}
