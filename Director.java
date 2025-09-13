public class Director {
    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Car buildSportsCar() {
        builder.setBrand("Porsche");
        builder.setModel("911");
        builder.setDoors(2);
        return builder.build();
    }

    public Car buildFamilyCar() {
        builder.setBrand("Toyota");
        builder.setModel("Corolla");
        builder.setDoors(4);
        return builder.build();
    }
}
