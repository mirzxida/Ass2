public class Truck extends Vehicle{
    private double capacity;
    private int numAxles;

    public Truck(String brand, int year, double capacity, int numAxles){
        super(brand, year);
        this.capacity = capacity;
        this.numAxles = numAxles;
    }

    @Override
    public void startEngine(){
        System.out.println(brand+ " truck is started.");
    }

    public void stopEngine(){
        System.out.println(brand+ " truck is stopped.");
    }
}
