package factory.carfactory;

import factory.carfactory.cars.BmwModel;
import factory.carfactory.cars.Car;
import factory.carfactory.cars.FordModel;

public class Main {
    public static void main(String[] args) {


        Factory commonwealthFactory = new CommonwealthFactory();
        Factory continentalFactory = new ContinentalFactory();

        Car bmw = commonwealthFactory.buildBmw(BmwModel.E60);
        System.out.println(bmw.getSteeringWheelPosition());

        Car ford = continentalFactory.buildFord(FordModel.CMAX);
        System.out.println(ford.getSteeringWheelPosition());

    }
}
