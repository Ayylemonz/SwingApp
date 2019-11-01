import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 1:58:02

class FormPanel extends JPanel {

    private GridBagConstraints gc;

    private JButton okBtn;
    private JTextField nameField;
    private JTextField occupationField;

    private FormListener formListener;


    FormPanel() {
        setLayout(new GridBagLayout());
        gc = new GridBagConstraints();

        PanelSize(); // the size for the panel
        Border(); // puts a border around the panel
        NameArea(); // the Name Filed
        OccupationArea(); // the Occupation Filed
        OkButton(); // the button to submit the user name and occupation filed input
        PanelList();

        OkbtnAction();
    }

    private void NameArea() {
        JLabel nameLabel = new JLabel("Name: ");

        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridx = 0;
        gc.gridy = 0;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = new Insets(0, 0, 0, 5);
        add(nameLabel, gc);

        nameField = new JTextField(10);
        gc.gridx = 1;
        gc.gridy = 0;
        gc.insets = new Insets(0, 0, 0, 0);
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
        gc.insets = new Insets(0, 0, 0, 5);
        add(occupationLabel, gc);

        occupationField = new JTextField(10);
        gc.gridy = 1;
        gc.gridx = 1;
        gc.insets = new Insets(0, 0, 0, 0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(occupationField, gc);
    }

    private void PanelList() {
        JList ageList;
        DefaultListModel ageModel;

        ageList = new JList();
        ageModel = new DefaultListModel();

        ageModel.addElement("Under 18");
        ageModel.addElement("18 to 65");
        ageModel.addElement("65 or over");
        ageList.setModel(ageModel);

        ageList.setPreferredSize(new Dimension(110, 60));
        ageList.setBorder(BorderFactory.createEtchedBorder());

        gc.weightx = 1;
        gc.weighty = 2.0;

        gc.gridy = 2;
        gc.gridx = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(ageList, gc);
    }

    private void OkButton() {
        okBtn = new JButton("OK");
        gc.weightx = 1;
        gc.weighty = 2.0;

        gc.gridy = 3;
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

    private void OkbtnAction() {
        okBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String occupation = occupationField.getText();

                FormEvent ev = new FormEvent(this, name, occupation);

                if (formListener != null) {
                    formListener.formEventOccurred(ev);
                }
            }
        });
    }

    public void setFormListener(FormListener listener) {
        this.formListener = listener;
    }
}
