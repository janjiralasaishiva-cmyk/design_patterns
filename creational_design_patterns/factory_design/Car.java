package creational_design_patterns.factory_design;

public class Car implements Vehicle{
//    public Car(){}
    public Car(String engine){}

    @Override
    public void start() {
        System.out.println("Car started..");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped..");
    }
}
