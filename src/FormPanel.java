import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

class FormPanel extends JPanel {

    private GridBagConstraints gc;


    FormPanel() {
        setLayout(new GridBagLayout());
        gc = new GridBagConstraints();

        PanelSize();
        Border();
        NameArea();
        OccupationArea();
        OkButton();
    }

    private void NameArea() {
        JLabel nameLabel = new JLabel("Name: ");

        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridx = 0;
        gc.gridy = 0;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.LINE_END;
        add(nameLabel, gc);

        JTextField nameField = new JTextField(10);
        gc.gridx = 1;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.LINE_START;
        add(nameField, gc);
    }

    private void OccupationArea() {
        JLabel occupationLabel = new JLabel("Occupation: ");

        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridy = 1;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.LINE_END;
        add(occupationLabel, gc);

        JTextField occupationField = new JTextField(10);
        gc.gridy = 1;
        gc.gridx = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        add(occupationField, gc);
    }

    private void OkButton() {
        JButton okBtn = new JButton("OK");
        gc.weightx = 1;
        gc.weighty = 2.0;

        gc.gridy = 2;
        gc.gridx = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(okBtn, gc);
    }

    private void Border() {
        Border innerBorder = BorderFactory.createTitledBorder("Add Person");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
    }

    private void PanelSize() {
        Dimension dim = getPreferredSize(); // to get the size
        dim.width = 250;
        setPreferredSize(dim);
        System.out.println(dim);
    }
}
