package hr.algebra.models;

public class Car extends Vehicle {

    public Car(FuelType fuelType, float fuelPercentage) {
        super(fuelType, fuelPercentage, 50, Size.SMALL);

    }

    @Override
    public String toString() {
        return "Car - " + this.getString();
    }
}
