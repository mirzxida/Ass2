public class Main {
    public static void main(String[] args){
        Driver dr_John = new Driver("John", "P1112223");
        Driver dr_Tox = new Driver("Tox", "M6452215");

        Car car1 = new Car("Lexus", 2006, 4, "Petrol");
        Motorcycle moto1 = new Motorcycle("Honda", 2004, false);
        Truck truck1 = new Truck("Volvo", 1994, 10.5, 4);

        car1.setDriver(dr_John);
        moto1.setDriver(dr_Tox);
        truck1.setDriver(dr_Tox);

        Vehicle[] garage = {car1, moto1, truck1};

        System.out.println("Info:");

        for (Vehicle v: garage){
            v.startEngine();
            v.displayInfo();
            v.stopEngine();
        }
    }
}