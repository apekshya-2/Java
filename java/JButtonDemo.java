package gui;

import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class JButtonDemo implements ActionListerner {
    JLabel jLab;
    public JButtonDemo() {
        JFrame jfrm = new JFrame("JButtonDemo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jfrm.setSize(500,450);
    ImageIcon hourglass = new ImageIcon("hourglass.png");
    JButton jb= new JButton(Hourglass);
    jb.setActionCommand("Hourglass");
    jb.setActionListener(this);
    jfrm.add(jb);
    ImageIcon analog = new ImageIcon("analog.png");
    jb= new JButton(analog);
    jb.setActionCommand("Analog Clock");
    jb.setActionListener(this);
    jfrm.add(jb);
    ImageIcon digital = new ImageIcon("digital.png");
    jb= new JButton(digital);
    jb.setActionCommand("Digital Clock");
    jb.setActionListener(this);
    jfrm.add(jb);
    ImageIcon stopwatch = new ImageIcon("stopwatch.png");
    jb= new JButton(stopwatch);
    jb.setActionCommand("stopwatch");
    jb.setActionListener(this);
    jfrm.add(jb);

    jLab = new JLabel("Choose a Timepiece");
    jfrm.add(jLab);
    jfrm.setVisible(true);

}
public void actionPerformed(ActionEvent ae) {
    jLab.set

}


    SwingUtilities.invokeLater(
        new Runnable() {
            public void run() {
                new JButtonDemo();
            }
        }
    );
}
}

