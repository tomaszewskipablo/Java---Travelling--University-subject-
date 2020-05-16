package si.um.opj.Tomaszewski.UI;

import si.um.opj.Tomaszewski.logic.FoodItem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DeleteFoodItems implements ActionListener {
    private ArrayList<FoodItem> foodItemArrayList;
    private JList <FoodItem>  chooseFoodItem;

    public DeleteFoodItems(ArrayList<FoodItem> foodItemArrayList, JList<FoodItem> chooseFoodItem) {
        this.foodItemArrayList=foodItemArrayList;
        this.chooseFoodItem=chooseFoodItem;
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        DefaultListModel<FoodItem> foodItemModel = (DefaultListModel<FoodItem>) chooseFoodItem.getModel();

        if (chooseFoodItem.getSelectedIndex() >= 0) {
            foodItemArrayList.remove(chooseFoodItem.getSelectedIndex());
            foodItemModel.remove(chooseFoodItem.getSelectedIndex());
        }
    }
}
