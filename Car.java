public class Car {
    private String brand;
    private String model;
    private int doors;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Car: " + brand + " " + model + " (" + doors + " doors)";
    }
}
