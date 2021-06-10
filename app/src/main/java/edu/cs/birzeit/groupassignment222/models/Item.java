package edu.cs.birzeit.groupassignment222.models;
import java.io.Serializable;
import java.util.Arrays;

import edu.cs.birzeit.groupassignment222.R;

public class Item implements Serializable {
    private int imageID;
    private String name;
    private int price;
    private double rating ; //from 5
    private String manufacturingCountry;
    private String [] availableColors;
    private int availableQuantity ;
    private int [] availableSizes;



    public static final Item[] items ={
            new Item(R.drawable.nikeshoes,"Nike Shoes", 75, 4.5, "America",new String[]{"Yello","Black","White"},20,new int[]{38,39,40,42}),
            new Item(R.drawable.ball,"Football", 22, 4.7, "America",new String[]{"Black","White"},30,new int[]{7,8,9}),
            new Item(R.drawable.dumbbells,"Dumbbells", 30, 4.6, "America",new String[]{"Yello","Black","White","Red"},10,new int[]{4,5,6,12,14}),
            new Item(R.drawable.tshirt,"Lacoste T-shirt", 32, 4.9, "America",new String[]{"Green","Black","White","Pink"},25,new int[]{37,38,39,40,42}),
            new Item(R.drawable.short2,"Short", 50, 4.4, "America",new String[]{"Black","White"},17,new int[]{38,39,40,42}),
            new Item(R.drawable.bag,"Sport Bag", 90, 4.9, "America",new String[]{"Navy","Black","White","Red"},10,new int[]{4,5,6,12,14}),
            new Item(R.drawable.basketball,"BasketBall", 50, 4.8, "America",new String[]{"Brown"},25,new int[]{7,8,9}),
            new Item(R.drawable.sportcloves,"Sport Cloves", 30, 4.6, "America",new String[]{"Black","White"},17,new int[]{38,39,40,42}),
    };


    public Item() {
    }

    public Item(int imageID, String name, int price, double rating, String manufacturingCountry, String[] availableColors, int availableQuantity, int[] availableSizes) {
        this.imageID = imageID;
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.manufacturingCountry = manufacturingCountry;
        this.availableColors = availableColors;
        this.availableQuantity = availableQuantity;
        this.availableSizes = availableSizes;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getManufacturingCountry() {
        return manufacturingCountry;
    }

    public void setManufacturingCountry(String manufacturingCountry) {
        this.manufacturingCountry = manufacturingCountry;
    }

    public String[] getAvailableColors() {
        return availableColors;
    }

    public void setAvailableColors(String[] availableColors) {
        this.availableColors = availableColors;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public int[] getAvailableSizes() {
        return availableSizes;
    }

    public void setAvailableSizes(int[] availableSizes) {
        this.availableSizes = availableSizes;
    }


    @Override
    public String toString() {
        return "Item{" +
                "imageID=" + imageID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", manufacturingCountry='" + manufacturingCountry + '\'' +
                ", availableColors=" + Arrays.toString(availableColors) +
                ", availableQuantity=" + availableQuantity +
                ", availableSizes=" + Arrays.toString(availableSizes) +
                '}';
    }
}
