package factory.carfactory;

import factory.carfactory.cars.BmwModel;
import factory.carfactory.cars.Car;
import factory.carfactory.cars.FordModel;

public interface Factory {

    Car buildFord(FordModel model);
    Car buildBmw(BmwModel model);

}
