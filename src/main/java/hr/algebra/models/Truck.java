package hr.algebra.models;

public class Truck extends Vehicle {

    public Truck(FuelType fuelType, float fuelPercentage) {
        super(fuelType, fuelPercentage, 90, Size.BIG);

    }

    @Override
    public String toString() {
        return "Truck - " + this.getString();
    }
}