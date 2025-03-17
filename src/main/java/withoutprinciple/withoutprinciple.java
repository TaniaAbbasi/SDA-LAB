
package withoutprinciple;


class CreditCard {
    public void processPayment(double amount) {
        System.out.println("Payment of $" + amount + " via Credit Card.");
    }
}


class Order {
    private CreditCard creditCard;

    public Order(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void checkout(double amount) {
        creditCard.processPayment(amount); 
    }
}


public class withoutprinciple {
    public static void main(String[] args) {
        CreditCard payment = new CreditCard();
        Order order = new Order(payment);
        order.checkout(150.0);  
    }
}