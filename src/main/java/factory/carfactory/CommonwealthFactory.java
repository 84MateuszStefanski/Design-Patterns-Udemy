package factory.carfactory;

import factory.carfactory.cars.*;

public class CommonwealthFactory implements Factory {

    SteeringWheelPosition position = SteeringWheelPosition.RIGHT;


    @Override
    public Car buildFord(FordModel model) {
        switch(model) {
            case CMAX:
                return new Ford(1.8F,"Diesel",2009, position);
            case FOCUS:
                return new Ford(2.2F,"LPG", 2019, position);
            default:
                throw new IllegalArgumentException("Unknown model");
        }
    }

    @Override
    public Car buildBmw(BmwModel model) {
        switch (model) {
            case X5:
                return new Bmw(1.8F,"Diesiel",2019, position);
            case E60:
                return new Bmw(1.6F,"Gas", 2018, position);
            default:
                throw new IllegalArgumentException("Unknown model");
        }
    }
}
