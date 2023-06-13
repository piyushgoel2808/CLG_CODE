import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingControlsExample extends JFrame {
    private JLabel label;
    private JTextField textField;
    private JButton button;
    private JCheckBox checkBox;
    private JRadioButton radioButton;
    private JComboBox<String> comboBox;

    public SwingControlsExample() {
        setTitle("Swing Controls Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        label = new JLabel("Enter your name:");
        textField = new JTextField(20);
        button = new JButton("Submit");
        checkBox = new JCheckBox("Agree to terms");
        radioButton = new JRadioButton("Option 1");
        comboBox = new JComboBox<>(new String[] { "Option 1", "Option 2", "Option 3" });

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                String message = "Hello, " + name + "!";
                JOptionPane.showMessageDialog(null, message);
            }
        });

        setLayout(new FlowLayout());
        add(label);
        add(textField);
        add(button);
        add(checkBox);
        add(radioButton);
        add(comboBox);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                SwingControlsExample example = new SwingControlsExample();
                example.setVisible(true);
            }
        });
    }
}
