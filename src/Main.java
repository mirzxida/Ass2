public class Main {
    public static void main(String[] args){
        Driver dr_John = new Driver("John", "P1112223");
        Driver dr_Tox = new Driver("Tox", "M6452215");
        Driver dr_Ais = new Driver("Ais", "D6468495");

        Car car1 = new Car("Lexus", 2006, 4, "Petrol");
        Motorcycle moto1 = new Motorcycle("Honda", 2004, false);
        Truck truck1 = new Truck("Vol" +
                "vo", 1994, 10.5, 4);
        ElectroCar electroCar1 = new ElectroCar("Deepal", 2024, 4, 500);

        car1.setDriver(dr_John);
        moto1.setDriver(dr_Tox);
        truck1.setDriver(dr_Tox);
        electroCar1.setDriver(dr_Ais);

        Vehicle[] garage = {car1, moto1, truck1, electroCar1};

        System.out.println("Info:");

        for (Vehicle v: garage){
            v.startEngine();
            v.displayInfo();
            v.stopEngine();
        }
    }
}
