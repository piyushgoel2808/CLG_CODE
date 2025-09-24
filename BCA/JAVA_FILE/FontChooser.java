import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FontChooser extends JFrame implements ActionListener {

    // Declare the components
    private JComboBox<String> fontNameBox, fontSizeBox, fontStyleBox;
    private JLabel fontNameLabel, fontSizeLabel, fontStyleLabel;
    private JTextArea textArea;
    private JPanel controlPanel;
    // Declare the arrays for the combo boxes
    private String[] fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
    private String[] fontSizes = { "8", "10", "12", "14", "16", "18", "20", "22", "24", "28",
            "32", "36", "40", "48", "56", "64" };
    private String[] fontStyles = { "Plain", "Bold", "Italic", "Bold Italic" };

    // Constructor to initialize the components and add them to the frame
    public FontChooser() {
        super("Font Chooser");
        fontNameBox = new JComboBox<>(fontNames);
        fontSizeBox = new JComboBox<>(fontSizes);
        fontStyleBox = new JComboBox<>(fontStyles);
        fontNameLabel = new JLabel("Font Name:");
        fontSizeLabel = new JLabel("Font Size:");
        fontStyleLabel = new JLabel("Font Style:");
        textArea = new JTextArea("This is a sample text.");
        controlPanel = new JPanel();
        // Set the layout of the control panel and add the components
        controlPanel.setLayout(new GridLayout(3, 2, 10, 10));
        controlPanel.add(fontNameLabel);
        controlPanel.add(fontNameBox);
        controlPanel.add(fontSizeLabel);
        controlPanel.add(fontSizeBox);
        controlPanel.add(fontStyleLabel);
        controlPanel.add(fontStyleBox);
        // Add action listeners to the combo boxes
        fontNameBox.addActionListener(this);
        fontSizeBox.addActionListener(this);
        fontStyleBox.addActionListener(this);
        // Set some properties of the frame
        this.setLayout(new BorderLayout());
        this.add(controlPanel, BorderLayout.NORTH);
        this.add(new JScrollPane(textArea), BorderLayout.CENTER);
        this.setSize(400, 300);
        this.setLocationRelativeTo(null); // Center the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    // Define the action performed method for the combo boxes
    @Override
    public void actionPerformed(ActionEvent e) {
        // Get the selected values from the combo boxes
        String fontName = (String) fontNameBox.getSelectedItem();
        int fontSize = Integer.parseInt((String) fontSizeBox.getSelectedItem());
        int fontStyle = fontStyleBox.getSelectedIndex();
        // Create a new font with the selected values
        Font font = new Font(fontName, fontStyle, fontSize);
        // Set the font of the text area
        textArea.setFont(font);
    }

    // Main method to create and show the font chooser
    public static void main(String[] args) {
        new FontChooser();
    }
}
