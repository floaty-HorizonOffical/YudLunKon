package YudLunKon.official.Extra.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Popup implements ActionListener {
    JLabel label;
    String label1TxtChange = "";
    public Popup(String title, String buttonTxt, String ChangeLabel , String Label, int up, int left, int down, int right){
        label1TxtChange = ChangeLabel;
        // GUI Creation
        JFrame popup = new JFrame();
        JPanel panel = new JPanel();

        // Nodes
        // 1 button
        JButton button = new JButton(buttonTxt);
        button.addActionListener(this);
        label = new JLabel(Label);

        // Making the GUI appear
        panel.setBorder(BorderFactory.createEmptyBorder(up, left, down, right));
        panel.setLayout(new GridLayout());

        panel.setLayout(new GridLayout(0, 1));
        panel.add(label);
        panel.add(button);

        // Info before showing
        popup.add(panel, BorderLayout.CENTER);
        popup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        popup.setTitle(title);
        popup.pack();
        popup.setVisible(true);
    }

    public static void OneButton (String title, String Label, String ButtonTxt, String BtnChangeLabelTxt, int up, int left, int down, int right){
        new Popup(title, ButtonTxt, BtnChangeLabelTxt, Label, up, left, down, right);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText(label1TxtChange);
    }
}
