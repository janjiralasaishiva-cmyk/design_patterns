package behavioral_design_patterns.strategy_design;

// Concrete strategy for PayPal payment
public class PayPalPayment implements PaymentStrategy {
    public void processPayment() {
        System.out.println("Processing PayPal payment...");
    }
}
