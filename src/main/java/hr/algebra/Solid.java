package hr.algebra;

import hr.algebra.Utilities.Utils;
import hr.algebra.models.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solid {

    public static void main(String[] args) throws IOException {


        printHr();
        System.out.println("Unesite broj malih vlakova: ");
        int smallTrainNumber = Integer.parseInt(readLine());

        System.out.println("Unesite broj velikih vlakova: ");
        int bigTrainNaumber = Integer.parseInt(readLine());

        System.out.println("Unesite broj vozila: ");
        int vehicleNumer = Integer.parseInt(readLine());

        printHr();

        Employee poorGuy = new Employee("Poor", (float) 0.1);
        Employee richGuy = new Employee("Rich", (float) 0.11);

        List<SmallTrain> smallTrains = new ArrayList();
        List<BigTrain> bigTrains = new ArrayList();

        generateSmallTrains(smallTrains, smallTrainNumber);
        generateBigTrains(bigTrains, bigTrainNaumber);

        fillSmallTrains(smallTrains, poorGuy, richGuy, vehicleNumer);
        fillBigTrains(bigTrains, poorGuy, richGuy, vehicleNumer);

        printHr();



        printHr();

        System.out.println(poorGuy);

        printHr();

        System.out.println(richGuy);

        printHr();
    }

    private static String readLine() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    private static void fillSmallTrains(List<SmallTrain> trains, Employee e1, Employee e2, int vehicleNumer) {
        int index = 0;
        for (Train train : trains) {
            for (int i = 0; i < vehicleNumer; i++) {
                Vehicle vehicle = Utils.getRandomVehicle();
                if (train.addVehicle(vehicle)) {
                    if (index % 2 == 0) {
                        e1.driveVehicle(vehicle);
                    } else {
                        e2.driveVehicle(vehicle);
                    }
                    System.out.println(vehicle.toString() + " On train: " + trains.toString());
                    index++;
                }
            }
        }
    }

    private static void fillBigTrains(List<BigTrain> trains, Employee e1, Employee e2, int vehicleNumer) {
        int index = 0;
        for (Train train : trains) {
            for (int i = 0; i < vehicleNumer; i++) {
                Vehicle vehicle = Utils.getRandomVehicle();
                if (train.addVehicle(vehicle)) {
                    if (index % 2 == 0) {
                        e1.driveVehicle(vehicle);
                    } else {
                        e2.driveVehicle(vehicle);
                    }
                    System.out.println(vehicle.toString() + " On train: " + trains.toString());
                    index++;
                }
            }
        }
    }

    private static void generateSmallTrains(List<SmallTrain> smallTrains, int smallTrainNumber) {
        for (int i = 0; i < smallTrainNumber; i++) {
            smallTrains.add(new SmallTrain());
        }
    }

    private static void generateBigTrains(List<BigTrain> bigTrains, int bigTrainNaumber) {
        for (int i = 0; i < bigTrainNaumber; i++) {
            bigTrains.add(new BigTrain());
        }
    }

    private static void printHr() {
        System.out.println("-----------------------------------------------------------------------------------------");
    }

}
