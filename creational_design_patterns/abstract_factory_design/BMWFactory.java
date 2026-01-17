package creational_design_patterns.abstract_factory_design;

// Concrete factory for each car brand
public class BMWFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new BMW();
    }
}
