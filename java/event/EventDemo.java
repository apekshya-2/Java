package event;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventDemo {
    JLabel jlab;

    EventDemo() {
        JFrame jFrm = new JFrame("An Event Example");
        jFrm.setLayout(new FlowLayout());
        jFrm.setSize(220,90);
        jFrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jbtnAlpha = new JButton("Alpha");
        JButton jbtnBeta = new JButton("Beta");
        jbtnAlpha.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlab.setText("Alpha was pressed.");
            }
        });
        jbtnBeta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlab.setText("Beta was pressed.");

                jFrm.add(jbtnAlpha);
                jFrm.add(jbtnBeta);
                jlab = new JLabel("Press a Button.");
                jFrm.add(jlab);
                jFrm.setVisible(true);
            }
        });
public static void main(String[]args) {
    SwingUtilities.invokeLater(
        new Runnable() {
            public void run() {
                new EventDemo();
            }
        }
    );
}

    }

}
