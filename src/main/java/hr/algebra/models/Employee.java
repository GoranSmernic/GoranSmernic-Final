package hr.algebra.models;

public class Employee {
    private String name;
    private float percent;
    private float salary;

    public Employee(String name, float percent) {
        this.name = name;
        this.percent = percent;
    }

    public Employee(String name, float percent, float salary) {
        this.name = name;
        this.percent = percent;
        this.salary = salary;
    }

    public float driveVehicle(Vehicle vehicle) {
        salary += vehicle.getPrice() * this.percent;
        return vehicle.getPrice() * this.percent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPercent() {
        return percent;
    }

    public void setPercent(float percent) {
        this.percent = percent;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee -" + " name: " + name + ", percent: " + percent + ", salary: " + salary;
    }
}
