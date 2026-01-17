package creational_design_patterns.abstract_factory_design;

public class Honda implements Vehicle{
    @Override
    public void start() {
        System.out.println("Honda Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Honda Car is stopping");
    }
}
