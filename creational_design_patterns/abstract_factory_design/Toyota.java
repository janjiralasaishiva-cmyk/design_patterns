package creational_design_patterns.abstract_factory_design;

public class Toyota implements Vehicle{
    @Override
    public void start() {
        System.out.println("Toyota Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Toyota Car is stopping");
    }
}
