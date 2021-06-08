package edu.cs.birzeit.groupassignment222.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

import edu.cs.birzeit.groupassignment222.R;

public class order implements Serializable {
    private Item item;
    private String chosenColor;
    private int chosenSize;
    private int chosenQuantity;

    public static final ArrayList<order> orders = new ArrayList<order>();

    public order() {
    }

    public order(Item item, String chosenColor, int chosenSize, int chosenQuantity) {
        this.item = item;
        this.chosenColor = chosenColor;
        this.chosenSize = chosenSize;
        this.chosenQuantity = chosenQuantity;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getChosenColor() {
        return chosenColor;
    }

    public void setChosenColor(String chosenColor) {
        this.chosenColor = chosenColor;
    }

    public int getChosenSize() {
        return chosenSize;
    }

    public void setChosenSize(int chosenSize) {
        this.chosenSize = chosenSize;
    }

    public int getChosenQuantity() {
        return chosenQuantity;
    }

    public void setChosenQuantity(int chosenQuantity) {
        this.chosenQuantity = chosenQuantity;
    }

    public static ArrayList<order> getOrders() {
        return orders;
    }

    @Override
    public String toString() {
        return "order{" +
                "item name=" + item.getName() +
                ", chosenColor='" + chosenColor + '\'' +
                ", chosenSize=" + chosenSize +
                ", chosenQuantity=" + chosenQuantity +
                '}';
    }
}
