package creational_design_patterns.abstract_factory_design;

public class Main {
    static void main() {
        VehicleFactory hondaFactory = new HondaFactory();
        Vehicle honda = hondaFactory.createVehicle();
        honda.start();
        honda.stop();

        VehicleFactory toyotaFactory = new ToyotaFactory();
        Vehicle toyota = toyotaFactory.createVehicle();
        toyota.start();
        toyota.stop();
    }
}
