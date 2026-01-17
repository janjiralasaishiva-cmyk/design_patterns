package creational_design_patterns.factory_design;

import java.util.Scanner;

import static creational_design_patterns.factory_design.VehicleDesign.getVehicle;

public class Main {
    void main(){
        Vehicle v1 = VehicleDesign.getVehicle("Car");
        v1.start();
        v1.stop();

        Vehicle bike = VehicleDesign.getVehicle("Bike");
        bike.stop();
        bike.start();

        Vehicle truck = VehicleDesign.getVehicle("Truck");
        truck.start();
        truck.stop();
    }
}
