package lab_5;
import javax.swing.*;
import java.awt.*;

public class program_5d extends JFrame {

    public program_5d() {
        setTitle("Color Tabbed Pane");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create the tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create panels with respective colors
        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);

        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);

        // Add tabs to the tabbed pane
        tabbedPane.addTab("Cyan", cyanPanel);
        tabbedPane.addTab("Magenta", magentaPanel);
        tabbedPane.addTab("Yellow", yellowPanel);

        // Add the tabbed pane to the frame
        add(tabbedPane);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            program_5d frame = new program_5d();
            frame.setVisible(true);
        });
    }
}
