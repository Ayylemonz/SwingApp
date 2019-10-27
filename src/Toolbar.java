import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* makes a Panel at the top of the app that holds two buttons. */

class Toolbar extends JPanel implements ActionListener {

    private JButton helloButton;
    private JButton goodByeButton;

    private TextPanel textPanel;

    Toolbar() {
        // sets a flow layout to left for the toolbar
        setLayout(new FlowLayout(FlowLayout.LEFT));

        helloButton = new JButton("Hello!");
        add(helloButton);
        helloButton.addActionListener(this);

        goodByeButton = new JButton("Good bye!");
        add(goodByeButton);
        goodByeButton.addActionListener(this);
    }

    public void setTextPanel(TextPanel textPanel) {
        this.textPanel = textPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();

        if (clicked == helloButton) {
            textPanel.appendText("Hallow\n");
        }

        if (clicked == goodByeButton) {
            textPanel.appendText("Good Bye!\n");
        }
    }
}
