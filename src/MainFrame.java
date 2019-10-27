import javax.swing.*;
import java.awt.*;

class MainFrame extends JFrame {

    private TextPanel textPanel;
    private JButton btn;
    private Toolbar toolbar;

    MainFrame() {

        // Sets a Border layout for this frame
        setLayout(new BorderLayout());

        // Adds a Panel to the top of the app
        toolbar = new Toolbar();

        add(toolbar, BorderLayout.NORTH);


        // Makes a Text area and putts it in
        // the center with the Border Layout.
        textPanel = new TextPanel();
        add(textPanel, BorderLayout.CENTER);

        // Make Button that says Click me.
        // And puts it in at the South with the Border Layout.
        btn = new JButton("Click Me!");
        add(btn, BorderLayout.SOUTH);
        btnActionPerformed();  // Prints Hello! to the text panel

        toolbar.setTextPanel(textPanel);

        // Makes the window
        setTitle("Cool App");
        setSize(600, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }

    // method for the btn 'Click me'
    private void btnActionPerformed() {
        btn.addActionListener(e -> {
            textPanel.appendText("Hello!\n");
        });
    }
}
