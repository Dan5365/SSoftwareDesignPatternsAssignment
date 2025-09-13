public class CarBuilder implements Builder {
    private Car car;

    public CarBuilder() {
        this.car = new Car();
    }

    @Override
    public void setBrand(String brand) {
        car.setBrand(brand);
    }

    @Override
    public void setModel(String model) {
        car.setModel(model);
    }

    @Override
    public void setDoors(int doors) {
        car.setDoors(doors);
    }

    @Override
    public Car build() {
        Car result = car;
        car = new Car();
        return result;
    }
}
