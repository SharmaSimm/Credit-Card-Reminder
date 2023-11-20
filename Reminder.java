/*****************************
This fil defines an abstract 'Reminder' class in Java,
with fields for reminder date and message, and an abstract method 'createReminder()' .
It serves as a base for reminder functionalites in other class,
demonstrating abstraction and encapsulation in Java.

**************************/


import java.util.Date;

//Abstract class Reminder
public abstract class Reminder {
  private Date reminderDate ;
  private String reminderMessage ;

  // Constructor
  public Reminder(Date reminderDate , String reminderMessage) {
    this.reminderDate = reminderDate ;
    this.reminderMessage = reminderMessage ;
  }

  //Getter and Setter Methods

  public Date getReminderDate() {
    return reminderDate ;
    
  }
  public void setReminderDate(Date reminderDate) {
    this.reminderDate = reminderDate;
    
  }

  public String getReminderMessage() {
    return reminderMessage;
  }

  public void setReminderMessage(String reminderMessage) {
    this.reminderMessage = reminderMessage ;
  }


// Abstract method to create a reminder
  public abstract void createReminder();
  
}
