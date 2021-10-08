import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI implements ActionListener {
    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();

    public GUI() {

        // the clickable button
        JButton button = new JButton("Click Me");
        button.addActionListener(this);

        // the panel with the button and text
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(1, 1));
        panel.setBackground(Color.green);
        panel.add(button);

        // set up the frame and display it
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Fredrik Strandberg");
        frame.pack();
        frame.setVisible(true);
    }

    // process the button clicks
    public void actionPerformed(ActionEvent e) {
        if(panel.getBackground() == Color.cyan){
            panel.setBackground(Color.green);
            frame.setTitle("Fredrik Strandberg");
        }
        else{
            panel.setBackground(Color.cyan);
            frame.setTitle("Jesper Senke");
        }
    }

    // create one Frame
    public static void main(String[] args) {
        new GUI();
    }
}
