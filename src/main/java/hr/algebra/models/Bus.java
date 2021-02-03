package hr.algebra.models;

public class Bus extends Vehicle {

    public Bus(FuelType fuelType, float fuelPercentage) {
        super(fuelType, fuelPercentage, 70, Size.BIG);

    }

    @Override
    public String toString() {
        return "Bus - " + this.getString();
    }
}
