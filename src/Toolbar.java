import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* makes a Panel at the top of the app that holds two buttons. */

class Toolbar extends JPanel implements ActionListener {

    private JButton helloButton;
    private JButton goodByeButton;

    private StringListener textListener;


    Toolbar() {
        // makes a border around the Tool bar
        setBorder(BorderFactory.createEtchedBorder());
        // sets a flow layout to left for the toolbar
        setLayout(new FlowLayout(FlowLayout.LEFT));
        // the Hello and goodbye buttons
        Buttons();
    }

    private void Buttons() {
        helloButton = new JButton("Hello!");
        helloButton.addActionListener(this);
        add(helloButton);

        goodByeButton = new JButton("Goodbye!");
        add(goodByeButton);
        goodByeButton.addActionListener(this);
    }

    void setStringListener(StringListener listener) {
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
