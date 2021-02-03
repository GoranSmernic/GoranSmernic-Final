package hr.algebra.models;

public class Vehicle {
    private FuelType fuelType;
    private float fuelPercentage;
    private float price;
    private Size size;

    public Vehicle(FuelType fuelType, float fuelPercentage, float price, Size size) {
        this.fuelType = fuelType;
        this.fuelPercentage = fuelPercentage;
        this.price = price;
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public float getFuelPercentage() {
        return fuelPercentage;
    }

    public void setFuelPercentage(float fuelPercentage) {
        this.fuelPercentage = fuelPercentage;
    }

    public String getString() {
        return "size: " + size + ", fuelType: " + fuelType + ", fuelPercentage: " + fuelPercentage + ", price: " + price + "kn";
    }

}
