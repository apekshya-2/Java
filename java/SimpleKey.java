package bcaoop.event;

// Demonstrate the key event handlers.
import java.awt.*;
import java.awt.event.*;
public class SimpleKey extends Frame
        implements KeyListener {
    String msg = "";
    String keyState = "";
    public SimpleKey() {
        addKeyListener(this);
        addWindowListener(new MyWindowAdapter());
    }
    // Handle a key press.
    public void keyPressed(KeyEvent ke) {
        keyState = "Key Down";
        repaint();
    }
    // Handle a key release.
    public void keyReleased(KeyEvent ke) {
        keyState = "Key Up";
        repaint();
    }
    // Handle key typed.
    public void keyTyped(KeyEvent ke) {
        msg += ke.getKeyChar();
        repaint();
    }
    // Display keystrokes.
    public void paint(Graphics g) {
        g.drawString(msg, 20, 100);
        g.drawString(keyState, 20, 50);
    }
    public static void main(String[] args) {
        SimpleKey appwin = new SimpleKey();
        appwin.setSize(new Dimension(200, 150));
        appwin.setTitle("SimpleKey");
        appwin.setVisible(true);
    }
}
// When the close box in the frame is clicked,
// close the window and exit the program.
