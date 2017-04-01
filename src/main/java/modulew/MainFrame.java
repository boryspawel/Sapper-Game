package modulew;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class MainFrame extends JFrame implements ActionListener {


    private List<JButton> buttons;
    private Container container;


    public MainFrame(int workspaceDimension) {
        Workspace workspace = new Workspace(workspaceDimension);

        buttons = new ArrayList<JButton>();
        workspace.buildWorkSpace();
        container = getContentPane();
        for (int i = 1; i < (workspaceDimension + 1); i++) {

            for (int j = 1; j < (workspaceDimension + 1); j++) {

                JButton button = new JButton();
                button.addActionListener(this);
                buttons.add(button);
                container.add(button);
                button.setBackground(Color.black);
                button.setText("" + (workspace.getWorkSpaceArray())[i][j]);
                button.setForeground(Color.black);

            }
        }

        setLayout(new GridLayout(workspaceDimension, workspaceDimension));
        setMinimumSize(new Dimension(500, 500));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        JButton button = (JButton) e.getSource();
        button.setBackground(Color.WHITE);


        if ((button.getText()).equals("" + (-1))) {
            JOptionPane.showMessageDialog(this, "Buuuuuuuuum");
            System.exit(0);


        }
        if ((button.getText()).equals("" + (0))) {
            button.setText("");
        }

    }

}










