package hr.algebra.Utilities;

import hr.algebra.Factories.Factory;
import hr.algebra.models.*;

import java.util.Random;

public class Utils {
    public static int getRandomInt(int min, int max) {
        return (new Random().nextInt((max - min) + 1) + min);
    }

    public static Size getRandomSize() {
        int temp = getRandomInt(0, 1);
        if (getRandomInt(0, 1) == 0) {
            return Size.BIG;
        }
        return Size.SMALL;
    }

    public static FuelType getRandomFuelType() {
        if (getRandomInt(0, 1) == 0) {
            return FuelType.BATTERY;
        }
        return FuelType.GAS;
    }

    public static float getRandomFuelPercentage() {
        return ((float) getRandomInt(1, 100) / 100);
    }

    public static Vehicle getRandomVehicle() {
        FuelType ft = getRandomFuelType();
        float fp = getRandomFuelPercentage();

        int temp = getRandomInt(0, 2);

        switch (temp) {
            case 0:
                return Factory.getVehicle(ft, fp, VehicleType.CAR);
            case 1:
                return Factory.getVehicle(ft, fp, VehicleType.TRUCK);
            case 2:
                return Factory.getVehicle(ft, fp, VehicleType.VAN);
        }
        return Factory.getVehicle(ft, fp, VehicleType.BUS);

    }
}
