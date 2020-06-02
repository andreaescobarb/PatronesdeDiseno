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
public class Meal {
    private String sandwich;
    private String sides;
    private String drink;
    private double price;
    private String offer;

    public String getSandwich() {
        return sandwich;
    }

    public String getSides() {
        return sides;
    }

    public String getDrink() {
        return drink;
    }

    public double getPrice() {
        return price;
    }

    public String getOffer() {
        return offer;
    }

    public void setSandwich(String sandwich) {
        this.sandwich = sandwich;
    }

    public void setSides(String sides) {
        this.sides = sides;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    @Override
    public String toString() {
        return "Meal{" + "sandwich=" + sandwich + ", sides=" + sides + ", drink=" + drink + ", price=" + price + ", offer=" + offer + '}';
    }
    
}
