import javax.swing.*;
import java.awt.*;

class MainFrame extends JFrame {

    private TextPanel textPanel;
    private JButton btn;

    MainFrame() {

        // Sets a Border layout for this frame
        setLayout(new BorderLayout());

        // Makes a Text area and putts it in
        // the center with the Border Layout.
        textPanel = new TextPanel();
        add(textPanel, BorderLayout.CENTER);

        // Make Button that says Click me.
        // And puts it in at the South with the Border Layout.
        btn = new JButton("Click Me!");
        add(btn, BorderLayout.SOUTH);
        // Prints Hello! to the text panel
        btnActionPerformed();

        // Makes the window
        setTitle("Cool App");
        setSize(600, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }

    // method for the btn 'Click me'
    private void btnActionPerformed(){
        btn.addActionListener(e -> textPanel.appendText("Hello!\n"));
    }
}
