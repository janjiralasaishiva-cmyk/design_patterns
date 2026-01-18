package behavioral_design_patterns.strategy_design;

// Concrete strategy for credit card payment
public class CreditCardPayment implements PaymentStrategy {
    public void processPayment() {
        System.out.println("Processing credit card payment...");
    }
}

