public class ElectroCar extends Car{
    private int battery;

    public ElectroCar(String brand, int year, int doors, int battery){
        super(brand, year, doors, "Electric");
        this.battery = battery;
    }

    @Override
    public void startEngine(){
        System.out.println(brand+" electrical car is started.");
    }

    public void stopEngine(){
        System.out.println(brand+" electrical car is stopped");
    }
}
