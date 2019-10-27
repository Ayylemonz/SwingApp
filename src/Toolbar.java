import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* makes a Panel at the top of the app that holds two buttons. */

class Toolbar extends JPanel implements ActionListener {

    private JButton helloButton;
    private JButton goodByeButton;

    private TextPanel textPanel;

    public Toolbar() {
        // sets a flow layout to left for the toolbar
        setLayout(new FlowLayout(FlowLayout.LEFT));

        helloButton = new JButton("Hello!");
        helloButton.addActionListener(this);
        add(helloButton);

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
            textPanel.appendText("Hello\n");
        } else if (clicked == goodByeButton) {
            textPanel.appendText("Good bye!\n");
        }
    }
}
