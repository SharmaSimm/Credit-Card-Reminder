
//This class extends a "Reminder' class 
//handling credit card details like number, expiration date and credit limits,
//along with reminder functionalites. Key features include getters and setters for card attributes and
//an overriden method for custom reminders. It demonstrates the use of oop concepts in Java.


import java.util.Date;



//Cc class that extends Reminder

public class CreditCard extends Reminder {
  private String cardNumber ;
  private Date expirationDate;
  private double creditLimit;
  private double availableCredit ;


  //Constructors
  public CreditCard(String cardNumber, Date expirationDate, double creditLimit, double availableCredit, Date reminderDate, String reminderMessage){
    super(reminderDate, reminderMessage);
    this.cardNumber = cardNumber;
    this.expirationDate = expirationDate;
    this.creditLimit = creditLimit;
    this.availableCredit = availableCredit;
  }


  //Getetr methods
  public String getCradNumber() {
    return cardNumber;
  }

  public Date getExpirationDate() {
    return expirationDate;
  }

  public double getCreditLimit(){
    return creditLimit;
  }
  public double getAvailableCredit(){
    return availableCredit;
  }

  //setter
  public void setCradNumber(String cardNumber) {
     this.cardNumber = cardNumber;
  }

  public  void setExpirationDate(Date expirationDate) {
     this.expirationDate = expirationDate;
  }

  public void setCreditLimit(double creditLimit){
    this.creditLimit = creditLimit;
  }
  public void  setAvailableCredit(double availableCredit){
    this.availableCredit = availableCredit;
  }


//Override method to create a reminder

  @Override 
public void createReminder(){
  System.out.println("Reminder: " + this.getReminderMessage() + "for Credit Card with Number: " + this.getCradNumber() + "and Expiration Date" + this.getExpirationDate() );
}
  

  
}
