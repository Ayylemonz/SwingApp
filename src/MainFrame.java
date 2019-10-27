import javax.swing.*;
import java.awt.*;

class MainFrame extends JFrame {

    private TextPanel textPanel;
    private Toolbar toolbar;
    private FormPanel formPanel;

    MainFrame() {
        setLayout(new BorderLayout()); // Sets a Border layout for this frame

        MakeToolBar(); // Makes the Toolbar In the North of app.
        MakeTextPanel(); // Makes the Text Panel in the Scanter of app.
        MakeFormPanel(); // Makes the Form Panel in the West of app.

        ToolBarButtons(); // The Hello and Goodbye buttons on the Top North Toolbar

        AppWindow(); // Makes the main app window.
    }

    private void MakeToolBar() {
        // Adds a Panel to the top of the app
        toolbar = new Toolbar();
        add(toolbar, BorderLayout.NORTH);
    }

    private void ToolBarButtons() {
        // The String listener for the Toolbar 'Hello!' and 'GoodBye!' button's.
        toolbar.setStringListener(new StringListener() {
            public void textEmitted(String text) {
                textPanel.appendText(text);
            }
        });
    }

    private void MakeTextPanel() {
        // Makes a Text area and putts it in
        // the center with the Border Layout.
        textPanel = new TextPanel();
        add(textPanel, BorderLayout.CENTER);
    }

    private void MakeFormPanel() {
        formPanel = new FormPanel();
        add(formPanel, BorderLayout.WEST);
    }

    private void AppWindow() {
        // Makes the main window
        setTitle("Cool App");
        setSize(600, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }
}
