public class Car {
    private int horsepower;
    private double engineVolume;
    private String brand;
    private String model;
    private int year;
    private int mileage;
    private String color;
    private boolean isManual;
    private String fuelType;

    public Car(int horsepower, double engineVolume, String brand, String model, int year, int mileage, String color, boolean isManual, String fuelType) {
        this.horsepower = horsepower;
        this.engineVolume = engineVolume;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.color = color;
        this.isManual = isManual;
        this.fuelType = fuelType;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public static void main(String[] args) {
        Car car1 = new Car(200, 2.0, "BMW", "3 Series", 2015, 50000, "black", true, "petrol");
        Car car2 = new Car(150, 1.6, "Ford", "Focus", 2018, 30000, "white", true, "diesel");
        Car car3 = new Car(180, 2.4, "Honda", "Accord", 2016, 70000, "silver", false, "petrol");
        Car car4 = new Car(120, 1.2, "Fiat", "Punto", 2017, 45000, "red", true, "petrol");
        Car car5 = new Car(250, 3.0, "Mercedes-Benz", "E-Class", 2019, 20000, "blue", false, "petrol");
        Car car6 = new Car(110, 1.4, "Volkswagen", "Golf", 2014, 80000, "grey", true, "diesel");
        Car car7 = new Car(170, 1.8, "Toyota", "Corolla", 2016, 60000, "black", false, "hybrid");
        Car car8 = new Car(140, 2.0, "Mazda", "6", 2017, 55000, "white", false, "petrol");
        Car car9 = new Car(190, 2.5, "Subaru", "Legacy", 2018, 40000, "red", false, "petrol");
        Car car10 = new Car(130, 1.6, "Renault", "Clio", 2015, 65000, "blue", true, "diesel");

        double totalEngineVolume = car1.getEngineVolume() + car2.getEngineVolume() + car3.getEngineVolume() + car4.getEngineVolume() + car5.getEngineVolume() + car6.getEngineVolume() + car7.getEngineVolume() + car8.getEngineVolume() + car9.getEngineVolume() + car10.getEngineVolume();
        double totalHorsepower = car1.getHorsepower() + car2.getHorsepower() + car3.getHorsepower() + car4.getHorsepower() + car5.getHorsepower() + car6.getHorsepower() + car7.getHorsepower() + car8.getHorsepower() + car9.getHorsepower() + car10.getHorsepower();
        System.out.println("Total horse power: " + totalHorsepower);
        System.out.println("Total engine volume: " + totalEngineVolume);
    }}