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
public class MealDirector {
    public Meal makeMeal(MealBuilder b){
        b.addDrink("Coca Cola");
        b.addSides("french fries");
        b.addOffer("0");
        b.setPrice(120.00);
        return b.getMeal();
    }
}
