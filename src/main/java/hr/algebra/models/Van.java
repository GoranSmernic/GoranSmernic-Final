package hr.algebra.models;

public class Van extends Vehicle {

    public Van(FuelType fuelType, float fuelPercentage) {
        super(fuelType, fuelPercentage, 80, Size.SMALL);

    }

    @Override
    public String toString() {
        return "Van - " + this.getString();
    }
}