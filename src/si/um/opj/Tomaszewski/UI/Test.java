package si.um.opj.Tomaszewski.UI;

import javax.swing.*;
import java.awt.*;

public class Test extends JFrame {


    private javax.swing.JPanel JPanel;
    private JTextField textField1;

    public Test()
    {

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");


        Dimension d = new Dimension(500,400);
        frame.setSize(d);
        frame.setPreferredSize(d);


        frame.setContentPane(new Test().JPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
