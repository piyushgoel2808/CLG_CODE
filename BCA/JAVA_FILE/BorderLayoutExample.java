import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample extends JFrame {
    public BorderLayoutExample() {
        setTitle("Border Layout Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        JLabel northLabel = new JLabel("North");
        add(northLabel, BorderLayout.NORTH);

        JLabel southLabel = new JLabel("South"); 
        add(southLabel, BorderLayout.SOUTH);

        JLabel eastLabel = new JLabel("East");
        add(eastLabel, BorderLayout.EAST);

        JLabel westLabel = new JLabel("West");
        add(westLabel, BorderLayout.WEST);

        JLabel centerLabel = new JLabel("Center");
        add(centerLabel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                BorderLayoutExample example = new BorderLayoutExample();
                example.setVisible(true);
            }
        });
    }
}
