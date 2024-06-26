package passwordgenerator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class PasswordGenerator extends JFrame {

    private JTextField lengthField;
    private JTextArea passwordArea;

    public PasswordGenerator() {
        setTitle("Password Generator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setLocationRelativeTo(null); // Center the window on screen

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        JLabel lengthLabel = new JLabel("Password Length: ");
        lengthField = new JTextField(10);
        inputPanel.add(lengthLabel);
        inputPanel.add(lengthField);

        JPanel buttonPanel = new JPanel();
        JButton generateButton = new JButton("Generate Password");
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generatePassword();
            }
        });
        buttonPanel.add(generateButton);

        passwordArea = new JTextArea(5, 30);
        passwordArea.setEditable(false); // Prevent editing of generated password text
        JScrollPane scrollPane = new JScrollPane(passwordArea);

        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        mainPanel.add(scrollPane, BorderLayout.SOUTH);

        add(mainPanel);
        setVisible(true);
    }

    private void generatePassword() {
        try {
            int passwordLength = Integer.parseInt(lengthField.getText());
            if (passwordLength <= 0) {
                JOptionPane.showMessageDialog(this, "Please enter a valid password length.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String password = generateRandomPassword(passwordLength);
            passwordArea.setText(password);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for password length.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private String generateRandomPassword(int length) {
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialCharacters = "$"; // Adding $ as a special character

        String allCharacters = uppercaseLetters + lowercaseLetters + numbers + specialCharacters;
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        // Generate a random password from characters, numbers, and special characters
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allCharacters.length());
            password.append(allCharacters.charAt(index));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PasswordGenerator();
            }
        });
    }
}
