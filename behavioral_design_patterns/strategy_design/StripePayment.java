package behavioral_design_patterns.strategy_design;

// Concrete strategy for Stripe payment
public class StripePayment implements PaymentStrategy {
    public void processPayment() {
        System.out.println("Processing Stripe payment...");
    }
}

