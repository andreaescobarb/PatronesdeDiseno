/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author edujg
 */
public class Car {

    private CarType model;

    public Car(CarType model) {
        this.model = model;
        construct();
    }

    protected void construct(){
        System.out.println("CAR");   
    }

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }
}
