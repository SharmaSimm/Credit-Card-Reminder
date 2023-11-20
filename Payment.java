/*****************************
This file defines the 'Payment' class which encapsulates the details and functionality of a payment.
It includes private fields for payment amount and date, along with a constructors, getters, and setter for these fields.
The key functionality is the 'processPayment' method which checks and processes payments against a given 'CreditCard' object, 
adjusting its available credit. This class highlights the practical application for encapsulation and 
object-oriented programming in Java.

****************************/
import java.util.Date;

// Payment class
public class Payment {
    private double amount;
    private Date paymentDate;

    // Constructor
    public Payment(double amount, Date paymentDate) {
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    // Getter methods
    public double getAmount() {
        return amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    // Setter methods
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    // Method to process a payment
    public void processPayment(CreditCard creditCard) {
        if (creditCard.getAvailableCredit() >= this.getAmount()) {
            creditCard.setAvailableCredit(creditCard.getAvailableCredit() - this.getAmount());
            System.out.println("Payment of " + this.getAmount() + " processed on " + this.getPaymentDate() + " for Credit Card with Number: " + creditCard );
        }
    }

}
