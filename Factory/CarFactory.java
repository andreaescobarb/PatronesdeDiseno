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
public class CarFactory {
    public Car buildCar(CarType model) {
        switch (model) {
        case SMALL:
            return new SmallCar();
        case SEDAN:
            return new SedanCar();
        case LUXURY:
            return new LuxuryCar();
        default:
            return new Car(model);
        }
    }
}
