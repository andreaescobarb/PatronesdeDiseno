/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Builder.Meal;
import Builder.MealBuilder;
import Builder.MealDirector;
import Builder.SandwichMealBuilder;
import Factory.Car;
import Factory.CarFactory;
import Factory.CarType;
import Observer.HeadHunter;
import Observer.JobSeeker;
import Singleton.EagerSingleton;

/**
 *
 * @author edujg
 */
public class Tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Builder");
        Builder();
        System.out.println("Factory");
        Factory();
        System.out.println("Observer");
        Observer();
        System.out.println("Singleton");
        Singleton();
    }
    public static void Builder(){
        MealBuilder b = new SandwichMealBuilder();
        MealDirector vendedor = new MealDirector();
        vendedor.makeMeal(b);
        Meal meal = b.getMeal();
        System.out.println(b.getMeal().toString());
    }
    public static void Factory(){
        CarFactory factory = new CarFactory();
        Car carrito = factory.buildCar(CarType.LUXURY);
        //System.out.println(carrito.getModel());
    }
    
    public static void Observer(){
        HeadHunter hunter = new HeadHunter();         
        JobSeeker seeker = new JobSeeker("Seeker");         
        hunter.registerObserver(seeker);         
        hunter.addJob("Trabajo disponible en Tesla");
    }
    public static void Singleton(){
        EagerSingleton s = EagerSingleton.getInstance();
        s.helloSingleton();
    }
}
