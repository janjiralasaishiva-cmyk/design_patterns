package behavioral_design_patterns.strategy_design;

// Concrete strategy for crypto payment
public class CryptoPayment implements PaymentStrategy {
    public void processPayment() {
        System.out.println("Processing crypto payment...");
    }
}
