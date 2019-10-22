import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private JTextArea textArea;
    private JButton btn;

    public MainFrame() {

        // Sets a Border layout for this frame
        setLayout(new BorderLayout());

        // Makes a Text area and putts it in
        // the center with the Border Layout.
        textArea = new JTextArea();
        add(textArea, BorderLayout.CENTER);

        // Make Button that says Click me.
        // And puts it in at the South with the Border Layout.
        btn = new JButton("Click Me!");
        add(btn, BorderLayout.SOUTH);
        // Prints Hello! to the text area
        btnActionPerformed();

        // Makes the window
        setTitle("Cool App");
        setSize(600, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }

    private void btnActionPerformed(){
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("Hello!\n");
            }
        });
    }
}
