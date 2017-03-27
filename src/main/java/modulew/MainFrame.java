package modulew;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/*
Jest to zarowno klasa głównego okna jak
równiez klasa z metoda ktora okno wyswietli(uruchomi program)
*/
public class MainFrame extends JFrame implements ActionListener {

    private final int workspaceDimension;
    private Integer[][] workSpaceArray;
    private List<JButton> buttons;
    private Container container;



    public MainFrame(String title, int workspaceDimension, Integer[][] workSpaceArray) {
        super(title);
        this.workspaceDimension = workspaceDimension;
        this.workSpaceArray = workSpaceArray;

        buttons = new ArrayList<JButton>();

        container = getContentPane();
        for (int i = 1; i < (workspaceDimension + 1); i++) {
            for (int j = 1; j < (workspaceDimension + 1); j++) {

                JButton button = new JButton();
                button.addActionListener(this);
                buttons.add(button);
                container.add(button);
                button.setBackground(Color.black);
                button.setText("" + workSpaceArray[i][j]);
                button.setForeground(Color.black);
                button.setLocation(i, j);

            }
        }


        setLayout(new GridLayout(workspaceDimension, workspaceDimension));
        setMinimumSize(new Dimension(500, 500));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        // ta metoda jest zwiazana z obsluga zdarzenia zwiazanym z dowolna kontrolka
        //pobieranie referencji na kontrolke zwiazana ze zdarzeniem
        JButton button = (JButton) e.getSource();
        button.setBackground(Color.WHITE);
        checkEmpty();


        if ((button.getText()).equals("" + (-1))) {
            JOptionPane.showMessageDialog(this, "Buuuuuuuuum. NIe żyjesz. Lecisz w kosmos");
            System.exit(0);


        }
        if ((button.getText()).equals("" + (0))) {
            button.setText("");
        }

//                    for (int i =1; i< workspaceDimension+1; i++) {
//                        for (int j = 1; j < workspaceDimension+1; j++) {
//                            for(int k=-1; k<=1;k++){
//                                 for(int n=-1; n<=1;n++){
//
//                                if (workSpaceArray[i+k][j+n]==0){}
//                                if(workSpaceArray[i][j]!=-1){workSpaceArray[i][j]=count;}


//        }
    }

    private void checkEmpty() {

//            for (int i = 0; i < (workspaceDimension * workspaceDimension); i++) {
//                if ((buttons.get(i).getText().equals("" + (0))) && (buttons.get(i).getBackground()) == Color.WHITE) {
//                    if ((i < workspaceDimension * workspaceDimension-1)&&(buttons.get(i + 1).getText().equals("" + (0)))
//                            ) {
//                        buttons.get(i + 1).setBackground(Color.WHITE);
//                    }
//                }
//                if ((buttons.get(i).getText().equals("" + (0))) && (buttons.get(i).getBackground() == Color.WHITE)&&i>0) {
//                 if ((buttons.get(i - 1).getText().equals("" + (0))) && (i > 1)) {
//                        buttons.get(i - 1).setBackground(Color.WHITE);
//
//
//                    }
//                     else if ((i < ((workspaceDimension * workspaceDimension) - workspaceDimension-2)) && ((buttons.get(i + workspaceDimension).getText().equals("" + (0)))))
//                        {
//                            buttons.get(i + workspaceDimension).setBackground(Color.WHITE);
//                        }
//                    }
//                }
            }
        }









