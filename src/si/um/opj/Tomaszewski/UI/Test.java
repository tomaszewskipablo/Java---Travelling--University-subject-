package si.um.opj.Tomaszewski.UI;

import si.um.opj.Tomaszewski.logic.FoodItem;
import si.um.opj.Tomaszewski.logic.FoodItemType;
import si.um.opj.Tomaszewski.logic.Location;
import si.um.opj.Tomaszewski.logic.facility.BusinessFacilitiy;
import si.um.opj.Tomaszewski.logic.facility.Store;
import si.um.opj.Tomaszewski.logic.facility.Warehouse;
import si.um.opj.Tomaszewski.logic.transport.Truck;
import si.um.opj.Tomaszewski.logic.transport.Van;
import si.um.opj.Tomaszewski.logic.transport.Vehicle;

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
    private JButton addVehicleButton;
    private JPanel vehicleLayout;
    private JTextField labelVehicle;
    private JTextField volumeVehicle;
    private JButton confirmButton;
    private JRadioButton vanRadioButton;
    private JRadioButton truckRadioButton;
    private JTextField speedVehicle;
    private JTextField lengthVehicle;
    private JTextField trailsVehicle;
    private JTextField maxVehicle;


    private JLabel numberOfTrailersLabel;
    private JLabel chooseVehicleLabel;

    private JLabel chooseBusinessFacility;
    private JTextField capacityTextBox;
    private JRadioButton warehauseRadioButton;
    private JRadioButton storeRadioButton;

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


    private JTextField labelBussines;
    private JTextField country;
    private JTextField city;


    private JList warehouseToTake;
    private JList loadStore;


    private ArrayList<FoodItem> foodItemArrayList = new ArrayList<FoodItem>();
    private DefaultListModel<FoodItem> foodItemModel = new DefaultListModel<FoodItem>();

    private ArrayList<Store> storeArrayList = new ArrayList<Store>();
     private DefaultListModel<Store> storeModel = new DefaultListModel<Store>();

    private ArrayList<Warehouse> warehouseArrayList = new ArrayList<Warehouse>();
     private DefaultListModel<Warehouse> warehouseModel = new DefaultListModel<Warehouse>();

    private ArrayList<Truck> truckArrayList = new ArrayList<Truck>();
     private DefaultListModel<Truck> truckModel = new DefaultListModel<Truck>();

    private ArrayList<Van> vanArrayList = new ArrayList<Van>();
    private DefaultListModel<Van> vanModel = new DefaultListModel<Van>();

    private JList FoodItemToAdd;
    private JList chooseFoodItem;
    private JList loadVehicle;
    private JList chooseVehicle;
    private JList chooseStore;
    private JList chooseWarehouse;
    private JList loadWarehouse;
    private JList chooseVan;
    private JComboBox foodType;
    private JLabel foodTypeLabel;

    public Test()
    {
        // Works fine here
        chooseFoodItem.setModel(foodItemModel);
        FoodItemToAdd.setModel(foodItemModel);


        // ERROR for every model
        // models works this would work FoodItemToAdd.setModel(vehicleModel), the problem is with JList
        chooseStore.setModel(storeModel);
        chooseWarehouse.setModel(warehouseModel);
        chooseVehicle.setModel(truckModel);
        chooseVan.setModel(vanModel);


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
                chooseWarehouse.setVisible(true);

            }
        });
        storeRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                warehauseRadioButton.setSelected(false);
                capacityTextBox.setVisible(false);
                capacityLabel.setVisible(false);
                chooseStore.setVisible(true);
            }
        });
        confirmBusinessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String label = labelBussines.getText();
                String countryS = country.getText();
                String cityS = city.getText();

                if(warehauseRadioButton.isSelected()!=true) {

                    Location location = new Location(countryS, cityS);
                    Store store = new Store(label, location);

                    storeModel.addElement(store);
                    storeArrayList.add(store);
                }
                else if(warehauseRadioButton.isSelected()) {

                        int capacity = Integer.parseInt(capacityTextBox.getText());

                        Location location = new Location(countryS, cityS);
                        Warehouse warehouse = new Warehouse(label, location, capacity);


                        warehouseModel.addElement(warehouse);
                        warehouseArrayList.add(warehouse);
                }
            }
        });
        // -------------------- BUSINESS END ---------------------

        // -------------------- VEHICLE START ---------------------

        truckRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                vanRadioButton.setSelected(false);
                numberOfTrailersLabel.setText("Number of trailers");
                numberOfTrailersLabel.setVisible(true);
                trailsVehicle.setVisible(true);
                foodType.setVisible(false);
                foodTypeLabel.setVisible(false);
            }
        });
        vanRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                truckRadioButton.setSelected(false);
                numberOfTrailersLabel.setVisible(false);
                foodType.setVisible(true);
                foodTypeLabel.setVisible(true);
                trailsVehicle.setVisible(false);
            }
        });
        // -------------------- VEHICLE END ---------------------

        // -------------------- FOODITEM START ---------------------


        addFoodItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
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
                loadWarehouse.setVisible(true);
                loadStore.setVisible(false);

            }
        });
        unloadRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                loadRadioButton.setSelected(false);
                actionLabel.setText("To");
                WhereLabel.setText("Store");
                loadWarehouse.setVisible(false);
                loadStore.setVisible(true);
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


        addVehicleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                chooseVehicleLabel.setVisible(false);

                vehicleLayout.setVisible(true);

                deleteConfirmVehicleButton.setEnabled(false);
                deleteConfirmVehicleButton.setVisible(false);
                confirmVehicleButton.setEnabled(true);
                confirmVehicleButton.setVisible(true);
                editConfirmVehicleButton.setEnabled(false);
                editConfirmVehicleButton.setVisible(false);
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                chooseVehicle.setVisible(true);
                chooseVehicleLabel.setVisible(true);

                vehicleLayout.setVisible(true);


                deleteConfirmVehicleButton.setEnabled(true);
                deleteConfirmVehicleButton.setVisible(true);
                confirmVehicleButton.setEnabled(false);
                confirmVehicleButton.setVisible(false);
                editConfirmVehicleButton.setEnabled(false);
                editConfirmVehicleButton.setVisible(false);
            }
        });
        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                chooseVehicle.setVisible(true);
                chooseVehicleLabel.setVisible(true);

                vehicleLayout.setVisible(true);

                deleteConfirmVehicleButton.setEnabled(false);
                deleteConfirmVehicleButton.setVisible(false);
                confirmVehicleButton.setEnabled(false);
                confirmVehicleButton.setVisible(false);
                editConfirmVehicleButton.setEnabled(true);
                editConfirmVehicleButton.setVisible(true);
            }
        });
        deleteConfirmBussinesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(storeRadioButton.isSelected() && chooseStore.getSelectedIndex()>=0){
                    int id = chooseStore.getSelectedIndex();

                    storeArrayList.remove(id);
                    storeModel.remove(id);
                }
                else if(warehauseRadioButton.isSelected() && chooseWarehouse.getSelectedIndex()>=0){
                    int id = chooseWarehouse.getSelectedIndex();

                    warehouseArrayList.remove(id);
                    warehouseModel.remove(id);
                }
            }
        });
        editConfirmBussinesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String label = labelBussines.getText();
                String countryS = country.getText();
                String cityS = city.getText();
                //STORE
                if(storeRadioButton.isSelected() && chooseStore.getSelectedIndex()>=0){
                    int id = chooseStore.getSelectedIndex();
                    Store store = storeArrayList.get(id);

                    store.setName(label);
                    Location location = new Location(countryS,cityS);
                    store.setLocation(location);


                }
                //WAREHOUSE
                else if(warehauseRadioButton.isSelected() && chooseWarehouse.getSelectedIndex()>=0){
                    int capacity = Integer.parseInt(capacityTextBox.getText());

                    int id = chooseWarehouse.getSelectedIndex();
                    Warehouse warehouse = warehouseArrayList.get(id);
                    Location location = new Location(countryS, cityS);

                    warehouse.setName(label);
                    warehouse.setLocation(location);
                    warehouse.setCapacity(capacity);
                }
            }
        });
        confirmVehicleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String label = labelVehicle.getText();
                double volume = Double.parseDouble(volumeVehicle.getText());
                double weight = Double.parseDouble(maxVehicle.getText());
                int length = Integer.parseInt(lengthVehicle.getText());

                if(truckRadioButton.isSelected() ) {
                    int trails = Integer.parseInt(trailsVehicle.getText());

                    Truck truck = new Truck(label, volume, weight, trails, length);
                    truckModel.addElement(truck);
                    truckArrayList.add(truck);
                }
                else if(vanRadioButton.isSelected() ) {
                    FoodItemType foodItemType;
                    if(foodType.getSelectedIndex()==0){
                        foodItemType = FoodItemType.FROZEN;
                    }
                    else {
                        foodItemType = FoodItemType.FRESH;
                    }

                    Van van = new Van(label, volume, weight, foodItemType, length);
                    vanModel.addElement(van);
                    vanArrayList.add(van);
                }
            }
        });
        deleteConfirmVehicleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(truckRadioButton.isSelected() && chooseVehicle.getSelectedIndex()>=0){
                    int id = chooseVehicle.getSelectedIndex();

                    truckArrayList.remove(id);
                    truckModel.remove(id);
                }
                else if(vanRadioButton.isSelected() && chooseVan.getSelectedIndex()>=0){
                    int id = chooseVan.getSelectedIndex();

                    vanArrayList.remove(id);
                    vanModel.remove(id);
                }
            }
        });
        editConfirmVehicleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String registration = labelVehicle.getText();
                double volume = Double.parseDouble(volumeVehicle.getText());
                double speed = Double.parseDouble(speedVehicle.getText());
                int length = Integer.parseInt(lengthVehicle.getText());

                //Truck
                if(truckRadioButton.isSelected() && chooseVehicle.getSelectedIndex()>=0){
                    int id = chooseVehicle.getSelectedIndex();
                    Truck truck = truckArrayList.get(id);

                    int trails = Integer.parseInt(trailsVehicle.getText());

                    truck.setRegistrationNumber(registration);
                    truck.setVolume(volume);
                    truck.setAverageSpeed(speed);
                    truck.setNumberOFTrailers(trails);
                }
                //VAN
                else if(vanRadioButton.isSelected() && chooseVan.getSelectedIndex()>=0){
                    int id = chooseVan.getSelectedIndex();
                    Van van = vanArrayList.get(id);

                    FoodItemType foodItemType;
                    if(foodType.getSelectedIndex()==0){
                        foodItemType = FoodItemType.FROZEN;
                    }
                    else {
                        foodItemType = FoodItemType.FRESH;
                    }

                    van.setRegistrationNumber(registration);
                    van.setVolume(volume);
                    van.setAverageSpeed(speed);
                    van.setFoodItemType(foodItemType);
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
