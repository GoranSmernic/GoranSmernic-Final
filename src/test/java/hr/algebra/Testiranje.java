package hr.algebra;

import hr.algebra.Factories.Factory;
import hr.algebra.models.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testiranje {
    @Test
    public void shouldReturnTrueIfBigVehicleWantsToGetOnBigTrain() {
        BigTrain train = new BigTrain();
        Vehicle vehicle = Factory.getVehicle(FuelType.GAS, 0.5F, VehicleType.TRUCK);
        Assertions.assertTrue(train.addVehicle(vehicle));
    }

    @Test
    public void shouldReturnFalseIfBigVehicleWantsToGetOnSmallTrain() {
        SmallTrain train = new SmallTrain();
        Vehicle vehicle = Factory.getVehicle(FuelType.GAS, 0.5F, VehicleType.BUS);
        Assertions.assertFalse(train.addVehicle(vehicle));
    }

}
