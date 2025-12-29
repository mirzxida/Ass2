public class Motorcycle extends Vehicle{
    private boolean hasSidecar;

    public Motorcycle(String brand, int year, boolean hasSidecar){
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void startEngine(){
        System.out.println(brand+ " motorcycle is started.");
    }
    @Override
    public void stopEngine(){
        System.out.println(brand+ " motorcycle is stopped.");
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Motorcycle has sidecar:"+hasSidecar);
    }
}

