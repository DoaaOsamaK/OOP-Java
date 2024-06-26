package creditcardencryptionapp;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CreditCardEncryptionApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Credit Card Encryption Simulator");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setVgap(10);
        grid.setHgap(10);

        Label cardNumberLabel = new Label("Enter your credit card number:");
        GridPane.setConstraints(cardNumberLabel, 0, 0);

        TextField cardNumberField = new TextField();
        GridPane.setConstraints(cardNumberField, 1, 0);

        Button encryptButton = new Button("Encrypt Card Number");
        GridPane.setConstraints(encryptButton, 0, 1);
        GridPane.setColumnSpan(encryptButton, 2);

        Label resultLabel = new Label();
        GridPane.setConstraints(resultLabel, 0, 2);
        GridPane.setColumnSpan(resultLabel, 2);

        encryptButton.setOnAction(e -> {
            String cardNumber = cardNumberField.getText();
            String encryptedNumber = encryptCardNumber(cardNumber);
            resultLabel.setText("Encrypted Number: " + encryptedNumber);
        });

        grid.getChildren().addAll(cardNumberLabel, cardNumberField, encryptButton, resultLabel);

        Scene scene = new Scene(grid, 400, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private String encryptCardNumber(String cardNumber) {
        if (cardNumber.length() < 4) {
            return "Invalid card number";
        }
        String firstFourthDigits = cardNumber.substring(0, 4);
        String encryptedPart = cardNumber.substring(4).replaceAll(".", "*");
        return firstFourthDigits +" "+ encryptedPart;
    }

    public static void main(String[] args) {
        launch(args);
    }
}

