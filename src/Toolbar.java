import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* makes a Panel at the top of the app that holds two buttons. */

class Toolbar extends JPanel implements ActionListener {

    private JButton helloButton;
    private JButton goodByeButton;

    private StringListener textListener;


    public Toolbar() {
        // sets a flow layout to left for the toolbar
        setLayout(new FlowLayout(FlowLayout.LEFT));

        helloButton = new JButton("Hello!");
        helloButton.addActionListener(this);
        add(helloButton);

        goodByeButton = new JButton("Goodbye!");
        add(goodByeButton);
        goodByeButton.addActionListener(this);
    }

    public void setStringListener(StringListener listener) {
        this.textListener = listener;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();

        if (clicked == helloButton) {
            if (textListener != null) {
                textListener.textEmitted("Hello!\n");
            }
        } else if (clicked == goodByeButton) {
            if (textListener != null) {
                textListener.textEmitted("Goodbye!\n");
            }
        }
    }
}
