import javax.swing.*;
// import javax.swing.event.*;

import java.awt.*;
import java.awt.event.*;

public class RGBColorChooser extends JFrame {
    private JScrollBar redScrollBar;
    private JScrollBar greenScrollBar;
    private JScrollBar blueScrollBar;
    private JPanel colorPanel;

    public RGBColorChooser() {
        setTitle("RGB Color Chooser");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        redScrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 0, 0, 255);
        redScrollBar.addAdjustmentListener(new ScrollBarListener());

        greenScrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 0, 0, 255);
        greenScrollBar.addAdjustmentListener(new ScrollBarListener());

        blueScrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 0, 0, 255);
        blueScrollBar.addAdjustmentListener(new ScrollBarListener());

        colorPanel = new JPanel();
        colorPanel.setBackground(Color.BLACK);

        JPanel scrollBarPanel = new JPanel(new GridLayout(3, 1));
        scrollBarPanel.add(redScrollBar);
        scrollBarPanel.add(greenScrollBar);
        scrollBarPanel.add(blueScrollBar);

        add(colorPanel, BorderLayout.CENTER);
        add(scrollBarPanel, BorderLayout.SOUTH);
    }

    private class ScrollBarListener implements AdjustmentListener {
        public void adjustmentValueChanged(AdjustmentEvent e) {
            int red = redScrollBar.getValue();
            int green = greenScrollBar.getValue();
            int blue = blueScrollBar.getValue();

            Color color = new Color(red, green, blue);
            colorPanel.setBackground(color);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                RGBColorChooser colorChooser = new RGBColorChooser();
                colorChooser.setVisible(true);
            }
        });
    }
}
