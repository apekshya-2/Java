package bcaoop.layouts;

// Demonstrate BorderLayout.
import java.awt.*;
import java.awt.event.*;

public class BorderLayoutDemo extends Frame {
    public BorderLayoutDemo() {
// Here, BorderLayout is used by default.
        add(new Button("This is across the top."),
                BorderLayout.NORTH);
        add(new Label("The footer message might go here."),
                BorderLayout.SOUTH);
        add(new Button("Right"), BorderLayout.EAST);
        add(new Button("Left"), BorderLayout.WEST);
        String msg = "The reasonable man adapts " +
                "himself to the world;\n" +
                "the unreasonable one persists in " +
                "trying to adapt the world to himself.\n" +
                "Therefore all progress depends " +
                "on the unreasonable man.\n\n" +
                " George Bernard Shaw\n\n";
        add(new TextArea(msg), BorderLayout.CENTER);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        BorderLayoutDemo appwin = new BorderLayoutDemo();
        appwin.setSize(new Dimension(300, 220));
        appwin.setTitle("BorderLayoutDemo");
        appwin.setVisible(true);
    }

}
