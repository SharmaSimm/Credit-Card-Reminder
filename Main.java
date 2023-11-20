/***************************************
This file uses JavaFX to setup the main user interface for a credit card reminder application. 
It features a login screen with username and password fields and options for logging in and password recovery. 
Upon successful login, it transitions to a new scene for credit card management. 
This file demonstrates JavaFX GUI development, event handling and scene transitions.

**************************************/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class Main extends Application 
{ 
  
  @Override
  public void start(Stage primaryStage) {
    
    Label label; 
    TextField tf, tff;
    Button button, button1;
    VBox vbox;
    Scene scene;
    
    tf = new TextField("Username ");
    tf.setMaxWidth(200);
    tff = new TextField("Password");
    tff.setMaxWidth(200);
    label = new Label("Welcome to Life Saver App");
    button = new Button("Log in"); 
    button1 = new Button("Forget Password");
    button.setOnAction(new EventHandler<ActionEvent>() {
      
      @Override 
      public void handle(ActionEvent e) {
        //Check if username and password are correct
        
        if(tf.getText().equals("username") && tff.getText().equals("password")){
          
      // create a new scene for the next page
      Label label = new Label("Welcome to Credit Card Reminder");
      Button addButton = new Button("Add New Credit Card");
      Button logoutButton = new Button("Log out");
      VBox vbox = new VBox(label, addButton, logoutButton);
      vbox.setSpacing(20);
      vbox.setAlignment(Pos.CENTER);
      Scene nextScene = new Scene(vbox, 300, 200);

      // set the next scene as the new scene
      primaryStage.setScene(nextScene);
        // label.setText(tf.getText());
        }   
      }
    });

    vbox = new VBox(label, tf, tff, button, button1);
    vbox.setSpacing(20);
    vbox.setAlignment(Pos.CENTER);
    scene = new Scene(vbox, 300, 200);
    
    primaryStage.setTitle("CreditCard Reminder");
    primaryStage.setScene(scene);
    primaryStage.show();
  } 
    
  public static void main(String[] args) {
    launch(args);
  }

  
} 
