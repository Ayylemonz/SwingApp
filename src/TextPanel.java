import javax.swing.*;
import java.awt.*;

/*
 the text Panel is where all the text stuff happens.
 The buttons prints text to it and you can type in there too
*/

class TextPanel extends JPanel {

    private JTextArea textArea;

    TextPanel() {
        // sets Border Layout
        setLayout(new BorderLayout());

        // Adds text panel to the Center of the app
        textArea = new JTextArea();
        add(new JScrollPane(textArea), BorderLayout.CENTER);
    }

    // A fanchon to append text to the "TextPanel"
    void appendText(String text) {
        textArea.append(text);
    }
}
