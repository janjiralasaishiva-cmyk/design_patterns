package creational_design_patterns.factory_design;

import creational_design_patterns.factory_design.Bike;
import creational_design_patterns.factory_design.Car;
import creational_design_patterns.factory_design.Truck;
import creational_design_patterns.factory_design.Vehicle;

import java.util.*;
import java.util.function.Supplier;

public class VehicleDesign {

    private static final Map<String, Supplier<Vehicle>> registry = new HashMap<>();

    // Registration — happens once
    static {
        registry.put("Car", () -> new Car("Engine")); // for argument constructor.
        registry.put("Truck", Truck::new);
        registry.put("Bike", Bike::new);
    }

    public static Vehicle getVehicle(String type) {
        Supplier<Vehicle> supplier = registry.get(type);
        if (supplier == null)
            throw new IllegalArgumentException("Unknown vehicle type");
        return supplier.get();
    }


    // It is not preferable as it is breaking Open closed principle
    // by using If - Else condition, we need to add new condition for every other type of object.
    // VehicleFactory.java - Factory to create vehicles
//    public class VehicleFactory {
//        public static Vehicle getVehicle(String vehicleType) {
//            if (vehicleType.equals("Car")) {
//                return new Car();
//            } else if (vehicleType.equals("Truck")) {
//                return new Truck();
//            } else if (vehicleType.equals("Bike")) {
//                return new Bike();
//            } else {
//                throw new IllegalArgumentException("Unknown vehicle type");
//            }
//        }
//    }
}
