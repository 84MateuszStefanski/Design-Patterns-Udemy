package factory.carfactory;

import factory.carfactory.cars.*;

public class ContinentalFactory implements Factory {
    SteeringWheelPosition position = SteeringWheelPosition.LEFT;


    @Override
    public Car buildFord(FordModel model) {
        switch(model) {
            case CMAX:
                return new Ford(1.8F,"LPG",2018, position);
            case FOCUS:
                return new Ford(2.2F,"Gasoline", 2020, position);
            default:
                throw new IllegalArgumentException("Unknown model");
        }
    }

    @Override
    public Car buildBmw(BmwModel model) {
        switch (model) {
            case X5:
                return new Bmw(3.3F,"Gasoline",2021, position);
            case E60:
                return new Bmw(2.2F, "Diesel", 2018, position);
            default:
                throw new IllegalArgumentException("Unknown model");
        }
    }


}
