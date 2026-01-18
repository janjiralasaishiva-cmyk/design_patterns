package creational_design_patterns.singleton_design;

public class Application {
    public void run(){
        Logger logger = Logger.getLogger();
        logger.log("Application started...");
    }

    static void main() {
        Application app = new Application();
        app.run();
    }
}
