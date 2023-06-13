import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JFrame frame;
    private JTextField numField1, numField2, resultField;
    private JButton addButton, subtractButton, multiplyButton;

    public Calculator() {
        // Create the frame
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(4, 2));
        numField1 = new JTextField();
        numField2 = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);
        addButton = new JButton("Add");
        subtractButton = new JButton("Subtract");
        multiplyButton = new JButton("Multiply");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateResult('+');
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateResult('-');
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateResult('*');
            }
        });
        frame.add(new JLabel("Number 1:"));
        frame.add(numField1);
        frame.add(new JLabel("Number 2:"));
        frame.add(numField2);
        frame.add(new JLabel("Result:"));
        frame.add(resultField);
        frame.add(addButton);
        frame.add(subtractButton);
        frame.add(multiplyButton);
        frame.setVisible(true);
    }

    private void calculateResult(char operator) {
        double num1 = Double.parseDouble(numField1.getText());
        double num2 = Double.parseDouble(numField2.getText());
        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }

        resultField.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Calculator();
            }
        });
    }
}
