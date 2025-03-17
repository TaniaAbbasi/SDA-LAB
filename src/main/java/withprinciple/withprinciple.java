package withprinciple;

// PaymentMethod interface
interface PaymentMethod {
    void processPayment(double amount);
}

// CreditCard class (implements PaymentMethod)
class CreditCard implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Payment of $" + amount + " via Credit Card.");
    }
}

// Order class (depends on interface, not concrete classes)
class Order {
    private PaymentMethod paymentMethod;

    public Order(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void checkout(double amount) {
        paymentMethod.processPayment(amount);
    }
}

// Main class
public class withprinciple {
    public static void main(String[] args) {
        PaymentMethod payment = new CreditCard();  // No more errors
        Order order = new Order(payment);
        order.checkout(100.0);  // Output: Payment of $100.0 via Credit Card.
    }
}