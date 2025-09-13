public class Main {
    public static void main(String[] args) {
        Builder builder = new CarBuilder();
        Director director = new Director(builder);

        Car sports = director.buildSportsCar();
        Car family = director.buildFamilyCar();

        System.out.println(sports);
        System.out.println(family);
    }
}
