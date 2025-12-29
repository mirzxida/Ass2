public class Car extends Vehicle{
    private int doors;
    private String fuelType;

    public Car(String brand, int year, int doors, String fuelType){
        super(brand, year);
        this.doors = doors;
        this.fuelType = fuelType;
    }

    @Override
    public void startEngine(){
        System.out.println(brand+ " car is started.");
    }

    public void stopEngine(){
        System.out.println(brand+ " car is stopped.");
    }
}

