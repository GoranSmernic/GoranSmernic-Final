package hr.algebra.models;

public class Train {
    private Size size;
    private int slots;
    private int vehicles;
    private float money;

    public Train(Size size, int slots) {
        this.size = size;
        this.slots = slots;
    }

    public Boolean addVehicle(Vehicle vehicle) {
        if (vehicle.getSize() == getSize() && vehicles <= slots) {
            vehicles++;
            money += vehicle.getPrice();
            return true;
        }
        return false;
    }


    public int getSlots() {
        return slots;
    }

    public Size getSize() {
        return size;
    }

    public String getString() {
        return " size: " + size + ", slots: " + slots + ", vehicles: " + vehicles + ", money: " + money;
    }
}
