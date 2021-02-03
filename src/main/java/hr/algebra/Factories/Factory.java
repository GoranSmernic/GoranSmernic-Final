package hr.algebra.Factories;

import hr.algebra.models.*;

public class Factory {
    public static Vehicle getVehicle(FuelType fuelType, float fuelPercentage, VehicleType vehicleType) {
        switch (vehicleType) {
            case BUS:
                return new Bus(fuelType, fuelPercentage);
            case CAR:
                return new Car(fuelType, fuelPercentage);
            case TRUCK:
                return new Truck(fuelType, fuelPercentage);
            case VAN:
                return new Van(fuelType, fuelPercentage);
        }
        return null;
    }
}
