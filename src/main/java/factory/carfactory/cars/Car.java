package factory.carfactory.cars;

public abstract class Car {
    private float engineCapacity;
    private String fuelType;
    private int yearOfProduction;
    private final SteeringWheelPosition position;

    protected Car(float engineCapacity, String fuelType, int yearOfProduction, SteeringWheelPosition position) {
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
        this.yearOfProduction = yearOfProduction;
        this.position = position;
    }

    public SteeringWheelPosition getSteeringWheelPosition() {
        return position;
    }
}
