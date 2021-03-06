package com.example.alex.starbuzz;

/**
 * Created by Alex on 13-02-2018.
 */

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    //drink in an array of Drinks
    public static final Drink[] drinks = {
            new Drink ("Latte", "A couple of espresso shots with steamed milk",
                    R.drawable.latte),
            new Drink("Cappuccino", "Espresso, hot milk, and a steamed milk foam",
                    R.drawable.cappuccino),
            new Drink("Filter", "Highest quality beans roasted and brewed fresh",
                    R.drawable.filter)
    };

    //Each Drink has a name, description and an image source
    private Drink(String name, String description, int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription(){
        return description;
    }
    public String getName(){
        return name;
    }
    public int getImageResourceId(){
        return imageResourceId;
    }

    //The string representation of a Drink is its name
    public String toString(){
        return this.name;
    }
}
