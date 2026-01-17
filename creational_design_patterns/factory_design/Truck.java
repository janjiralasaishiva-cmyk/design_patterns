package creational_design_patterns.factory_design;

public class Truck implements Vehicle{
    @Override
    public void start() {
        System.out.println("Truck started...");
    }

    @Override
    public void stop() {
        System.out.println("Truck stopped...");
    }
}
