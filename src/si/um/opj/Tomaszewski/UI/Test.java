package si.um.opj.Tomaszewski.UI;

import si.um.opj.Tomaszewski.logic.FoodItem;
import si.um.opj.Tomaszewski.logic.FoodItemType;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

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
    private JComboBox chooseVehicleAction;
    private JLabel numberOfTrailersLabel;
    private JLabel chooseVehicleLabel;

    private JLabel chooseBusinessFacility;
    private JTextField capacityTextBox;
    private JRadioButton warehauseRadioButton;
    private JRadioButton storeRadioButton;
    private JList chooseFoodItem;
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

    private JLabel actionLabel;
    private JLabel WhereLabel;
    private JComboBox chooseBusinessAction;
    private JButton submitButton;
    private JTextField labelFoodItem;
    private JTextField volumeFoodItem;
    private JTextField weightFoodItem;
    private JTextField ExpirationdateFoodItem;
    private JComboBox ComboxFoodType;
    private JButton deleteConfirmFoodItemButton;
    private JButton editConfirmFoodItemButton;
    private JButton deleteConfirmBussinesButton;
    private JButton editConfirmBussinesButton;
    private JButton deleteConfirmVehicleButton;
    private JButton editConfirmVehicleButton;
    private JButton confirmVehicleButton;
    private JList list1;
    private JList chooseBussines;

    private ArrayList<FoodItem> foodItemArrayList = new ArrayList<FoodItem>();// arraylist that has only Singers
    final private DefaultListModel<FoodItem> foodItemModel = new DefaultListModel<FoodItem>(); //creating model for jList


    public Test()
    {
        chooseFoodItem.setModel(foodItemModel);


// -------------------- BUSINESS START ---------------------
        addBusinessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                confirmBusinessButton.setText("Add");

                chooseBusinessFacility.setVisible(false);

                confirmBusinessButton.setEnabled(true);
                confirmBusinessButton.setVisible(true);
                deleteConfirmBussinesButton.setEnabled(false);
                deleteConfirmBussinesButton.setVisible(false);
                editConfirmBussinesButton.setEnabled(false);
                editConfirmBussinesButton.setVisible(false);
            }
        });
        deleteBusinessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                confirmBusinessButton.setText("Delete");
                //show()

                chooseBusinessFacility.setVisible(true);

                confirmBusinessButton.setEnabled(false);
                confirmBusinessButton.setVisible(false);
                deleteConfirmBussinesButton.setEnabled(true);
                deleteConfirmBussinesButton.setVisible(true);
                editConfirmBussinesButton.setEnabled(false);
                editConfirmBussinesButton.setVisible(false);
            }
        });
        editBusinessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                confirmBusinessButton.setText("Edit");

                chooseBusinessFacility.setVisible(true);


                confirmBusinessButton.setEnabled(false);
                confirmBusinessButton.setVisible(false);
                deleteConfirmBussinesButton.setEnabled(false);
                deleteConfirmBussinesButton.setVisible(false);
                editConfirmBussinesButton.setEnabled(true);
                editConfirmBussinesButton.setVisible(true);
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

                deleteConfirmVehicleButton.setEnabled(false);
                deleteConfirmVehicleButton.setVisible(false);
                confirmVehicleButton.setEnabled(true);
                confirmVehicleButton.setVisible(true);
                editConfirmVehicleButton.setEnabled(false);
                editConfirmVehicleButton.setVisible(false);
            }
        });
        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                chooseVehicle.setVisible(true);
                chooseVehicleLabel.setVisible(true);
                confirmButton.setText("Edit");
                vehicleLayout.setVisible(true);

                deleteConfirmVehicleButton.setEnabled(false);
                deleteConfirmVehicleButton.setVisible(false);
                confirmVehicleButton.setEnabled(false);
                confirmVehicleButton.setVisible(false);
                editConfirmVehicleButton.setEnabled(true);
                editConfirmVehicleButton.setVisible(true);
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                chooseVehicle.setVisible(true);
                chooseVehicleLabel.setVisible(true);
                confirmButton.setText("Delete");
                vehicleLayout.setVisible(true);


                deleteConfirmVehicleButton.setEnabled(true);
                deleteConfirmVehicleButton.setVisible(true);
                confirmFoodItemButton.setEnabled(false);
                confirmFoodItemButton.setVisible(false);
                editConfirmVehicleButton.setEnabled(false);
                editConfirmVehicleButton.setVisible(false);
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



                chooseFoodItemLabel.setVisible(false);


                confirmFoodItemButton.setEnabled(true);
                confirmFoodItemButton.setVisible(true);
                deleteConfirmFoodItemButton.setEnabled(false);
                deleteConfirmFoodItemButton.setVisible(false);
                editConfirmFoodItemButton.setEnabled(false);
                editConfirmFoodItemButton.setVisible(false);
            }
        });
        deleteFoodItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                confirmFoodItemButton.setText("Delete");
                chooseFoodItem.setVisible(true);
                chooseFoodItemLabel.setVisible(true);

                confirmFoodItemButton.setEnabled(false);
                confirmFoodItemButton.setVisible(false);
                deleteConfirmFoodItemButton.setEnabled(true);
                deleteConfirmFoodItemButton.setVisible(true);
                editConfirmFoodItemButton.setEnabled(false);
                editConfirmFoodItemButton.setVisible(false);
            }
        });
        editFoodItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                confirmFoodItemButton.setText("Edit");
                chooseFoodItem.setVisible(true);
                chooseFoodItemLabel.setVisible(true);


                confirmFoodItemButton.setEnabled(false);
                confirmFoodItemButton.setVisible(false);
                deleteConfirmFoodItemButton.setEnabled(false);
                deleteConfirmFoodItemButton.setVisible(false);
                editConfirmFoodItemButton.setEnabled(true);
                editConfirmFoodItemButton.setVisible(true);
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

        // -------------------- FOODITEM MENAGEMENT START ---------------------
        confirmFoodItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String label = labelFoodItem.getText();
                double volume = Double.parseDouble(volumeFoodItem.getText());
                double weight = Double.parseDouble(weightFoodItem.getText());
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate expirationDate= LocalDate.parse(ExpirationdateFoodItem.getText(), formatter);

                FoodItemType foodItemType;
                if(ComboxFoodType.getSelectedIndex()==0){
                    foodItemType = FoodItemType.FROZEN;
                }
                else {
                    foodItemType = FoodItemType.FRESH;
                }

                FoodItem foodItem = new FoodItem(label,volume,weight,expirationDate,foodItemType);
                foodItemModel.addElement(foodItem);
                foodItemArrayList.add(foodItem);
            }
        });


        deleteConfirmFoodItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(chooseFoodItem.getSelectedIndex()>=0) {
                    int id = chooseFoodItem.getSelectedIndex();

                    foodItemArrayList.remove(id);
                    foodItemModel.remove(id);
                }
            }
        });
        editConfirmFoodItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(chooseFoodItem.getSelectedIndex()>=0) {
                    String label = labelFoodItem.getText();
                    double volume = Double.parseDouble(volumeFoodItem.getText());
                    double weight = Double.parseDouble(weightFoodItem.getText());
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    LocalDate expirationDate = LocalDate.parse(ExpirationdateFoodItem.getText(), formatter);

                    FoodItemType foodItemType;
                    if(ComboxFoodType.getSelectedIndex()==0){
                       foodItemType = FoodItemType.FROZEN;
                    }
                    else {
                        foodItemType = FoodItemType.FRESH;
                    }

                    int id = chooseFoodItem.getSelectedIndex();
                    FoodItem foodItem = foodItemArrayList.get(id);

                    foodItem.setLabel(label);
                    foodItem.setVolume(volume);
                    foodItem.setExpirationDate(expirationDate);
                    foodItem.setFoodItemType(foodItemType);
                }
            }
        });


        chooseFoodItem.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                if(chooseFoodItem.getSelectedIndex() >= 0)
                {
                    int id = chooseFoodItem.getSelectedIndex();
                    FoodItem selectedItem = foodItemArrayList.get(id);

                    labelFoodItem.setText(selectedItem.getLabel());
                    volumeFoodItem.setText(String.valueOf(selectedItem.getVolume()));
                    weightFoodItem.setText(String.valueOf(selectedItem.getWeight()));
                    ExpirationdateFoodItem.setText(String.valueOf(selectedItem.getExpirationDate()));

                }
                }
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
