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
    @Override
    public void stopEngine(){
        System.out.println(brand+ " car is stopped.");
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Car has "+doors+" doors and drives on "+fuelType);
    }
}

