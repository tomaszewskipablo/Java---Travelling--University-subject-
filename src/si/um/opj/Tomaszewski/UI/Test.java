package si.um.opj.Tomaszewski.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test extends JFrame {


    private javax.swing.JPanel JPanel;
    private JTabbedPane tabbedPane1;
    private JButton deleteButton;
    private JButton editButton;
    private JButton addButton;
    private JPanel vehicleLayout;
    private JTextField textField2;
    private JTextField textField3;
    private JButton confirmButton;
    private JRadioButton vanRadioButton;
    private JRadioButton truckRadioButton;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JComboBox chooseVehicle;
    private JLabel numberOfTrailersLabel;
    private JLabel chooseVehicleLabel;
    private JComboBox chooseBusiness;
    private JLabel chooseBusinessFacility;
    private JTextField capacityTextBox;
    private JRadioButton warehauseRadioButton;
    private JRadioButton storeRadioButton;
    private JComboBox chooseFoodItem;
    private JLabel chooseFoodItemLabel;
    private JPanel confirmFoodButton;
    private JButton confirmFoodItemButton;
    private JButton confirmBusinessButton;
    private JButton addFoodItemButton;
    private JButton deleteFoodItemButton;
    private JButton editFoodItemButton;
    private JButton addBusinessButton;
    private JButton deleteBusinessButton;
    private JButton editBusinessButton;
    private JLabel capacityLabel;
    private JRadioButton loadRadioButton;
    private JRadioButton unloadRadioButton;
    private JComboBox chooseVehicleAction;
    private JLabel actionLabel;
    private JLabel WhereLabel;
    private JComboBox chooseBusinessAction;
    private JButton submitButton;

    public Test()
    {
// -------------------- BUSINESS START ---------------------
        addBusinessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                confirmBusinessButton.setText("Add");
                chooseBusiness.setVisible(false);
                chooseBusinessFacility.setVisible(false);
            }
        });
        deleteBusinessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                confirmBusinessButton.setText("Delete");
                chooseBusiness.setVisible(true);
                chooseBusinessFacility.setVisible(true);
            }
        });
        editBusinessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                confirmBusinessButton.setText("Edit");
                chooseBusiness.setVisible(true);
                chooseBusinessFacility.setVisible(true);
            }
        });
        warehauseRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                storeRadioButton.setSelected(false);
                capacityTextBox.setVisible(true);
                capacityLabel.setVisible(true);
            }
        });
        storeRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                warehauseRadioButton.setSelected(false);
                capacityTextBox.setVisible(false);
                capacityLabel.setVisible(false);
            }
        });
        // -------------------- BUSINESS END ---------------------

        // -------------------- VEHICLE START ---------------------
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                chooseVehicle.setVisible(false);
                chooseVehicleLabel.setVisible(false);
                confirmButton.setText("Add");
                vehicleLayout.setVisible(true);
            }
        });
        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                chooseVehicle.setVisible(true);
                chooseVehicleLabel.setVisible(true);
                confirmButton.setText("Edit");
                vehicleLayout.setVisible(true);
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                chooseVehicle.setVisible(true);
                chooseVehicleLabel.setVisible(true);
                confirmButton.setText("Delete");
                vehicleLayout.setVisible(true);
            }
        });
        truckRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                vanRadioButton.setSelected(false);
                numberOfTrailersLabel.setText("Number of trailers");
            }
        });
        vanRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                truckRadioButton.setSelected(false);
                numberOfTrailersLabel.setText("Food Item type");
            }
        });
        // -------------------- VEHICLE END ---------------------

        // -------------------- FOODITEM START ---------------------


        addFoodItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                confirmFoodItemButton.setText("Add");
                chooseFoodItem.setVisible(false);
                chooseFoodItemLabel.setVisible(false);
            }
        });
        deleteFoodItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                confirmFoodItemButton.setText("Delete");
                chooseFoodItem.setVisible(true);
                chooseFoodItemLabel.setVisible(true);
            }
        });
        editFoodItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                confirmFoodItemButton.setText("Edit");
                chooseFoodItem.setVisible(true);
                chooseFoodItemLabel.setVisible(true);
            }
        });

        // -------------------- FOODITEM END ---------------------

        // -------------------- VEHICLE LOAD/UNLOAD START ---------------------
        loadRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                unloadRadioButton.setSelected(false);
                actionLabel.setText("From");
                WhereLabel.setText("Warehouse");

            }
        });
        unloadRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                loadRadioButton.setSelected(false);
                actionLabel.setText("To");
                WhereLabel.setText("Store");
            }
            // -------------------- VEHICLE LOAD/UNLOAD END ---------------------
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");


        Dimension d = new Dimension(800,400);
        frame.setPreferredSize(d);


        frame.setContentPane(new Test().JPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
