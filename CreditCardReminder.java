
import java.util.Date;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private String username;
    private String password;
    private CreditCard[] creditCards = new CreditCard[10];
    private int numCreditCards = 0;

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
        button.setOnAction(e -> {
            if (tf.getText().equals(username) && tff.getText().equals(password)) {
                label.setText("Logged in successfully.");
                showCreditCards(primaryStage);
            } else {
                label.setText("Invalid username or password.");
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

    private void showCreditCards(Stage primaryStage) {
        Label label;
        Button addCardButton, logoutButton;
        VBox vbox;
        Scene scene;

        label = new Label("Credit Cards:");
        addCardButton = new Button("Add New Credit Card");
        addCardButton.setOnAction(e -> {
            addCreditCard();
        });
        logoutButton = new Button("Log out");
        logoutButton.setOnAction(e -> {
            primaryStage.close();
        });

        vbox = new VBox(label, addCardButton, logoutButton);
        vbox.setSpacing(20);
        vbox.setAlignment(Pos.CENTER);
        scene = new Scene(vbox, 300, 200);

        primaryStage.setTitle("Credit Cards");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void addCreditCard() {
        String cardNumber = "1234 5678 9012 3456"; // Example card number
        Date expirationDate = new Date(); // Example expiration date
        double creditLimit = 5000.00; // Example credit limit
        double availableCredit = 2500.00; // Example available credit
        Date reminderDate = new Date(); // Example reminder date
        String reminderMessage = "Pay credit card bill"; // Example reminder message

        if (numCreditCards < creditCards.length) {
            creditCards[numCreditCards++] = new CreditCard(cardNumber, expirationDate, creditLimit, availableCredit, reminderDate, reminderMessage);
        } else {
            System.out.println("Cannot add more credit cards.");
        }
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.username = "user";
        app.password = "pass";
        launch(args);
    }
}
