import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;

public class AgeCalculatorApp {
    public static void main(String[] args) {
        // Create the main JFrame
        JFrame frame = new JFrame("Age Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);

        // Create a JPanel
        JPanel panel = new JPanel();

        // Create a JButton
        JButton calculateButton = new JButton("Calculate Age");

        // Create a JLabel to show the result
        JLabel resultLabel = new JLabel("Your age will be displayed here.");

        // Add ActionListener to the button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Use a fixed birthdate of March 9, 1978
                LocalDate birthdate = LocalDate.of(1978, 3, 9);
                LocalDate currentDate = LocalDate.now();

                // Calculate the age
                int age = Period.between(birthdate, currentDate).getYears();

                // Display the age
                resultLabel.setText("Your age is: " + age + " years");
            }
        });

        // Add components to the panel
        panel.add(calculateButton);
        panel.add(resultLabel);

        // Add the panel to the frame
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
