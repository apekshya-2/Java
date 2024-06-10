package gui;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class JLabeDemo {
    public JLabeDemo() {
        JFrame jfrm = new JFrame("Label Demo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(360, 210);
        ImageIcon ii = new ImageIcon("hourglass.jpeg");
        JLabel jl = new JLabel("Hourglass", ii, JLabel.CENTER);
        jfrm.add(jl);
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JLabeDemo();
            }
        });
    }

}