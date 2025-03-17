
DESCRIPTION OF CODE: 

WITH PRINCIPLE:

The provided code demonstrates the principle of low coupling by reducing direct dependencies between
 classes. Instead of the Order class being tightly coupled to a specific payment method (like CreditCard),
 it depends on the PaymentMethod interface. This design allows the Order class to interact with any payment
 method that implements the interface, making it more flexible and easier to extend. For instance, you 
could add new payment methods (e.g., PayPal, DebitCard) without modifying the Order class. This reduces
 the impact of changes and enhances code maintainability. The CreditCard class implements the PaymentMethod
interface, ensuring that the payment processing logic is independent of the order processing logic.

WITHOUT PRINCIPLE:

The provided code does not follow the principle of low coupling because the Order class is tightly coupled
 to the CreditCard class. This means the Order class directly depends on the concrete implementation of 
CreditCard rather than an abstract interface. As a result, any change to the CreditCard class, such as 
modifying the payment process or introducing a new payment method (e.g., PayPal or DebitCard), would 
require modifying the Order class. This tight connection reduces flexibility and makes the code harder 
to extend and maintain. If you wanted to add new payment options, you would need to rewrite the Order 
class for each new payment method, violating the Open/Closed Principle. Such a design increases the 
risk of errors and makes future modifications complex and time-consuming. 