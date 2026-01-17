package creational_design_patterns.abstract_factory_design;

public class BMW implements Vehicle{
    @Override
    public void start() {
        System.out.println("BMW Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("BMW Car is stopping");
    }
}
